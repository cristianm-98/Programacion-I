package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Mision {
    private LocalDate fechaMision;
    private String ubicacion;
    private String personalAsignado;

    public Mision(LocalDate fechaMision, String ubicacion, String personalAsignado) {
        this.fechaMision = fechaMision;
        this.ubicacion = ubicacion;
        this.personalAsignado = personalAsignado;
    }

    public LocalDate getFechaMision() {
        return fechaMision;
    }
    public String getUbicacion(){
        return ubicacion;
    }
    public String getPersonalAsignado(){
        return personalAsignado;
    }
    public void setFechaMision(LocalDate fechaMision){
        this.fechaMision=fechaMision;
    }
    public void setUbicacion(String ubicacion){
        this.ubicacion=ubicacion;
    }
    public void setPersonalAsignado(String personalAsignado){
        this.personalAsignado=personalAsignado;
    }

    @Override
    public String toString() {
        return "Mision{" +
                "fechaMision=" + fechaMision +
                ", ubicacion='" + ubicacion + '\'' +
                ", personalAsignado='" + personalAsignado + '\'' +
                '}';
    }
}