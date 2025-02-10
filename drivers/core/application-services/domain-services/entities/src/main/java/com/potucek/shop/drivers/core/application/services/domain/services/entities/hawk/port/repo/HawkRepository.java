package com.potucek.shop.drivers.core.application.services.domain.services.entities.hawk.port.repo;

import com.potucek.shop.drivers.core.application.services.domain.services.entities.hawk.Hawk;
import org.jmolecules.ddd.annotation.Repository;

import java.util.Set;

@Repository
public interface HawkRepository {

    /**
     * Retrieve all hawks (eagles, buzzards, vultures, kites, etc.) and sort them according to their IUCN category.
     * <p>
     * Sorting should prioritize birds in the "LC" (Least Concern) category first and place birds in the "DD" (Data Deficient) category
     * last.
     * The method provides a structured way to access and organize data on hawks using the family name "Hawks, eagles."
     * </p>
     *
     * @return a set of hawks sorted by their IUCN category.
     */
    Set<Hawk> findAllHawksSortedByIUCNCategory();
}
