//package com.potucek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.service.cart;
//
//import com.potucek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.port.out.persistence.ProductRepository;
//import com.potucek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.service.product.FindProductsService;
//import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.product
// .Product;
//import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
//import org.junit.jupiter.api.Test;
//
//import java.util.List;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//
//class FindProductsServiceTest {
//
//    private static final Product TEST_PRODUCT_1 = createTestProduct(euros(19, 99));
//    private static final Product TEST_PRODUCT_2 = TestProductFactory.createTestProduct(euros(25, 99));
//
//    private final ProductRepository productRepository = mock(ProductRepository.class);
//    private final FindProductsService findProductsService =
//            new FindProductsService(productRepository);
//
//    @Test
//    void givenASearchQuery_findByNameOrDescription_returnsTheProductsReturnedByThePersistencePort() {
//        when(productRepository.findByNameOrDescription("one")).thenReturn(List.of(TEST_PRODUCT_1));
//        when(productRepository.findByNameOrDescription("two")).thenReturn(List.of(TEST_PRODUCT_2));
//        when(productRepository.findByNameOrDescription("one-two"))
//                .thenReturn(List.of(TEST_PRODUCT_1, TEST_PRODUCT_2));
//        when(productRepository.findByNameOrDescription("empty")).thenReturn(List.of());
//
//        assertThat(findProductsService.findByNameOrDescription("one")).containsExactly(TEST_PRODUCT_1);
//        assertThat(findProductsService.findByNameOrDescription("two")).containsExactly(TEST_PRODUCT_2);
//        assertThat(findProductsService.findByNameOrDescription("one-two"))
//                .containsExactly(TEST_PRODUCT_1, TEST_PRODUCT_2);
//        assertThat(findProductsService.findByNameOrDescription("empty")).isEmpty();
//    }
//
//    @Test
//    void givenATooShortSearchQuery_findByNameOrDescription_throwsAnException() {
//        String searchQuery = "x";
//
//        ThrowingCallable invocation = () -> findProductsService.findByNameOrDescription(searchQuery);
//
//        assertThatIllegalArgumentException().isThrownBy(invocation);
//    }
//}
