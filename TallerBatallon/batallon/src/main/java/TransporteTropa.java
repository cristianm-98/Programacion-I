import java.time.LocalDate;

public abstract class TransporteTropa extends Vehiculo {
    private String capacidadSoldado;

    public TransporteTropa(String id,String modelo, LocalDate fechaFabricacion,String kilometraje,String capacidadSoldado) {
        super(id,modelo,fechaFabricacion,kilometraje,);
        this.capacidadSoldado=capacidadSoldado;
    }

    public String getCapacidadSoldado() {
        return capacidadSoldado;
    }

    public void setCapacidadSoldado(String capacidadSoldado) {
        this.capacidadSoldado = capacidadSoldado;
    }
    @Override
    public void desplazar(){
        System.out.println("El vehiculo de tropas se esta moviendo");
    }
}
