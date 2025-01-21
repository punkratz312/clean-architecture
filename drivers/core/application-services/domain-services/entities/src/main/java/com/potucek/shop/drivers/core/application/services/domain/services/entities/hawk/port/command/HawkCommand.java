package com.potucek.shop.drivers.core.application.services.domain.services.entities.hawk.port.command;

import com.potucek.shop.drivers.core.application.services.domain.services.entities.hawk.Hawk;
import com.potucek.shop.drivers.core.application.services.domain.services.entities.hawk.port.repo.HawkRepository;

import java.util.Set;

/**
 * using {@link HawkRepository}
 */
public interface HawkCommand {

    /**
     * return {@link HawkRepository#findAllHawksSortedByIUCNCategory()}
     */
    Set<Hawk> findAllHawks();
}
