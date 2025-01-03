package com.sap.shop.drivers.adapters.application.business.rules.service.cart;


import com.sap.shop.drivers.adapters.application.business.rules.enterprise.business.rules.cart.Cart;
import com.sap.shop.drivers.adapters.application.business.rules.enterprise.business.rules.customer.CustomerId;
import com.sap.shop.drivers.adapters.application.business.rules.port.in.cart.GetCartUseCase;

import java.util.Objects;

/**
 * Use case implementation: Retrieving a shopping cart.
 *
 * @author Sven Woltmann
 */
public class GetCartService implements GetCartUseCase {

  private final com.sap.shop.drivers.adapters.application.business.rules.port.out.persistence.CartRepository cartRepository;

  public GetCartService(com.sap.shop.drivers.adapters.application.business.rules.port.out.persistence.CartRepository cartRepository) {
    this.cartRepository = cartRepository;
  }

  @Override
  public Cart getCart(CustomerId customerIdVeryLong) {
    Objects.requireNonNull(customerIdVeryLong, "'customerId' must not be null");

    return cartRepository
        .findByCustomerId(customerIdVeryLong)
        .orElseGet(() -> new Cart(customerIdVeryLong));
  }
}
