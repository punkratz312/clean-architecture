package com.potucek.shop.drivers.port.hawk.io.file;

import com.potucek.shop.drivers.core.application.service.hawk.HawkApplicationService;
import com.potucek.shop.drivers.port.hawk.HawkPort;
import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;

public class HawkFilePort implements HawkPort {

    private final HawkApplicationService hawkApplicationService;

    public HawkFilePort(HawkApplicationService hawkApplicationService) {
        this.hawkApplicationService = hawkApplicationService;
    }

    @SneakyThrows
//    @PostContruct
    public void init() {
        List<String> file = Files.readAllLines(Path.of(""));
        registerHawks(Set.copyOf(file));
    }


    @Override
    public Set<String> registerHawks() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void registerHawks(Set<String> hawks) {

    }

    @Override
    public void registerHawk(Set<String> hawk) {
        throw new UnsupportedOperationException();
    }
}
