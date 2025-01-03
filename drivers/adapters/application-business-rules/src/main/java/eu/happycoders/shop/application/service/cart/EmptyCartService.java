package com.sap.shop.application.service.cart;

import com.sap.shop.application.port.in.cart.EmptyCartUseCase;
import com.sap.shop.application.port.out.persistence.CartRepository;
import com.sap.shop.model.customer.CustomerId;
import java.util.Objects;

/**
 * Use case implementation: Emptying a shopping cart.
 *
 * @author Sven Woltmann
 */
public class EmptyCartService implements EmptyCartUseCase {

  private final CartRepository cartRepository;

  public EmptyCartService(CartRepository cartRepository) {
    this.cartRepository = cartRepository;
  }

  @Override
  public void emptyCart(CustomerId customerId) {
    Objects.requireNonNull(customerId, "'customerId' must not be null");

    cartRepository.deleteByCustomerId(customerId);
  }
}
