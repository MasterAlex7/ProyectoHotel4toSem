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
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Adrian Quinn
 */
public class FrameTotalHabitaciones extends javax.swing.JInternalFrame {
    MySqlConn conn=new MySqlConn();
    
    int habitacionesSencillas1,habitacionesDuales1,habitacionesMaster1;
    int habitacionesSencillas2,habitacionesDuales2,habitacionesMaster2;
    
    
    /**
     * Creates new form FrameTotalHabitaciones
     */
    public FrameTotalHabitaciones() {
        initComponents();
        mostrarInformacion();
        cargarGrafica();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelTotSencilla = new javax.swing.JLabel();
        jLabelTotMaster = new javax.swing.JLabel();
        jLabelTotDual = new javax.swing.JLabel();
        jPanelMostrarGrafica = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setPreferredSize(new java.awt.Dimension(1018, 625));
        setRequestFocusEnabled(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TIPOS DE HABITACIONES");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 46, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sencilla");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dual");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Master");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, -1, -1));

        jLabelTotSencilla.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelTotSencilla.setForeground(new java.awt.Color(204, 255, 102));
        jLabelTotSencilla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabelTotSencilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 80, 30));

        jLabelTotMaster.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelTotMaster.setForeground(new java.awt.Color(204, 255, 102));
        jLabelTotMaster.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabelTotMaster, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 80, 30));

        jLabelTotDual.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelTotDual.setForeground(new java.awt.Color(204, 255, 102));
        jLabelTotDual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabelTotDual, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 80, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 510, 520));

        jPanelMostrarGrafica.setPreferredSize(new java.awt.Dimension(510, 510));

        javax.swing.GroupLayout jPanelMostrarGraficaLayout = new javax.swing.GroupLayout(jPanelMostrarGrafica);
        jPanelMostrarGrafica.setLayout(jPanelMostrarGraficaLayout);
        jPanelMostrarGraficaLayout.setHorizontalGroup(
            jPanelMostrarGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        jPanelMostrarGraficaLayout.setVerticalGroup(
            jPanelMostrarGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelMostrarGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 510, 510));

        jPanel3.setBackground(new java.awt.Color(40, 210, 213));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Informacion de Habitaciones");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 265, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 266, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 24, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 23, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelTotDual;
    private javax.swing.JLabel jLabelTotMaster;
    private javax.swing.JLabel jLabelTotSencilla;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelMostrarGrafica;
    // End of variables declaration//GEN-END:variables
    
    public void mostrarInformacion(){
        String query="select * from habitaciones ORDER BY numero ASC";
        this.conn.Consult(query);
        int n=0;
        try{
            this.conn.rs.last();//Se posicion en el ultimo registro de la tabla
            n=this.conn.rs.getRow();//regresa el numero actual del registro
            this.conn.rs.first();//Se posiciona en el primer registro de la tabal
        
        }catch(Exception e){
            System.out.println("Error para consultar datos");
        
        }
        
        if(n!=0){//Si hay datos
            String aux;
            for (int i = 0; i < n; i++) {
                try{
                   aux=this.conn.rs.getString(3);
                    //System.out.println(aux);
                   if(aux.equals("Sencilla") && i <15){
                       this.habitacionesSencillas1++;
                   }else if(aux.equals("Dual") && i<15){
                       this.habitacionesDuales1++;
                   }else if(aux.equals("Master")&& i<15){
                       this.habitacionesMaster1++;
                   }else if(aux.equals("Sencilla")&& i>=15){
                       this.habitacionesSencillas2++;
                   }else if(aux.equals("Dual") && i>=15){
                       this.habitacionesDuales2++;
                   }else if(aux.equals("Master") && i>=15){
                       this.habitacionesMaster2++;
                   }
                    this.conn.rs.next();
                }catch(SQLException ex){
                    System.out.println("Error para obtener los datos");
                }
            }
            /*String columnas[]={"Habitacion","Paciente","Diagnostico","Medico"};
            jTableConsulta1.setModel(new DefaultTableModel(datos,columnas));
            System.out.println("Tabla lista");*/
            int totalSencilla=this.habitacionesSencillas1+this.habitacionesSencillas2;
            int totalDual=this.habitacionesDuales1+this.habitacionesDuales2;
            int totalMaster=this.habitacionesMaster1+this.habitacionesMaster2;
            this.jLabelTotSencilla.setText(""+totalSencilla);
            this.jLabelTotMaster.setText(""+totalMaster);
            this.jLabelTotDual.setText(""+totalDual);
        
        }else{
            JOptionPane.showMessageDialog(this, "No hay datos disponibles...");
        }
    
    }
    
    public void cargarGrafica(){
        DefaultCategoryDataset datos=new DefaultCategoryDataset();
        
        datos.setValue(this.habitacionesSencillas1, "Piso 1", "Sencilla");
        datos.setValue(this.habitacionesSencillas2, "Piso 2", "Sencilla");
        datos.setValue(this.habitacionesDuales1,"Piso 1","Dual");
        datos.setValue(this.habitacionesDuales2, "Piso 2", "Dual");
        datos.setValue(this.habitacionesMaster1, "Piso 1", "Master");
        datos.setValue(this.habitacionesMaster2, "Piso 2", "Master");
        
        JFreeChart graficoBarras=ChartFactory.createBarChart3D(
        "Tipos de Habitaciones\n Yummy Resorts",  //nombre de la grafica
        "Tipos de Habitaciones", //nombre de las barras o culmanas
        "Cantidad de habitaciones",   //nombre de la numeracion
        datos, //datos del grafico
        PlotOrientation.VERTICAL, //orientacion
        true, //leyenda de barras individuales por oclor
        true,  //herramientas
        false   //url del grafico
        );
        
        ChartPanel panel=new ChartPanel(graficoBarras);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(250,250));
        
        this.jPanelMostrarGrafica.setLayout(new BorderLayout());
        this.jPanelMostrarGrafica.add(panel,BorderLayout.CENTER);
        
        pack();
        repaint();
    
    }

}
