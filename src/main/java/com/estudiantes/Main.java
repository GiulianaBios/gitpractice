package com.estudiantes;

public class Main {
    public static void main(String[] args) {
        // Ejemplo de un estudiante
        Estudiante estudianteEjemplo = new Estudiante("Juan Pérez", "Programación para Testers");
        estudianteEjemplo.presentarse();

        Estudiante estudianteEjemplo = new Estudiante("Giuliana Bentancor", "Docente Programación para Testers");
        estudianteEjemplo.presentarse();
        
        // Aquí cada uno de los estudiantes agregará sus propias instancias
        // Ejemplo:
        // Estudiante estudianteMaria = new Estudiante("Maria", "Curso");
        // estudianteMaria.presentarse();
    }
}