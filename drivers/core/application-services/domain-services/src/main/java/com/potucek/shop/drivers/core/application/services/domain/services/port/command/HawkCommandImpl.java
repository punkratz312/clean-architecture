package com.potucek.shop.drivers.core.application.services.domain.services.port.command;

import com.potucek.shop.drivers.core.application.services.domain.services.entities.hawk.Hawk;
import com.potucek.shop.drivers.core.application.services.domain.services.entities.hawk.port.command.HawkCommand;

import java.util.Set;

public class HawkCommandImpl implements HawkCommand {
    
    @Override
    public Set<Hawk> findAllHawks() {
        return Set.of();
    }
}
