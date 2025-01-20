package com.potucek.shop.drivers.core.application.services.repo;

import java.util.Set;

public interface HawkApplicationRepo {

    Set<String> findAllHawksSortedByIUCNCategory();

}