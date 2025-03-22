package co.edu.uniquindio.poo;

public class Contacto {
    //Atributos
    private String nombre;
    private String alias;
    private String direccion;
    private String telefono;
    private String email;

    //Constructor
    public Contacto (String nombre, String alias,String direccion,String telefono,String email){
        this.nombre=nombre;
        this.alias=alias;
        this.direccion=direccion;
        this.telefono=telefono;
        this.email=email;
    }
    //Getters and Setters
    public String getNombre(){
        return nombre;
    }
    public String getAlias(){
        return alias;
    }
    public String getDireccion (){
        return direccion;
    }
    public String getTelefono(){
        return telefono;
    }
    public String getEmail(){
        return email;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setAlias(String alias){
        this.alias=alias;
    }
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    public void setTelefeno(String telefono){
        this.telefono=telefono;
    }
    public void setEmail(String email){
        this.email=email;
    }
    @Override
    public String toString (){
        return "DATOS DEL CONTACTO \n"
                + "Nombre " + nombre +"\n"
                + "Alias " + alias +"\n"
                + "Dirección " + direccion +"\n"
                + "telefono " + telefono +"\n"
                + "Email " + email;
    }
}
