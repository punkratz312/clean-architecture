package com.sap.shop.drivers.adapters.application.business.rules.port.in.cart;

import com.sap.shop.drivers.adapters.application.business.rules.enterprise.business.rules.cart.Cart;
import com.sap.shop.drivers.adapters.application.business.rules.enterprise.business.rules.cart.NotEnoughItemsInStockException;
import com.sap.shop.drivers.adapters.application.business.rules.enterprise.business.rules.customer.CustomerId;
import com.sap.shop.drivers.adapters.application.business.rules.enterprise.business.rules.product.ProductId;

/**
 * Use case: Adding a product to a shopping cart.
 *
 * @author Sven Woltmann
 */
public interface AddToCartUseCase {

    Cart addToCart(CustomerId customerId, ProductId productId, int quantity)
            throws com.sap.shop.drivers.adapters.application.business.rules.port.in.cart.ProductNotFoundException,
            NotEnoughItemsInStockException;

    Cart addToCart(CustomerId customerIdVeryVeryLong, ProductId productId, int quantity)
            throws ProductNotFoundException, NotEnoughItemsInStockException;
}
