public class Estudiante {

    //Atributos
    private String id;
    private String nombreCompleto;
    private int edad;
    private char genero;
    private String identidad;
    private String alergia;
    private String nombreAcudiente;
    private String numeroAcudiente;


    //Constructor
    public Estudiante(String id, String nombreCompleto, int edad, char genero, String identidad,String alergia,String nombreAcudiente,String numeroAcudiente){
        this.id=id;
        this.nombreCompleto=nombreCompleto;
        this.edad=edad;
        this.genero=genero;
        this.identidad=identidad;
        this.alergia=alergia;
        this.nombreAcudiente=nombreAcudiente;
        this.numeroAcudiente=numeroAcudiente;
    }

    //Getters & Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String getNombreAcudiente() {
        return nombreAcudiente;
    }

    public void setNombreAcudiente(String nombreAcudiente) {
        this.nombreAcudiente = nombreAcudiente;
    }

    public String getNumeroAcudiente() {
        return numeroAcudiente;
    }

    public void setNumeroAcudiente(String numeroAcudiente) {
        this.numeroAcudiente = numeroAcudiente;
    }

    @Override
    public String toString() {
        return  "DATOS DEL ESTUDIANTE \n"
                +"----------------------- \n"
                +"Id: " + id + '\n'
                +"Nombre: "+nombreCompleto+ '\n'
                +"Edad: "+edad+ '\n'
                +"Genero: "+genero+ '\n'
                +"Identificacion: "+identidad+ '\n'
                +"Alergia: "+alergia+ '\n'
                +"Nombre del Acudiente: "+nombreAcudiente+ '\n'
                +"Numero del Acudiente: "+numeroAcudiente+ '\n';
    }
}
