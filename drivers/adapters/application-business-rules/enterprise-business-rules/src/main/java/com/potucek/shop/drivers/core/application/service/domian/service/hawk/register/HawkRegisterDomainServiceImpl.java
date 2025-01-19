package com.potucek.shop.drivers.core.application.service.domian.service.hawk.register;

import com.potucek.shop.drivers.core.application.service.domian.service.entities.Hawk.Hawk;

import java.util.HashSet;
import java.util.Set;

public class HawkRegisterDomainServiceImpl implements HawkRegisterDomainService {

    private final Set<Hawk> hawks = new HashSet<>();

    @Override
    public Set<Hawk> registerHawks() {
        return hawks;
    }

    @Override
    public void registerHawks(Set<Hawk> hawks) {
        this.hawks.clear();
        this.hawks.addAll(hawks);
    }

    @Override
    public void registerHawk(Hawk hawk) {
        hawks.add(hawk);
    }
}
