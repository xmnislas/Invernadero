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
public class Servidor extends Thread {

    private final JTextArea areatexto;
    public final static int PUERTO_SERVIDOR = 1234;

    public Servidor(JTextArea areatexto) {
        this.areatexto = areatexto;
    }

    @Override
    public void run() {
        try {
            ServerSocket serverSocket = new ServerSocket(PUERTO_SERVIDOR);
            areatexto.append("Esperando conexión con el gateway... \n");
            while (true) {
                try ( Socket socket = serverSocket.accept()) {
                    DataInputStream flujoEntrada = new DataInputStream(socket.getInputStream());
                    String mensaje = flujoEntrada.readUTF();
                    areatexto.append("Mensaje recibido: " + textoPlano(mensaje));
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static String textoPlano(String binario) {
        String[] numerosBinarios = binario.split(" ");
        String texto = "";

        for (String currentBinary : numerosBinarios) {
            int decimal = binarioDecimal(currentBinary);
            char letra = (char) decimal;
            texto += letra;
        }
        return texto;
    }

    public static int binarioDecimal(String binario) {
        int decimal = 0;
        int posicion = 0;
        for (int x = binario.length() - 1; x >= 0; x--) {
            short digit = 1;
            if (binario.charAt(x) == '0') {
                digit = 0;
            }
            double multiplier = Math.pow(2, posicion);
            decimal += digit * multiplier;
            posicion++;
        }
        return decimal;
    }
}
