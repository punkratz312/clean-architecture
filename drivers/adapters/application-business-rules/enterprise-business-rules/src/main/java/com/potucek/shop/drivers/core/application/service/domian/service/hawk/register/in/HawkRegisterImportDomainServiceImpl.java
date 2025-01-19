package com.potucek.shop.drivers.core.application.service.domian.service.hawk.register.in;

import com.potucek.shop.drivers.core.application.service.domian.service.entities.Hawk.Hawk;

import java.util.HashSet;
import java.util.Set;

public class HawkRegisterImportDomainServiceImpl implements HawkRegisterImportDomainService {

    private final Set<Hawk> hawks = new HashSet<>();

    @Override
    public Set<Hawk> registerHawks() {
        return hawks;
    }
}
