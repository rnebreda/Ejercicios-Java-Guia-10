/*
 * Continuando el ejercicio anterior, después de mostrar los perros, al
 * usuario se le pedirá un perro y se recorrerá la lista con un
 * Iterator, se buscará el perro en la lista. Si el perro está en la
 * lista, se eliminará el perro que ingresó el usuario y se mostrará la
 * lista ordenada. Si el perro no se encuentra en la lista, se le
 * informará al usuario y se mostrará la lista ordenada.
 */
package Main;

import Servicio.PerroServicio;
import java.util.Scanner;

/**
 *
 * @author LogiC
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**

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
        
        System.out.println("Elimine una raza");
        ps.eliminarRaza(leer.next());
        
        System.out.println("");
        ps.mostrarListaOrdenada();
    }

}
