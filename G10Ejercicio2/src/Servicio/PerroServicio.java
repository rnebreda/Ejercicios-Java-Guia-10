/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Perro;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LogiC
 */
public class PerroServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public List<Perro> raza = new ArrayList();
    
    public void crearPerros() {
        System.out.println("Ingrese la raza de perro: ");
        String ingreso = leer.next();
        Perro aux = new Perro(ingreso);
        raza.add(aux);
    }
    
    public void mostrarLista() {
        System.out.println("Las razas de perros ingresadas son: ");
        for (Perro perro : raza) {
            System.out.println(perro.getRaza());
        }
    }
    
    public void eliminarRaza(String nombre) {
        boolean encontrado=false;
        Iterator<Perro> it = raza.iterator();
        while (it.hasNext()) {
            if (it.next().getRaza().equals(nombre)) {
                it.remove();
                encontrado=true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encuentra en la lista. No se elimina");
        }
    }
    
    public void mostrarListaOrdenada () {
        Collections.sort(raza, Comparadores.ordenarRaza);
        mostrarLista();
    }
}
