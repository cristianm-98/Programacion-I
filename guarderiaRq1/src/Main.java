import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Solicitud de ingreso de estudiante

        String nombre= JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
        int edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
        String generoMensaje=JOptionPane.showInputDialog("Ingrese el genero (M o F)");
        String identificacion=JOptionPane.showInputDialog("Ingrese el numero de identidad");
        String alergia=JOptionPane.showInputDialog("Ingrese la alergia");
        String nombreAcudiente=JOptionPane.showInputDialog("Ingrese el nombre del acudiente");
        String numeroContacto=JOptionPane.showInputDialog("Ingrese el numero de contacto");

        //Verificar que el usuario ingreso el caracter correcto
        char genero=' ';
        if(generoMensaje !=null && generoMensaje.length()==1){
            genero=generoMensaje.charAt(0);
        }else{
            JOptionPane.showMessageDialog(null,"Por favor, ingrese un solo caracter (M o F)");
            return;
        }

        //Guardando la informacion ingresada a la variable estudiante
        Estudiante newEstudiante=new Estudiante(nombre,edad,genero,identificacion,alergia,nombreAcudiente,numeroContacto);

        //Mostrar la informacion
        JOptionPane.showMessageDialog(null,newEstudiante);

        }
}
