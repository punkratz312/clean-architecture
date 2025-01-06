package eu.happycoders.shop.bootstrap.rest.cart;

import com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.rest.cart.AddToCartControllerAdapter;
import eu.happycoders.shop.application.port.in.cart.AddToCartUseCase;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

/**
 * REST controller for all shopping cart use cases.
 *
 * @author Sven Woltmann
 */
@Path("/carts")
@Produces(MediaType.APPLICATION_JSON)
public class AddToCartController {

    private          AddToCartControllerAdapter addToCartControllerAdapter;

    public AddToCartController(AddToCartControllerAdapter addToCartControllerAdapter) {
        this.addToCartControllerAdapter addToCartControllerAdapter;
    }

    @POST
    @Path("/{customerId}/line-items")
    public CartWebModel addLineItem(
            @PathParam("customerId") String customerIdString,
            @QueryParam("productId") String productIdString,
            @QueryParam("quantity") int quantity) {
        return addToCartControllerAdapter.addLineItem(customerIdString, productIdString, quantity);
    }
}
