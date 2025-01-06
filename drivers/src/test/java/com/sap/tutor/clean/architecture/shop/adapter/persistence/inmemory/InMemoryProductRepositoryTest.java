package com.sap.tutor.clean.architecture.shop.adapter.persistence.inmemory;

import com.sap.tutor.clean.architecture.shop.adapter.persistence.AbstractProductRepositoryTest;

class InMemoryProductRepositoryTest
        extends AbstractProductRepositoryTest<InMemoryProductRepository> {

    @Override
    protected InMemoryProductRepository createProductRepository() {
        return new InMemoryProductRepository();
    }
}
