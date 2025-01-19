package com.potucek.shop.drivers.core.application.services.hawk.repo;

import com.potucek.shop.drivers.core.application.services.domain.service.entities.hawk.Hawk;
import com.potucek.shop.drivers.core.application.services.domain.service.hawk.register.HawkDomainRepo;

import java.util.Set;

public class HawkDomainRepoImpl implements HawkDomainRepo {
    @Override
    public Set<Hawk> findAllHawksSortedByIUCNCategory() {
        return Set.of();
    }
}
