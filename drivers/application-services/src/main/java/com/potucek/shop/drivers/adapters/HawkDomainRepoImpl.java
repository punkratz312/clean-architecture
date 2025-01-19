package com.potucek.shop.drivers.adapters;

import com.potucek.shop.drivers.adapters.application.business.rules.registry.HawkDomainRepo;
import com.potucek.shop.drivers.core.application.services.domain.services.entities.hawk.Hawk;
import com.potucek.shop.drivers.core.application.services.hawk.port.HawkRepoPort;
import lombok.RequiredArgsConstructor;

import java.util.Set;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class HawkDomainRepoImpl implements HawkDomainRepo {

    private final HawkRepoPort hawkRepoPort;

    @Override
    public Set<Hawk> findAllHawksSortedByIUCNCategory() {
        return hawkRepoPort.findAllHawksSortedByIUCNCategory().stream().map(o -> new Hawk(null, null, null, null)).collect(Collectors.toSet());

    }
}
