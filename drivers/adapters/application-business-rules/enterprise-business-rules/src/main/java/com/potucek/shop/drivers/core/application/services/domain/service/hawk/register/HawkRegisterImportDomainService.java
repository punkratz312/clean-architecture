package com.potucek.shop.drivers.core.application.services.domain.service.hawk.register;

import com.potucek.shop.drivers.core.application.services.domain.service.entities.hawk.Hawk;

import java.util.Set;

public interface HawkRegisterImportDomainService {

    Set<Hawk> findAllHawks();

}