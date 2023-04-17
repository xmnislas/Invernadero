/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemas;

import guis.GatewayForm;
import guis.MenuForm;
import guis.ServidorForm;
import java.io.IOException;

/**
 *
 * @author Equipo 3
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        new ServidorForm().setVisible(true);
        new GatewayForm().setVisible(true);
        new MenuForm().setVisible(true);
    }
}
