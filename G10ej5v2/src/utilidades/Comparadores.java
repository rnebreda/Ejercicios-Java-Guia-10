/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import entidades.Pais;
import java.util.Comparator;

/**
 *
 * @author Usuario
 */
public class Comparadores {

    public static Comparator<Pais> nombreMayorAMenor = (Pais p1, Pais p2) -> p2.getNombre().compareTo(p1.getNombre());

    public static Comparator<Pais> nombreMenorAMayor = (Pais p1, Pais p2) -> p1.getNombre().compareTo(p2.getNombre());

    public static Comparator<Pais> idiomaMayorAMenor = (Pais p1, Pais p2) -> p2.getIdioma().compareTo(p1.getIdioma());

    public static Comparator<Pais> idiomaMenorAMayor = (Pais p1, Pais p2) -> p1.getIdioma().compareTo(p2.getIdioma());

    public static Comparator<Pais> superficieMayorAMenor = (Pais p1, Pais p2) -> p2.getSuperficie().compareTo(p1.getSuperficie());

    public static Comparator<Pais> superficieMenorAMayor = (Pais p1, Pais p2) -> p1.getSuperficie().compareTo(p2.getSuperficie());

    public static Comparator<Pais> poblacionMayorAMenor = (Pais p1, Pais p2) -> p2.getPoblacion().compareTo(p1.getPoblacion());

    public static Comparator<Pais> poblacionMenorAMayor = (Pais p1, Pais p2) -> p1.getPoblacion().compareTo(p2.getPoblacion());

}
