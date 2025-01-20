package com.potucek.shop.drivers.core.application.services.port.command;

import com.potucek.shop.drivers.core.application.services.domain.services.hawk.HawkDomainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Component
public class HawkCommandPortImpl implements HawkCommandPort {

    private final HawkDomainService hawkDomainService;

    @Override
    public Set<String> findAllHawks() {
        return hawkDomainService.findAllHawksSortedByIUCNCategory().stream().map(Object::toString).collect(Collectors.toSet());
    }
}
