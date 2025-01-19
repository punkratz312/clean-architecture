package com.potucek.shop.drivers.port.hawk;

import java.util.Set;

public interface HawkPort {

    Set<String> findAllHawksSortedByIUCNCategory();
}