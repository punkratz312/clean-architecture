package com.sap.clean.architecture.shop.application.service.cart;

import com.sap.clean.architecture.shop.application.port.in.cart.GetCartUseCase;
import com.sap.clean.architecture.shop.application.port.out.persistence.CartRepository;
import com.sap.clean.architecture.shop.model.cart.Cart;
import com.sap.clean.architecture.shop.model.customer.CustomerId;
import java.util.Objects;

/**
 * Use case implementation: Retrieving a shopping cart.
 *
 * @author Sven Woltmann
 */
public class GetCartService implements GetCartUseCase {

  private final CartRepository cartRepository;

  public GetCartService(CartRepository cartRepository) {
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
