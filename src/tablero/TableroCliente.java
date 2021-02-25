/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablero;

import Controlador.Controller;
import Controlador.ControllerCliente;
import Modelo.Cliente;
import Modelo.Model;
import Modelo.Server;
import Vista.Ventana;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Angel Nodarse
 * @serial 1032507704
 * @author Mateo Hoya 
 * @serial 1001326526
 * @author Juan Camilo Díaz
 * @serial 1023028211
 */
public class TableroCliente {

    Ventana v;
    Model m;
    ControllerCliente c;
    

    public TableroCliente() throws IOException {
        System.out.println("cliente");
        v = new Ventana();
        m = new Model(v);
        c = new ControllerCliente(m);
        v.borrar.addActionListener(c);
        v.panelsito.addMouseMotionListener(c);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        TableroCliente tc= new TableroCliente();
        
    }
}
