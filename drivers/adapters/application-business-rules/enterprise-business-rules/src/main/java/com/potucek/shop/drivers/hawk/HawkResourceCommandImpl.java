package com.potucek.shop.drivers.hawk;

import com.potucek.shop.drivers.core.application.services.hawk.HawkApplicationService;
import com.potucek.shop.drivers.core.application.services.hawk.port.command.HawkResourceCommand;
import lombok.RequiredArgsConstructor;

import java.util.Set;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class HawkResourceCommandImpl implements HawkResourceCommand {

    private final HawkApplicationService hawkApplicationService;

    //    @GetMapping
    @Override
    public Set<Object> findAllHawks() {
        return hawkApplicationService.findAllHawks().stream().map(hawk -> new Object()).collect(Collectors.toSet());
    }
}
