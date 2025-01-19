package com.potucek.shop.drivers.adapters.application.business.rules.registry;

import com.potucek.shop.drivers.core.application.services.domain.services.entities.hawk.Hawk;

import java.util.Set;

public interface HawkDomainRepo {

    Set<Hawk> findAllHawksSortedByIUCNCategory();

}