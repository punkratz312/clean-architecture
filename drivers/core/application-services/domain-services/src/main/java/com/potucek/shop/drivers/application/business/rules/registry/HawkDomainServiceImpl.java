package com.potucek.shop.drivers.application.business.rules.registry;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@RequiredArgsConstructor
@Component
public class HawkDomainServiceImpl implements HawkDomainService {

    private final HawkDomainRepo hawkDomainRepo;

    @Override
    public Set<String> findAll() {
        return new HashSet<>(hawkDomainRepo.findAllHawksSortedByIUCNCategory());
    }
}
