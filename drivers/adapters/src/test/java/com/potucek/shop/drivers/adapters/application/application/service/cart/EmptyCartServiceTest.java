package com.potucek.shop.drivers.adapters.application.application.service.cart;

import com.potucek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.model.customer.CustomerId;
import com.potucek.shop.drivers.adapters.application.business.rules.rules.port.out.persistence.CartRepository;
import com.potucek.shop.drivers.adapters.application.business.rules.rules.service.cart.EmptyCartService;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class EmptyCartServiceTest {

    private static final CustomerId TEST_CUSTOMER_ID = new CustomerId(61157);

    private final CartRepository cartRepository = mock(CartRepository.class);
    private final EmptyCartService emptyCartService = new EmptyCartService(cartRepository);

    @Test
    void emptyCart_invokesDeleteOnThePersistencePort() {
        emptyCartService.emptyCart(TEST_CUSTOMER_ID);

        verify(cartRepository).deleteByCustomerId(TEST_CUSTOMER_ID);
    }
}
