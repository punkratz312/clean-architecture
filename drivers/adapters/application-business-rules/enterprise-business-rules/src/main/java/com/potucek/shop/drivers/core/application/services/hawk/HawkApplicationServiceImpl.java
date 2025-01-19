package com.potucek.shop.drivers.core.application.services.hawk;

import com.potucek.shop.drivers.core.application.services.domain.service.hawk.register.in.HawkDomainService;
import com.potucek.shop.drivers.core.application.services.hawk.port.HawkRepoPort;
import lombok.RequiredArgsConstructor;

import java.util.Set;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class HawkApplicationServiceImpl implements HawkApplicationService {

    private final HawkRepoPort hawkRepoPort;
    private final HawkDomainService hawkDomainService;

    @Override
    public Set<String> findAllHawks() {
        return hawkDomainService.findAllHawksSortedByIUCNCategory().stream().map(Object::toString).collect(Collectors.toSet());
    }
}
