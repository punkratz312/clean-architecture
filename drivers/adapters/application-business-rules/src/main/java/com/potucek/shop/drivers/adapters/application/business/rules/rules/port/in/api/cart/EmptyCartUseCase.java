package com.potucek.shop.drivers.adapters.application.business.rules.rules.port.in.api.cart;

import com.poutcek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.customer.CustomerId;

/**
 * Use case: Emptying a shopping cart.
 *
 * @author Sven Woltmann
 */
public interface EmptyCartUseCase {

    void emptyCart(CustomerId customerId);
}
