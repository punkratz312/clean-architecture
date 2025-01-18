package com.potucek.shop.drivers.adapters.application.business.rules.rules.service.cart;

import com.potucek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.model.cart.Cart;
import com.potucek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.model.cart.NotEnoughItemsInStockException;
import com.potucek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.model.customer.CustomerId;
import com.potucek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.model.product.Product;
import com.potucek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.model.product.ProductId;
import com.potucek.shop.drivers.adapters.application.business.rules.rules.port.in.api.cart.AddToCartUseCase;
import com.potucek.shop.drivers.adapters.application.business.rules.rules.port.in.api.product.ProductNotFoundException;
import com.potucek.shop.drivers.adapters.application.business.rules.rules.port.out.persistence.CartRepository;
import com.potucek.shop.drivers.adapters.application.business.rules.rules.port.out.persistence.ProductRepository;

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
