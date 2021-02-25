/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import Modelo.Model;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;

/**
 *
 * @author USER
 */
public class ControllerCliente extends MouseAdapter implements ActionListener {

    private Model m;
    private Cliente cl;
    Timer timer = new Timer(100, this);

    
    public ControllerCliente(Model m) throws IOException {
        this.m = m;
        cl = new Cliente();
        timer.start();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        m.getPuntos(e.getX(), e.getY());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() != null) {
            if (e.getActionCommand().equals("borrar")) {
                this.m.borrarTablero();
            }
        }
        try {
            int x = Integer.parseInt(cl.conectar());
            int y = Integer.parseInt(cl.conectar());
         //   System.out.println("x " + x);
         //   System.out.println("y " + y);
            m.getPuntos(x, y);
        } catch (IOException ex) {
            Logger.getLogger(ControllerCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
