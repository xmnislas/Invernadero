/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Equipo 3
 */
public class ConexionBD implements IConexionBD{
    final String CADENA_CONEXION = "jdbc:mysql://localhost/invernadero";
    final String USUARIO = "root";
    final String CONTRASENIA = "1234";
    
    @Override
    public Connection crearConexion() throws SQLException {
        Connection conexion = DriverManager.getConnection(CADENA_CONEXION,USUARIO, CONTRASENIA);
        return conexion;
    }
}
