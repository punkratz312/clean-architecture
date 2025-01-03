package com.sap.shop.drivers.adapters.application.business.rules.rest.cart;


import eu.happycoders.shop.application.MoneyAdapter;

import java.util.List;

/**
 * Model class for returning a shopping cart via REST API.
 *
 * @author Sven Woltmann
 */
public record CartWebModel(
    List<CartLineItemWebModel> lineItems, int numberOfItems, MoneyAdapter subTotal) {

  static CartWebModel fromDomainModel(Cart cart) {
    return new CartWebModel(
        cart.lineItems().stream().map(CartLineItemWebModel::fromDomainModel).toList(),
        cart.numberOfItems(),
        cart.subTotal());
  }
}
