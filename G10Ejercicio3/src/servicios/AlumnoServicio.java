/*
3. Crear una clase llamada Alumno que mantenga información sobre las notas de distintos 
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer 
con sus 3 notas. 

En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide 
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le 
pregunta al usuario si quiere crear otro Alumno o no.

Después de ese bucle tendremos el siguiente método en el servicio de Alumno: 
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota 
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro 
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este 
promedio final, devuelto por el método y mostrado en el main
 */
package servicios;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AlumnoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private List<Alumno> curso = new ArrayList();

    public void crearAlumno() {

        String nombre;
        do {
            List<Integer> aux = new ArrayList();
            System.out.println("Ingrese el nombre del alumno");
            nombre = leer.next();
            System.out.println("Ingrese las 3 notas del alumno");
            for (int i = 0; i < 3; i++) {
                aux.add(leer.nextInt());
            }
            Alumno a = new Alumno(nombre, aux);
            curso.add(a);

            System.out.println("Desea continuar (S=Si)");
        } while (leer.next().equalsIgnoreCase("S"));
    }

    public void mostrarLista() {
        System.out.println("Los alumnos en la lista y sus notas son: ");
        for (Alumno a : curso) {
            System.out.print(a.getNombre()+" "+a.getNotas());
            System.out.println("");
        }
    }

    public void notaFinal() {
        boolean encontrada = false;
        Iterator<Alumno> it = curso.iterator();
        Alumno aux;
        System.out.println("Ingrese un alumno a buscar");
        String nombreBuscado = leer.next();

        while (it.hasNext()) {
            aux = it.next();
            if (aux.getNombre().equals(nombreBuscado)) {
                System.out.println("El promedio del Alumno " + aux.getNombre() + " es " + promedio(aux.getNotas()));
                encontrada = true;
            }
        }
        if (!encontrada) {
            System.out.println("El alumno no se encuentra en la lista");
        }
    }

    private double promedio(List<Integer> a) {
        Integer suma = 0;
        double promedio;
        for (Integer nota : a) {
            suma += nota;
        }
        promedio = suma / a.size();  
        return promedio;
    }
}
