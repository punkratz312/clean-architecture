package com.potucek.shop.drivers.port.hawk;

import java.util.Set;

public interface HawkPort {

    /**
     * Find all hawks (eagles, buzzards, vultures, kites, etc), sort them according to their IUCN Category and print them (System.out
     * .println). For each species you should print at least the English name, the scientific name and the IUCN category.
     * <p>
     * Sorting should be according to the list above with birds in the "LC" category printed first and birds in the "DD" category printed
     * last.
     * <p>
     * You can find all hawks using the family name "Hawks, eagles"
     */
    Set<String> registerHawks();

    void registerHawks(Set<String> hawks);

    void registerHawk(Set<String> hawk);

}