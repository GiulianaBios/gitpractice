package com.estudiantes;

public class Main {
    public static void main(String[] args) {
        // Ejemplo de un estudiante
        Estudiante estudianteEjemplo = new Estudiante("Juan Pérez", "Programación para Testers");
        estudianteEjemplo.presentarse();
        Estudiante estudianteMarcelo = new Estudiante("Marcelo Sosa", "Programación para Testers");
        estudianteMarcelo.presentarse();
        Estudiante estudiantePEPE = new Estudiante("PEPE", "Programación para Testers");
        estudiantePEPE.presentarse();

        // Aquí cada uno de los estudiantes agregará sus propias instancias
        // Ejemplo:
        // Estudiante estudianteMaria = new Estudiante("Maria", "Curso");
        // estudianteMaria.presentarse();
    }
}