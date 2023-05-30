/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos 
productos que venderemos y el precio que tendrán. Además, se necesita que la 
aplicación cuente con las funciones básicas. 

Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio, 
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar 
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio. 
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package servicios;

import entidades.Producto;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ProductoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Map<Integer, Producto> catalogo = new HashMap<>();
    private Integer nroProducto = 0;

    public void crearProducto() {

        do {
            Producto p = new Producto();
            nroProducto++;
            System.out.println("Ingrese un producto");
            p.setNombre(leer.next());
            System.out.println("Ingrese el precio");
            p.setPrecio(leer.nextDouble());
            catalogo.put(nroProducto, p);
            System.out.println("Desea Continuar? (S=si)");

        } while (leer.next().equalsIgnoreCase("S"));
    }

    public void modificarPrecio() {
        boolean encontrado = false;
        System.out.println("Ingrese un Producto a modificar");
        String buscado = leer.next();
        Producto aux;
        for (Map.Entry<Integer, Producto> pr : catalogo.entrySet()) {
            aux = pr.getValue();
            if (pr.getValue().getNombre().equalsIgnoreCase(buscado)) {
                System.out.println("Ingrese el nuevo precio");
                aux.setPrecio(leer.nextDouble());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("El producto buscado no está en la lista");
        }

    }

    public void mostrarProductos() {
        catalogo.entrySet().forEach((pr) -> {
            System.out.println(pr.getKey() + " " + pr.getValue().toString());
        }); //funtional
    }

    public void borrarProducto() {
        boolean encontrado = false;
        System.out.println("Ingrese un Producto a borrar");
        String buscado = leer.next();
        Integer aux = 0;
        for (Map.Entry<Integer, Producto> pr : catalogo.entrySet()) {
            aux = pr.getKey();
            if (pr.getValue().getNombre().equalsIgnoreCase(buscado)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            catalogo.remove(aux);
        } else {
            System.out.println("El producto buscado no está en la lista");
        }

    }
    
    public void ordenarProductos(Comparator c){
        ArrayList<Producto> prod =new ArrayList(catalogo.values());
        prod.sort(c);
        for (Producto p : prod) {
            System.out.println(p.toString());
        }
    }
}
