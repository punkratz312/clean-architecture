package com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.port.in.cart;

import com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.cart.Cart;
import com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.customer.CustomerId;

/**
 * Use case: Retrieving a shopping cart.
 *
 * @author Sven Woltmann
 */
public interface GetCartUseCase {

    Cart getCart(CustomerId customerId);
}
