package com.potucek.shop.drivers.core.application.service.domian.service.hawk.register.out;

import com.potucek.shop.drivers.core.application.service.domian.service.entities.Hawk.Hawk;

import java.util.Set;

public interface HawkRegisterDomainService {

    /**
     * Find all hawks (eagles, buzzards, vultures, kites, etc), sort them according to their IUCN Category and print them (System.out
     * .println). For each species you should print at least the English name, the scientific name and the IUCN category.
     * <p>
     * Sorting should be according to the list above with birds in the "LC" category printed first and birds in the "DD" category printed
     * last.
     * <p>
     * You can find all hawks using the family name "Hawks, eagles"
     */
    Set<Hawk> registerHawks();

}