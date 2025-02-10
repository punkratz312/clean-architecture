package com.potucek.shop.drivers;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import org.jmolecules.archunit.JMoleculesDddRules;
import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;

//@AnalyzeClasses(packagesOf = Application.class)
@AnalyzeClasses(packages = "com.potucek.shop")
class JMoleculesDddUnitTest {
    @ArchTest
    void whenCheckingAllClasses_thenCodeFollowsAllDddPrinciples(JavaClasses classes) {
        JMoleculesDddRules.all().check(classes);
    }

//    @Test
//    void documentation() {
//        new Documenter(Application.class)
//                .writeDocumentation(Documenter.DiagramOptions.defaults(), Documenter.CanvasOptions.defaults());
//    }

    ApplicationModules modules = ApplicationModules.of(Application.class);

    @Test
    void writeDocumentationSnippets() {

        new Documenter(modules)
                .writeModulesAsPlantUml()
                .writeIndividualModulesAsPlantUml();
    }

}