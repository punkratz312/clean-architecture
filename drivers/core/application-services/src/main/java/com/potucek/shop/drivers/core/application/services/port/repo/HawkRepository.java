package com.potucek.shop.drivers.core.application.services.port.repo;

import java.util.Set;

public interface HawkRepository {

    Set<String> findAllHawks();

}