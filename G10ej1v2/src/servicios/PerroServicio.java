/*
1 Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El 
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y 
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide 
salir, se mostrará todos los perros guardados en el ArrayList.

2 Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá 
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro 
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista 
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará 
la lista ordenada
 */
package servicios;

import entidades.Perro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PerroServicio {

    ArrayList<Perro> raza = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearPerro() {
        Perro can = new Perro();
        System.out.println("Ingrese la raza del perro");
        String razaPerro = leer.next();
        can.setRaza(razaPerro);
        raza.add(can);

        //raza.add(new Perr(leer.next()));
    }

    public void cargarPerros() {
        do {
            crearPerro();
            System.out.println("Desea continuar? (S=Si)");

        } while (leer.next().equalsIgnoreCase("S"));
    }

    public void mostrarLista() {
        System.out.println("La lista de razas es: ");
        raza.forEach((perro) -> {
            System.out.println(perro.getRaza());
        });
    }

    public void mostrarFor() {
        for (Perro aux : raza) {
            System.out.println(aux.getRaza());
        }
    }

    public void buscarPerro() {
        boolean encontrada = false;

        System.out.println("Ingrese una raza de perro para buscar");
        String razaBuscada = leer.next();
        Iterator<Perro> it = raza.iterator();

        while (it.hasNext()) {
            if (it.next().getRaza().equalsIgnoreCase(razaBuscada)) {
                it.remove();
                System.out.println("raza eliminada!!!");
                encontrada = true;
            }
        }
        if (!encontrada) {
            System.out.println("no se encontro la raza");
        }
    }

    public void ordenarLista() {
        Comparator<Perro> comparatorByNameRaza;
        comparatorByNameRaza = (Perro raza1, Perro raza2) -> raza1.getRaza().compareTo(raza2.getRaza());
        Collections.sort(raza, comparatorByNameRaza);
        for (Perro listaRaza : raza) {
            System.out.println(listaRaza.getRaza());
        }
    }
    
}
