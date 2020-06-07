/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.vistas;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author LEFT4
 */
public class VistaCentro extends javax.swing.JFrame {

    /**
     * Creates new form EntradaCentro
     */
    public VistaCentro() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public JButton getBtn_Carrito() {
        return btn_Carrito;
    }

    public JButton getBtn_Electronica() {
        return btn_Electronica;
    }

    public JButton getBtn_Heladeria() {
        return btn_Heladeria;
    }

    public JButton getBtn_Relojeria() {
        return btn_Relojeria;
    }

    public JLabel getMsjBienvenida() {
        return msjBienvenida;
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
        msjBienvenida = new javax.swing.JLabel();
        btn_Carrito = new javax.swing.JButton();
        btn_Heladeria = new javax.swing.JButton();
        btn_Electronica = new javax.swing.JButton();
        btn_Relojeria = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        msjBienvenida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        msjBienvenida.setForeground(new java.awt.Color(255, 255, 255));
        msjBienvenida.setText("Buen dia (nombre)! Bienvenido al Centro Comercial!");
        jPanel1.add(msjBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 30));

        btn_Carrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/proyecto/imagenes/carro-de-la-compra (1).png"))); // NOI18N
        jPanel1.add(btn_Carrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 50, 40));

        btn_Heladeria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/proyecto/imagenes/HeladeriaLOGO.png"))); // NOI18N
        jPanel1.add(btn_Heladeria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 200, 380));

        btn_Electronica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/proyecto/imagenes/ElectronicaLOGO.png"))); // NOI18N
        jPanel1.add(btn_Electronica, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 430, 180));

        btn_Relojeria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/proyecto/imagenes/RelojeriaLOGO.png"))); // NOI18N
        jPanel1.add(btn_Relojeria, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 430, 180));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/proyecto/imagenes/FondoCentro.jpg"))); // NOI18N
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
            java.util.logging.Logger.getLogger(VistaCentro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaCentro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaCentro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaCentro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaCentro().setVisible(true);
                
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
    // End of variables declaration//GEN-END:variables
}
