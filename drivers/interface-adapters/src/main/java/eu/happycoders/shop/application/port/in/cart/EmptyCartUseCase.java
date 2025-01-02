package com.sap.clean.architecture.shop.application.port.in.cart;

import com.sap.clean.architecture.shop.model.customer.CustomerId;

/**
 * Use case: Emptying a shopping cart.
 *
 * @author Sven Woltmann
 */
public interface EmptyCartUseCase {

  void emptyCart(CustomerId customerId);
}
