package com.potucek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.service.cart;

import com.potucek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.port.in.api.cart.EmptyCartUseCase;
import com.potucek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.port.out.persistence.CartRepository;
import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.customer.CustomerId;

import java.util.Objects;

/**
 * Use case implementation: Emptying a shopping cart.
 *
 * @author Sven Woltmann
 */
public class EmptyCartService implements EmptyCartUseCase {

    private final CartRepository cartRepository;

    public EmptyCartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @Override
    public void emptyCart(CustomerId customerId) {
        Objects.requireNonNull(customerId, "'customerId' must not be null");

        cartRepository.deleteByCustomerId(customerId);
    }
}
