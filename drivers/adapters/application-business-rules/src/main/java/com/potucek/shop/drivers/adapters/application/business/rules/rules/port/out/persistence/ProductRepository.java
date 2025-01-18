package com.potucek.shop.drivers.adapters.application.business.rules.rules.port.out.persistence;

import com.potucek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.model.product.Product;
import com.potucek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.model.product.ProductId;

import java.util.List;
import java.util.Optional;

/**
 * Outgoing persistence port for products.
 *
 * @author Sven Woltmann
 */
public interface ProductRepository {

    void save(Product product);

    Optional<Product> findById(ProductId productId);

    List<Product> findByNameOrDescription(String query);
}
