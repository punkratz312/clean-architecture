package com.potucek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.port.in.cart;

import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.cart.Cart;
import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.customer.CustomerId;

/**
 * Use case: Retrieving a shopping cart.
 *
 * @author Sven Woltmann
 */
public interface GetCartUseCase {

    Cart getCart(CustomerId customerId);
}
