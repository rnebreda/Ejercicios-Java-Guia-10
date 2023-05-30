/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Perro;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LogiC
 */
public class PerroServicio {
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    List<Perro> raza = new ArrayList();
    
    public void crearPerros() {
        System.out.println("Ingrese la raza de perro: ");
        String ingreso = leer.next();
        Perro aux = new Perro(ingreso);
        raza.add(aux);
    }
    
    public void mostrarLista() {
        System.out.println("Las razas de perros ingresadas son: ");
        raza.forEach((perro) -> {
            System.out.println(perro.getRaza());
        });
    }
}
