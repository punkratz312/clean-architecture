package com.potucek.shop.drivers.core.application.services.domain.services.hawk.registry;

import com.potucek.shop.drivers.core.application.services.domain.services.entities.hawk.Hawk;

import java.util.Set;

public interface HawkDomainService {

    Set<Hawk> findAllHawksSortedByIUCNCategory();

}