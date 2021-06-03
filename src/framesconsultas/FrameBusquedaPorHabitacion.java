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
public class FrameBusquedaPorHabitacion extends javax.swing.JInternalFrame {
    MySqlConn conn=new MySqlConn();
    /**
     * Creates new form FrameBusquedaPorHabitacion
     */
    public FrameBusquedaPorHabitacion() {
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
        jPanel1 = new javax.swing.JPanel();
        jLabelAvisoNombre = new javax.swing.JLabel();
        jTextFieldNumHabitacion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaInformacion = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelTipoConsulta.setBackground(new java.awt.Color(102, 255, 102));
        jPanelTipoConsulta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTipoConsulta.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabelTipoConsulta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTipoConsulta.setText("Busqueda por numero de habitacion");
        jPanelTipoConsulta.add(jLabelTipoConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        getContentPane().add(jPanelTipoConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 140));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelAvisoNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelAvisoNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAvisoNombre.setText("Ingrese el numero de la habitacion");
        jPanel1.add(jLabelAvisoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        jTextFieldNumHabitacion.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNumHabitacion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldNumHabitacion.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTextFieldNumHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 160, 30));

        jTextAreaInformacion.setEditable(false);
        jTextAreaInformacion.setBackground(new java.awt.Color(255, 255, 255));
        jTextAreaInformacion.setColumns(20);
        jTextAreaInformacion.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jTextAreaInformacion.setForeground(new java.awt.Color(0, 0, 0));
        jTextAreaInformacion.setRows(5);
        jScrollPane1.setViewportView(jTextAreaInformacion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 520, 260));

        jButton1.setBackground(new java.awt.Color(51, 255, 153));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Limpiar");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1020, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        boolean existe=false;
        int numHab=Integer.parseInt(this.jTextFieldNumHabitacion.getText());
        String query="select * from huespedes where habitacion= '"+numHab+"'";
        String hab="select * from habitaciones where numero= '"+numHab+"'";
        this.conn.Consult(hab);
        try{
            String tipoHab=this.conn.rs.getString(3);
            existe=true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "El numero de habitacion ingresado no existe!!!");
        }
        
        if(existe=true){
            this.conn.Consult(query);
            try{
                String nombre=this.conn.rs.getString(1);
                String tipoHab=this.conn.rs.getString(4);
                String ciudadOrigen=this.conn.rs.getString(2);
                this.jTextAreaInformacion.setText("***************\nNombre: "+nombre+"\nTipo de Habitacion: "+tipoHab+"\nCiudad de origen: "+ciudadOrigen+"\n**************");
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Habitacion no ocupada");
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabelAvisoNombre;
    private javax.swing.JLabel jLabelTipoConsulta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelTipoConsulta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaInformacion;
    private javax.swing.JTextField jTextFieldNumHabitacion;
    // End of variables declaration//GEN-END:variables
}
