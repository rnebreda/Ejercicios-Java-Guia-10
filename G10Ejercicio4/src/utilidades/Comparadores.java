/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import entidades.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Usuario
 */
public class Comparadores {
    public static Comparator<Pelicula> duracionMayorAMenor= (Pelicula p1, Pelicula p2) -> p2.getDuracion().compareTo(p1.getDuracion());

    public static Comparator<Pelicula> duracionMenorAMayor= (Pelicula p1, Pelicula p2) -> p1.getDuracion().compareTo(p2.getDuracion());

    public static Comparator<Pelicula> directorMayorAMenor= (Pelicula p1, Pelicula p2) -> p2.getDirector().compareTo(p1.getDirector());

    public static Comparator<Pelicula> directorMenorAMayor= (Pelicula p1, Pelicula p2) -> p1.getDirector().compareTo(p2.getDirector());

    public static Comparator<Pelicula> tituloMayorAMenor= (Pelicula p1, Pelicula p2) -> p2.getTitulo().compareTo(p1.getTitulo());

    public static Comparator<Pelicula> tituloMenorAMayor= (Pelicula p1, Pelicula p2) -> p1.getTitulo().compareTo(p2.getTitulo());


}