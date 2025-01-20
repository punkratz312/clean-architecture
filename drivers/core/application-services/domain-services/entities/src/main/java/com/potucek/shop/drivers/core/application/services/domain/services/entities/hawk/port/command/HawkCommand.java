package com.potucek.shop.drivers.core.application.services.domain.services.entities.hawk.port.command;

import com.potucek.shop.drivers.core.application.services.domain.services.entities.hawk.Hawk;

import java.util.Set;

public interface HawkCommand {

    /**
     * considered unused as implemented from port impl and then discovered
     */
    Set<Hawk> findAllHawks();
}
