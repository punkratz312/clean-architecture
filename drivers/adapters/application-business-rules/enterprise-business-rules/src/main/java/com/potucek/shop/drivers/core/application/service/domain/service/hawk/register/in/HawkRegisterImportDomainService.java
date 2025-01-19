package com.potucek.shop.drivers.core.application.service.domain.service.hawk.register.in;

import com.potucek.shop.drivers.core.application.service.domain.service.entities.hawk.Hawk;

import java.util.Set;

public interface HawkRegisterImportDomainService {

    Set<Hawk> findAllHawksSortedByIUCNCategory();

}