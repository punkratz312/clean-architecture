package com.potucek.shop.drivers.core.application.services.port.command;

import com.potucek.shop.drivers.core.application.services.domain.services.hawk.HawkDomainCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;

@RequiredArgsConstructor
@Component
public class HawkApplicationCommandImpl implements HawkApplicationCommand {

    private final HawkDomainCommand hawkDomainCommand; // using the inner world aka. use-case

    @Override
    public Set<String> findAllHawks() {
        return hawkDomainCommand.findAllHawks();
    }
}
