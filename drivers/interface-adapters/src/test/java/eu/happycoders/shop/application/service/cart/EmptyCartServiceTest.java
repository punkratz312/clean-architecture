package com.sap.clean.architecture.shop.application.service.cart;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import com.sap.clean.architecture.shop.application.port.out.persistence.CartRepository;
import com.sap.clean.architecture.shop.model.customer.CustomerId;
import org.junit.jupiter.api.Test;

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
