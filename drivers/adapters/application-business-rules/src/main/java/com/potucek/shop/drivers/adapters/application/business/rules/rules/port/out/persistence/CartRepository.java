package com.potucek.shop.drivers.adapters.application.business.rules.rules.port.out.persistence;

import com.potucek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.model.cart.Cart;
import com.potucek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.model.customer.CustomerId;

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
