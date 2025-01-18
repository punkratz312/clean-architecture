package com.potucek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.rules.port.in.product;

import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.rules.product.Product;

import java.util.List;

/**
 * Use case: Finding products via a search query.
 *
 * @author Sven Woltmann
 */
public interface FindProductsUseCase {

    List<Product> findByNameOrDescription(String query);
}
