package com.potucek.shop.drivers.adapters.application.business.rules.registry;

import com.potucek.shop.drivers.core.application.services.domain.services.entities.hawk.Hawk;
import lombok.RequiredArgsConstructor;

import java.util.Set;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class HawkDomainServiceImpl implements HawkDomainService {

    private final HawkDomainRepo hawkDomainRepo;

    @Override
    public Set<Hawk> findAllHawksSortedByIUCNCategory() {
        return hawkDomainRepo.findAllHawksSortedByIUCNCategory().stream().map(o -> new Hawk(null, null, null, null)).collect(Collectors.toSet());
    }
}
