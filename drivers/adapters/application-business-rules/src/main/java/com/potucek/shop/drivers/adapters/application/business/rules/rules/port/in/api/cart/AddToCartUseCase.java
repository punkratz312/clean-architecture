package com.potucek.shop.drivers.adapters.application.business.rules.rules.port.in.api.cart;

import com.potucek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.model.cart.Cart;
import com.potucek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.model.cart.NotEnoughItemsInStockException;
import com.potucek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.model.customer.CustomerId;
import com.potucek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.model.product.ProductId;
import com.potucek.shop.drivers.adapters.application.business.rules.rules.port.in.api.product.ProductNotFoundException;

/**
 * Use case: Adding a product to a shopping cart.
 *
 * @author Sven Woltmann
 */
public interface AddToCartUseCase {

    Cart addToCart(CustomerId customerId, ProductId productId, int quantity)
            throws ProductNotFoundException,
            NotEnoughItemsInStockException;

//    Cart addToCart(CustomerId customerIdVeryVeryLong, ProductId productId, int quantity)
//            throws ProductNotFoundException, NotEnoughItemsInStockException;
}
