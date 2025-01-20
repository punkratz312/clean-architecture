package com.potucek.shop.drivers.core.application.services.domain.services.hawk.port.repo;

import com.potucek.shop.drivers.core.application.services.domain.services.entities.hawk.Hawk;
import com.potucek.shop.drivers.core.application.services.domain.services.entities.hawk.port.repo.HawkRepository;
import lombok.RequiredArgsConstructor;

import java.util.Set;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class HawkRepositoryImpl implements HawkRepository {

    private final HawkDomainRepo hawkDomainRepo;

    @Override
    public Set<Hawk> findAllHawksSortedByIUCNCategory() {
        return hawkDomainRepo.findAllHawksSortedByIUCNCategory().stream().map(s -> new Hawk(s, null, null, null)).collect(Collectors.toSet());
    }
}
