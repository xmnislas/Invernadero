/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guis;

import java.io.IOException;
import persistencia.ConexionBD;
import persistencia.IConexionBD;
import persistencia.ISensorDAO;
import persistencia.SensorDAO;

/**
 *
 * @author Equipo 3
 */
public class MenuForm extends javax.swing.JFrame {
     IConexionBD conexionBD = new ConexionBD();
     ISensorDAO sensorDAO = new SensorDAO(conexionBD);
    /**
     * Creates new form MenuForm
     */
    public MenuForm(){
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegistrarSensor = new javax.swing.JButton();
        btnTransmitirMedidas = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Invernadero");

        btnRegistrarSensor.setText("Registrar sensor");
        btnRegistrarSensor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarSensorActionPerformed(evt);
            }
        });

        btnTransmitirMedidas.setText("Transmitir medidas");
        btnTransmitirMedidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransmitirMedidasActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel1.setText("Sistema de Sensores en Invernadero");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTransmitirMedidas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrarSensor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(113, 113, 113))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addComponent(btnRegistrarSensor)
                .addGap(18, 18, 18)
                .addComponent(btnTransmitirMedidas)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarSensorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarSensorActionPerformed
        new SensorForm(sensorDAO).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistrarSensorActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnTransmitirMedidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransmitirMedidasActionPerformed
        new MedidasForm(sensorDAO).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTransmitirMedidasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarSensor;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTransmitirMedidas;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
