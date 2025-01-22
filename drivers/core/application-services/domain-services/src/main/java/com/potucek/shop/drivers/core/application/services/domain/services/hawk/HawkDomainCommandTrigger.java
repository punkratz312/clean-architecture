package com.potucek.shop.drivers.core.application.services.domain.services.hawk;

import java.util.Set;

/**
 * trigger for {@link com.potucek.shop.drivers.core.application.services.domain.services.entities.hawk.port.command.HawkCommand}
 */
public interface HawkDomainCommandTrigger {

    Set<String> findAllHawks();

}