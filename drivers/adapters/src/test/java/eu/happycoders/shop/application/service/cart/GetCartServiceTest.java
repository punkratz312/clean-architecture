package com.sap.shop.drivers.adapters.application.service.cart;

import static com.sap.shop.model.money.TestMoneyFactory.euros;
import static com.sap.shop.model.product.TestProductFactory.createTestProduct;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

import com.sap.shop.drivers.adapters.application.business.rules.service.cart.port.out.persistence.CartRepository;
import com.sap.shop.drivers.adapters.application.business.rules.service.cart.service.cart.GetCartService;
import com.sap.shop.model.cart.Cart;
import com.sap.shop.model.cart.NotEnoughItemsInStockException;
import com.sap.shop.model.customer.CustomerId;
import com.sap.shop.model.product.Product;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class GetCartServiceTest {

  private static final CustomerId TEST_CUSTOMER_ID = new CustomerId(61157);
  private static final Product TEST_PRODUCT_1 = createTestProduct(euros(19, 99));
  private static final Product TEST_PRODUCT_2 = createTestProduct(euros(25, 99));

  private final CartRepository cartRepository = mock(CartRepository.class);
  private final GetCartService getCartService = new GetCartService(cartRepository);

  @Test
  void givenCartIsPersisted_getCart_returnsPersistedCart() throws NotEnoughItemsInStockException {
    Cart persistedCart = new Cart(TEST_CUSTOMER_ID);
    persistedCart.addProduct(TEST_PRODUCT_1, 1);
    persistedCart.addProduct(TEST_PRODUCT_2, 5);

    Mockito.when(cartRepository.findByCustomerId(TEST_CUSTOMER_ID))
        .thenReturn(Optional.of(persistedCart));

    Cart cart = getCartService.getCart(TEST_CUSTOMER_ID);

    assertThat(cart).isSameAs(persistedCart);
  }

  @Test
  void givenCartIsNotPersisted_getCart_returnsAnEmptyCart() {
    Mockito.when(cartRepository.findByCustomerId(TEST_CUSTOMER_ID)).thenReturn(Optional.empty());

    Cart cart = getCartService.getCart(TEST_CUSTOMER_ID);

    assertThat(cart).isNotNull();
    assertThat(cart.lineItems()).isEmpty();
  }
}
