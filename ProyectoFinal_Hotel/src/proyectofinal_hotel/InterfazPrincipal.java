/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal_hotel;

import Interfaces_Vistas.datosCategoria;
import Interfaces_Vistas.datosHabitacion;
import Interfaces_Vistas.datosHuesped;
import Interfaces_Vistas.formularioReserva;
import Interfaces_Vistas.huespedesHabitacion;
import Interfaces_Vistas.registroReserva;

/**
 *
 * @author Diego
 */
public class InterfazPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form InterfazPrincipal
     */
    public InterfazPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jDescritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMdatosHuesped = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMdatosHabitacion = new javax.swing.JMenuItem();
        jMdatosCategoria = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMformularioReserva = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMHuespedxHabitacion = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMsalir = new javax.swing.JMenuItem();

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDescritorioLayout = new javax.swing.GroupLayout(jDescritorio);
        jDescritorio.setLayout(jDescritorioLayout);
        jDescritorioLayout.setHorizontalGroup(
            jDescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 813, Short.MAX_VALUE)
        );
        jDescritorioLayout.setVerticalGroup(
            jDescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_imagenes/turista.png"))); // NOI18N
        jMenu1.setText("Huésped");

        jMdatosHuesped.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_imagenes/formulario-de-consentimiento-del-donante.png"))); // NOI18N
        jMdatosHuesped.setText("Datos Huésped");
        jMdatosHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMdatosHuespedActionPerformed(evt);
            }
        });
        jMenu1.add(jMdatosHuesped);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_imagenes/hotel.png"))); // NOI18N
        jMenu2.setText("Habitaciones/Categoria");

        jMdatosHabitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_imagenes/reserva-en-linea.png"))); // NOI18N
        jMdatosHabitacion.setText("Datos Habitación");
        jMdatosHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMdatosHabitacionActionPerformed(evt);
            }
        });
        jMenu2.add(jMdatosHabitacion);

        jMdatosCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_imagenes/reserva.png"))); // NOI18N
        jMdatosCategoria.setText("Datos Categoría");
        jMdatosCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMdatosCategoriaActionPerformed(evt);
            }
        });
        jMenu2.add(jMdatosCategoria);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_imagenes/registrarse.png"))); // NOI18N
        jMenu3.setText("Administración");

        jMformularioReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_imagenes/reservado.png"))); // NOI18N
        jMformularioReserva.setText("Formulario de Reserva");
        jMformularioReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMformularioReservaActionPerformed(evt);
            }
        });
        jMenu3.add(jMformularioReserva);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_imagenes/campana.png"))); // NOI18N
        jMenu4.setText("Consultas");

        jMHuespedxHabitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_imagenes/llave-de-la-habitacion.png"))); // NOI18N
        jMHuespedxHabitacion.setText("Huespedes por Habitacion");
        jMHuespedxHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMHuespedxHabitacionActionPerformed(evt);
            }
        });
        jMenu4.add(jMHuespedxHabitacion);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_imagenes/registro-en-linea.png"))); // NOI18N
        jMenuItem1.setText("Registro de Inscripcion");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_imagenes/salida.png"))); // NOI18N
        jMenu5.setText("Salir");

        jMsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_imagenes/boton.png"))); // NOI18N
        jMsalir.setText("Cerrar Programa");
        jMsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMsalirActionPerformed(evt);
            }
        });
        jMenu5.add(jMsalir);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDescritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDescritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMsalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMsalirActionPerformed

    private void jMdatosHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMdatosHuespedActionPerformed
        // TODO add your handling code here:
        jDescritorio.removeAll();
        jDescritorio.repaint();
        datosHuesped dataHuesped=new datosHuesped();
        dataHuesped.setVisible(true);
        jDescritorio.add(dataHuesped);
        jDescritorio.moveToFront(dataHuesped);

       
    }//GEN-LAST:event_jMdatosHuespedActionPerformed

    private void jMdatosHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMdatosHabitacionActionPerformed
        // TODO add your handling code here:
        jDescritorio.removeAll();
        jDescritorio.repaint();
        datosHabitacion dataHabitacion=new datosHabitacion();
        dataHabitacion.setVisible(true);
        jDescritorio.add(dataHabitacion);
        jDescritorio.moveToFront(dataHabitacion);
    }//GEN-LAST:event_jMdatosHabitacionActionPerformed

    private void jMdatosCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMdatosCategoriaActionPerformed
        // TODO add your handling code here:
        jDescritorio.removeAll();
        jDescritorio.repaint();
        datosCategoria dataCategoria=new datosCategoria();
        dataCategoria.setVisible(true);
        jDescritorio.add(dataCategoria);
        jDescritorio.moveToFront(dataCategoria);
    }//GEN-LAST:event_jMdatosCategoriaActionPerformed

    private void jMformularioReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMformularioReservaActionPerformed
        // TODO add your handling code here:
        jDescritorio.removeAll();
        jDescritorio.repaint();
        formularioReserva formReserva=new formularioReserva();
        formReserva.setVisible(true);
        jDescritorio.add(formReserva);
        jDescritorio.moveToFront(formReserva);
    }//GEN-LAST:event_jMformularioReservaActionPerformed

    private void jMHuespedxHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMHuespedxHabitacionActionPerformed
        // TODO add your handling code here:
        jDescritorio.removeAll();
        jDescritorio.repaint();
        huespedesHabitacion huespedHabitacion=new huespedesHabitacion();
        huespedHabitacion.setVisible(true);
        jDescritorio.add(huespedHabitacion);
        jDescritorio.moveToFront(huespedHabitacion);
        
    }//GEN-LAST:event_jMHuespedxHabitacionActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        jDescritorio.removeAll();
        jDescritorio.repaint();
        registroReserva registroIns=new registroReserva();
        registroIns.setVisible(true);
        jDescritorio.add(registroIns);
        jDescritorio.moveToFront(registroIns);
        
    
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JDesktopPane jDescritorio;
    private javax.swing.JMenuItem jMHuespedxHabitacion;
    private javax.swing.JMenuItem jMdatosCategoria;
    private javax.swing.JMenuItem jMdatosHabitacion;
    private javax.swing.JMenuItem jMdatosHuesped;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMformularioReserva;
    private javax.swing.JMenuItem jMsalir;
    // End of variables declaration//GEN-END:variables
}
