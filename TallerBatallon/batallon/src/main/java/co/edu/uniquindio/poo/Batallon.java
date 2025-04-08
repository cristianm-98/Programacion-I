package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Batallon {
    private String nombre;
    private LinkedList<Vehiculo>listaVehiculos;
    private LinkedList<Mision>listaMisiones;


    private LinkedList<VehiculoTransporteTropa>listTransporteTropas;
    private LinkedList<VehiculoBlindado>listBlindados;
    private LinkedList<VehiculoApoyo>listApoyos;


    public Batallon(String nombre){
        this.nombre=nombre;
        listaVehiculos=new LinkedList<>();
        listaMisiones=new LinkedList<>();

        listTransporteTropas=new LinkedList<>();
        listBlindados=new LinkedList<>();
        listApoyos=new LinkedList<>();
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public LinkedList<Mision> getListaMisiones() {
        return listaMisiones;
    }

    public void setListaMisiones(LinkedList<Mision> listaMisiones) {
        this.listaMisiones = listaMisiones;
    }

    public LinkedList<VehiculoTransporteTropa> getListTransporteTropas() {
        return listTransporteTropas;
    }

    public void setListTransporteTropas(LinkedList<VehiculoTransporteTropa> listTransporteTropas) {
        this.listTransporteTropas = listTransporteTropas;
    }

    public LinkedList<VehiculoBlindado> getListBlindados() {
        return listBlindados;
    }

    public void setListBlindados(LinkedList<VehiculoBlindado> listBlindados) {
        this.listBlindados = listBlindados;
    }

    public LinkedList<VehiculoApoyo> getListApoyos() {
        return listApoyos;
    }

    public void setListApoyos(LinkedList<VehiculoApoyo> listApoyos) {
        this.listApoyos = listApoyos;
    }

    public LinkedList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(LinkedList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    @Override
    public String toString(){
        return "DATOS DEL BATALLON \n"
                + " Nombre" + nombre;
    }

    //Metodo para obtener la lista de los Vehiculos
    public LinkedList<Vehiculo>obtenerVehiculosConMisiones(){
        LinkedList<Vehiculo>vehiculosMisionesCompleto=new LinkedList<>();

        for(Vehiculo vehiculo:listaVehiculos){
            if(vehiculo.getMisionCompletadas()>50){
                vehiculosMisionesCompleto.add(vehiculo);
            }
        }
        return vehiculosMisionesCompleto;
    }

    //Metodo para obtener la lista de los vehiculos de cada una de las listas
    public LinkedList<Vehiculo>obtenerVehiculos(){
        LinkedList<Vehiculo>vehiculosMisionesCompletadas=new LinkedList<>();

        for(Vehiculo vehiculo:listTransporteTropas){
            if(vehiculo.getMisionCompletadas()>50){
                vehiculosMisionesCompletadas.add(vehiculo);
            }
        }
        for(Vehiculo vehiculo:listBlindados){
            if(vehiculo.getMisionCompletadas()>50){
                vehiculosMisionesCompletadas.add(vehiculo);
            }
        }
        for(Vehiculo vehiculo:listApoyos){
            if(vehiculo.getMisionCompletadas()>50){
                vehiculosMisionesCompletadas.add(vehiculo);
            }
        }
        return vehiculosMisionesCompletadas;
    }
}
