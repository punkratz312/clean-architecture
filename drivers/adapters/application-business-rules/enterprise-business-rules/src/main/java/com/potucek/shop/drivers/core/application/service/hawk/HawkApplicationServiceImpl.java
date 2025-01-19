package com.potucek.shop.drivers.core.application.service.hawk;

import com.potucek.shop.drivers.core.application.service.domian.service.entities.Hawk.Hawk;
import com.potucek.shop.drivers.core.application.service.domian.service.hawk.register.HawkRegisterDomainService;

import java.util.Set;
import java.util.stream.Collectors;

public class HawkApplicationServiceImpl implements HawkApplicationService {

    private final HawkRegisterDomainService hawkRegisterDomainService;

    public HawkApplicationServiceImpl(HawkRegisterDomainService hawkRegisterDomainService) {
        this.hawkRegisterDomainService = hawkRegisterDomainService;
    }

    @Override
    public Set<String> registerHawks() {
        return hawkRegisterDomainService.registerHawks().stream().map(Hawk::toString).collect(Collectors.toSet());
    }

    @Override
    public void registerHawks(Set<String> hawks) {

    }

    @Override
    public void registerHawk(Set<String> hawk) {

    }
}
