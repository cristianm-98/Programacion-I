package co.edu.uniquindio.poo;

public abstract class VehiculoBlindado extends Vehiculo {

    private int nivelBlindaje;

    public VehiculoBlindado(String id, String modelo, int fechaFabricacion, double kilometraje, int nivelBlindaje, EstadoOperativo estadoOperativo) {
        super(id, modelo, fechaFabricacion,kilometraje,estadoOperativo);
        this.nivelBlindaje = nivelBlindaje;
    }

    public int getNivelBlindaje() {
        return nivelBlindaje;
    }

    public void setNivelBlindaje(int nivelBlindaje) {
        this.nivelBlindaje=nivelBlindaje;
    }

    @Override
    public String toString() {
        return "Vehiculo Blindado" + super.toString() + "Nivel de blindaje " + nivelBlindaje;
    }
}
