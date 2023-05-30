/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto, 
tendremos una clase Pelicula con el título, director y duración de la película (en horas). 
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo 
que se pide a continuación:

En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario 
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere 
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones: 
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en 
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en 
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla
 */
package servicios;

import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PeliculaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private List<Pelicula> videos = new ArrayList();

    public void crearPeliculas() {

        String nombre, director;
        Double duracion;
        do {
            System.out.println("Ingrese el nombre de la película");
            nombre = leer.next();
            System.out.println("Ingrese el director");
            director = leer.next();
            System.out.println("Ingrese la duración de la película");
            duracion = leer.nextDouble();
            Pelicula a = new Pelicula(nombre, director, duracion);
            videos.add(a);

            System.out.println("Desea continuar (S=Si)");
        } while (leer.next().equalsIgnoreCase("S"));
    }

    public void mostrarLista() {
        System.out.println("Las Peliculas en lista son: ");
        for (Pelicula a : videos) {
            System.out.println(a.toString());
            //System.out.println("");
        }
    }

    public void mostrarDuracion() {
        System.out.println("Las Peliculas que duran más de una hora son: ");
        for (Pelicula a : videos) {
            if (a.getDuracion() > 1) {
                System.out.println(a.toString());
                //System.out.println("");
            }

        }
    }   

    public void ordenarLista(Comparator c) {
        
        Collections.sort(videos, c);
        videos.forEach((p) -> {
            System.out.println(p);
        });
    }
}

