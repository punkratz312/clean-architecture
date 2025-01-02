package com.sap.shop.adapter.in.rest.cart;

import com.sap.shop.model.cart.Cart;
import com.sap.shop.model.money.Money;
import java.util.List;

/**
 * Model class for returning a shopping cart via REST API.
 *
 * @author Sven Woltmann
 */
public record CartWebModel(
    List<CartLineItemWebModel> lineItems, int numberOfItems, Money subTotal) {

  static CartWebModel fromDomainModel(Cart cart) {
    return new CartWebModel(
        cart.lineItems().stream().map(CartLineItemWebModel::fromDomainModel).toList(),
        cart.numberOfItems(),
        cart.subTotal());
  }
}
