package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;

public class Mision {
    private String id;
    private LocalDate fechaMision;
    private String ubicacion;
    private Vehiculo vehiculo;
    private LinkedList<Soldado> listaSoldados;

    public Mision(String id, LocalDate fechaMision, String ubicacion) {
        this.fechaMision = fechaMision;
        this.ubicacion = ubicacion;
        listaSoldados = new LinkedList<>();
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

    public boolean agregarSoldado(Soldado soldado, Mision mision) {
        if (soldado.isDisponible()) {
            mision.getListaSoldados().add(soldado);
            soldado.setDisponible(false);
            return true;
        }
        return false;
    }

    public void cambiarEstado(Mision mision) {
        for (Soldado soldado : mision.getListaSoldados()) {
            soldado.setDisponible(true);
        }
    }

    public LinkedList<Soldado> buscarEspecialidad(String funcion) {
        LinkedList<Soldado> listaEspecializado = new LinkedList<>();
        for (Soldado soldado : listaSoldados) {
            if (soldado.getFuncion().equals(funcion)) {
                listaEspecializado.add(soldado);
            }
        }
        return listaEspecializado;
    }

    public LinkedList<Soldado>soldadoRango(Rango rango,boolean disponible){
        LinkedList<Soldado>listaSoldadoRango=new LinkedList<>();
        for(Soldado soldado:listaSoldados){
            if (soldado.isDisponible()==disponible && soldado.getRango()==rango){
                listaSoldadoRango.add(soldado);
            }
        }
        return listaSoldadoRango;
    }
    public double calcularEdades(){
        int contarEdad=0;
        double promedio=0.0;
        for(Soldado soldado:listaSoldados) {
            contarEdad = contarEdad + soldado.getEdad();
        }
        if(listaSoldados.size()>0) {
            promedio = (double)contarEdad / listaSoldados.size();
        }
        return promedio;
    }
    public Soldado buscarSoldado(String idSoldado){
        for(Soldado soldado:listaSoldados){
            if(soldado.getId().equals(idSoldado)){
                return soldado;
            }
        }
        return null;
    }
}