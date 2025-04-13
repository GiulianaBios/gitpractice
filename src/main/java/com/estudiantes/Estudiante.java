package com.estudiantes;

public class Estudiante {
    private String nombre;
    private String materia;

    public Estudiante(String nombre, String materia) {
        this.nombre = nombre;
        this.materia = materia;
    }

    public void presentarse() {
        System.out.println("Hola, soy " + nombre + " y estoy cursando " + materia);
    }

    public String getNombre() {
        return nombre;
    }

    public String getMateria() {
        return materia;
    }
} 