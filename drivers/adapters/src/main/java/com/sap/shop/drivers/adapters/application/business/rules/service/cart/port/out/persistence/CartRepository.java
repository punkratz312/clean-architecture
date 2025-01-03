package com.sap.shop.drivers.adapters.application.business.rules.service.cart.port.out.persistence;

import com.sap.shop.model.cart.Cart;
import com.sap.shop.model.customer.CustomerId;
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
