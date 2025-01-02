package com.sap.clean.architecture.shop.adapter.in.rest.cart;

import com.sap.clean.architecture.shop.model.cart.CartLineItem;
import com.sap.clean.architecture.shop.model.money.Money;
import com.sap.clean.architecture.shop.model.product.Product;

/**
 * Model class for returning a shopping cart line item via REST API.
 *
 * @author Sven Woltmann
 */
public record CartLineItemWebModel(
    String productId, String productName, Money price, int quantity) {

  public static CartLineItemWebModel fromDomainModel(CartLineItem lineItem) {
    Product product = lineItem.product();
    return new CartLineItemWebModel(
        product.id().value(), product.name(), product.price(), lineItem.quantity());
  }
}
