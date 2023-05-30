/*
Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el
numero.
• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al
usuario.
• Muestra por pantalla los datos
• Agregar una ciudad con su código postal correspondiente más al HashMap.
• Elimina 3 ciudades existentes dentro del HashMap
 */
package servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Usuario
 */
public class PostalesServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Map<Integer, String> PostCode = new HashMap<>();

    public void ingresoPostCode() {
        Integer cp;
        String ciudad;
        System.out.println("Ingrese el Código Postal");
        cp = leer.nextInt();
        System.out.println("Ingrese el nombre de la Ciudad");
        ciudad = leer.next();
        PostCode.put(cp, ciudad);
    }

    public void cargarDiez() {
        for (int i = 0; i < 10; i++) {
            ingresoPostCode();
        }
    }

    public void mostrarMapa() {
        for (Map.Entry<Integer, String> pc : PostCode.entrySet()) {
            System.out.println(pc.getKey()
                    + " - " + pc.getValue());
        }
    }

    public void buscarPostCode() {
        boolean encontrado = false;
        System.out.println("Ingrese el Código Postal a buscar");
        Integer buscado = leer.nextInt();

        for (Map.Entry<Integer, String> pc : PostCode.entrySet()) {
            if (Objects.equals(pc.getKey(), buscado)) {
                System.out.println(pc.getKey() + ", " + pc.getValue());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("El Código Postal no se encuentra en la lista");
        }
        System.out.println("");
    }

    public void eliminarCiudad() {
        boolean encontrado = false;
        System.out.println("Ingrese la Ciudad a borrar");
        String ciudad = leer.next();
        Integer aux=0;

        for (Map.Entry<Integer, String> pc : PostCode.entrySet()) {
            if (Objects.equals(pc.getValue(), ciudad)) {
                aux= pc.getKey();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("La ciudad no se encuentra en la lista");
        } else {
            PostCode.remove(aux);
            System.out.println("Se borró con éxito");
        }
        System.out.println("");
    }

    public void eliminarTres() {
        for (int i = 0; i < 3; i++) {
            eliminarCiudad();
        }
    }

    public void mostrarOrdenado() {
        TreeMap<Integer, String> tree = new TreeMap(PostCode);
        for (Map.Entry<Integer, String> pc : tree.entrySet()) {
            System.out.println(pc.getKey()
                    + " - " + pc.getValue());
        }
    }

}
