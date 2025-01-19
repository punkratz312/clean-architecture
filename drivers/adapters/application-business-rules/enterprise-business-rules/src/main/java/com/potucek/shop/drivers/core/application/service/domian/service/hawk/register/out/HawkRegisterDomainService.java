package com.potucek.shop.drivers.core.application.service.domian.service.hawk.register.out;

import com.potucek.shop.drivers.core.application.service.domian.service.entities.Hawk.Hawk;

import java.util.Set;

/**
 * # BIRDS
 * <p>
 * Birdlife International regularly publishes the Red List of endangered birds. An example of this list is in the resources folder (a csv
 * file
 * called "birds.csv").
 * It contains a single line for each bird species in the world. Each line has 4 fields separated by ";" (semicolon).
 * <p>
 * The structure is:
 * <p>
 * ```
 * Bird Family;English Bird Name;Scientific Bird Name;IUCN Category
 * ```
 * <p>
 * The IUCN Category defines if a species is endangered and how endangered it is.
 * <p>
 * These are the possible values (sorted from least to most endangered).
 * <p>
 * ```
 * LC (Least Concern)
 * NT (NearThreatened)
 * VU (Vulnerable)
 * EN (Endangered)
 * CR (Critically Endangered)
 * EW (Extinct in the Wild)
 * EX (Extinct)
 * DD (Data Deficient)
 * ```
 * <p>
 * _Note_: Only the short two-character form is used in the file, the value is parentheses is just for explanation
 * <p>
 * ## Your task:
 * <p>
 * Find all hawks (eagles, buzzards, vultures, kites, etc), sort them according to their IUCN Category and print them (System.out
 * .println). For
 * each species you should print at least the English name, the scientific name and the IUCN category.
 * <p>
 * Sorting should be according to the list above with birds in the "LC" category printed first and birds in the "DD" category printed last.
 * <p>
 * You can find all hawks using the family name "Hawks, eagles"
 */
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