/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Entidades.Perro;
import java.util.Comparator;

/**
 *
 * @author Usuario
 */
public class Comparadores {

    public static Comparator<Perro> ordenarRaza = new Comparator<Perro>() {
        @Override
        public int compare(Perro p1, Perro p2) {
            return (p1.getRaza().compareTo(p2.getRaza()));
        }
    };
    
    public static Comparator<Perro> ordenarRazaInv = new Comparator<Perro>() {
        @Override
        public int compare(Perro p1, Perro p2) {
            return (p2.getRaza().compareTo(p1.getRaza()));
        }
    };
    
    
}
