package co.edu.uniquindio.poo;

public class Grupo {
    private String nombre;
    private Categoria categoria;
    private Contacto[] listaContactoGrupos;

    public Grupo(String nombre, Categoria categoria){
        this.nombre=nombre;
        this.categoria=categoria;
        listaContactoGrupos=new Contacto[5];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Contacto[] getListaContactoGrupos() {
        return listaContactoGrupos;
    }

    public void setListaContactoGrupos(Contacto[] listaContactoGrupos) {
        this.listaContactoGrupos = listaContactoGrupos;
    }

    @Override
    public String toString(){
        return "DATOS DEL GRUPO \n"
                + "Nombre " + nombre;
    }
}
