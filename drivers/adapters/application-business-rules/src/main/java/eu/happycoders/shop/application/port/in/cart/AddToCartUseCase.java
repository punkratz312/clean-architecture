package com.sap.shop.application.port.in.cart;

import com.sap.shop.model.cart.Cart;
import com.sap.shop.model.cart.NotEnoughItemsInStockException;
import com.sap.shop.model.customer.CustomerId;
import com.sap.shop.model.product.ProductId;

/**
 * Use case: Adding a product to a shopping cart.
 *
 * @author Sven Woltmann
 */
public interface AddToCartUseCase {

  Cart addToCart(CustomerId customerId, ProductId productId, int quantity)
      throws ProductNotFoundException, NotEnoughItemsInStockException;
}
