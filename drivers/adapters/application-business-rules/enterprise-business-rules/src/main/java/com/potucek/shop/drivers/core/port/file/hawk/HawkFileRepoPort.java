package com.potucek.shop.drivers.core.port.file.hawk;

import com.potucek.shop.drivers.core.application.services.hawk.port.HawkRepoPort;
import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;
import java.util.stream.Collectors;

public class HawkFileRepoPort implements HawkRepoPort {

    @SneakyThrows
    @Override
    public Set<Object> findAllHawksSortedByIUCNCategory() {
        return Files.readAllLines(Path.of("")).stream().map(s -> new Object()).collect(Collectors.toSet());
    }
}
