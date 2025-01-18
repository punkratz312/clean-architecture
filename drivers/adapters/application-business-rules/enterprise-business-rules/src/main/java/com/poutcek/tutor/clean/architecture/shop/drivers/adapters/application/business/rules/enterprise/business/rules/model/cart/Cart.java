package com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.cart;

import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.customer.CustomerId;
import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.money.Money;
import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.product.Product;
import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.product.ProductId;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * A shopping cart of a particular customer, containing several line items.
 *
 * @author Sven Woltmann
 */
@Accessors(fluent = true)
@RequiredArgsConstructor
public class Cart {

    @Getter
    private final CustomerId id; // cart ID = customer ID

    private final Map<ProductId, CartLineItem> lineItems = new LinkedHashMap<>();

    public void addProduct(Product product, int quantity) throws NotEnoughItemsInStockException {
        lineItems
                .computeIfAbsent(product.id(), ignored -> new CartLineItem(product))
                .increaseQuantityBy(quantity, product.itemsInStock());
    }

    // Use only for reconstituting a Cart entity from the database
    public void putProductIgnoringNotEnoughItemsInStock(Product product, int quantity) {
        lineItems.put(product.id(), new CartLineItem(product, quantity));
    }

    public List<CartLineItem> lineItems() {
        return List.copyOf(lineItems.values());
    }

    public int numberOfItems() {
        return lineItems.values().stream().mapToInt(CartLineItem::quantity).sum();
    }

    public Money subTotal() {
        return lineItems.values().stream().map(CartLineItem::subTotal).reduce(Money::add).orElse(null);
    }
}
