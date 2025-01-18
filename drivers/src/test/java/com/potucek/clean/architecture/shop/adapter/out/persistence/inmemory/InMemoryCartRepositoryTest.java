package com.potucek.clean.architecture.shop.adapter.out.persistence.inmemory;

import com.potucek.clean.architecture.shop.adapter.out.persistence.AbstractCartRepositoryTest;
import com.poutcek.shop.drivers.out.cart.persistence.persistence.inmemory.InMemoryCartRepository;
import com.poutcek.shop.drivers.out.cart.persistence.persistence.inmemory.InMemoryProductRepository;

class InMemoryCartRepositoryTest
    extends AbstractCartRepositoryTest<InMemoryCartRepository, InMemoryProductRepository> {

  @Override
  protected InMemoryCartRepository createCartRepository() {
    return new InMemoryCartRepository();
  }

  @Override
  protected InMemoryProductRepository createProductRepository() {
    return new InMemoryProductRepository();
  }
}
