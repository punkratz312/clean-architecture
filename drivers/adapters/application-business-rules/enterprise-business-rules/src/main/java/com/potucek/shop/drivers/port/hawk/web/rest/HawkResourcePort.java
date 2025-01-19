package com.potucek.shop.drivers.port.hawk.web.rest;

import com.potucek.shop.drivers.port.hawk.HawkPort;

import java.util.Set;

public class HawkResourcePort implements HawkPort {

    private final HawkPort hawkPort;

    public HawkResourcePort(HawkPort hawkPort) {
        this.hawkPort = hawkPort;
    }

    @Override
    public Set<String> registerHawks() {
        return hawkPort.registerHawks();
    }

    @Override
    public void registerHawks(Set<String> hawks) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void registerHawk(Set<String> hawk) {
        throw new UnsupportedOperationException();
    }
}
