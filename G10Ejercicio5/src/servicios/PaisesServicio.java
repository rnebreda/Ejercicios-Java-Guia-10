/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos 
usaremos un conjunto.

El programa pedirá un país en un bucle, se guardará el país en el 
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir, 
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer 
los servicios en la clase correspondiente)

Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar 
cómo se ordena un conjunto.

Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se 
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el 
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará 
al usuario
 */
package servicios;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Usuario
 */
public class PaisesServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Set<String> conjuntoPaises = new TreeSet();
    
    public void cargarPaises (){
        
        do {
            System.out.println("Ingrese un país");
            conjuntoPaises.add(leer.next());
            System.out.println("Desea cargar otro país (S=Si)");
            
        } while (leer.next().equalsIgnoreCase("S"));  
    }
    
    public void mostrarPaises(){
        conjuntoPaises.forEach((cp) -> {
            System.out.println(cp);
        });
    }
    
    public void eliminarPais(){
        Iterator it = conjuntoPaises.iterator();
        boolean encontrado=false;
        System.out.println("Ingrese el pais que desea eliminar de la lista");
        String paisBuscado= leer.next();
        while(it.hasNext()){
            if (it.next().equals(paisBuscado)) {
                it.remove();
                encontrado=true;
            }
        }
        if (!encontrado) {
            System.out.println("El pais buscado no se encuentra en la lista");
        }
    }
}
