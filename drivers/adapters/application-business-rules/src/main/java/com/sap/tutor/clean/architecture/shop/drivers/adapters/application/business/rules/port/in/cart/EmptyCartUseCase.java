package com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.port.in.cart;

import com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.customer.CustomerId;

/**
 * Use case: Emptying a shopping cart.
 *
 * @author Sven Woltmann
 */
public interface EmptyCartUseCase {

    void emptyCart(CustomerId customerId);
}
