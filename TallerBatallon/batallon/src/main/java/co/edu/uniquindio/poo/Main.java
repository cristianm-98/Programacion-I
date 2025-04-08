package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Batallon batallon = new Batallon("Batallon de Honda N-8");

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