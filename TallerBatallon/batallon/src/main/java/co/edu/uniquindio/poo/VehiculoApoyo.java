package co.edu.uniquindio.poo;

public abstract class VehiculoApoyo extends Vehiculo {
    private TipoFuncion tipoFuncion;

    public VehiculoApoyo(String id, String modelo, int fechaFabricacion, double kilometraje, EstadoOperativo estadoOperativo, TipoFuncion tipoFuncion) {
        super(id, modelo,fechaFabricacion,kilometraje,estadoOperativo);
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
        return "Vehiculo de Apoyo" + super.toString() + "Tipo de funcion " + tipoFuncion;
    }
}
