package com.potucek.shop.drivers.application.business.rules.registry;

import com.potucek.shop.drivers.core.application.services.domain.services.entities.hawk.Hawk;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@RequiredArgsConstructor
@Component
public class HawkDomainServiceImpl implements HawkDomainService {

    private final HawkDomainRepo hawkDomainRepo;

    @Override
    public Set<Hawk> findAll() {
        return new HashSet<>(hawkDomainRepo.findAll());
    }
}
