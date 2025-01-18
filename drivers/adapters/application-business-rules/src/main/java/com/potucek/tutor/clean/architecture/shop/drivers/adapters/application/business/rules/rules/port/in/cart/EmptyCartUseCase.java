package com.potucek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.rules.port.in.cart;

import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.rules.customer.CustomerId;

/**
 * Use case: Emptying a shopping cart.
 *
 * @author Sven Woltmann
 */
public interface EmptyCartUseCase {

    void emptyCart(CustomerId customerId);
}
