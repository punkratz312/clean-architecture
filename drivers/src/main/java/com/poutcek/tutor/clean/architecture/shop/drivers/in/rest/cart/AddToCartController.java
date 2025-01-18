package com.poutcek.tutor.clean.architecture.shop.drivers.in.rest.cart;

import com.potucek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.port.in.api.cart.AddToCartUseCase;
import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.cart.Cart;
import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.cart.NotEnoughItemsInStockException;
import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.customer.CustomerId;
import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.product.ProductId;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import static com.poutcek.tutor.clean.architecture.shop.drivers.in.rest.cart.common.ControllerCommons.clientErrorException;
import static com.poutcek.tutor.clean.architecture.shop.drivers.in.rest.cart.common.CustomerIdParser.parseCustomerId;
import static com.poutcek.tutor.clean.architecture.shop.drivers.in.rest.cart.common.ProductIdParser.parseProductId;

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
    } catch (
            com.potucek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.port.in.cart.ProductNotFoundException e) {
      throw clientErrorException(
          Response.Status.BAD_REQUEST, "The requested product does not exist");
    } catch (NotEnoughItemsInStockException e) {
      throw clientErrorException(
          Response.Status.BAD_REQUEST, "Only %d items in stock".formatted(e.itemsInStock()));
    }
  }
}
