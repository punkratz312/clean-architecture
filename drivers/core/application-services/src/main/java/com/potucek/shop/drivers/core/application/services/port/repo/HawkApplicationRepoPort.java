package com.potucek.shop.drivers.core.application.services.port.repo;

import org.jmolecules.architecture.hexagonal.PrimaryPort;

import java.util.Set;

@PrimaryPort
public interface HawkApplicationRepoPort {

    Set<String> findAllHawksSortedByIUCNCategory();

}