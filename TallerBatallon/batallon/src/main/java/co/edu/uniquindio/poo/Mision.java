package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;

public class Mision {
    private String id;
    private LocalDate fechaMision;
    private String ubicacion;
    private LinkedList<String>listaPersonalAsignado;
    private Vehiculo theVehiculo;

    public Mision(String id,LocalDate fechaMision, String ubicacion) {
        this.fechaMision = fechaMision;
        this.ubicacion = ubicacion;
        listaPersonalAsignado=new LinkedList<>();
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

    public Vehiculo getTheVehiculo() {
        return theVehiculo;
    }

    public void setTheVehiculo(Vehiculo theVehiculo) {
        this.theVehiculo = theVehiculo;
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