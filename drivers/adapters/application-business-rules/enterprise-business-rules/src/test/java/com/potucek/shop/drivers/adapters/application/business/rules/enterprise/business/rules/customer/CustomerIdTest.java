package com.potucek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.customer;

import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.customer.CustomerId;
import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CustomerIdTest {
    @ParameterizedTest
    @ValueSource(ints = {-100, -1, 0})
    void givenAValueLessThan1_newCustomerId_throwsException(int value) {
        ThrowableAssert.ThrowingCallable invocation = () -> new CustomerId(value);

        assertThatIllegalArgumentException().isThrownBy(invocation);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 8_765, 2_000_000_000})
    void givenAValueGreatThanOrEqualTo1_newCustomerId_succeeds(int value) {
        CustomerId customerId = new CustomerId(value);

        assertThat(customerId.value()).isEqualTo(value);
    }
}
