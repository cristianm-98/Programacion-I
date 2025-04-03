import java.time.LocalDate;

public abstract class Blindado extends Vehiculo {

    private String nivelBlindado;

    public Blindado(String id, String modelo, LocalDate fechaFabricacion, String kilometraje,String nivelBlindado){
        super(id,modelo,fechaFabricacion,kilometraje);
        this.nivelBlindado=nivelBlindado;
    }

    public String getNivelBlindado() {
        return nivelBlindado;
    }

    public void setNivelBlindado(String nivelBlindado) {
        this.nivelBlindado = nivelBlindado;
    }
    @Override
    public void desplazar(){
        System.out.println("El vehiculo blindado se esta moviendo");
    }
}
