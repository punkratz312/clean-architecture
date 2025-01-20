package com.potucek.shop.drivers;

import com.potucek.shop.drivers.application.business.rules.registry.HawkDomainRepo;
import com.potucek.shop.drivers.core.application.services.domain.services.entities.hawk.Hawk;
import com.potucek.shop.drivers.core.application.services.domain.services.entities.hawk.port.repo.HawkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

import java.util.Set;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Component
@ApplicationScope
public class HawkDomainRepoImpl implements HawkDomainRepo {

    private final HawkRepository hawkRepository;

    @Override
    public Set<Hawk> findAll() {
        return hawkRepository.findAllHawksSortedByIUCNCategory().stream().map(o -> new Hawk(null, null, null, null)).collect(Collectors.toSet());

    }
}
