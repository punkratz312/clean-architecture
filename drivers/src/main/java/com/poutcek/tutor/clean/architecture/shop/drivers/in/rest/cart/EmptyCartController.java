package com.poutcek.tutor.clean.architecture.shop.drivers.in.rest.cart;

import com.potucek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.port.in.api.cart.EmptyCartUseCase;
import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.customer.CustomerId;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import static com.poutcek.tutor.clean.architecture.shop.drivers.in.rest.cart.common.CustomerIdParser.parseCustomerId;

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
