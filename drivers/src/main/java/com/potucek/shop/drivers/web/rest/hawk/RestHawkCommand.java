package com.potucek.shop.drivers.web.rest.hawk;

import com.potucek.shop.drivers.core.application.services.domain.services.entities.hawk.port.command.HawkCommand;
import com.potucek.shop.drivers.core.application.services.hawk.HawkApplicationService;
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
public class RestHawkCommand implements HawkCommand {

    private final HawkApplicationService hawkApplicationService;

    @Override
    @GetMapping
    public Set<String> findAllHawks() {
        return hawkApplicationService.findAllHawks();
    }

}
