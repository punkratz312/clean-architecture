package com.potucek.shop.drivers.core.application.services.domain.services.hawk.port.repo;

import com.potucek.shop.drivers.core.application.services.domain.services.entities.hawk.port.repo.HawkRepository;

import java.util.Set;

class HawkRepositoryImpl implements HawkRepository {

//    private final HawkApplicationRepo s;

    @Override
    public Set<String> findAllHawksSortedByIUCNCategory() {
        return Set.of();
    }
}
