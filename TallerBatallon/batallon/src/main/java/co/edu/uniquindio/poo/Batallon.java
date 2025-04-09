package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Batallon {

    private String nombre;
    private LinkedList<Vehiculo> listaVehiculos;
    private LinkedList<Mision> listaMisiones;


    public Batallon(String nombre) {
        this.nombre = nombre;
        listaVehiculos = new LinkedList<>();
        listaMisiones = new LinkedList<>();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Mision> getListaMisiones() {
        return listaMisiones;
    }

    public void setListaMisiones(LinkedList<Mision> listaMisiones) {
        this.listaMisiones = listaMisiones;
    }

    public LinkedList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(LinkedList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    @Override
    public String toString() {
        return "DATOS DEL BATALLON \n"
                + " Nombre" + nombre;
    }

    //--------Realizacion del CRUD------------

    //Metodo para buscarVehiculo
    public Vehiculo buscarVehiculo(String id){
        for(Vehiculo vehiculo:listaVehiculos){
            if(vehiculo.getId().equals(id)){
                return vehiculo;
            }
        }
        return null;
    }

    //Metodo para Almacenar
    public void agregarVehiculo(Vehiculo vehiculo) {
        listaVehiculos.add(vehiculo);
    }

    //Metodo para Obtener
    public LinkedList<Vehiculo> obtenerVehiculo() {
        return listaVehiculos;
    }

    //Metodo para Eliminar
    public boolean eliminarVehiculo(String id){
        for(Vehiculo vehiculo:listaVehiculos){
            if(vehiculo.getId().equals(id)){
                listaVehiculos.remove(vehiculo);
                return true;
            }
        }
        return false;
    }

    //Metodo para Actualizar
    public boolean actulizarVehiculo(String id, String modelo, int fechaFabricacion,double kilometraje, EstadoOperativo estadoOperativo){
        for(Vehiculo vehiculo:listaVehiculos){
            if(vehiculo.getId().equals(id)){
                vehiculo.setId(id);
                vehiculo.setModelo(modelo);
                vehiculo.setFechaFabricacion(fechaFabricacion);
                vehiculo.setKilometraje(kilometraje);
                vehiculo.setEstadoOperativo(estadoOperativo);
                return true;

            }
        }
        return false;
    }

    //------------Finalizacion del CRUD

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

    public boolean estaDisponible(String id){
        for(Vehiculo vehiculo:listaVehiculos){
            if(vehiculo.getId().equals(id) && vehiculo.estadoOperativo.equals(EstadoOperativo.DISPONIBLE)){
                return true;
            }
        }
        return false;
    }
}
