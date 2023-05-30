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
package g10extra2;

import servicios.CantanteServicio;

/**
 *
 * @author Usuario
 */
public class G10Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    CantanteServicio cs= new CantanteServicio();
    cs.crearCincoCantantes();
    cs.menu();
    cs.mostrarCantantes();
    }
    
}
