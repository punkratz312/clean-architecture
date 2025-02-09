package com.potucek.shop.drivers.web.rest.hawk;

import com.potucek.shop.drivers.core.application.services.port.command.HawkApplicationCommandTrigger;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RequiredArgsConstructor
@Component
@RestController
@RequestMapping("hawks")
class HawkRestCommandTrigger {

    private final HawkApplicationCommandTrigger hawkCommand; // using the inner world aka. use-case

    @GetMapping
    public Set<String> findAllHawks() {
        return hawkCommand.findAllHawks();
    }

}
