package com.potucek.shop.drivers.core.application.services.domain.services.entities.hawk.port.command;

import com.potucek.shop.drivers.core.application.services.domain.services.entities.hawk.Hawk;
import com.potucek.shop.drivers.core.application.services.domain.services.entities.hawk.port.repo.HawkRepository;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@RequiredArgsConstructor
public class HawkCommandImpl implements HawkCommand {

    private final HawkRepository hawkRepository;

    @Override
    public Set<Hawk> findAllHawks() {
        return hawkRepository.findAllHawksSortedByIUCNCategory();
    }
}
