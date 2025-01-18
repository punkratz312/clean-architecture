package com.potucek.shop.drivers.adapters.application.business.rules.port.in.api.cart;

import com.potucek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.cart.Cart;
import com.potucek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.customer.CustomerId;

/**
 * Use case: Retrieving a shopping cart.
 *
 * @author Sven Woltmann
 */
public interface GetCartUseCase {

    Cart getCart(CustomerId customerId);
}
