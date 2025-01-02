package com.sap.shop.application.port.in.cart;

import com.sap.shop.model.cart.Cart;
import com.sap.shop.model.customer.CustomerId;

/**
 * Use case: Retrieving a shopping cart.
 *
 * @author Sven Woltmann
 */
public interface GetCartUseCase {

  Cart getCart(CustomerId customerId);
}
