package com.proyecto;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;

import org.junit.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

public class ArquitecturaTest {

    @Test
    public void lasClasesNoDebenDependerDePaquetesExternosAlProyecto() {

        JavaClasses clases = new ClassFileImporter()
                .importPackages("com.proyecto");

        ArchRule regla = noClasses()
                .that().resideInAPackage("com.proyecto..")
                .should().dependOnClassesThat()
                .resideInAPackage("com.proyecto.inexistente..");

        regla.check(clases);
    }
}