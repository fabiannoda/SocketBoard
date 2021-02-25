/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Model;
import Modelo.Server;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author USER
 */
public class ControllerServer extends MouseAdapter implements ActionListener{


    private Model m;
    private Server server;
    

    public ControllerServer(Model m){
       this.m=m;
       this.server=new Server(); 
       
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        
        m.getPuntos(e.getX(),e.getY());
        
        try {
            this.server.send(""+e.getX());
            this.server.send(""+e.getY());
        } catch (IOException ex) {
            Logger.getLogger(ControllerServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        if(e.getActionCommand().equals("borrar")){
            this.m.borrarTablero();
        }

    }
}
