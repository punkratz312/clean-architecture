package com.potucek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.port.in.cart;

import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.cart.Cart;
import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.cart.NotEnoughItemsInStockException;
import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.customer.CustomerId;
import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.product.ProductId;

/**
 * Use case: Adding a product to a shopping cart.
 *
 * @author Sven Woltmann
 */
public interface AddToCartUseCase {

    Cart addToCart(CustomerId customerId, ProductId productId, int quantity)
            throws com.potucek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.port.in.cart.ProductNotFoundException,
            NotEnoughItemsInStockException;

//    Cart addToCart(CustomerId customerIdVeryVeryLong, ProductId productId, int quantity)
//            throws ProductNotFoundException, NotEnoughItemsInStockException;
}
