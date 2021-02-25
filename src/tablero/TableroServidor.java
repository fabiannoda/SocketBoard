/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablero;

import Controlador.Controller;
import Controlador.ControllerServer;
import Modelo.Cliente;
import Modelo.Model;
import Modelo.Server;
import Vista.Ventana;
import java.io.IOException;

/**
 *
 * @author Angel Nodarse
 * @serial 1032507704
 * @author Mateo Hoya 
 * @serial 1001326526
 * @author Juan Camilo Díaz
 * @serial 1023028211
 */
public class TableroServidor {
   
    Ventana v;
    Model m;
    ControllerServer c;
    
    
    public TableroServidor() throws IOException {
        System.out.println("servidor");
        v = new Ventana();
        m = new Model(v);
        c = new ControllerServer(m);
        v.borrar.addActionListener(c);
        v.panelsito.addMouseMotionListener(c);
        
    }
    
    public static void main(String[] args) throws IOException {
        TableroServidor ts=new TableroServidor();
    }
    
}
