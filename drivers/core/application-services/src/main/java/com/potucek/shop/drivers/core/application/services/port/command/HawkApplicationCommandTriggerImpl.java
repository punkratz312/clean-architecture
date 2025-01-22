package com.potucek.shop.drivers.core.application.services.port.command;

import com.potucek.shop.drivers.core.application.services.domain.services.hawk.HawkDomainCommandTrigger;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;

@RequiredArgsConstructor
@Component
class HawkApplicationCommandTriggerImpl implements HawkApplicationCommandTrigger {

    private final HawkDomainCommandTrigger hawkDomainCommandTrigger; // using the inner world aka. use-case

    @Override
    public Set<String> findAllHawks() {
        return hawkDomainCommandTrigger.findAllHawks();
    }
}
