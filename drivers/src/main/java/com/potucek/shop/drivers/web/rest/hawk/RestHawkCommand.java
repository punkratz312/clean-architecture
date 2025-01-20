package com.potucek.shop.drivers.web.rest.hawk;

import com.potucek.shop.drivers.core.application.services.port.command.HawkCommandPort;
import com.potucek.shop.drivers.core.application.services.port.repo.HawkProvider;
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
public class RestHawkCommand implements HawkCommandPort {

    private final HawkProvider hawkCommandPort;

    @Override
    @GetMapping
    public Set<String> findAllHawks() {
        return hawkCommandPort.findAllHawks();
    }

}
