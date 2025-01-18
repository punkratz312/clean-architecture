package com.potucek.shop.drivers.adapters.application.business.rules.port.out.persistence;

import com.potucek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.cart.Cart;
import com.potucek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.customer.CustomerId;

import java.util.Optional;

/**
 * Outgoing persistence port for carts.
 *
 * @author Sven Woltmann
 */
public interface CartRepository {

    void save(Cart cart);

    Optional<Cart> findByCustomerId(CustomerId customerId);

    void deleteByCustomerId(CustomerId customerId);
}
