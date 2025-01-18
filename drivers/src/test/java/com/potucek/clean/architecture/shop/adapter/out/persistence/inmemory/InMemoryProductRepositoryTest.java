package com.potucek.clean.architecture.shop.adapter.out.persistence.inmemory;

import com.potucek.clean.architecture.shop.adapter.out.persistence.AbstractProductRepositoryTest;
import com.poutcek.shop.drivers.out.cart.persistence.InMemoryProductRepository;.inmemory.InMemoryProductRepository;

class InMemoryProductRepositoryTest
    extends AbstractProductRepositoryTest<InMemoryProductRepository> {

  @Override
  protected InMemoryProductRepository createProductRepository() {
    return new InMemoryProductRepository();
  }
}
