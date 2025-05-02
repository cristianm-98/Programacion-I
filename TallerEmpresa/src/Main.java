import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Solicitud de dato de la empresa
        String nit = JOptionPane.showInputDialog("Ingrese Nit de la empresa");
        String nombre=JOptionPane.showInputDialog("Ingrese nombre de la empresa");

        //Solicitud de los datos de la empresa
        String identificacion = JOptionPane.showInputDialog("Ingrese la identificacion:");
        String nombreCompleto = JOptionPane.showInputDialog("Ingrese el nombre:");
        String puesto = JOptionPane.showInputDialog("Ingrese el puesto");
        String correo = JOptionPane.showInputDialog("Ingrese el correo");
        String telefono = JOptionPane.showInputDialog("Ingrese el telefono");
        String fechaContratacion = JOptionPane.showInputDialog("Ingrese fecha de contracion");

        //Creacion de la empresa
        Empresa empresa = new Empresa(nit,nombre);
        //Creacion del empleado
        Empleado empleado = new Empleado(identificacion, nombreCompleto, puesto, correo, telefono, fechaContratacion);

        //Creacion del mensaje
        String mensaje="INFORMACION DE LA EMPRESA Y EMPLEADO \n"
                +"--------------------------------------------- \n\n"
                +empresa.toString() +"\n"
                +"-------------------------"+'\n'
                +empleado.toString();

        //Mostrar el mensaje
        JOptionPane.showMessageDialog(null,mensaje,"Datos Completos",JOptionPane.INFORMATION_MESSAGE);


    }
}