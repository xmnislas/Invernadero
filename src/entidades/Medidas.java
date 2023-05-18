/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Equipo 3
 */
public class Medidas {
    private Long id_medida, id_sensor;
    private Double humedad, temperatura;

    public Medidas() {
    }
    
    public Medidas(Double humedad, Double temperatura) {
        this.humedad = humedad;
        this.temperatura = temperatura;
    }

    public Medidas(Long id_sensor, Double humedad, Double temperatura) {
        this.id_sensor = id_sensor;
        this.humedad = humedad;
        this.temperatura = temperatura;
    }

    public Medidas(Long id_medida, Long id_sensor, Double humedad, Double temperatura) {
        this.id_medida = id_medida;
        this.id_sensor = id_sensor;
        this.humedad = humedad;
        this.temperatura = temperatura;
    }

    public Long getId_medida() {
        return id_medida;
    }

    public void setId_medida(Long id_medida) {
        this.id_medida = id_medida;
    }

    public Long getId_sensor() {
        return id_sensor;
    }

    public void setId_sensor(Long id_sensor) {
        this.id_sensor = id_sensor;
    }

    public Double getHumedad() {
        return humedad;
    }

    public void setHumedad(Double humedad) {
        this.humedad = humedad;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "Medidas{" + "humedad=" + humedad + ", temperatura=" + temperatura + '}';
    }
}
