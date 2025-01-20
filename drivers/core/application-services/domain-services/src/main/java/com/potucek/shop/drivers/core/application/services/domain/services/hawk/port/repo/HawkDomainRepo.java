package com.potucek.shop.drivers.core.application.services.domain.services.hawk.port.repo;

import java.util.Set;

public interface HawkDomainRepo {

    Set<String> findAllHawksSortedByIUCNCategory();

}