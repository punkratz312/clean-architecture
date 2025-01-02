package com.sap.clean.architecture.shop.application.port.in.cart;

import com.sap.clean.architecture.shop.model.cart.Cart;
import com.sap.clean.architecture.shop.model.customer.CustomerId;

/**
 * Use case: Retrieving a shopping cart.
 *
 * @author Sven Woltmann
 */
public interface GetCartUseCase {

  Cart getCart(CustomerId customerId);
}
