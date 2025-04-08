package co.edu.uniquindio.poo;

import java.util.LinkedList;

public abstract class Vehiculo {
    protected String id;
    protected String modelo;
    protected int fechaFabricacion;
    protected double kilometraje;
    protected int misionCompletadas;
    protected EstadoOperativo estadoOperativo;
    protected LinkedList<Mision>listaMisiones;

    public Vehiculo(String id, String modelo,int fechaFabricacion, double kilometraje,EstadoOperativo estadoOperativo) {
        this.id = id;
        this.modelo = modelo;
        this.fechaFabricacion = fechaFabricacion;
        this.kilometraje = kilometraje;
        this.misionCompletadas = 0;
        this.estadoOperativo = estadoOperativo;
        listaMisiones=new LinkedList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(int fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMisionCompletadas() {
        return misionCompletadas;
    }

    public void setMisionCompletadas(int misionCompletadas) {
        this.misionCompletadas = misionCompletadas;
    }
    public EstadoOperativo getEstadoOperativo() {
        return estadoOperativo;
    }

    public void setEstadoOperativo(EstadoOperativo estadoOperativo) {
        this.estadoOperativo = estadoOperativo;
    }

    public LinkedList<Mision> getListaMisiones() {
        return listaMisiones;
    }

    public void setListaMisiones(LinkedList<Mision> listaMisiones) {
        this.listaMisiones = listaMisiones;
    }

    @Override
    public String toString() {
        return "DATOS DE VEHICULOS" + "\n" +
                "Id " + id +
                " Modelo " + modelo +
                "Año de fabricacion " + fechaFabricacion +
                "Kilometraje" + kilometraje +
                "Mision Completadas " + misionCompletadas +
                "Estado Operativo" + estadoOperativo;

    }
}
