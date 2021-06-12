/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framesconsultas;

import conexiones.MySqlConn;
import java.sql.SQLException;

/**
 *
 * @author Adrian Quinn
 */
public class FrameIngresosHotel extends javax.swing.JInternalFrame {

    MySqlConn conn = new MySqlConn();

    /**
     * Creates new form FrameIngresosHotel
     */
    public FrameIngresosHotel() {
        initComponents();
        consultarIngresos();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTema = new javax.swing.JPanel();
        jLabelTipoConsulta = new javax.swing.JLabel();
        jPanelFono = new javax.swing.JPanel();
        jLabelAvisoDeIngresos = new javax.swing.JLabel();
        jLabelIngresosTotales = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelTema.setBackground(new java.awt.Color(102, 255, 204));

        jLabelTipoConsulta.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelTipoConsulta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTipoConsulta.setText("INGRESOS TOTALES DEL HOTEL");

        javax.swing.GroupLayout jPanelTemaLayout = new javax.swing.GroupLayout(jPanelTema);
        jPanelTema.setLayout(jPanelTemaLayout);
        jPanelTemaLayout.setHorizontalGroup(
            jPanelTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTemaLayout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jLabelTipoConsulta)
                .addContainerGap(605, Short.MAX_VALUE))
        );
        jPanelTemaLayout.setVerticalGroup(
            jPanelTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTemaLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabelTipoConsulta)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelTema, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanelFono.setBackground(new java.awt.Color(51, 51, 51));
        jPanelFono.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelAvisoDeIngresos.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelAvisoDeIngresos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAvisoDeIngresos.setText("Ingresos hasta el momento del hotel despues de todos los check out");
        jPanelFono.add(jLabelAvisoDeIngresos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, 40));

        jLabelIngresosTotales.setFont(new java.awt.Font("Arial", 1, 56)); // NOI18N
        jLabelIngresosTotales.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIngresosTotales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelFono.add(jLabelIngresosTotales, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 370, 80));

        getContentPane().add(jPanelFono, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1050, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelAvisoDeIngresos;
    private javax.swing.JLabel jLabelIngresosTotales;
    private javax.swing.JLabel jLabelTipoConsulta;
    private javax.swing.JPanel jPanelFono;
    private javax.swing.JPanel jPanelTema;
    // End of variables declaration//GEN-END:variables

    public void consultarIngresos() {
        //Obtenemos la informacion directa desde la base de datos
        String query = "select * from hotelinfo";
        this.conn.Consult(query);
        try {
            int ingresosTotales = this.conn.rs.getInt(1);
            this.jLabelIngresosTotales.setText("$ " + ingresosTotales + ".00");

        } catch (SQLException ex) {

        }
    }

}
