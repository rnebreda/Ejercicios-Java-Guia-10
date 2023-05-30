/*
2. Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
cada cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios.
 */
package servicios;

import entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CantanteServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<CantanteFamoso> Famosos = new ArrayList();

    public void agregarCantante() {
        CantanteFamoso cf = new CantanteFamoso();
        System.out.println("Ingrese el nombre del Cantante");
        cf.setNombre(leer.next());
        System.out.println("Ingrese el album más vendido");
        cf.setMasVendido(leer.next());
        Famosos.add(cf);
    }

    public void crearCincoCantantes() {
        for (int i = 0; i < 5; i++) {
            agregarCantante();
        }
    }

    public void mostrarCantantes() {
        for (CantanteFamoso cf : Famosos) {
            System.out.println(cf.toString());
        }
    }

    public void borrarCantante() {
        Iterator<CantanteFamoso> it = Famosos.iterator();
        boolean encontrado = false;
        System.out.println("Ingrese el Cantante a borrar");
        String buscado = leer.next();
        CantanteFamoso aux;
        while (it.hasNext()) {
            aux = it.next();
            if (aux.getNombre().equalsIgnoreCase(buscado)) {
                it.remove();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("El Cantante buscado no se encuentra en la lista");
        }
    }
    
    public void menu(){
        int opcion;
        do{
            System.out.println("1 - Agregar Cantante");
            System.out.println("2 - Mostrar Lista");
            System.out.println("3 - Borrar Cantante");
            System.out.println("9 - Salir");
            System.out.println("Ingrese una opción");
            opcion=leer.nextInt();
            switch(opcion){
                case 1: agregarCantante(); break;
                case 2: mostrarCantantes(); break;
                case 3: borrarCantante(); break;
                case 9: break;
            }
        } while (opcion != 9);
        
    }

}
