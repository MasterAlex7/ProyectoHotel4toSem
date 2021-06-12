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
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Cesar Daniel
 */
public class FramePorcentajeOcupacion extends javax.swing.JInternalFrame {

    MySqlConn conn = new MySqlConn();

    /**
     * Creates new form FramePorcentajeOcupacion
     */
    public FramePorcentajeOcupacion() {
        initComponents();

        mostrarGrafica();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelVerde = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelNegroFondo = new javax.swing.JPanel();
        jPanelGrafica = new javax.swing.JPanel();
        jLabelTituloDisponible = new javax.swing.JLabel();
        jLabelTituloOcupado = new javax.swing.JLabel();
        jLabelInformacionDisponible = new javax.swing.JLabel();
        jLabelInformacionOcupado = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelVerde.setBackground(new java.awt.Color(0, 255, 204));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("PORCENTAJE DE OCUPACION");

        javax.swing.GroupLayout jPanelVerdeLayout = new javax.swing.GroupLayout(jPanelVerde);
        jPanelVerde.setLayout(jPanelVerdeLayout);
        jPanelVerdeLayout.setHorizontalGroup(
            jPanelVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVerdeLayout.createSequentialGroup()
                .addGap(344, 344, 344)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(417, Short.MAX_VALUE))
        );
        jPanelVerdeLayout.setVerticalGroup(
            jPanelVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVerdeLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanelNegroFondo.setBackground(new java.awt.Color(51, 51, 51));
        jPanelNegroFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanelGraficaLayout = new javax.swing.GroupLayout(jPanelGrafica);
        jPanelGrafica.setLayout(jPanelGraficaLayout);
        jPanelGraficaLayout.setHorizontalGroup(
            jPanelGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 636, Short.MAX_VALUE)
        );
        jPanelGraficaLayout.setVerticalGroup(
            jPanelGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );

        jPanelNegroFondo.add(jPanelGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 31, -1, -1));

        jLabelTituloDisponible.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabelTituloDisponible.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloDisponible.setText("PORCENTAJE DISPONIBLE");
        jPanelNegroFondo.add(jLabelTituloDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 120, -1, -1));

        jLabelTituloOcupado.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabelTituloOcupado.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloOcupado.setText("PORCENTAJE OCUPADO");
        jPanelNegroFondo.add(jLabelTituloOcupado, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 270, -1, -1));

        jLabelInformacionDisponible.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabelInformacionDisponible.setForeground(new java.awt.Color(255, 255, 255));
        jPanelNegroFondo.add(jLabelInformacionDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 180, 70, 20));

        jLabelInformacionOcupado.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabelInformacionOcupado.setForeground(new java.awt.Color(255, 255, 255));
        jPanelNegroFondo.add(jLabelInformacionOcupado, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 320, 70, 20));

        getContentPane().add(jPanelNegroFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1010, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelInformacionDisponible;
    private javax.swing.JLabel jLabelInformacionOcupado;
    private javax.swing.JLabel jLabelTituloDisponible;
    private javax.swing.JLabel jLabelTituloOcupado;
    private javax.swing.JPanel jPanelGrafica;
    private javax.swing.JPanel jPanelNegroFondo;
    private javax.swing.JPanel jPanelVerde;
    // End of variables declaration//GEN-END:variables

    public void mostrarGrafica() {
        int totalHabOcup = 0, aux = 0, suma = 0;
        float totOcup = 0, totDisp = 0;
        String query = "select * from habitaciones where estado = '1'";
        this.conn.Consult(query);
        try {
            this.conn.rs.last();
            aux = this.conn.rs.getRow();
            this.conn.rs.first();
            for (int i = 0; i < aux; i++) {
                if (this.conn.rs.getBoolean(2)) {
                    suma++;
                }
                this.conn.rs.next();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en Consulta de Datos");
        }
        //Se hacen los calculos para obtenr el total disponible y el ocupado
        totDisp = (((30 - suma) * 100) / 30);
        totOcup = (100 - totDisp);
        //Se muestra la informacion en Labels
        this.jLabelInformacionDisponible.setText("%" + totDisp);
        this.jLabelInformacionOcupado.setText("%" + totOcup);

        //Se genera la grafica en base a los datos obtenidos
        DefaultPieDataset grafOcup = new DefaultPieDataset();
        grafOcup.setValue("Disponible", totDisp);
        grafOcup.setValue("Ocupado", totOcup);
        JFreeChart grafFin = ChartFactory.createPieChart("Ocupacion de Habitaciones", grafOcup, true, true, false);

        //Brindamos las especificaciones a nuestra grafica
        ChartPanel panGraf = new ChartPanel(grafFin);
        panGraf.setMouseWheelEnabled(true);
        panGraf.setPreferredSize(new Dimension(700, 400));
        this.jPanelGrafica.setLayout(new BorderLayout());
        this.jPanelGrafica.add(panGraf, BorderLayout.CENTER);
        pack();
        repaint();
    }

}
