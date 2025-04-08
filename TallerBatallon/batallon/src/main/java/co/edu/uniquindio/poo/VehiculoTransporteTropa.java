package co.edu.uniquindio.poo;

public abstract class VehiculoTransporteTropa extends Vehiculo {
    private int capacidadSoldado;

    public VehiculoTransporteTropa(String id, String modelo, int fechaFabricacion, double kilometraje, int capacidadSoldado, EstadoOperativo estadoOperativo) {
        super(id, modelo, fechaFabricacion,kilometraje,estadoOperativo);
        this.capacidadSoldado = capacidadSoldado;
    }

    public int getCapacidadSoldado() {
        return capacidadSoldado;
    }

    public void setCapacidadSoldado(int capacidadSoldado) {
        this.capacidadSoldado = capacidadSoldado;
    }

    @Override
    public String toString() {
        return "Transporte Tropa" + super.toString() + "Capacidad Soldado" + capacidadSoldado;
    }
}
