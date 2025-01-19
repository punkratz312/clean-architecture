package com.potucek.shop.drivers.command.web.rest.hawk;

import com.potucek.shop.drivers.core.application.services.hawk.port.command.HawkResourceCommand;

import java.util.Set;

public class HawkResourceCommandImpl implements HawkResourceCommand {

    //    @GetMapping
    @Override
    public Set<Object> findAllHawksSortedByIUCNCategory() {
        return Set.of();
    }
}
