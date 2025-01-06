package com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.rest.cart;

import com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.cart.Cart;
import com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.money.Money;

import java.util.List;

/**
 * Model class for returning a shopping cart via REST API.
 *
 * @author Sven Woltmann
 */
public record CartWebModel(List<CartLineItemWebModel> lineItems, int numberOfItems, Money subTotal) {

    static CartWebModel fromDomainModel(Cart cart) {
        return new CartWebModel(
                cart.lineItems().stream().map(CartLineItemWebModel::fromDomainModel).toList(),
                cart.numberOfItems(),
                cart.subTotal());
    }
}
