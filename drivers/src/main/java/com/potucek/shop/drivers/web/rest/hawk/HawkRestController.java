package com.potucek.shop.drivers.web.rest.hawk;

import com.potucek.shop.drivers.core.HawkCommand;
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
public class HawkRestController {

    private final HawkCommand hawkCommand;

    @GetMapping
    public Set<String> findAllHawks() {
        return hawkCommand.findAllHawks();
    }

}
