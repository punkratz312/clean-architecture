package com.sap.clean.architecture.shop.application.port.in.product;

import com.sap.clean.architecture.shop.model.product.Product;
import java.util.List;

/**
 * Use case: Finding products via a search query.
 *
 * @author Sven Woltmann
 */
public interface FindProductsUseCase {

  List<Product> findByNameOrDescription(String query);
}
