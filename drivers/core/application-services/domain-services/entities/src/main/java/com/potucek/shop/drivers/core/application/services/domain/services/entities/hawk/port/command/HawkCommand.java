package com.potucek.shop.drivers.core.application.services.domain.services.entities.hawk.port.command;

import com.potucek.shop.drivers.core.application.services.domain.services.entities.hawk.Hawk;
import com.potucek.shop.drivers.core.application.services.domain.services.entities.hawk.port.repo.HawkRepository;
import org.jmolecules.architecture.hexagonal.PrimaryPort;

import java.util.Set;

/**
 * use {@link HawkRepository}
 */
@PrimaryPort
public interface HawkCommand {

    /**
     * return {@link HawkRepository#findAllHawksSortedByIUCNCategory()}
     */
    Set<Hawk> findAllHawks();
}
