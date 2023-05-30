/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import entidades.Producto;
import java.util.Comparator;

/**
 *
 * @author Usuario
 */
public class ComparaProductos {

    public static Comparator<Producto> nombreMayorAMenor = (Producto p1, Producto p2) -> p2.getNombre().compareTo(p1.getNombre());

    public static Comparator<Producto> nombreMenorAMayor = (Producto p1, Producto p2) -> p1.getNombre().compareTo(p2.getNombre());

    public static Comparator<Producto> precioMayorAMenor = (Producto p1, Producto p2) -> p2.getPrecio().compareTo(p1.getPrecio());

    public static Comparator<Producto> precioMenorAMayor = (Producto p1, Producto p2) -> p1.getPrecio().compareTo(p2.getPrecio());
}
