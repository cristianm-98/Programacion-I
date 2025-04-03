package co.edu.uniquindio.poo;

public class Apoyo extends Vehiculo {
    public TipoFuncion tipoFuncion;

    public Apoyo(String id, String modelo,int fechaFabricacion, double kilometraje,int misionCompletadas,EstadoOperativo estadoOperativo,TipoFuncion tipoFuncion) {
        super(id, modelo,fechaFabricacion,kilometraje,misionCompletadas,estadoOperativo);
        this.tipoFuncion=tipoFuncion;
    }

    public TipoFuncion getTipoFuncion() {
        return tipoFuncion;
    }

    public void setTipoFuncion(TipoFuncion tipoFuncion) {
        this.tipoFuncion = tipoFuncion;
    }

    @Override
    public String toString() {
        return "Apoyo{" +
                "tipoFuncion=" + tipoFuncion +
                ", id='" + id + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fechaFabricacion=" + fechaFabricacion +
                ", kilometraje=" + kilometraje +
                ", misionCompletadas=" + misionCompletadas +
                ", estadoOperativo=" + estadoOperativo +
                '}';
    }
}
