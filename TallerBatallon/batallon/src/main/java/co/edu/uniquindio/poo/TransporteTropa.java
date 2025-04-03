package co.edu.uniquindio.poo;

public class TransporteTropa extends Vehiculo {
    private int capacidadSoldado;

    public TransporteTropa(String id, String modelo,int fechaFabricacion, double kilometraje,int misionCompletadas,int capacidadSoldado,EstadoOperativo estadoOperativo) {
        super(id, modelo, fechaFabricacion,kilometraje,misionCompletadas,estadoOperativo);
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
        return "TransporteTropa{" +
                "id='" + id + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fechaFabricacion=" + fechaFabricacion +
                ", kilometraje=" + kilometraje +
                ", misionCompletadas=" + misionCompletadas +
                ", estadoOperativo=" + estadoOperativo +
                ", capacidadSoldado=" + capacidadSoldado +
                '}';
    }
}
