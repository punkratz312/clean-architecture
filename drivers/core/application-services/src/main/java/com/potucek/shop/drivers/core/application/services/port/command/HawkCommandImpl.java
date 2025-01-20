package com.potucek.shop.drivers.core.application.services.port.command;

import com.potucek.shop.drivers.core.HawkCommand;
import com.potucek.shop.drivers.core.application.services.domain.services.hawk.HawkDomainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;

@RequiredArgsConstructor
@Component
public class HawkCommandImpl implements HawkCommand {

    private final HawkDomainService hawkDomainService;

    @Override
    public Set<String> findAllHawks() {
        return hawkDomainService.findAllHawks();
    }
}
