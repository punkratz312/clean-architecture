package com.potucek.shop.drivers.core.application.services.domain.service.hawk.registry;

import com.potucek.shop.drivers.core.application.services.domain.service.entities.hawk.Hawk;

import java.util.Set;

public interface HawkRegistryImportDomainService {

    Set<Hawk> findAllHawks();

}