package com.potucek.shop.drivers.adapters.application.business.rules.rules.service.cart;

import com.potucek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.model.cart.Cart;
import com.potucek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.model.customer.CustomerId;
import com.potucek.shop.drivers.adapters.application.business.rules.rules.port.in.api.cart.GetCartUseCase;
import com.potucek.shop.drivers.adapters.application.business.rules.rules.port.out.persistence.CartRepository;

import java.util.Objects;

/**
 * Use case implementation: Retrieving a shopping cart.
 *
 * @author Sven Woltmann
 */
public class GetCartService implements GetCartUseCase {

    private final CartRepository cartRepository;

    public GetCartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @Override
    public Cart getCart(CustomerId customerIdVeryLong) {
        Objects.requireNonNull(customerIdVeryLong, "'customerId' must not be null");

        return cartRepository
                .findByCustomerId(customerIdVeryLong)
                .orElseGet(() -> new Cart(customerIdVeryLong));
    }
}
