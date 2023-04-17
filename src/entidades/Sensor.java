/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Equipo 3
 */
public class Sensor extends SensorGenerico{
    private String formatoTransmision;

    public Sensor() {
    }

    public Sensor(String formatoTransmision, String marca, String fabricante) {
        super(marca, fabricante);
        this.formatoTransmision = formatoTransmision;
    }
    
    public Sensor(Long idSensor, String marca, String fabricante) {
        super(idSensor, marca, fabricante);
    }

    public Sensor(String formatoTransmision, Long idSensor, String marca, String fabricante) {
        super(idSensor, marca, fabricante);
        this.formatoTransmision = formatoTransmision;
    }

    public String getFormatoTransmision() {
        return formatoTransmision;
    }

    public void setFormatoTransmision(String formatoTransmision) {
        this.formatoTransmision = formatoTransmision;
    }

    @Override
    public String toString() {
        return "Sensor{" + "id=" + super.getIdSensor() + '}';
    }

}
