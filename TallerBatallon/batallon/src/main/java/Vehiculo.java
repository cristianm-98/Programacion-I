
public abstract class Vehiculo {
    public String id;
    public String modelo;
    public int fechaFabricacion;
    public double kilometraje;
    public int misionCompletadas;

    public Vehiculo(String id, String modelo, int fechaFabricacion, double kilometraje,int misionCompletadas){
        this.id=id;
        this.modelo=modelo;
        this.fechaFabricacion=fechaFabricacion;
        this.kilometraje=kilometraje;
        this.misionCompletadas=misionCompletadas;
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

    public abstract void desplazar();
}
