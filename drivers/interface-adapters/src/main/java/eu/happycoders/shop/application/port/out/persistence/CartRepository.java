package com.sap.clean.architecture.shop.application.port.out.persistence;

import com.sap.clean.architecture.shop.model.cart.Cart;
import com.sap.clean.architecture.shop.model.customer.CustomerId;
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
