/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author USER
 */
public class Ventana extends JFrame{
    public MyPanel panelsito=new MyPanel();
    public JButton borrar;
    public Ventana() {
        borrar=new JButton("borrar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Quiero mi 50");
        this.setLayout(null);
        this.setSize(700, 600);
        panelsito.setBorder(new EmptyBorder(5, 5, 5, 5));
        panelsito.setBounds(0,0,700,500);
        panelsito.setLayout(null);  
        borrar.setBounds(340, 510, 90, 30);
        this.add(borrar);
        this.add(panelsito);
        this.setVisible(true);
    }
    
    
    
   
    
    
    
    
}
