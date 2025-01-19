package com.potucek.shop.drivers.core.application.services.hawk;

import com.potucek.shop.drivers.core.application.services.domain.service.hawk.register.HawkDomainService;
import lombok.RequiredArgsConstructor;

import java.util.Set;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class HawkApplicationServiceImpl implements HawkApplicationService {

    private final HawkDomainService hawkDomainService;

    @Override
    public Set<String> findAllHawks() {
        return hawkDomainService.findAllHawksSortedByIUCNCategory().stream().map(Object::toString).collect(Collectors.toSet());
    }
}
