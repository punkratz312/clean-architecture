package com.potucek.shop.drivers.application.business.rules.registry;

import java.util.Set;

public interface HawkDomainRepo {

    Set<String> findAllHawksSortedByIUCNCategory();

}