package com.potucek.shop.drivers.core.application.services.domain.service.hawk.register.in;

import com.potucek.shop.drivers.core.application.services.domain.service.entities.hawk.Hawk;
import lombok.RequiredArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@RequiredArgsConstructor
public class HawkRegisterImportDomainServiceImpl implements HawkRegisterImportDomainService {

    private final HawkRegisterImportDomainService hawkRegisterImportDomainService;
    private final Set<Hawk> hawks = new HashSet<>();

    @Override
    public Set<Hawk> findAllHawksSortedByIUCNCategory() {
        return hawks;
    }
}
