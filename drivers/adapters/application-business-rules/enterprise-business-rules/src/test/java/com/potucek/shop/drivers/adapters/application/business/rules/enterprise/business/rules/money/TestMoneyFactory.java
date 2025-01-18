package com.potucek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.money;

import com.potucek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.model.money.Money;

import java.util.Currency;

public class TestMoneyFactory {

    private static final Currency EUR = Currency.getInstance("EUR");
    private static final Currency USD = Currency.getInstance("USD");

    public static Money euros(int euros, int cents) {
        return Money.of(EUR, euros, cents);
    }

    public static Money usDollars(int dollars, int cents) {
        return Money.of(USD, dollars, cents);
    }
}
