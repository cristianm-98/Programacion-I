package co.edu.uniquindio.poo;

public class Reunion {
    private String descripcion;
    private String fecha;
    private String hora;
    private Contacto[] listaAsistentes;

    public Reunion(String descripcion,String fecha,String hora){
        this.descripcion=descripcion;
        this.fecha=fecha;
        this.hora=hora;
        listaAsistentes=new Contacto[5];
    }
    public String getDescripcion(){
        return descripcion;
    }
    public String getFecha(){
        return fecha;
    }
    public String getHora(){
        return hora;
    }
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    public void setFecha(String fecha){
        this.fecha=fecha;
    }
    public void setHora(String hora){
        this.hora=hora;
    }
    public Contacto[] getListaAsistentes() {
        return listaAsistentes;
    }
    public void setListaAsistente(Contacto[] listaAsistentes) {
        this.listaAsistentes = listaAsistentes;
    }

    @Override
    public String toString(){
        return "DATOS DE LA REUNION \n"
                + "Descripcion " + descripcion +"\n"
                + "Fecha " + fecha +"\n"
                + "Hora " + hora;
    }
}
