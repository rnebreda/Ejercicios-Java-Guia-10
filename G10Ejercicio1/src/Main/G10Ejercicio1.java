/*
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList
 * de tipo String. El programa pedirá una raza de perro en un bucle, el
 * mismo se guardará en la lista y después se le preguntará al usuario
 * si quiere guardar otro perro o si quiere salir. Si decide salir, se
 * mostrará todos los perros guardados en el ArrayList.
 */
package Main;

import Servicio.PerroServicio;
import java.util.Scanner;

/**
 *
 * @author LogiC
 */
public class G10Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         *
         */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PerroServicio ps = new PerroServicio();
        String otroPerro;
        do {
            ps.crearPerros();
            System.out.println("Desea ingresar otra raza de perro? (S=Si)");
            otroPerro = leer.next();
        } while (otroPerro.equalsIgnoreCase("S"));

        ps.mostrarLista();
    }

}
