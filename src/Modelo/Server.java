/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class Server {
    
    ServerSocket listener;
    
    public Server() {
        try {
            this.listener = new ServerSocket(9090);
            
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void send(String a) throws IOException {
        Socket socket = listener.accept();
        
        PrintWriter out
                = new PrintWriter(socket.getOutputStream(), true);
        
        out.println(a);
        
    }

    public static void main(String[] args) throws IOException {
        Server s = new Server();
        s.send("aaaa");
        s.send("asdasdasdads");
    }
}
