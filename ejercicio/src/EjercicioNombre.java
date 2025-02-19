import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioNombre {
    public static void main(String[] args) {

        //Crear la lista de nombre

        ArrayList<String> listado = new ArrayList<>();

        // Ingresar los nombres
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa 5 nombres");

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre: " + (i + 1));
            String nombre = scanner.nextLine();
            listado.add(nombre);
        }
        for (String nombre : listado) {
            System.out.println(nombre);
        }
    }
}