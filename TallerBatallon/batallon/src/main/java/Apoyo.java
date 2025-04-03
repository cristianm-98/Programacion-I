import java.time.LocalDate;

public abstract class Apoyo extends Vehiculo{

    public Apoyo(String id, String modelo, LocalDate fechaFabricacion, String kilometraje){
        super(id,modelo,fechaFabricacion,kilometraje);
    }
    @Override
    public void desplazar(){
        System.out.println("El vehiculo de apoyo se esta moviendo");
    }

}
