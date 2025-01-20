package com.potucek.shop.drivers.core.application.services.hawk;

import com.potucek.shop.drivers.application.business.rules.registry.HawkDomainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Component
public class HawkApplicationServiceImpl implements HawkApplicationService {

    private final HawkDomainService hawkDomainService;

    @Override
    public Set<String> findAllHawks() {
        return hawkDomainService.findAll().stream().map(Object::toString).collect(Collectors.toSet());
    }
}
