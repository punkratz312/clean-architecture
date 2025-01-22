package com.potucek.shop.drivers.core.application.services.domain.services.hawk;

import com.potucek.shop.drivers.core.application.services.domain.services.entities.hawk.port.command.HawkCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Set;

@RequiredArgsConstructor
@Component
class HawkDomainCommandTriggerImpl implements HawkDomainCommandTrigger {

    private final HawkCommand hawkCommand;

    @Override
    public Set<String> findAllHawks() {
//        return hawkCommand.findAllHawks().stream().map(Record::toString).collect(Collectors.toSet());
        return Collections.emptySet();
    }
}
