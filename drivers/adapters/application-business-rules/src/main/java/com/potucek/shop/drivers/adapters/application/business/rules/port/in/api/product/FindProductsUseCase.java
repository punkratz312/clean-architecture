package com.potucek.shop.drivers.adapters.application.business.rules.port.in.api.product;

import com.potucek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.product.Product;

import java.util.List;

/**
 * Use case: Finding products via a search query.
 *
 * @author Sven Woltmann
 */
public interface FindProductsUseCase {

    List<Product> findByNameOrDescription(String query);
}
