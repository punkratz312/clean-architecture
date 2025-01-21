package com.potucek.shop.drivers.core.application.services.domain.services.hawk;

import com.potucek.shop.drivers.core.application.services.domain.services.entities.hawk.port.command.HawkCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Component
public class HawkDomainCommandImpl implements HawkDomainCommand {

    private final HawkCommand hawkCommand;

    @Override
    public Set<String> findAllHawks() {
        return hawkCommand.findAllHawks().stream().map(Record::toString).collect(Collectors.toSet());
    }
}
