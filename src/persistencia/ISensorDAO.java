/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import entidades.Sensor;
import java.util.List;

/**
 *
 * @author xmnislas
 */
public interface ISensorDAO {
    boolean agregar(Sensor sensor);
    
    List<Sensor> consultarTodos();
}
