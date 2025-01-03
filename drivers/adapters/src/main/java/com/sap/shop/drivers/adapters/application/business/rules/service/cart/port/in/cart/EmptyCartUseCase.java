package com.sap.shop.drivers.adapters.application.business.rules.service.cart.port.in.cart;

import com.sap.shop.model.customer.CustomerId;

/**
 * Use case: Emptying a shopping cart.
 *
 * @author Sven Woltmann
 */
public interface EmptyCartUseCase {

  void emptyCart(CustomerId customerId);
}
