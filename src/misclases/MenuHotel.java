/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misclases;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Adrian Quinn
 */
public class MenuHotel extends javax.swing.JFrame {

    /**
     * Creates new form MenuHotel
     */
    public MenuHotel() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargaIconos();
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
        jLabelRegistroIco = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabelSalir = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelMinimizar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelCheckIn = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelConsultas = new javax.swing.JLabel();
        jLabelCheckOut1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 51));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelRegistroIco.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelRegistroIco.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelRegistroIcoMouseMoved(evt);
            }
        });
        jLabelRegistroIco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelRegistroIcoMouseExited(evt);
            }
        });
        jPanel1.add(jLabelRegistroIco, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 130, 140));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 176, 85, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 228, 212, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 640));

        jPanel2.setBackground(new java.awt.Color(60, 151, 195));

        jLabelSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSalirMouseClicked(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("YUMMY RESORTS MENU");

        jLabelMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMinimizar.setPreferredSize(new java.awt.Dimension(32, 32));
        jLabelMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 251, Short.MAX_VALUE)
                .addComponent(jLabelMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelSalir)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addGap(34, 34, 34))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 770, 130));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CONSULTAS");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CHECK-OUT");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 730, 20));

        jLabelCheckIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCheckIn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelCheckInMouseMoved(evt);
            }
        });
        jLabelCheckIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCheckInMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCheckInMouseExited(evt);
            }
        });
        jPanel3.add(jLabelCheckIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 130, 140));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CHECK-IN");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        jLabelConsultas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelConsultas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelConsultasMouseMoved(evt);
            }
        });
        jLabelConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelConsultasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelConsultasMouseExited(evt);
            }
        });
        jPanel3.add(jLabelConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 130, 140));

        jLabelCheckOut1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCheckOut1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelCheckOut1MouseMoved(evt);
            }
        });
        jLabelCheckOut1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCheckOut1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCheckOut1MouseExited(evt);
            }
        });
        jPanel3.add(jLabelCheckOut1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 130, 140));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MODIFICAR HOSPEDAJE");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 730, 240));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 770, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelRegistroIcoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegistroIcoMouseMoved
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jLabelRegistroIcoMouseMoved

    private void jLabelRegistroIcoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegistroIcoMouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabelRegistroIcoMouseExited

    private void jLabelSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalirMouseClicked
        // TODO add your handling code here:
        String opciones[]={"Salir del Programa","Cerrar Sesion","Cancelar"};
        int res= JOptionPane.showOptionDialog(null, "Que deseas hacer?", "Salir...",0,0, null, opciones, JOptionPane.QUESTION_MESSAGE);
        if(res==0){
            System.exit(0);
        }else if(res==1){
            setVisible(false);
            new SesionLogin().setVisible(true);
        }
    }//GEN-LAST:event_jLabelSalirMouseClicked

    private void jLabelCheckInMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCheckInMouseMoved
        // TODO add your handling code here:
        this.jLabelCheckIn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200,200,200)));
    }//GEN-LAST:event_jLabelCheckInMouseMoved

    private void jLabelCheckInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCheckInMouseExited
        // TODO add your handling code here:
         this.jLabelCheckIn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51,51,51)));
    }//GEN-LAST:event_jLabelCheckInMouseExited

    private void jLabelConsultasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelConsultasMouseMoved
        // TODO add your handling code here:
        this.jLabelConsultas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200,200,200)));
    }//GEN-LAST:event_jLabelConsultasMouseMoved

    private void jLabelConsultasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelConsultasMouseExited
        // TODO add your handling code here:
        this.jLabelConsultas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51,51,51)));
    }//GEN-LAST:event_jLabelConsultasMouseExited

    private void jLabelCheckOut1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCheckOut1MouseMoved
        // TODO add your handling code here:
        this.jLabelCheckOut1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200,200,200)));
    }//GEN-LAST:event_jLabelCheckOut1MouseMoved

    private void jLabelCheckOut1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCheckOut1MouseExited
        // TODO add your handling code here:
        this.jLabelCheckOut1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51,51,51)));
    }//GEN-LAST:event_jLabelCheckOut1MouseExited

    private void jLabelMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizarMouseClicked
        // TODO add your handling code here:
         this.setState(SesionLogin.ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizarMouseClicked

    private void jLabelCheckInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCheckInMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        new ServicioCheckIn().setVisible(true);
    }//GEN-LAST:event_jLabelCheckInMouseClicked

    private void jLabelCheckOut1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCheckOut1MouseClicked
        // TODO add your handling code here:
        setVisible(false);
        new ServicioCheckOut().setVisible(true);
    }//GEN-LAST:event_jLabelCheckOut1MouseClicked

    private void jLabelConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelConsultasMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        new ServicioConsultas().setVisible(true);
    }//GEN-LAST:event_jLabelConsultasMouseClicked

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
            java.util.logging.Logger.getLogger(MenuHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuHotel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCheckIn;
    private javax.swing.JLabel jLabelCheckOut1;
    private javax.swing.JLabel jLabelConsultas;
    private javax.swing.JLabel jLabelMinimizar;
    private javax.swing.JLabel jLabelRegistroIco;
    private javax.swing.JLabel jLabelSalir;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
    
    public void cargaIconos(){
        ImageIcon iconoGrandeUsuario=new ImageIcon("src/iconos/user.png");
        ImageIcon iconoGrandeEntrada=new ImageIcon("src/iconos/log-in.png");
        ImageIcon iconoGrandeConsulta=new ImageIcon("src/iconos/bookmark.png");
        ImageIcon iconoGrandeSalida=new ImageIcon("src/iconos/exit.png");
        ImageIcon iconoMinimizar=new ImageIcon("src/iconos/minimize.png");
        ImageIcon iconoCerrar=new ImageIcon("src/iconos/cancel.png");
        
        this.jLabelRegistroIco.setIcon(iconoGrandeUsuario);
        this.jLabelCheckIn.setIcon(iconoGrandeEntrada);
        this.jLabelConsultas.setIcon(iconoGrandeConsulta);
        this.jLabelCheckOut1.setIcon(iconoGrandeSalida);
        this.jLabelMinimizar.setIcon(iconoMinimizar);
        this.jLabelSalir.setIcon(iconoCerrar);
    
    }


}
