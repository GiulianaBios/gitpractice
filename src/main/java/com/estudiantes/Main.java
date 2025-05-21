package com.estudiantes;

public class Main {
    public static void main(String[] args) {
        // Ejemplo de un estudiante
        Estudiante estudianteEjemplo = new Estudiante("Juan Pérez", "Programación para Testers");
        estudianteEjemplo.presentarse();
      
        Estudiante estudianteMarcelo = new Estudiante("Marcelo Sosa", "Programación para Testers");
        estudianteMarcelo.presentarse();
        Estudiante estudianteNicolas = new Estudiante("Nicolas", "Programación para Testers");
        estudianteNicolas.presentarse();
        Estudiante estudianteDario = new Estudiante("Dario Russo", "Programación para Testers");
        estudianteDario.presentarse();
    }
}