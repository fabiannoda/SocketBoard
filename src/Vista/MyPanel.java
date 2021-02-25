/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Punto;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author USER
 */
public class MyPanel extends JPanel{
    
    ArrayList<Punto> listaPuntos=new ArrayList<>();
    
    public void setLista(ArrayList<Punto>lp){
        this.listaPuntos=lp;
        repaint();
    }
    public void setLista(Punto p){
        this.listaPuntos.add(new Punto(p.getX(),p.getY()));
        repaint();
    }
    
    public void borrarPuntos(){
        listaPuntos.clear();
       // System.out.println("borrroooo");
        System.out.println(listaPuntos.size());
    }
    
    @Override
     public void paint(Graphics g) {
         
         for(int i=0;i<listaPuntos.size();i++){
             g.fillOval(listaPuntos.get(i).getX(), listaPuntos.get(i).getY(), 10, 10);
         }
        
    }

    
}
