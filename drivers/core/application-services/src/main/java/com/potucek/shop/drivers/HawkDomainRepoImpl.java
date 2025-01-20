package com.potucek.shop.drivers;

import com.potucek.shop.drivers.core.application.services.domain.services.entities.hawk.port.repo.HawkRepository;
import com.potucek.shop.drivers.core.application.services.repo.HawkApplicationRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@RequiredArgsConstructor
@Component
public class HawkDomainRepoImpl implements HawkApplicationRepo {

    private final HawkRepository hawkRepository;

    @Override
    public Set<String> findAllHawksSortedByIUCNCategory() {
        return new HashSet<>(hawkRepository.findAllHawksSortedByIUCNCategory());
    }
}
