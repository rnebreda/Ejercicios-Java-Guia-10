/*Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Integer> Productos = new HashMap();

    public void crearProducto() {

        Boolean resp = true;

        do {
            System.out.println("Ingrese el nombre del Producto.");
            String nombre = leer.next();

            System.out.println("Ingrese el precio del Producto");
            Integer precio = leer.nextInt();
            Productos.put(nombre, precio);//INGRESAMOS LA LLAVE Y EL VALOR

            System.out.println("Desea agregar otro Producto?. S/N");
            String agregar = leer.next();

            if (agregar.equalsIgnoreCase("N")) {
                resp = false;
            }

        } while (resp);

    }

    public void modificarPrecio() {
        System.out.println("A que producto desea cambiarle el precio?.");
        String cambiar = leer.next();

        for (Map.Entry<String, Integer> entry : Productos.entrySet()) {
            if (Productos.containsKey(cambiar)) {
                System.out.println("Cual es el nuevo precio?");
                
                Productos.put(cambiar, leer.nextInt());
                break;
            }
        }
        System.out.println("El precio fue modificado.-------------");
        System.out.println("");
    }
//    public void editarPrecio(){
//        System.out.println("Cual es el nombre del producto a editar: ");
//        String nombre = leer.next();
//        if (productos.containsKey(nombre)){
//            System.out.println("Ingrese el nuevo precio: ");
//            double precioNew = leer.nextDouble();
//            productos.put(nombre, precioNew);
//            System.out.println("Precio modificado correctamente");
//        }else{
//            System.out.println("El producto no se encuentra registrado");
//        }
//    }
    
    

    public void eliminarProducto() {
        System.out.println("Que producto desea eliminar?.");
        String eliminar = leer.next();

       // for (Map.Entry<String, Integer> entry : Productos.entrySet()) {
            if (Productos.containsKey(eliminar)) {

                Productos.remove(eliminar);
              System.out.println("Se borro el producto seleccionado. --------------");
        System.out.println("");
            }else{
                System.out.println("No se encuentra el producto, " + eliminar);
            }
        //}
       
    }

    public void mostrar() {
        for (Map.Entry<String, Integer> entry : Productos.entrySet()) {
            System.out.println("Producto: " + entry.getKey()
                    + " / Precio $ " + entry.getValue());
        }
    }
}
