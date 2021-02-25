/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.MyPanel;
import Vista.Ventana;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Model {
    ArrayList<Punto>lp=new ArrayList<>();
    Ventana v;
    public Model(Ventana v) {
        this.v = v;
    }
    
    public void getPuntos(ArrayList<Punto> l){
        lp=l;
    }
    
     public void getPuntos(int x, int y){
        lp.add(new Punto(x, y));
        updateUI();
    }
     
    public void updateUI(){
        v.panelsito.setLista(lp);
    }
    
    public void borrarTablero(){
        v.getContentPane().removeAll();
        v.panelsito.borrarPuntos();
        v.getContentPane().add(v.panelsito);
        v.getContentPane().add(v.borrar);
        v.getContentPane().revalidate();
        v.getContentPane().repaint();
    }
}
