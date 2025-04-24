package co.edu.uniquindio.poo;

import java.util.Objects;

public class Soldado {
    private String id;
    private String nombre;
    private int edad;
    private boolean disponible;
    private String funcion;
    private Rango rango;


    public Soldado(String id, String nombre, int edad, boolean disponible, String funcion, Rango rango) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.disponible = disponible;
        this.funcion = funcion;
        this.rango=rango;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public Rango getRango() {
        return rango;
    }

    public void setRango(Rango rango) {
        this.rango = rango;
    }
}
