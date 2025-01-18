package com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.service.product;

import com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.product.Product;
import com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.port.in.product.FindProductsUseCase;
import com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.port.out.persistence.ProductRepository;

import java.util.List;
import java.util.Objects;

/**
 * Use case implementation: Finding products via a search query.
 *
 * @author Sven Woltmann
 */
public class FindProductsService implements FindProductsUseCase {

    private final ProductRepository productRepository;

    public FindProductsService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findByNameOrDescription(String query) {
        Objects.requireNonNull(query, "'query' must not be null");
        if (query.length() < 2) {
            throw new IllegalArgumentException("'query' must be at least two characters long");
        }

        return productRepository.findByNameOrDescription(query);
    }
}
