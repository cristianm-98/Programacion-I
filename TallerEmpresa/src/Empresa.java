public class Empresa {

    //Atributos
    private String nit;
    private String nombre;

    //Constructor
    public Empresa(String nit,String nombre){
        this.nit=nit;
        this.nombre=nombre;
    }
    //Getters & Setters
    public String getNit(){
        return nit;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNit(String nit){
        this.nit=nit;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    @Override
    public String toString(){
        return "NOMBRE DE LA EMPRESA" + '\n'
                + "Nit: " +nit+ '\n'
                + "Nombre: " +nombre;
    }
}
