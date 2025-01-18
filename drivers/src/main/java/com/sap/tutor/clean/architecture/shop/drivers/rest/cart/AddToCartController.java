package com.sap.tutor.clean.architecture.shop.drivers.rest.cart;

import com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.rest.cart.AddToCartControllerAdapter;
import com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.rest.cart.CartWebModel;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/carts")
@Produces(MediaType.APPLICATION_JSON)
public class AddToCartController {

    private AddToCartControllerAdapter addToCartControllerAdapter;

    @POST
    @Path("/{customerId}/line-items")
    public CartWebModel addLineItem(
            @PathParam("customerId") String customerIdString,
            @QueryParam("productId") String productIdString,
            @QueryParam("quantity") int quantity) {
        return addToCartControllerAdapter.addLineItem(customerIdString, productIdString, quantity);
    }
}
