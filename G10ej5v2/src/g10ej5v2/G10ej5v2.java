/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g10ej5v2;

import servicios.PaisServicio;

/**
 *
 * @author Usuario
 */
public class G10ej5v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PaisServicio ps = new PaisServicio();
        ps.cargarPaises();
        ps.mostrarPaises();
        ps.eliminarPais();
        System.out.println("");
        ps.mostrarPaises();
    }
    
}
