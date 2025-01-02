package com.sap.shop.application.port.out.persistence;

import com.sap.shop.model.product.Product;
import com.sap.shop.model.product.ProductId;
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
