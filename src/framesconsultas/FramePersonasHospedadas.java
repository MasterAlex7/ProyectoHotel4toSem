/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framesconsultas;

import conexiones.MySqlConn;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Adrian Quinn
 */
public class FramePersonasHospedadas extends javax.swing.JInternalFrame {
    MySqlConn conn=new MySqlConn();
    List<Huesped> listaarray = new ArrayList<Huesped>();
    /**
     * Creates new form FramePersonasHospedadas
     */
    public FramePersonasHospedadas() {
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

        jPanelBase = new javax.swing.JPanel();
        Consultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaMostrar = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabelTitulo1 = new javax.swing.JLabel();
        jButtonLimpiar = new javax.swing.JButton();

        jPanelBase.setBackground(new java.awt.Color(51, 51, 51));
        jPanelBase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Consultar.setBackground(new java.awt.Color(51, 255, 204));
        Consultar.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Consultar.setForeground(new java.awt.Color(255, 255, 255));
        Consultar.setText("Consultar");
        Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });
        jPanelBase.add(Consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        jTextAreaMostrar.setBackground(new java.awt.Color(255, 255, 255));
        jTextAreaMostrar.setColumns(20);
        jTextAreaMostrar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextAreaMostrar.setForeground(new java.awt.Color(0, 0, 0));
        jTextAreaMostrar.setRows(5);
        jScrollPane1.setViewportView(jTextAreaMostrar);

        jPanelBase.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 440, 430));

        jPanel2.setBackground(new java.awt.Color(102, 255, 204));

        jLabelTitulo1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabelTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo1.setText("Personas hospedadas en el hotel");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(252, Short.MAX_VALUE)
                .addComponent(jLabelTitulo1)
                .addGap(215, 215, 215))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabelTitulo1)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanelBase.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 130));

        jButtonLimpiar.setBackground(new java.awt.Color(255, 102, 102));
        jButtonLimpiar.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButtonLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });
        jPanelBase.add(jButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBase, javax.swing.GroupLayout.PREFERRED_SIZE, 546, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
        String query="select * from huespedes order by nombre asc";
        this.conn.Consult(query);
        String nom, tipoh;

        int hab;
        try{
            this.conn.rs.first();
            do{
                nom = this.conn.rs.getString(1);
                hab = this.conn.rs.getInt(3);
                tipoh = this.conn.rs.getString(4);
                Huesped aux = new Huesped(nom,hab,tipoh);
                listaarray.add(aux);
                this.jTextAreaMostrar.append(aux.Mostrar());
                this.jTextAreaMostrar.append("\n");
            }while(this.conn.rs.next());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(this, "Habitación no registrada");
        }
    }//GEN-LAST:event_ConsultarActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        // TODO add your handling code here:
        this.jTextAreaMostrar.setText("");
    }//GEN-LAST:event_jButtonLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Consultar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JLabel jLabelTitulo1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelBase;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaMostrar;
    // End of variables declaration//GEN-END:variables
}
