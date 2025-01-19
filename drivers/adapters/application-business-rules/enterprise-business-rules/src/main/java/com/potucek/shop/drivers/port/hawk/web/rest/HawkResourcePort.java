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

}
