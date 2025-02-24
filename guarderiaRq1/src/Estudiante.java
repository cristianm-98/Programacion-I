public class Estudiante {

    //Atributos de la clase Estudiante
    private String nombre;
    private int edad;
    private char genero;
    private String identificacion;
    private String alergia;
    private String nombreAcudiente;
    private String numeroContacto;

    public Estudiante(String nombre, int edad, char genero, String identificacion, String alergia, String nombreAcudiente, String numeroContacto){
        this.nombre=nombre;
        this.edad=edad;
        this.genero=genero;
        this.identificacion=identificacion;
        this.alergia=alergia;
        this.nombreAcudiente=nombreAcudiente;
        this.numeroContacto=numeroContacto;
    }

    //Getters & Setters
    public String getNombre(){
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    public char getGenero(){
        return genero;
    }
    public String getIdentificacion(){
        return identificacion;
    }
    public String getAlergia(){
        return alergia;
    }
    public String getNombreAcudiente(){
        return nombreAcudiente;
    }
    public String getNumeroContacto(){
        return numeroContacto;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setGenero(char genero){
        this.genero=genero;
    }
    public void setIdentificacion(String identificacion){
        this.identificacion=identificacion;
    }
    public void setAlergia(String alergia){
        this.alergia=alergia;
    }
    public void setNombreAcudiente(String nombreAcudiente){
        this.nombreAcudiente=nombreAcudiente;
    }
    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    //Cuerpo del mensaje

    @Override
    public String toString() {
        return "DATOS DEL ESTUDIANTE \n"
                +"-------------------------------- \n"
                +"Nombre: "+nombre+ '\n'
                +"Edad: "+edad+ '\n'
                +"Genero: "+genero+ '\n'
                +"Identificación: "+identificacion+ '\n'
                +"Alergia: "+alergia+ '\n'
                +"Nombre del Acudiente: "+nombreAcudiente+ '\n'
                +"Numero del Acudiente: "+numeroContacto
                ;
    }
}
