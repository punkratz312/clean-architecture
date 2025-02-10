package com.potucek.shop.drivers.web.rest.hawk;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import org.jmolecules.archunit.JMoleculesDddRules;
import org.junit.jupiter.api.Test;

//@AnalyzeClasses(packagesOf = Application.class)
@AnalyzeClasses(packages = "com.potucek.shop")
class JMoleculesDddUnitTest {
    @ArchTest
    void whenCheckingAllClasses_thenCodeFollowsAllDddPrinciples(JavaClasses classes) {
        JMoleculesDddRules.all().check(classes);
    }

    @ArchTest
    ArchRule ddd = JMoleculesDddRules.all();

    @Test
    void documentation() {
//        new Documenter(Application.class)
//                .writeDocumentation(Options.defaults(), CanvasOptions.defaults());
    }
}