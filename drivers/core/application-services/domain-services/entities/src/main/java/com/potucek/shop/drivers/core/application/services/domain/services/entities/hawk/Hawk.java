package com.potucek.shop.drivers.core.application.services.domain.services.entities.hawk;

import org.jmolecules.ddd.annotation.AggregateRoot;
import org.jmolecules.ddd.annotation.Identity;
import org.jmolecules.ddd.annotation.ValueObject;

@AggregateRoot
@ValueObject
public record Hawk(
        @Identity
        String birdFamily,
        String englishBirdName,
        String scientificBirdName,
        String iucnCategory
) {
}