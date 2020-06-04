/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.vistas;

import java.awt.Color;

/**
 *
 * @author LEFT4
 */
public class EntradaCentro extends javax.swing.JFrame {

    /**
     * Creates new form EntradaCentro
     */
    public EntradaCentro() {
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

        jPanel1 = new javax.swing.JPanel();
        btn_Carrito = new javax.swing.JButton();
        tituloHeladeria = new javax.swing.JLabel();
        tituloElectronica = new javax.swing.JLabel();
        btn_Heladeria = new javax.swing.JButton();
        btn_Electronica = new javax.swing.JButton();
        tituloRelojeria = new javax.swing.JLabel();
        btn_Relojeria = new javax.swing.JButton();
        msjBienvenida = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Carrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/proyecto/imagenes/carro-de-la-compra (1).png"))); // NOI18N
        jPanel1.add(btn_Carrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 60, 50));

        tituloHeladeria.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        tituloHeladeria.setForeground(new java.awt.Color(255, 255, 255));
        tituloHeladeria.setText("HELADERIA");
        jPanel1.add(tituloHeladeria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        tituloElectronica.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        tituloElectronica.setText("ELECTRONICA");
        jPanel1.add(tituloElectronica, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, -1));

        btn_Heladeria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/proyecto/imagenes/HeladeriaLOGO.png"))); // NOI18N
        btn_Heladeria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_HeladeriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_HeladeriaMouseExited(evt);
            }
        });
        btn_Heladeria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HeladeriaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Heladeria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 200, 380));

        btn_Electronica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/proyecto/imagenes/ElectronicaLOGO.png"))); // NOI18N
        btn_Electronica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ElectronicaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Electronica, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 430, 190));

        tituloRelojeria.setBackground(new java.awt.Color(0, 0, 0));
        tituloRelojeria.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        tituloRelojeria.setForeground(new java.awt.Color(204, 204, 255));
        tituloRelojeria.setText("RELOJERIA");
        jPanel1.add(tituloRelojeria, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 150, 20));

        btn_Relojeria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/proyecto/imagenes/RelojeriaLOGO (1).png"))); // NOI18N
        btn_Relojeria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_RelojeriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_RelojeriaMouseExited(evt);
            }
        });
        jPanel1.add(btn_Relojeria, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 430, 180));

        msjBienvenida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        msjBienvenida.setForeground(new java.awt.Color(255, 255, 255));
        msjBienvenida.setText("Buen dia (nombre)! Bienvenido al Centro Comercial!");
        jPanel1.add(msjBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 380, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/proyecto/imagenes/FondoInicio.jpg"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_HeladeriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_HeladeriaMouseEntered
        
    }//GEN-LAST:event_btn_HeladeriaMouseEntered

    private void btn_HeladeriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_HeladeriaMouseExited
       
    }//GEN-LAST:event_btn_HeladeriaMouseExited

    private void btn_RelojeriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RelojeriaMouseEntered
//        btn_Relojeria.setOpaque(false);
    }//GEN-LAST:event_btn_RelojeriaMouseEntered

    private void btn_RelojeriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RelojeriaMouseExited
//        btn_Relojeria.setOpaque(true);
    }//GEN-LAST:event_btn_RelojeriaMouseExited

    private void btn_HeladeriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HeladeriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_HeladeriaActionPerformed

    private void btn_ElectronicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ElectronicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ElectronicaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EntradaCentro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntradaCentro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntradaCentro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntradaCentro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntradaCentro().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btn_Carrito;
    private javax.swing.JButton btn_Electronica;
    private javax.swing.JButton btn_Heladeria;
    private javax.swing.JButton btn_Relojeria;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel msjBienvenida;
    private javax.swing.JLabel tituloElectronica;
    private javax.swing.JLabel tituloHeladeria;
    private javax.swing.JLabel tituloRelojeria;
    // End of variables declaration//GEN-END:variables
}
