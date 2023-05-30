/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g10ejercicio5;

import servicios.PaisesServicio;

/**
 *
 * @author Usuario
 */
public class G10Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PaisesServicio ps = new PaisesServicio();
        ps.cargarPaises();
        ps.mostrarPaises();
        ps.eliminarPais();
        System.out.println("");
        ps.mostrarPaises();
    }
    
}
