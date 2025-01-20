package com.potucek.shop.drivers.drivers.web.rest.hawk;

import com.potucek.shop.drivers.core.application.services.domain.services.entities.hawk.port.command.HawkResourceCommand;
import com.potucek.shop.drivers.core.application.services.hawk.HawkApplicationService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RequiredArgsConstructor
@RestController
@Path("hawks")
public class RestHawkResourceCommand implements HawkResourceCommand {

    private final HawkApplicationService hawkApplicationService;

    @GET
    @Override
    public Set<String> findAllHawks() {
        return hawkApplicationService.findAllHawks();
    }
}
