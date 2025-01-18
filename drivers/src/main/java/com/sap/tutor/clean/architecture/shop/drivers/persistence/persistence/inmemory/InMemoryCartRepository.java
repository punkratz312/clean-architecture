package com.sap.tutor.clean.architecture.shop.drivers.persistence.persistence.inmemory;

import com.sap.tutor.clean.architecture.shop.application.port.out.persistence.CartRepository;
import com.sap.tutor.clean.architecture.shop.model.cart.Cart;
import com.sap.tutor.clean.architecture.shop.model.customer.CustomerId;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Persistence adapter: Stores carts in memory.
 *
 * @author Sven Woltmann
 */
public class InMemoryCartRepository implements CartRepository {

    private final Map<CustomerId, Cart> carts = new ConcurrentHashMap<>();

    @Override
    public void save(Cart cart) {
        carts.put(cart.id(), cart);
    }

    @Override
    public Optional<Cart> findByCustomerId(CustomerId customerId) {
        return Optional.ofNullable(carts.get(customerId));
    }

    @Override
    public void deleteByCustomerId(CustomerId customerId) {
        carts.remove(customerId);
    }
}
