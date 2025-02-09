package com.potucek.shop.drivers.io.file;

import com.potucek.shop.drivers.core.application.services.port.repo.HawkApplicationRepoPort;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Set;
import java.util.stream.Collectors;

@Component
class HawkFileApplicationRepoPort implements HawkApplicationRepoPort {

    static final String HAWKS_EAGLES = "Hawks, eagles";
    static final String BIRDS_CSV = "birds.csv";

    @SneakyThrows
    @Override
    public Set<String> findAllHawksSortedByIUCNCategory() {
        Set<String> collect = Files
                .readAllLines(Paths.get(getClass().getClassLoader().getResource(BIRDS_CSV).toURI())).stream()
                .skip(1)
                .filter(line -> line.startsWith(HAWKS_EAGLES))
                .map(line -> new Bird(IucnCategory.valueOf(line.split(";")[3].trim())))
                .sorted(Comparator.comparingInt(bird -> bird.iucnCategory().getOrder()))
                .map(Record::toString)
                .collect(Collectors.toSet());
        collect.add("Greetings from Spring Boot!");
        return collect;
    }

    record Bird(IucnCategory iucnCategory) {
    }

    @Getter
    @RequiredArgsConstructor
    enum IucnCategory {
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
