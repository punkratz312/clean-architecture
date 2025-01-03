package com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.port.in.cart;

import com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.cart.Cart;
import com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.cart.NotEnoughItemsInStockException;
import com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.customer.CustomerId;
import com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.product.ProductId;

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
