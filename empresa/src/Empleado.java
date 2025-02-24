public class Empleado {

    //Atributos
    private String identifacion;
    private String nombreCompleto;
    private String puesto;
    private String correo;
    private String telefono;
    private String fechaContratacion;

    //Constructor
    public Empleado(String identifacion, String nombreCompleto, String puesto, String correo, String telefono, String fechaContracion) {
        this.identifacion = identifacion;
        this.nombreCompleto = nombreCompleto;
        this.puesto = puesto;
        this.correo = correo;
        this.telefono = telefono;
        this.fechaContratacion = fechaContracion;
    }

    //Getters & Setters
    public String getIdentifacion() {
        return identifacion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setIdentifacion(String identifacion) {
        this.identifacion = identifacion;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }


    @Override
    public String toString() {
        return "DATOS DEL EMPLEADO" +'\n'
                + "Identificacion: " +identifacion+ '\n'
                + "Nombre Completo: " +nombreCompleto+ '\n'
                + "Puesto: " +puesto+ '\n'
                + "Correo Electronico: " +correo+ '\n'
                + "Telefono: " +telefono+ '\n'
                + "Fecha Contratacion: " +fechaContratacion+ '\n'
                ;
    }
}
