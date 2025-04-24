package co.edu.uniquindio.poo;

public abstract class VehiculoApoyo extends Vehiculo {


    public VehiculoApoyo(String id, String modelo, int fechaFabricacion, double kilometraje, EstadoOperativo estadoOperativo) {
        super(id, modelo,fechaFabricacion,kilometraje,estadoOperativo);

    }

    @Override
    public String toString() {
        return "Vehiculo de Apoyo" + super.toString();
    }
}
