package co.edu.uniquindio.poo;

import java.time.LocalDate;
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

    //-------------------Realizacion del CRUD------------------

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

    //------------Finalizacion del CRUD------------------

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

    //--------------Inicio de metodos del taller Batallon--------------------

    //Metodo para registar la mision

    public void registrarMision(LocalDate fechaMision, String ubicacionMision, LinkedList<String>personalAsignado, String idVehiculo){
        for(Vehiculo vehiculo:listaVehiculos){
            if(vehiculo.getId().equals(idVehiculo)){
                Mision newMision=new Mision(idVehiculo,fechaMision,ubicacionMision,personalAsignado);
                listaMisiones.add(newMision);
                vehiculo.setMisionCompletadas(vehiculo.getMisionCompletadas()+1);
                break;
            }
        }
    }

    //Metodo para calcular el promedio del kilometraje de cada vehiculo
    public String obtenerPromedioKilometrajeTipo(){
        int contarVehiculoTropas=0;
        int contarVehiculoBlindado=0;
        int contarVehiculoApoyo=0;
        double sumarKilometrajeTropas=0.0;
        double sumarKilometrajeBlindado=0.0;
        double sumarKilometrajeApoyo=0.0;
        double promedioTropas=0.0;
        double promedioBlindado=0.0;
        double promedioApoyo=0.0;

        for(Vehiculo vehiculo:listaVehiculos){
            if(vehiculo instanceof VehiculoTransporteTropa){
                contarVehiculoTropas++;
                sumarKilometrajeTropas+=vehiculo.getKilometraje();
            }else if (vehiculo instanceof VehiculoBlindado){
                contarVehiculoBlindado++;
                sumarKilometrajeBlindado+=vehiculo.getKilometraje();
            }else if(vehiculo instanceof VehiculoApoyo){
                contarVehiculoApoyo++;
                sumarKilometrajeApoyo+=vehiculo.getKilometraje();
            }

        }
        if(contarVehiculoTropas>0){
            promedioTropas=sumarKilometrajeTropas/contarVehiculoTropas;
        }
        if (contarVehiculoBlindado>0) {
            promedioBlindado = sumarKilometrajeBlindado / contarVehiculoBlindado;
        }
        if (contarVehiculoApoyo>0){
            promedioApoyo=sumarKilometrajeApoyo/contarVehiculoApoyo;
        }
        String resultado= "Promedio de Vehiculo Tropas " + promedioTropas + "\n";
        resultado+= "Promedio de Vehiculo Blindado " + promedioBlindado + "\n";
        resultado+= "Promedio de Vehiculo Apoyo " + promedioApoyo;

        return resultado;
    }

    //Metodo para mostrar todas las misiones, por ubicacion y rango de fecha

    public LinkedList<Mision> obtenerListaMisiones(String ubicacion,LocalDate fechaInicio, LocalDate fechaFinal){
        LinkedList<Mision>misionesFiltradas=new LinkedList<>();

        for(Mision mision:listaMisiones){
            if(mision.getUbicacion().equals(ubicacion) && mision.getFechaMision().isAfter(fechaInicio) || mision.getFechaMision().equals(fechaInicio) &&
                    mision.getFechaMision().isBefore(fechaFinal) || mision.getFechaMision().equals(fechaFinal)){
                misionesFiltradas.add(mision);

            }
        }
        return misionesFiltradas;
    }

    //Metodo para retornar el vehiculo
    public LinkedList<Vehiculo>listaVehiculosConMayorMisiones(int misionesCompletadas) {
        LinkedList<Vehiculo>vehiculoConMasMisiones=new LinkedList<>();
        int maximoMisiones=0;
        for(Vehiculo vehiculo:listaVehiculos){
            if(vehiculo.getMisionCompletadas()>maximoMisiones){
                maximoMisiones=vehiculo.getMisionCompletadas();
                vehiculoConMasMisiones.clear();
                vehiculoConMasMisiones.add(vehiculo);
            }else if(vehiculo.getMisionCompletadas()==maximoMisiones){
                vehiculoConMasMisiones.add(vehiculo);
            }
        }
        return vehiculoConMasMisiones;

    }
    //--------------Fin de metodos del taller Batallon-----------------


    public boolean estaDisponible(String id){
        for(Vehiculo vehiculo:listaVehiculos){
            if(vehiculo.getId().equals(id) && vehiculo.estadoOperativo.equals(EstadoOperativo.DISPONIBLE)){
                return true;
            }
        }
        return false;
    }
}
