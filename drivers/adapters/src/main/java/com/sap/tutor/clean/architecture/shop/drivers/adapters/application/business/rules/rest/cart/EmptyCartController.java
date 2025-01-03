package com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.rest.cart;

import com.sap.tutor.clean.architecture.shop.application.port.in.cart.EmptyCartUseCase;
import com.sap.tutor.clean.architecture.shop.model.customer.CustomerId;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import static com.sap.tutor.clean.architecture.shop.adapter.in.rest.common.CustomerIdParser.parseCustomerId;

/**
 * REST controller for all shopping cart use cases.
 *
 * @author Sven Woltmann
 */
@Path("/carts")
@Produces(MediaType.APPLICATION_JSON)
public class EmptyCartController {

    private final EmptyCartUseCase emptyCartUseCase;

    public EmptyCartController(EmptyCartUseCase emptyCartUseCase) {
        this.emptyCartUseCase = emptyCartUseCase;
    }

    @DELETE
    @Path("/{customerId}")
    public void deleteCart(@PathParam("customerId") String customerIdString) {
        CustomerId customerId = parseCustomerId(customerIdString);
        emptyCartUseCase.emptyCart(customerId);
    }
}
