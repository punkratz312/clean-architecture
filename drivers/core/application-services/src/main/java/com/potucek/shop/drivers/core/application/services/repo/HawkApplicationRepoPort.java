package com.potucek.shop.drivers.core.application.services.repo;

import java.util.Set;

public interface HawkApplicationRepoPort {

    Set<String> findAllHawksSortedByIUCNCategory();

}