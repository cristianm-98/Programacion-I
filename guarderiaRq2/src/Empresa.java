import javax.swing.*;
import java.util.ArrayList;

public class Empresa {

    //Atributos de la clase
    private String nit;
    private String nombre;
    private ArrayList<Estudiante> listaEstudiantes;


    //Constructor
    public Empresa(String nit, String nombre) {
        this.nit = nit;
        this.nombre = nombre;
        listaEstudiantes = new ArrayList<>();

    }
    //Getters & Setters

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiante(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    //Estructura del mensaje
    @Override
    public String toString() {
        return "DATOS DE LA EMPRESA"
                + "Nit: " + nit + '\n'
                + "Nombre: " + nombre + '\n'
                ;
    }

    //Metodo de agregar
    public void agregarEstudiante(Estudiante estudianteAgregar) {
        listaEstudiantes.add(estudianteAgregar);
    }

    //Metodo de obtener
    public void obtenerEstudiante() {
        int i = 0;
        for (Estudiante estudiante : listaEstudiantes) {
            JOptionPane.showMessageDialog(null, "Estudiante " + (i + 1) + '\n' + estudiante + i++);

        }
    }

    //Metodo de actualizar
    public void actualizarEstudiante(Estudiante estudianteActualizar) {
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getIdentidad().equals(estudianteActualizar.getIdentidad())) {

                String nuevoNombre = JOptionPane.showInputDialog("Cambio de nombre");
                estudiante.setNombreCompleto(nuevoNombre);

                break;

                /*estudiante.setNombreCompleto(estudianteActualizar.getNombreCompleto());
                estudiante.setEdad(estudianteActualizar.getEdad());
                estudiante.setGenero(estudianteActualizar.getGenero());
                estudiante.setAlergia(estudianteActualizar.getAlergia());
                estudiante.setNombreAcudiente(estudianteActualizar.getNombreAcudiente());
                estudiante.setNumeroAcudiente(estudiante.getNumeroAcudiente());
                */
            }
        }
    }

    //Metodo de Eliminar
    public void eliminarEstudiante(Estudiante estudianteEliminar) {
        listaEstudiantes.remove(estudianteEliminar);
    }

    //Metodo para obtener mayores de edad
    public ArrayList<Estudiante> listarEstudiantesMayores(ArrayList<Estudiante> listaEstudiantes) {

        boolean mayorEdad = false;
        for (Estudiante estudianteMayor : this.getListaEstudiantes()) {
            if (estudianteMayor.getEdad() >= 5) {
                listaEstudiantes.add(estudianteMayor);
                mayorEdad = true;
            }
        }
        if (mayorEdad) {
            for (Estudiante mayor : listaEstudiantes) {
                JOptionPane.showMessageDialog(null, "Los estudiante mayores son: \n"
                        + mayor.getNombreCompleto() + " " + mayor.getEdad() + " años");
            }
        }else {
            JOptionPane.showMessageDialog(null, "No hay estudiante mayores");
        }
        return listaEstudiantes;
    }
}