package co.edu.uniquindio.poo;

public class Blindado extends Vehiculo {

    private int nivelBlindaje;

    public Blindado(String id, String modelo,int fechaFabricacion,double kilometraje, int misionCompletadas,int nivelBlindaje, EstadoOperativo estadoOperativo) {
        super(id, modelo, fechaFabricacion,kilometraje,misionCompletadas,estadoOperativo);
        this.nivelBlindaje = nivelBlindaje;
    }

    public int getNivelBlindaje() {
        return nivelBlindaje;
    }

    public void setNivelBlindaje(int nivelBlindaje) {
        this.nivelBlindaje=nivelBlindaje;
    }

}
