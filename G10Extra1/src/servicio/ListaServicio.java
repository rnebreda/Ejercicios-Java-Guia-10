/*
1. Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
 */
package servicio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ListaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList <Integer> numeros = new ArrayList();
    
    public void cargarNumeros(){
        Integer aux, suma=0;
        
        do {
            System.out.println("Ingrese un entero");
            aux=leer.nextInt();
            if (aux != -99) {
                numeros.add(aux);
                suma+= aux;
                
            }
        } while (aux != -99);
        
        System.out.println("Cantidad de valores ingresados= "+numeros.size());
        System.out.println("La suma de los elementos es= "+suma);
        System.out.println("El promedio es= "+((double)suma/numeros.size()));  
    }
    
  
}
