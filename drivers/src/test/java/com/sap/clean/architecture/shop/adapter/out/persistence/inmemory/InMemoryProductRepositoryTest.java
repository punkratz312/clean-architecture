package com.sap.clean.architecture.shop.adapter.out.persistence.inmemory;

import com.sap.clean.architecture.shop.adapter.out.persistence.AbstractProductRepositoryTest;

class InMemoryProductRepositoryTest
    extends AbstractProductRepositoryTest<InMemoryProductRepository> {

  @Override
  protected InMemoryProductRepository createProductRepository() {
    return new InMemoryProductRepository();
  }
}
