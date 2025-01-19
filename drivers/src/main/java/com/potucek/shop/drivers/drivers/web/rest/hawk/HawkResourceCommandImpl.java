package com.potucek.shop.drivers.drivers.web.rest.hawk;

import com.potucek.shop.drivers.core.application.services.hawk.HawkApplicationService;
import com.potucek.shop.drivers.core.application.services.hawk.port.command.HawkResourceCommand;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@RequiredArgsConstructor
@Path("hawks")
public class HawkResourceCommandImpl implements HawkResourceCommand {

    private final HawkApplicationService hawkApplicationService;

    @GET
    @Override
    public Set<String> findAllHawks() {
        return hawkApplicationService.findAllHawks();
    }
}
