package com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.port.out.persistence;


import com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.product.Product;
import com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.product.ProductId;

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
