package com.potucek.shop.drivers.core.application.service.hawk;

import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;
import java.util.stream.Collectors;

public class HawkFileRepo implements HawkRepo {

    @SneakyThrows
    @Override
    public Set<Object> findAll() {
        return Files.readAllLines(Path.of("")).stream().map(s -> new Object()).collect(Collectors.toSet());
    }
}
