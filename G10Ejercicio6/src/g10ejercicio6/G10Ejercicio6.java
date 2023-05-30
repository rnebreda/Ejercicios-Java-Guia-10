/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g10ejercicio6;

import java.util.Scanner;
import servicios.ProductoServicio;
import utilidades.ComparaProductos;

/**
 *
 * @author Usuario
 */
public class G10Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ProductoServicio ps = new ProductoServicio();
        boolean salir = false;
        int opcion;

        do {System.out.println("-----------------------------------------");
            System.out.println("1 - Ingresar Producto");
            System.out.println("2 - Mostrar lista de Productos por código");
            System.out.println("3 - Modificar Precio");
            System.out.println("4 - Borrar Producto");
            System.out.println("5 - Ordenar Lista por Producto A-Z");
            System.out.println("6 - Ordenar Lista por Producto Z-A");
            System.out.println("7 - Ordenar Lista por Precio menor");
            System.out.println("8 - Ordenar Lista por Precio mayor");
            System.out.println("99 - Salir");
            System.out.println("Ingrese una opción");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    ps.crearProducto();
                    break;
                case 2:
                    ps.mostrarProductos();
                    break;
                case 3:
                    ps.modificarPrecio();
                    break;
                case 4:
                    ps.borrarProducto();
                    break;
                case 5:
                    ps.ordenarProductos(ComparaProductos.nombreMenorAMayor);
                    break;
                case 6:
                    ps.ordenarProductos(ComparaProductos.nombreMayorAMenor);
                    break;
                case 7:
                    ps.ordenarProductos(ComparaProductos.precioMenorAMayor);
                    break;
                case 8:
                    ps.ordenarProductos(ComparaProductos.precioMayorAMenor);
                    break;
                case 99:
                    salir= true;
                    break;
            }

        } while (!salir);

    }

}
