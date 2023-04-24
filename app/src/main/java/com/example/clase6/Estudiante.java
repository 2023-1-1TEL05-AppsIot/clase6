package com.example.clase6;

public class Estudiante {
    private String nombre;
    private boolean delegado;

    public Estudiante(String nombre, boolean delegado) {
        this.nombre = nombre;
        this.delegado = delegado;
    }

    public Estudiante(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isDelegado() {
        return delegado;
    }

    public void setDelegado(boolean delegado) {
        this.delegado = delegado;
    }
}
