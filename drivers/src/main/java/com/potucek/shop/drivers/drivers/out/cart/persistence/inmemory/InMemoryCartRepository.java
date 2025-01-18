package com.potucek.shop.drivers.drivers.out.cart.persistence.inmemory;

import com.potucek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.cart.Cart;
import com.potucek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.customer.CustomerId;
import com.potucek.shop.drivers.adapters.application.business.rules.port.out.persistence.CartRepository;

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
