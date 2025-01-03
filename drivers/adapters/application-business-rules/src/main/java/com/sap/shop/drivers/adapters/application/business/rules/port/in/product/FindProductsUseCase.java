package com.sap.shop.drivers.adapters.application.business.rules.port.in.product;

import com.sap.shop.model.product.Product;
import java.util.List;

/**
 * Use case: Finding products via a search query.
 *
 * @author Sven Woltmann
 */
public interface FindProductsUseCase {

  List<Product> findByNameOrDescription(String query);
}
