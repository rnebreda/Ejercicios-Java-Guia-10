/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

/**
 *
 * @author Usuario
 */
import entidades.Libro3;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Libro3Servicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashSet<Libro3> libreria = new HashSet<>();

    public void crearLibro3() {

        do {
            Libro3 l3 = new Libro3();
            System.out.println("Ingrese titulo, autor y cantidad ejemplares");
            l3.setTitulo(leer.next());
            l3.setAutor(leer.next());
            l3.setEjemplares(leer.nextInt());
            l3.setPrestados(0);
            libreria.add(l3);
            System.out.println("¿Deséa seguir cargando? Responder s/n");
        } while (leer.next().equalsIgnoreCase("s"));
    }

    public boolean prestamo() {
        boolean encontrado = false;
        boolean exito = false;
        Libro3 aux;
        System.out.println("Ingrese título a buscar");
        String buscado = leer.next();
        Iterator<Libro3> it = libreria.iterator();
        while (it.hasNext()) {
            aux = it.next();
            if (aux.getTitulo().equalsIgnoreCase(buscado)) {
                encontrado = true;
                if (aux.getPrestados() < aux.getEjemplares()) {
                    aux.setPrestados(aux.getPrestados() + 1);
                    exito = true;
                } else {
                    exito = false;
                }
            }
        }
        if (!encontrado) {
            System.out.println("El libro no se encuentra en la lista");
        }
        return exito;
    }

    public boolean devolucion() {
        boolean encontrado = false;
        boolean exito = false;
        Libro3 aux;
        System.out.println("Ingrese título a buscar");
        String buscado = leer.next();
        Iterator<Libro3> it = libreria.iterator();
        while (it.hasNext()) {
            aux = it.next();
            if (aux.getTitulo().equalsIgnoreCase(buscado)) {
                encontrado = true;
                if (aux.getPrestados() != 0) {
                    aux.setPrestados(aux.getPrestados() - 1);
                    exito = true;
                } else {
                    exito = false;
                }
            }
        }
        if (!encontrado) {
            System.out.println("El libro no se encuentra en la lista");
        }
        return exito;
    }

    public void mostrarLibros() {
        for (Libro3 l3 : libreria) {
            System.out.println(l3.toString());
        }
    }

    public void menu() {
        int opcion;
        do {
            System.out.println("Ingrese número de opción");
            System.out.println("1- Agregar libro");
            System.out.println("2- Mostrar libros");
            System.out.println("3- Prestar libro");
            System.out.println("4- Devolver libro");
            System.out.println("9- Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    crearLibro3();
                    break;
                case 2:
                    mostrarLibros();
                    break;
                case 3:
                    if (prestamo()) {
                        System.out.println("El prestamo se realizo con exito");
                    } else {
                        System.out.println("No se puede realizar el prestamo");
                    }

                    break;
                case 4:
                    if (devolucion()) {
                        System.out.println("Devolución exitosa");
                    } else {
                        System.out.println("te equivocaste de libreria");
                    }

                    break;
                case 9:
                    System.out.println("Muchas gracias");
                    break;
            }

        } while (opcion != 9);

    }

}//end service
