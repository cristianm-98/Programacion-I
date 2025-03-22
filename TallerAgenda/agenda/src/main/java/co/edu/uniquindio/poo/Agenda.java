package co.edu.uniquindio.poo;

public class Agenda {

    //Atributos
    private String nombre;
    private Contacto[] listaContactos;
    private Reunion[] listaReuniones;
    private Grupo[] listaGrupos;

    //Constructor
    public Agenda(String nombre) {
        this.nombre = nombre;
        listaContactos = new Contacto[5];
        listaReuniones = new Reunion[5];
        listaGrupos = new Grupo[5];

    }

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Contacto[] getListaContactos() {
        return listaContactos;
    }

    public Reunion[] getListaReuniones() {
        return listaReuniones;
    }

    public Grupo[] getListaGrupos() {
        return listaGrupos;
    }

    public void setListaContactos(Contacto[] listaContactos) {
        this.listaContactos = listaContactos;
    }

    public void setListaReuniones(Reunion[] listaReuniones) {
        this.listaReuniones = listaReuniones;
    }

    public void setListaGrupos(Grupo[] listaGrupos) {
        this.listaGrupos = listaGrupos;
    }

    //Mensaje
    @Override
    public String toString() {
        return "DATOS DE LA AGENDA \n"
                + "Nombre: " + nombre;
    }

    //Metodo para encontrar posicion  en la lista
    public int encontrarPosicionValido() {
        for (int i = 0; i < listaContactos.length; i++) {
            if (listaContactos == null) {
                return i;
            }
        }
        return -1;
    }

    //Metodo para verificar si el contacto esta repetido
    public boolean verificarContacto(String nombre, String telefono) {
        boolean flag = true;
        for (int i = 0; i < listaContactos.length; i++) {
            if (listaContactos[i].getNombre().equals(nombre) && listaContactos[i].getTelefono().equals(telefono)) {
                flag = false;
            }
        }
        return flag;
    }
}
