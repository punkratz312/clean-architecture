package com.sap.shop.drivers.adapters.application.business.rules.enterprise.business.rules.cart;

import com.sap.shop.drivers.adapters.application.business.rules.enterprise.business.rules.cart.customer.CustomerId;
import java.util.concurrent.ThreadLocalRandom;

public class TestCartFactory {

  public static Cart emptyCartForRandomCustomer() {
    return new Cart(new CustomerId(ThreadLocalRandom.current().nextInt(1_000_000)));
  }
}
