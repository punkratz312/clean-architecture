package com.potucek.shop.drivers.hawk;

import com.potucek.shop.drivers.core.application.services.domain.service.hawk.register.in.HawkRegisterImportDomainService;
import com.potucek.shop.drivers.core.application.services.hawk.port.command.HawkResourceCommand;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@RequiredArgsConstructor
public class HawkResourceCommandImpl implements HawkResourceCommand {

    private final HawkRegisterImportDomainService hawkRegisterImportDomainService;

    //    @GetMapping
    @Override
    public Set<Object> findAllHawksSortedByIUCNCategory() {
        return hawkRegisterImportDomainService.findAllHawksSortedByIUCNCategory();
    }
}
