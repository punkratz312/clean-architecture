package com.potucek.shop.drivers.core.application.services.domain.services.hawk;

import com.potucek.shop.drivers.core.application.services.domain.services.hawk.port.repo.HawkDomainRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;

@RequiredArgsConstructor
@Component
public class HawkDomainServiceImpl implements HawkDomainService {

    private final HawkDomainRepo hawkDomainRepo;

    @Override
    public Set<String> findAllHawks() {
        return hawkDomainRepo.findAllHawksSortedByIUCNCategory();
    }
}
