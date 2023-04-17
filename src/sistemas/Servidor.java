/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemas;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/**
 *
 * @author Equipo 3
 */
public class Servidor extends Thread{
    private final JTextArea areatexto;
    public final static int PUERTO_SERVIDOR = 1234;
    
    public Servidor(JTextArea areatexto){
        this.areatexto = areatexto;
    }
    
    @Override
    public void run(){
        try {
            ServerSocket serverSocket = new ServerSocket(PUERTO_SERVIDOR);
            areatexto.append("Esperando conexión con el gateway... \n");
            while(true) {
                try (Socket socket = serverSocket.accept()) {
                    DataInputStream flujoEntrada = new DataInputStream(socket.getInputStream());
                    String mensaje = flujoEntrada.readUTF();
                    areatexto.append("Mensaje recibido: " + mensaje);
                }
            }            
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
}
