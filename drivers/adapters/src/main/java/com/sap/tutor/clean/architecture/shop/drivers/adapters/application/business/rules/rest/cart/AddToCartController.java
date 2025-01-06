package com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.rest.cart;

import com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.cart.Cart;
import com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.cart.NotEnoughItemsInStockException;
import com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.customer.CustomerId;
import com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.product.ProductId;
import com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.port.in.cart.AddToCartUseCase;
import com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.port.in.cart.ProductNotFoundException;

import static com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.rest.common.ControllerCommons.clientErrorException;
import static com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.rest.common.CustomerIdParser.parseCustomerId;
import static com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.rest.common.ProductIdParser.parseProductId;

/**
 * REST controller for all shopping cart use cases.
 *
 * @author Sven Woltmann
 */
@Path("/carts")
@Produces(MediaType.APPLICATION_JSON)
public class AddToCartController {

    private final AddToCartUseCase addToCartUseCase;

    public AddToCartController(AddToCartUseCase addToCartUseCase) {
        this.addToCartUseCase = addToCartUseCase;
    }

    @POST
    @Path("/{customerId}/line-items")
    public CartWebModel addLineItem(
            @PathParam("customerId") String customerIdString,
            @QueryParam("productId") String productIdString,
            @QueryParam("quantity") int quantity) {
        CustomerId customerId = parseCustomerId(customerIdString);
        ProductId productId = parseProductId(productIdString);

        try {
            Cart cart = addToCartUseCase.addToCart(customerId, productId, quantity);
            return CartWebModel.fromDomainModel(cart);
        } catch (ProductNotFoundException e) {
            throw clientErrorException(
                    Response.Status.BAD_REQUEST, "The requested product does not exist");
        } catch (NotEnoughItemsInStockException e) {
            throw clientErrorException(
                    Response.Status.BAD_REQUEST, "Only %d items in stock".formatted(e.itemsInStock()));
        }
    }
}
