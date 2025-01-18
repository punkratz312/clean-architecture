package com.poutcek.tutor.clean.architecture.shop.drivers.in.rest.cart;

import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.cart.CartLineItem;
import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.money.Money;
import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.product.Product;

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
