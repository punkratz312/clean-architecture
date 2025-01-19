package com.potucek.shop.drivers.file;

import com.potucek.shop.drivers.core.application.services.hawk.port.HawkRepoPort;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.Set;
import java.util.stream.Collectors;

public class HawkFileRepoPort implements HawkRepoPort {

    public static final String HAWKS_EAGLES = "Hawks, eagles";

    @SneakyThrows
    @Override
    public Set<String> findAllHawksSortedByIUCNCategory() {
        return Files.readAllLines(Path.of("birds.csv")).stream()
                .skip(1)
                .filter(line -> line.startsWith(HAWKS_EAGLES))
                .map(line -> {
                    String[] fields = line.split(";");
                    return new Bird(fields[1].trim(), fields[2].trim(), IucnCategory.valueOf(fields[3].trim()));
                })
                .sorted(Comparator.comparingInt(bird -> bird.iucnCategory().getOrder()))
                .map(bird -> bird.englishName() + " (" + bird.scientificName() + ") - " + bird.iucnCategory())
                .collect(Collectors.toSet());
    }

    public record Bird(String englishName, String scientificName, IucnCategory iucnCategory) {
    }

    @Getter
    @RequiredArgsConstructor
    public enum IucnCategory {
        LC(1),
        NT(2),
        VU(3),
        EN(4),
        CR(5),
        EW(6),
        EX(7),
        DD(8);
        private final int order;
    }
}
