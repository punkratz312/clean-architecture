package com.potucek.shop.drivers.application.business.rules.registry;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;

@RequiredArgsConstructor
@Component
public class HawkDomainServiceImpl implements HawkDomainService {

    private final HawkDomainRepo hawkDomainRepo;

    @Override
    public Set<String> findAll() {
        return hawkDomainRepo.findAllHawksSortedByIUCNCategory();
    }
}
