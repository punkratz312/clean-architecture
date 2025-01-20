package com.potucek.shop.drivers.core.application.services.domain.services.hawk.port.repo;

import com.potucek.shop.drivers.core.application.services.domain.services.entities.hawk.port.repo.HawkRepository;

import java.util.Set;

public class HawkRepositoryImpl implements HawkRepository {

    @Override
    public Set<String> findAllHawksSortedByIUCNCategory() {
        return Set.of();
    }
}
