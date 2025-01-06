package com.sap.tutor.clean.architecture.shop.drivers.rest.cart.rest.product;

import com.sap.tutor.clean.architecture.shop.model.money.Money;
import com.sap.tutor.clean.architecture.shop.model.product.Product;

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
