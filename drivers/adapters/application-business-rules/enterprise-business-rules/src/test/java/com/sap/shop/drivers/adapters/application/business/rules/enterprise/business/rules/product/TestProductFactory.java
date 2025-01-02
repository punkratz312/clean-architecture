package com.sap.shop.drivers.adapters.application.business.rules.enterprise.business.rules.product;

import com.sap.shop.drivers.adapters.application.business.rules.enterprise.business.rules.money.Money;

public class TestProductFactory {

  private static final int ENOUGH_ITEMS_IN_STOCK = Integer.MAX_VALUE;

  public static Product createTestProduct(Money price) {
    return createTestProduct(price, ENOUGH_ITEMS_IN_STOCK);
  }

  public static Product createTestProduct(Money price, int itemsInStock) {
    return new Product(
        ProductId.randomProductId(), //
        "any name",
        "any description",
        price,
        itemsInStock);
  }
}
