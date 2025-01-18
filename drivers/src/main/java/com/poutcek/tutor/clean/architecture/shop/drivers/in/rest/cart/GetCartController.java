package com.poutcek.tutor.clean.architecture.shop.drivers.in.rest.cart;

import com.potucek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.port.in.api.cart.GetCartUseCase;
import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.customer.CustomerId;
import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.cart.Cart;
import jakarta.ws.rs.GET;
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
public class GetCartController {

  private final GetCartUseCase getCartUseCase;

  public GetCartController(GetCartUseCase getCartUseCase) {
    this.getCartUseCase = getCartUseCase;
  }

  @GET
  @Path("/{customerId}")
  public CartWebModel getCart(@PathParam("customerId") String customerIdString) {
    CustomerId customerId = parseCustomerId(customerIdString);
    Cart cart = getCartUseCase.getCart(customerId);
    return CartWebModel.fromDomainModel(cart);
  }
}
