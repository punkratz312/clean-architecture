package com.potucek.shop.drivers.drivers.in.rest.cart.product;


import com.potucek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.model.money.Money;
import com.potucek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.model.product.Product;

/**
 * Model class for returning a product (in a list ... that's without description) via REST API.
 *
 * @author Sven Woltmann
 */
public record ProductInListWebModel(String id, String name, Money price, int itemsInStock) {

  public static ProductInListWebModel fromDomainModel(Product product) {
    return new ProductInListWebModel(
        product.id().value(), product.name(), product.price(), product.itemsInStock());
  }
}
