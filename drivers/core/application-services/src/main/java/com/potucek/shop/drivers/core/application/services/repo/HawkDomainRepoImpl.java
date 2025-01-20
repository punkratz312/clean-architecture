package com.potucek.shop.drivers.core.application.services.repo;

import com.potucek.shop.drivers.application.business.rules.registry.HawkDomainRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;

@RequiredArgsConstructor
@Component
public class HawkDomainRepoImpl implements HawkDomainRepo { // implementing the inner world

    private final HawkApplicationRepoPort hawkRepository;  // using the outer world through port

    @Override
    public Set<String> findAllHawksSortedByIUCNCategory() {
        return hawkRepository.findAllHawksSortedByIUCNCategory();
    }
}
