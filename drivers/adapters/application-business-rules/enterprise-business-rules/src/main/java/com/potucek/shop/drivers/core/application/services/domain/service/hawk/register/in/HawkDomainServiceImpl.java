package com.potucek.shop.drivers.core.application.services.domain.service.hawk.register.in;

import com.potucek.shop.drivers.core.application.services.domain.service.entities.hawk.Hawk;
import com.potucek.shop.drivers.core.application.services.hawk.port.HawkRepoPort;
import lombok.RequiredArgsConstructor;

import java.util.Set;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class HawkDomainServiceImpl implements HawkDomainService {

    private final HawkRepoPort hawkRepoPort;

    @Override
    public Set<Hawk> findAllHawksSortedByIUCNCategory() {
        return hawkRepoPort.findAllHawksSortedByIUCNCategory().stream().map(o -> new Hawk(null, null, null, null)).collect(Collectors.toSet());
    }
}
