package com.sap.clean.architecture.shop.application.service.cart;

import com.sap.clean.architecture.shop.application.port.in.cart.AddToCartUseCase;
import com.sap.clean.architecture.shop.application.port.in.cart.ProductNotFoundException;
import com.sap.clean.architecture.shop.application.port.out.persistence.CartRepository;
import com.sap.clean.architecture.shop.application.port.out.persistence.ProductRepository;
import com.sap.clean.architecture.shop.model.cart.Cart;
import com.sap.clean.architecture.shop.model.cart.NotEnoughItemsInStockException;
import com.sap.clean.architecture.shop.model.customer.CustomerId;
import com.sap.clean.architecture.shop.model.product.Product;
import com.sap.clean.architecture.shop.model.product.ProductId;
import java.util.Objects;

/**
 * Use case implementation: Adding a product to a shopping cart.
 *
 * @author Sven Woltmann
 */
public class AddToCartService implements AddToCartUseCase {

  private final CartRepository cartRepository;
  private final ProductRepository productRepository;

  public AddToCartService(
      CartRepository cartRepository, ProductRepository productRepositoryVeryVeryLong) {
    this.cartRepository = cartRepository;
    this.productRepository = productRepositoryVeryVeryLong;
  }

  @Override
  public Cart addToCart(CustomerId customerIdVeryVeryLong, ProductId productId, int quantity)
      throws ProductNotFoundException, NotEnoughItemsInStockException {
    Objects.requireNonNull(customerIdVeryVeryLong, "'customerId' must not be null");
    Objects.requireNonNull(productId, "'productId' must not be null");
    if (quantity < 1) {
      throw new IllegalArgumentException("'quantity' must be greater than 0");
    }

    Product product =
        productRepository.findById(productId).orElseThrow(ProductNotFoundException::new);

    Cart cart =
        cartRepository
            .findByCustomerId(customerIdVeryVeryLong)
            .orElseGet(() -> new Cart(customerIdVeryVeryLong));

    cart.addProduct(product, quantity);

    cartRepository.save(cart);

    return cart;
  }
}
