package com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.service.cart;

import com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.cart.Cart;
import com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.cart.NotEnoughItemsInStockException;
import com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.customer.CustomerId;
import com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.product.Product;
import com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.product.ProductId;
import com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.port.in.cart.AddToCartUseCase;
import com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.port.in.cart.ProductNotFoundException;
import com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.port.out.persistence.CartRepository;
import com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.port.out.persistence.ProductRepository;

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
