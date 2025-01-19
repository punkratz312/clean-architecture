package com.potucek.shop.drivers.core.application.service.domian.service.hawk.register.in;

import com.potucek.shop.drivers.core.application.service.domian.service.entities.Hawk.Hawk;

import java.util.Set;

public interface HawkRegisterImportDomainService {

    Set<Hawk> registerHawks();

}