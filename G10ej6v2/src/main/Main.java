/*Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package main;

import java.util.Scanner;
import servicio.ProductoServicio;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductoServicio miProducto = new ProductoServicio();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Boolean salir = false;
        int opc;

        while (!salir) {
            System.out.println("1 - Ingresar Producto.");
            System.out.println("2 - Modificar precio de Producto.");
            System.out.println("3 - Eliminar un Producto.");
            System.out.println("4 - Mostrar los Producto.");
            System.out.println("5 - Salir.");
            
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    miProducto.crearProducto();
                    break;
                case 2:
                    miProducto.modificarPrecio();
                    break;
                case 3:
                    miProducto.eliminarProducto();
                    break;
                case 4:
                    miProducto.mostrar();
                    break;
                case 5:
                    salir = true;
            }

        }

        
        
        
        

    }

}
