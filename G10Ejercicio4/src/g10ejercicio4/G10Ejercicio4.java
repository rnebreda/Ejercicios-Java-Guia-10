/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g10ejercicio4;

import servicios.PeliculaServicio;
import utilidades.Comparadores;

/**
 *
 * @author Usuario
 */
public class G10Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeliculaServicio ps = new PeliculaServicio();
        ps.crearPeliculas();
        ps.mostrarLista();
        System.out.println("");
        ps.mostrarDuracion();
        System.out.println("Ordenadas por duración de Mayor a Menor");
        ps.ordenarLista(Comparadores.duracionMayorAMenor);
        System.out.println("Ordenadas por duración de Menor a Mayor");
        ps.ordenarLista(Comparadores.duracionMenorAMayor);
        System.out.println("Ordenadas por Título de Menor a Mayor");
        ps.ordenarLista(Comparadores.tituloMenorAMayor);
        System.out.println("Ordenadas por Director de Menor a Mayor");
        ps.ordenarLista(Comparadores.directorMenorAMayor);
    }

}
