/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framesconsultas;

import conexiones.MySqlConn;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Adrian Quinn
 */
public class FramePorcentajeOcupHab extends javax.swing.JInternalFrame {

    MySqlConn conn = new MySqlConn();

    /**
     * Creates new form FramePorcentajeOcupHab
     */
    public FramePorcentajeOcupHab() {
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
        jButtonConsultar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jButtonConsultar.setBackground(new java.awt.Color(102, 255, 204));
        jButtonConsultar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonConsultar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 255, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Porcentajes de ocupación por el tipo de habitación");
        jPanel2.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1020, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jButtonConsultar)
                .addGap(43, 43, 43)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jButtonConsultar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1020, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        int master = 0, sencilla = 0, dual = 0;
        int sencillaocp = 0, dualocp = 0, masterocp = 0;
        String query = "select * from habitaciones order by numero asc";
        this.conn.Consult(query);
        try {
            this.conn.rs.first();
            for (int i = 0; i < 30; i++) {
                if (this.conn.rs.getString(3).equals("Sencilla")) {
                    sencilla++;
                    if (this.conn.rs.getBoolean(2) == true) {
                        sencillaocp++;
                    }
                }
                if (this.conn.rs.getString(3).equals("Dual")) {
                    dual++;
                    if (this.conn.rs.getBoolean(2) == true) {
                        dualocp++;
                    }
                }
                if (this.conn.rs.getString(3).equals("Master")) {
                    master++;
                    if (this.conn.rs.getBoolean(2) == true) {
                        masterocp++;
                    }
                }
                this.conn.rs.next();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Habitación no registrada");
        }
        //Se hace un calculo correspondiente para obtener el porcentaje
        float ts = (sencillaocp * 100) / sencilla;
        float td = (dualocp * 100) / dual;
        float tm = (masterocp * 100) / master;

        String habt = "Habitaciones";
        //Se procede a generar la grafica
        DefaultCategoryDataset meses = new DefaultCategoryDataset();

        meses.setValue(ts, habt, "Sencilla");
        meses.setValue(td, habt, "Dual");
        meses.setValue(tm, habt, "Master");

        JFreeChart f = ChartFactory.createBarChart("Grafica de Barras\n Porcentaje de ocupación de habitaciones", "Tipo", "Porcentaje de ocupación", meses, PlotOrientation.VERTICAL, true, false, false);
        ChartPanel panel = new ChartPanel(f);;
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(650, 380));

        this.jPanel4.setLayout(new BorderLayout());
        this.jPanel4.add(panel, BorderLayout.NORTH);

        pack();
        repaint();


    }//GEN-LAST:event_jButtonConsultarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
