/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framesconsultas;

import conexiones.MySqlConn;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Adrian Quinn
 */
public class FrameBusquedaPorNombreHuesped extends javax.swing.JInternalFrame {
    MySqlConn conn=new MySqlConn();
    /**
     * Creates new form FrameBusquedaPorNombreHuesped
     */
    public FrameBusquedaPorNombreHuesped() {
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

        jPanelTipoConsulta = new javax.swing.JPanel();
        jLabelTipoConsulta = new javax.swing.JLabel();
        jPanelInformacion = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDespliegueInfo = new javax.swing.JTextArea();
        jLabelAvisoNombre = new javax.swing.JLabel();
        jTextFieldNombreHuesped = new javax.swing.JTextField();
        jButtonBusqueda = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelTipoConsulta.setBackground(new java.awt.Color(0, 255, 255));
        jPanelTipoConsulta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTipoConsulta.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabelTipoConsulta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTipoConsulta.setText("Busqueda de Huesped");
        jPanelTipoConsulta.add(jLabelTipoConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        getContentPane().add(jPanelTipoConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1021, 139));

        jPanelInformacion.setBackground(new java.awt.Color(51, 51, 51));
        jPanelInformacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextAreaDespliegueInfo.setEditable(false);
        jTextAreaDespliegueInfo.setBackground(new java.awt.Color(255, 255, 255));
        jTextAreaDespliegueInfo.setColumns(20);
        jTextAreaDespliegueInfo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextAreaDespliegueInfo.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDespliegueInfo);

        jPanelInformacion.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 460, 390));

        jLabelAvisoNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelAvisoNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAvisoNombre.setText("Ingresa el nombre del huesped a buscar");
        jPanelInformacion.add(jLabelAvisoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jTextFieldNombreHuesped.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNombreHuesped.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNombreHuesped.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNombreHuesped.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        jPanelInformacion.add(jTextFieldNombreHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 144, 350, 30));

        jButtonBusqueda.setBackground(new java.awt.Color(102, 255, 153));
        jButtonBusqueda.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBusqueda.setText("Buscar");
        jButtonBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBusquedaActionPerformed(evt);
            }
        });
        jPanelInformacion.add(jButtonBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        jButtonLimpiar.setBackground(new java.awt.Color(255, 102, 102));
        jButtonLimpiar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });
        jPanelInformacion.add(jButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        getContentPane().add(jPanelInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 138, 1021, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBusquedaActionPerformed
        // TODO add your handling code here:
        String nombre=this.jTextFieldNombreHuesped.getText();
        int numHabitacion,piso=0;
        String query="select * from huespedes where nombre= '"+nombre+"'";
        this.conn.Consult(query);
        try{
            numHabitacion=this.conn.rs.getInt(3);
            if(piso<=126){
                piso=1;
            }else{
                piso=2;
            }
            this.jTextAreaDespliegueInfo.setText("Informacion del huesped: \nNombre: "+nombre+" \nHabitacion: "+numHabitacion+"\nPiso: "+piso);
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(this, "Huesped no registrado");
        }
        
    }//GEN-LAST:event_jButtonBusquedaActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        // TODO add your handling code here:
        this.jTextFieldNombreHuesped.setText("");
        this.jTextAreaDespliegueInfo.setText("");
        this.jTextFieldNombreHuesped.requestFocus();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBusqueda;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JLabel jLabelAvisoNombre;
    private javax.swing.JLabel jLabelTipoConsulta;
    private javax.swing.JPanel jPanelInformacion;
    private javax.swing.JPanel jPanelTipoConsulta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDespliegueInfo;
    private javax.swing.JTextField jTextFieldNombreHuesped;
    // End of variables declaration//GEN-END:variables
}
