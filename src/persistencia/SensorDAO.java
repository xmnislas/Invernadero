/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidades.Sensor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Equipo 3
 */
public class SensorDAO implements ISensorDAO{
    private IConexionBD conexionBD;
    
    public SensorDAO(IConexionBD conexionBD){
        this.conexionBD = conexionBD;
    }

    @Override
    public boolean agregar(Sensor sensor) {
        try{
            Connection conexion = this.conexionBD.crearConexion();
            
            Statement comandoSQL = conexion.createStatement();
            
            String codigoSQL = String.format("INSERT INTO sensores (marca, fabricante, formato_transmision) VALUES ('%s', '%s', '%s');", 
                sensor.getMarca(), sensor.getFabricante(), sensor.getFormatoTransmision());
            
            int registrosAfectados = comandoSQL.executeUpdate(codigoSQL);
            
            conexion.close();
            
            return (registrosAfectados == 1);
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
            return false;
        }
    }
    
    @Override
    public List<Sensor> consultarTodos() {
        List<Sensor> listaSensores = new ArrayList<>();
        
        try{
            Connection conexion  = this.conexionBD.crearConexion();
            
            Statement comandoSQL = conexion.createStatement();
            
            String codigoSQL = String.format("SELECT id_sensor, marca, fabricante, formato_transmision FROM sensores;");
            
            ResultSet resultado = comandoSQL.executeQuery(codigoSQL);
            
            while(resultado.next()){
                Long id_sensor = resultado.getLong("id_sensor");
                String marca = resultado.getString("marca");
                String fabricante = resultado.getString("fabricante");
                String formato_transmision = resultado.getString("formato_transmision");
                
                Sensor sensor = new Sensor(formato_transmision, id_sensor, marca, fabricante);
                listaSensores.add(sensor);
            }
            
            conexion.close();
            return listaSensores;
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
            return listaSensores;
        }
    }
    
}
