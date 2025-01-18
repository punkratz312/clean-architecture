package com.potucek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.port.in.api.cart;

import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.customer.CustomerId;

/**
 * Use case: Emptying a shopping cart.
 *
 * @author Sven Woltmann
 */
public interface EmptyCartUseCase {

    void emptyCart(CustomerId customerId);
}
