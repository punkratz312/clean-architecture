package com.potucek.shop.drivers.adapters.application.business.rules.rules.port.in.api.cart;

import com.potucek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.model.customer.CustomerId;

/**
 * Use case: Emptying a shopping cart.
 *
 * @author Sven Woltmann
 */
public interface EmptyCartUseCase {

    void emptyCart(CustomerId customerId);
}
