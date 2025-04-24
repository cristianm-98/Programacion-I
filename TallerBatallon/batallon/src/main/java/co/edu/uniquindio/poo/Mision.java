package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;

public class Mision {
    private String id;
    private LocalDate fechaMision;
    private String ubicacion;
    private Vehiculo vehiculo;
    private LinkedList<Soldado>listaSoldados;

    public Mision(String id, LocalDate fechaMision, String ubicacion) {
        this.fechaMision = fechaMision;
        this.ubicacion = ubicacion;
        listaSoldados=new LinkedList<>();
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

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LinkedList<Soldado> getListaSoldados() {
        return listaSoldados;
    }

    public void setListaSoldados(LinkedList<Soldado> listaSoldados) {
        this.listaSoldados = listaSoldados;
    }

    @Override
    public String toString() {
        return "Mision{" +
                "fechaMision=" + fechaMision +
                ", ubicacion='" + ubicacion + '\'' +
                '}';
    }
}