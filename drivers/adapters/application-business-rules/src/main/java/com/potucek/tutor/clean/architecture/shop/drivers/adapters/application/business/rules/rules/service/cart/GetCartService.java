package com.potucek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.service.cart;

import com.potucek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.port.out.persistence.CartRepository;
import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.cart.Cart;
import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.customer.CustomerId;
import com.potucek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.port.in.cart.GetCartUseCase;

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
