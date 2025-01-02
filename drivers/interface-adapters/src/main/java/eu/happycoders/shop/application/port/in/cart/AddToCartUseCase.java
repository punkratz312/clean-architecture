package com.sap.clean.architecture.shop.application.port.in.cart;

import com.sap.clean.architecture.shop.model.cart.Cart;
import com.sap.clean.architecture.shop.model.cart.NotEnoughItemsInStockException;
import com.sap.clean.architecture.shop.model.customer.CustomerId;
import com.sap.clean.architecture.shop.model.product.ProductId;

/**
 * Use case: Adding a product to a shopping cart.
 *
 * @author Sven Woltmann
 */
public interface AddToCartUseCase {

  Cart addToCart(CustomerId customerId, ProductId productId, int quantity)
      throws ProductNotFoundException, NotEnoughItemsInStockException;
}
