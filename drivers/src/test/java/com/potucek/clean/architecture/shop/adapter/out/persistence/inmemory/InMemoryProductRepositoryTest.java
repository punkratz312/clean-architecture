package com.potucek.clean.architecture.shop.adapter.out.persistence.inmemory;

import com.potucek.clean.architecture.shop.adapter.out.persistence.AbstractProductRepositoryTest;
import com.potucek.tutor.clean.architecture.shop.drivers.in.rest.cart.persistence.InMemoryProductRepository;.inmemory.InMemoryProductRepository;

class InMemoryProductRepositoryTest
    extends AbstractProductRepositoryTest<InMemoryProductRepository> {

  @Override
  protected InMemoryProductRepository createProductRepository() {
    return new InMemoryProductRepository();
  }
}
