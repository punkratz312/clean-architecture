package com.potucek.shop.drivers.core.application.service.hawk;

import lombok.RequiredArgsConstructor;

import java.util.Set;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class HawkApplicationServiceImpl implements HawkApplicationService {

    private final HawkRepo hawkRepo;

    @Override
    public Set<String> findAllHawksSortedByIUCNCategory() {
        return hawkRepo.findAllHawksSortedByIUCNCategory().stream().map(Object::toString).collect(Collectors.toSet());
    }

    @Override
    public void registerHawks(Set<String> hawks) {

    }

    @Override
    public void registerHawk(Set<String> hawk) {

    }
}
