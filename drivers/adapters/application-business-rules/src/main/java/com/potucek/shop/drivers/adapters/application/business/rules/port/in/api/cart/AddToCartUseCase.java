package com.potucek.shop.drivers.adapters.application.business.rules.port.in.api.cart;

import com.potucek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.cart.Cart;
import com.potucek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.cart.NotEnoughItemsInStockException;
import com.potucek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.customer.CustomerId;
import com.potucek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.product.ProductId;

/**
 * Use case: Adding a product to a shopping cart.
 *
 * @author Sven Woltmann
 */
public interface AddToCartUseCase {

    Cart addToCart(CustomerId customerId, ProductId productId, int quantity)
            throws ProductNotFoundException,
            NotEnoughItemsInStockException;
}
