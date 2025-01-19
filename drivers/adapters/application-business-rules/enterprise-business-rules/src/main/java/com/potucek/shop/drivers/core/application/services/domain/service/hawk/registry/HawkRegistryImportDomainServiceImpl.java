package com.potucek.shop.drivers.core.application.services.domain.service.hawk.registry;

import com.potucek.shop.drivers.core.application.services.domain.service.entities.hawk.Hawk;
import lombok.RequiredArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@RequiredArgsConstructor
public class HawkRegistryImportDomainServiceImpl implements HawkRegistryImportDomainService {

    private final HawkRegistryImportDomainService hawkRegistryImportDomainService;
    private final Set<Hawk> hawks = new HashSet<>();

    @Override
    public Set<Hawk> findAllHawks() {
        return hawks;
    }
}
