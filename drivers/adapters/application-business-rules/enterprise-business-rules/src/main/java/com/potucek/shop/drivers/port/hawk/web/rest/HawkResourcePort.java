package com.potucek.shop.drivers.port.hawk.web.rest;

import com.potucek.shop.drivers.port.hawk.HawkPort;

import java.util.Set;

public class HawkResourcePort implements HawkPort {
    @Override
    public Set<String> registerHawks() {
        return Set.of();
    }

    @Override
    public void registerHawks(Set<String> hawks) {
        throw new IllegalStateException();
    }

    @Override
    public void registerHawk(Set<String> hawk) {
        throw new IllegalStateException();
    }
}
