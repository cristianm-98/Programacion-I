package co.edu.uniquindio.poo;

public class Vehiculo {
    protected String id;
    protected String modelo;
    protected int fechaFabricacion;
    protected double kilometraje;
    protected int misionCompletadas;
    protected EstadoOperativo estadoOperativo;

    public Vehiculo(String id, String modelo,int fechaFabricacion, double kilometraje,int misionCompletadas,EstadoOperativo estadoOperativo) {
        this.id = id;
        this.modelo = modelo;
        this.fechaFabricacion = fechaFabricacion;
        this.kilometraje = kilometraje;
        this.misionCompletadas = misionCompletadas;
        this.estadoOperativo = estadoOperativo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(int fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMisionCompletadas() {
        return misionCompletadas;
    }

    public void setMisionCompletadas(int misionCompletadas) {
        this.misionCompletadas = misionCompletadas;
    }
    public EstadoOperativo getEstadoOperativo() {
        return estadoOperativo;
    }

    public void setEstadoOperativo(EstadoOperativo estadoOperativo) {
        this.estadoOperativo = estadoOperativo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "id='" + id + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fechaFabricacion=" + fechaFabricacion +
                ", kilometraje=" + kilometraje +
                ", misionCompletadas=" + misionCompletadas +
                ", estadoOperativo=" + estadoOperativo +
                '}';
    }
}
