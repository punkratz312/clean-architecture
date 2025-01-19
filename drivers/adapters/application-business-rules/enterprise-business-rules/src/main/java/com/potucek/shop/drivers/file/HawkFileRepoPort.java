package com.potucek.shop.drivers.file;

import com.potucek.shop.drivers.core.application.services.hawk.port.HawkRepoPort;
import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class HawkFileRepoPort implements HawkRepoPort {

    public static final String HAWKS_EAGLES = "Hawks, eagles;";

    @SneakyThrows
    @Override
    public Set<String> findAllHawksSortedByIUCNCategory() {
        TreeSet<String> strings = new TreeSet<>(Files.readAllLines(Path.of("")));
        return strings.stream().filter(s -> s.startsWith(HAWKS_EAGLES)).sorted(String::compareTo).collect(Collectors.toCollection(LinkedHashSet::new));
    }
}
