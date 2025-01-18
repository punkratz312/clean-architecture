package com.potucek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.rules.port.in.cart;

import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.rules.cart.Cart;
import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.rules.cart.NotEnoughItemsInStockException;
import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.rules.customer.CustomerId;
import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.rules.product.ProductId;

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
