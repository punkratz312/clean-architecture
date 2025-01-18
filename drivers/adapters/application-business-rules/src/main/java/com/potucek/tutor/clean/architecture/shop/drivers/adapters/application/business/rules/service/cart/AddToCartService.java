package com.potucek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.service.cart;

import com.potucek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.port.in.cart.AddToCartUseCase;
import com.potucek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.port.in.cart.ProductNotFoundException;
import com.potucek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.port.out.persistence.CartRepository;
import com.potucek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.port.out.persistence.ProductRepository;
import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.cart.Cart;
import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.cart.NotEnoughItemsInStockException;
import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.customer.CustomerId;
import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.product.Product;
import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.product.ProductId;

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
