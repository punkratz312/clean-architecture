package com.potucek.shop.drivers.core.application.services.domain.service.hawk.register.out;

import com.potucek.shop.drivers.core.application.services.domain.service.entities.hawk.Hawk;
import com.potucek.shop.drivers.core.application.services.domain.service.hawk.register.in.HawkRegisterImportDomainService;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@RequiredArgsConstructor
public class HawkRegisterDomainServiceImpl implements HawkRegisterDomainService {

    private final HawkRegisterImportDomainService hawkRegisterImportDomainService;

    @Override
    public Set<Hawk> findAllHawksSortedByIUCNCategory() {
        return hawkRegisterImportDomainService.findAllHawksSortedByIUCNCategory();
    }
}
