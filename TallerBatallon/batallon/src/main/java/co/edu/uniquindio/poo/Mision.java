package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;

public class Mision {
    private String id;
    private LocalDate fechaMision;
    private String ubicacion;
    private LinkedList<String>listaPersonalAsignado;
    private Vehiculo vehiculo;

    public Mision(String id,LocalDate fechaMision, String ubicacion,LinkedList<String>listaPersonalAsignado) {
        this.fechaMision = fechaMision;
        this.ubicacion = ubicacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getFechaMision() {
        return fechaMision;
    }

    public void setFechaMision(LocalDate fechaMision) {
        this.fechaMision = fechaMision;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public LinkedList<String> getListaPersonalAsignado() {
        return listaPersonalAsignado;
    }

    public void setListaPersonalAsignado(LinkedList<String> listaPersonalAsignado) {
        this.listaPersonalAsignado = listaPersonalAsignado;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Mision{" +
                "fechaMision=" + fechaMision +
                ", ubicacion='" + ubicacion + '\'' +
                ", personalAsignado='" + listaPersonalAsignado + '\'' +
                '}';
    }
}