/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author USER
 */
public class Cliente {

    public String conectar() throws IOException {
        String serverAddress = "localhost";
        Socket s = new Socket(serverAddress, 9090);
        BufferedReader input
                = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String answer = input.readLine();
        return answer;
    }

    public static void main(String args[]) throws IOException {
        Cliente cl = new Cliente();
        cl.conectar();
        cl.conectar();
    }
}
