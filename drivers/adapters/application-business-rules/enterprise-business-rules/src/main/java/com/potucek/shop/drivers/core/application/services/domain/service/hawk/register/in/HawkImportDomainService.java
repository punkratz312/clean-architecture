package com.potucek.shop.drivers.core.application.services.domain.service.hawk.register.in;

import com.potucek.shop.drivers.core.application.services.domain.service.entities.hawk.Hawk;

import java.util.Set;

public interface HawkImportDomainService {

    Set<Hawk> findAllHawksSortedByIUCNCategory();

}