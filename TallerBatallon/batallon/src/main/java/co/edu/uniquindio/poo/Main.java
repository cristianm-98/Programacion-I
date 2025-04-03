package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Batallon batallon = new Batallon("Batallon de Honda N-8");

        Vehiculo vehiculoTropa=new TransporteTropa("01","2011",2014,308.41,20,5,EstadoOperativo.MISION);
        Vehiculo vehiculoBlindaje=new Blindado("02","2100",2000,2580.01,20,4,EstadoOperativo.DISPONIBLE);
        Vehiculo vehiculoApoyo = new Apoyo("03","2001",2005,3850.01,56,EstadoOperativo.MISION,TipoFuncion.MEDICO);


        LinkedList<Vehiculo>vehiculosConMisiones= batallon.obtenerVehiculosConMisiones();

        if(vehiculosConMisiones.isEmpty()){
            System.out.println("No hay vehiculos con mas de 50 misiones completadas");
            }else{
                System.out.println("Vehiculo con mas de 50 misiones");

                for(Vehiculo vehiculo:vehiculosConMisiones){
                    System.out.println(" "+vehiculo.getId()+" "+vehiculo.getModelo());


            }
        }

    }
}