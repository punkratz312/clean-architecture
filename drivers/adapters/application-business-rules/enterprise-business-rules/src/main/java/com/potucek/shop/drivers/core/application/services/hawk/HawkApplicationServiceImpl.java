package com.potucek.shop.drivers.core.application.services.hawk;

import com.potucek.shop.drivers.core.application.services.hawk.port.HawkRepoPort;
import lombok.RequiredArgsConstructor;

import java.util.Set;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class HawkApplicationServiceImpl implements HawkApplicationService {

    private final HawkRepoPort hawkRepoPort;

    @Override
    public Set<String> findAllHawksSortedByIUCNCategory() {
        return hawkRepoPort.findAllHawksSortedByIUCNCategory().stream().map(Object::toString).collect(Collectors.toSet());
    }
}
