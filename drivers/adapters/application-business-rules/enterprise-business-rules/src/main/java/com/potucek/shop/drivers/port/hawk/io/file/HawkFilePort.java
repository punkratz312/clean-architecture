package com.potucek.shop.drivers.port.hawk.io.file;

import com.potucek.shop.drivers.core.application.services.hawk.HawkApplicationService;
import com.potucek.shop.drivers.port.hawk.HawkPort;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;

@RequiredArgsConstructor
public class HawkFilePort implements HawkPort {

    private final HawkApplicationService hawkApplicationService;

    @SneakyThrows
//    @PostContruct
    public void init() {
        List<String> file = Files.readAllLines(Path.of(""));
//        registerHawks(Set.copyOf(file));
    }


    @Override
    public Set<String> findAllHawksSortedByIUCNCategory() {
        throw new UnsupportedOperationException();
    }
}
