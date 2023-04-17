/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Equipo 3
 */
public abstract class SensorGenerico {
    private Long idSensor;
    private String marca, fabricante;

    public SensorGenerico() {
    }

    public SensorGenerico(String marca, String fabricante) {
        this.marca = marca;
        this.fabricante = fabricante;
    }

    public SensorGenerico(Long idSensor, String marca, String fabricante) {
        this.idSensor = idSensor;
        this.marca = marca;
        this.fabricante = fabricante;
    }

    public Long getIdSensor() {
        return idSensor;
    }

    public void setIdSensor(Long idSensor) {
        this.idSensor = idSensor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "SensorGenerico{" + "idSensor=" + idSensor + ", marca=" + marca + ", fabricante=" + fabricante + '}';
    }
    
}
