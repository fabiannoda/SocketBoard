/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Model;
import Vista.Ventana;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author USER
 */
public class Controller extends MouseAdapter implements ActionListener{


    private Model m;
    

    public Controller(Model m){

       this.m=m;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        
        m.getPuntos(e.getX(),e.getY());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        if(e.getActionCommand().equals("borrar")){
            this.m.borrarTablero();
        }

    }

    
    
}
