package com.potucek.shop.drivers.adapters.application.business.rules.rules.port.out.persistence.

.shop.drivers.adapters.application.business.rules.port.out.persistence;

import com.poutcek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.product.Product;
import com.poutcek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.product.ProductId;

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
