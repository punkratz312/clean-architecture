package com.potucek.shop.drivers.core.application.service.domian.service.hawk.register.out;

import com.potucek.shop.drivers.core.application.service.domian.service.entities.Hawk.Hawk;
import com.potucek.shop.drivers.core.application.service.domian.service.hawk.register.in.HawkRegisterImportDomainService;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@RequiredArgsConstructor
public class HawkRegisterDomainServiceImpl implements HawkRegisterDomainService {

    private final HawkRegisterImportDomainService hawkRegisterImportDomainService;

    @Override
    public Set<Hawk> registerHawks() {
        return hawkRegisterImportDomainService.registerHawks(); // TODO sort
    }
}
