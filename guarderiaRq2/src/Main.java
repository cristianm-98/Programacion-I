import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Empresa nuevaEmpresa =new Empresa("81000913","Pequeños Gigantes");

        boolean menu = true;
        while (menu) {
            JOptionPane.showMessageDialog(null, "Bienvenido al sistema\n");
            int menuSeleccionado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion: \n 1. Agregar \n 2. Obtener \n 3. Actualizar " +
                    "\n 4. Eliminar \n 5. Lista de mayores \n 6. Salir del Sistema"));

            switch (menuSeleccionado) {
                case 1:
                    int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes"));
                    for (int i = 0; i < cantidad; i++) {
                        String id = JOptionPane.showInputDialog("Ingrese ID unico");
                        String nombreCompleto = JOptionPane.showInputDialog("Ingrese el nombre");
                        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
                        String optionGenero = JOptionPane.showInputDialog("Ingrese genero (F o M)");
                        char genero = ' ';
                        if (optionGenero != null && optionGenero.length() == 1) {
                            genero = optionGenero.charAt(0);
                        } else {
                            JOptionPane.showMessageDialog(null, "Por favor, ingrese la opcion correcta");
                            return;
                        }
                        String identidad = JOptionPane.showInputDialog("Ingrese numero de identificacion");
                        String alergia = JOptionPane.showInputDialog("Ingrese Alergia");
                        String nombreAcudiente = JOptionPane.showInputDialog("Ingrese nombre del acudiente");
                        String numeroAcudiente = JOptionPane.showInputDialog("Ingrese el numero del acudiente");

                        Estudiante nuevoEstudiante = new Estudiante(id, nombreCompleto, edad, genero, identidad, alergia, nombreAcudiente, numeroAcudiente);
                        nuevaEmpresa.agregarEstudiante(nuevoEstudiante);
                    }
                    JOptionPane.showMessageDialog(null, "Los Estudiantes fueron ingresados Correctamente");
                    break;
                case 2:
                    nuevaEmpresa.obtenerEstudiante();
                    break;
                case 3:
                    ArrayList<Estudiante> estudianteEncontrado = new ArrayList<>();
                    int documento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el documento"));

                    for (Estudiante estudiante : nuevaEmpresa.getListaEstudiantes()) {
                        if (estudiante.getIdentidad().equals(String.valueOf(documento))) {
                            estudianteEncontrado.add(estudiante);

                            nuevaEmpresa.actualizarEstudiante(estudiante);
                            JOptionPane.showMessageDialog(null,"Datos Actualizados Correctamente");
                        }
                    }
                    if(estudianteEncontrado.isEmpty()){
                        JOptionPane.showMessageDialog(null,"No se encontro el documento del estudiante ");
                    }
                    break;
                case 4:
                    int encontrar=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el documento"));
                    boolean encontrado=false;
                    for(Estudiante estudiante:nuevaEmpresa.getListaEstudiantes()){
                        if(estudiante.getIdentidad().equals(String.valueOf(encontrar))){
                            nuevaEmpresa.eliminarEstudiante(estudiante);
                            JOptionPane.showMessageDialog(null,"Estudiante Eliminado");
                            encontrado=true;
                            break;
                        }
                    }
                    if(!encontrado){
                        JOptionPane.showMessageDialog(null,"El documento no existe");
                    }
                    break;
                case 5:
                    ArrayList<Estudiante>mayorEdad=new ArrayList<>();
                    nuevaEmpresa.listarEstudiantesMayores(mayorEdad);

                    break;
                case 6:
                    menu=false;
                    JOptionPane.showMessageDialog(null,"Saliendo del sistema");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
                    break;

            }

        }

    }
}
