/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misclases;

import conexiones.MySqlConn;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author Adrian Quinn
 */
public class ServicioEdicion extends javax.swing.JFrame {

    MySqlConn conn = new MySqlConn();
    String tipoHab = "";
    int numHab = 0;
    String usuario="";

    /**
     * Creates new form ServicioEdicion
     */
    public ServicioEdicion() {
        initComponents();
        elementosOcultos();
        cargarIconos();
    }
    
    public ServicioEdicion(String usuario) {
        this.usuario=usuario;
        initComponents();
        elementosOcultos();
        cargarIconos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBarraLateral = new javax.swing.JPanel();
        jLabelIconoGrandeUsuario = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelDir = new javax.swing.JLabel();
        jLabelNomUsuario = new javax.swing.JLabel();
        jLabelNomHotel = new javax.swing.JLabel();
        jPanelEdicionReg = new javax.swing.JPanel();
        jLabelNumHab = new javax.swing.JLabel();
        jTextFieldNumHab = new javax.swing.JTextField();
        jToggleButtonBuscaHab = new javax.swing.JToggleButton();
        jLabelSel = new javax.swing.JLabel();
        jCheckBoxOcupantes = new javax.swing.JCheckBox();
        jCheckBoxFechaEntDiasHos = new javax.swing.JCheckBox();
        jCheckBoxCiudad = new javax.swing.JCheckBox();
        jCheckBoxNombre = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonConfirmarModif = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jTextFieldNuevaCiudad = new javax.swing.JTextField();
        jTextFieldNuevoNombre = new javax.swing.JTextField();
        jDateChooserFechaNueva = new com.toedter.calendar.JDateChooser();
        jTextFieldNuevosDias = new javax.swing.JTextField();
        jTextFieldNuevosOcupantes = new javax.swing.JTextField();
        jLabelGuardar = new javax.swing.JLabel();
        jLabelIconoGuardar = new javax.swing.JLabel();
        jLabelMenu = new javax.swing.JLabel();
        jLabelIconoMenu = new javax.swing.JLabel();
        jLabelTipoHab = new javax.swing.JLabel();
        jLabelFondoDegradado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBarraLateral.setBackground(new java.awt.Color(0, 0, 0));
        jPanelBarraLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelBarraLateral.add(jLabelIconoGrandeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 130, 130));

        jLabelUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setText("Usuario");
        jPanelBarraLateral.add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 70, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanelBarraLateral.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 130, 10));

        jLabelDir.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabelDir.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDir.setText("Grieta de la Orden 687, Calvillo,AGS.");
        jPanelBarraLateral.add(jLabelDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, 10));

        jLabelNomUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelNomUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelBarraLateral.add(jLabelNomUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 130, 30));

        jLabelNomHotel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelNomHotel.setForeground(new java.awt.Color(204, 204, 204));
        jLabelNomHotel.setText("Hotel Yummy Resorts");
        jPanelBarraLateral.add(jLabelNomHotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, -1));

        getContentPane().add(jPanelBarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 560));

        jPanelEdicionReg.setBackground(new java.awt.Color(102, 102, 0));
        jPanelEdicionReg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNumHab.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabelNumHab.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumHab.setText("Ingresa el numero de habitacion");
        jPanelEdicionReg.add(jLabelNumHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jTextFieldNumHab.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNumHab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextFieldNumHab.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNumHab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(33, 218, 226)));
        jPanelEdicionReg.add(jTextFieldNumHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 240, 30));

        jToggleButtonBuscaHab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jToggleButtonBuscaHab.setText("Buscar");
        jToggleButtonBuscaHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonBuscaHabActionPerformed(evt);
            }
        });
        jPanelEdicionReg.add(jToggleButtonBuscaHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        jLabelSel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabelSel.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSel.setText("Selecciona los elementos que se deben modificar");
        jPanelEdicionReg.add(jLabelSel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jCheckBoxOcupantes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jCheckBoxOcupantes.setText("Ocupantes");
        jPanelEdicionReg.add(jCheckBoxOcupantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, -1, -1));

        jCheckBoxFechaEntDiasHos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jCheckBoxFechaEntDiasHos.setText("Fecha Entrada y Dias hospedaje");
        jPanelEdicionReg.add(jCheckBoxFechaEntDiasHos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, -1));

        jCheckBoxCiudad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jCheckBoxCiudad.setText("Ciudad Origen");
        jPanelEdicionReg.add(jCheckBoxCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, -1));

        jCheckBoxNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jCheckBoxNombre.setText("Nombre Huesped");
        jPanelEdicionReg.add(jCheckBoxNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre nuevo:");
        jPanelEdicionReg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, 20));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ciudad de origen:");
        jPanelEdicionReg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, 20));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha Entrada:");
        jPanelEdicionReg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, 40));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dias de hospedaje:");
        jPanelEdicionReg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, -1, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ocupantes:");
        jPanelEdicionReg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, -1, 20));

        jButtonConfirmarModif.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonConfirmarModif.setText("Confirmar");
        jButtonConfirmarModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarModifActionPerformed(evt);
            }
        });
        jPanelEdicionReg.add(jButtonConfirmarModif, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanelEdicionReg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 780, 20));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanelEdicionReg.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 780, 10));

        jTextFieldNuevaCiudad.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNuevaCiudad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextFieldNuevaCiudad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 240, 224)));
        jPanelEdicionReg.add(jTextFieldNuevaCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 170, 20));

        jTextFieldNuevoNombre.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNuevoNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextFieldNuevoNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 240, 224)));
        jPanelEdicionReg.add(jTextFieldNuevoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 170, 20));
        jPanelEdicionReg.add(jDateChooserFechaNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 200, 30));

        jTextFieldNuevosDias.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNuevosDias.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextFieldNuevosDias.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNuevosDias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 240, 237)));
        jPanelEdicionReg.add(jTextFieldNuevosDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 180, -1));

        jTextFieldNuevosOcupantes.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNuevosOcupantes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextFieldNuevosOcupantes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNuevosOcupantes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jPanelEdicionReg.add(jTextFieldNuevosOcupantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, 180, -1));

        jLabelGuardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGuardar.setText("Guardar cambios");
        jPanelEdicionReg.add(jLabelGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 477, -1, 30));

        jLabelIconoGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIconoGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelIconoGuardarMouseClicked(evt);
            }
        });
        jPanelEdicionReg.add(jLabelIconoGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 430, 100, 70));

        jLabelMenu.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelMenu.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMenu.setText("Menu");
        jPanelEdicionReg.add(jLabelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 50, 60, -1));

        jLabelIconoMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIconoMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelIconoMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelIconoMenuMouseClicked(evt);
            }
        });
        jPanelEdicionReg.add(jLabelIconoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 70, 50));

        jLabelTipoHab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanelEdicionReg.add(jLabelTipoHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 190, 30));

        jLabelFondoDegradado.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelFondoDegradado.setForeground(new java.awt.Color(4, 82, 173));
        jLabelFondoDegradado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelEdicionReg.add(jLabelFondoDegradado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 560));

        getContentPane().add(jPanelEdicionReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 0, 820, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonBuscaHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonBuscaHabActionPerformed
        //Buscamos que la habitacion ingresada ya haya sido registrada
        int hab = Integer.parseInt(this.jTextFieldNumHab.getText().trim());
        String query = "select * from huespedes where habitacion= " + "'" + hab + "'";
        this.conn.Consult(query);
        try {
            int habBase = this.conn.rs.getInt(3);
            this.tipoHab = this.conn.rs.getString(4);
            if (habBase == hab) {
                this.numHab = habBase;
                JOptionPane.showMessageDialog(this, "Habitacion Encontrada!!!");
                this.jButtonConfirmarModif.setEnabled(true);
                this.jLabelTipoHab.setText("Habitacion "+this.tipoHab);
            } else {
                JOptionPane.showMessageDialog(this, "Habitacion no disponible");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "No existe la habitacion ingresada");
        }
    }//GEN-LAST:event_jToggleButtonBuscaHabActionPerformed

    private void jLabelIconoMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIconoMenuMouseClicked
        //Volvemos al menu
        setVisible(false);
        new MenuHotel(this.usuario).setVisible(true);
    }//GEN-LAST:event_jLabelIconoMenuMouseClicked

    private void jButtonConfirmarModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarModifActionPerformed
        //Una vez seleccionadas las confirmaciones a realizar, desbloqueamos los espacios
        this.jTextFieldNuevaCiudad.setEditable(true);
        this.jTextFieldNuevoNombre.setEditable(true);
        this.jTextFieldNuevosDias.setEditable(true);
        this.jTextFieldNuevosOcupantes.setEditable(true);
        this.jDateChooserFechaNueva.setEnabled(true);
        this.jLabelIconoGuardar.setEnabled(true);
    }//GEN-LAST:event_jButtonConfirmarModifActionPerformed

    private void jLabelIconoGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIconoGuardarMouseClicked

        boolean accesoCorrecto=true;
        String consult = "select * from huespedes where habitacion= " + "'" + this.numHab + "'";
        String nombre, ciudadOrigen;
        Date fechaEntrada, fechaSalida;
        int  ocupantes, max = 0;
        java.sql.Date fechaIn,fechaOut;

        //Obtenemos el tipo de habitacion para no tenr mas ocupante de los posibles en la modificacion
        if (this.tipoHab.equals("Sencilla")) {
            max = 3;
        } else if (this.tipoHab.equals("Dual")) {
            max = 4;
        } else if (this.tipoHab.equals("Master")) {
            max = 5;
        }

        //Realizamos la consulta y obtenemos los datos dependiento de la seleccion de datos a modificar
        this.conn.Consult(consult);
        try {
         if(this.jCheckBoxOcupantes.isSelected()){
            if(Integer.parseInt(this.jTextFieldNuevosOcupantes.getText())>max || Integer.parseInt(this.jTextFieldNuevosOcupantes.getText())<0){
                JOptionPane.showMessageDialog(null, "El numero de ocupantes ingresados excede el maximo de tu tipo de habitacion o es igual o menor a cero");  
            }else{
                accesoCorrecto=true;
            }
          }if(accesoCorrecto==true){
              //Dependiendo del checkBox seleccionada, debemos obtener los datos
            if (this.jCheckBoxNombre.isSelected()) {
                nombre = this.jTextFieldNuevoNombre.getText();
            } else {
                nombre = this.conn.rs.getString(1);
            }
            if (this.jCheckBoxCiudad.isSelected()) {
                ciudadOrigen = this.jTextFieldNuevaCiudad.getText();
            } else {
                ciudadOrigen = this.conn.rs.getString(2);
            }
            if (this.jCheckBoxFechaEntDiasHos.isSelected()) {
                fechaEntrada = this.jDateChooserFechaNueva.getDate();
                long d1 = fechaEntrada.getTime();
                 fechaIn = new java.sql.Date(d1);
                Calendar calendario = Calendar.getInstance();
                calendario.setTime(fechaEntrada);
                calendario.add(Calendar.DATE, Integer.parseInt(this.jTextFieldNuevosDias.getText()));
                fechaSalida= calendario.getTime();
                long dh=fechaSalida.getTime();
                 fechaOut=new java.sql.Date(dh);
            } else {
                fechaEntrada = this.conn.rs.getDate(6);
                long d1 = fechaEntrada.getTime();
                 fechaIn = new java.sql.Date(d1);
                fechaSalida= this.conn.rs.getDate(7);
                long dh=fechaSalida.getTime();
                fechaOut=new java.sql.Date(dh);
            }
            if(this.jCheckBoxOcupantes.isSelected()){
                if(Integer.parseInt(this.jTextFieldNuevosOcupantes.getText())>0){
                    ocupantes=Integer.parseInt(this.jTextFieldNuevosOcupantes.getText());
                }else{
                    JOptionPane.showMessageDialog(this, "No es posible dejar la habitacion vacia!!");
                    throw new SQLException();
                }
            }else{
                ocupantes=this.conn.rs.getInt(5);
            }
            int costo=this.conn.rs.getInt(8);
            //  Vamos a actualziar la informacion en base a los nuevos datos obtenidos por el numero de la habitacion
            String parte1 = "UPDATE huespedes SET nombre =('"+nombre+"'), ciudad =('"+ciudadOrigen+"'), habitacion =('"+this.numHab+"'), tipohab =('"+this.tipoHab+"'), personas =('"+ocupantes;
            String parte2 = "'), fechaingreso =('"+fechaIn+"'), fechasalida =('"+fechaOut+"'), costo=('"+costo+"') WHERE habitacion = ('"+this.numHab+"')";
            String query=parte1+parte2;
            int aux=this.conn.Update(query);
            if(aux>0){
                JOptionPane.showMessageDialog(null, "Datos actualizados!!!");
            }else{
            System.out.println("Datos no actualizados!!!");
            }
          }

        } catch (SQLException ex) {
            System.out.println("Error..." + ex.getMessage());
        }


    }//GEN-LAST:event_jLabelIconoGuardarMouseClicked

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
            java.util.logging.Logger.getLogger(ServicioEdicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServicioEdicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServicioEdicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServicioEdicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServicioEdicion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirmarModif;
    private javax.swing.JCheckBox jCheckBoxCiudad;
    private javax.swing.JCheckBox jCheckBoxFechaEntDiasHos;
    private javax.swing.JCheckBox jCheckBoxNombre;
    private javax.swing.JCheckBox jCheckBoxOcupantes;
    private com.toedter.calendar.JDateChooser jDateChooserFechaNueva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelDir;
    private javax.swing.JLabel jLabelFondoDegradado;
    private javax.swing.JLabel jLabelGuardar;
    private javax.swing.JLabel jLabelIconoGrandeUsuario;
    private javax.swing.JLabel jLabelIconoGuardar;
    private javax.swing.JLabel jLabelIconoMenu;
    private javax.swing.JLabel jLabelMenu;
    private javax.swing.JLabel jLabelNomHotel;
    private javax.swing.JLabel jLabelNomUsuario;
    private javax.swing.JLabel jLabelNumHab;
    private javax.swing.JLabel jLabelSel;
    private javax.swing.JLabel jLabelTipoHab;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanelBarraLateral;
    private javax.swing.JPanel jPanelEdicionReg;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextFieldNuevaCiudad;
    private javax.swing.JTextField jTextFieldNuevoNombre;
    private javax.swing.JTextField jTextFieldNuevosDias;
    private javax.swing.JTextField jTextFieldNuevosOcupantes;
    private javax.swing.JTextField jTextFieldNumHab;
    private javax.swing.JToggleButton jToggleButtonBuscaHab;
    // End of variables declaration//GEN-END:variables

    public void cargarIconos() {
        //Obtener los recursos en una ImageIcon
        ImageIcon fondoDegradado = new ImageIcon("src/imagenes/fondo.jpg");
        ImageIcon iconoUsuarioGrande = new ImageIcon("src/iconos/user.png");
        ImageIcon iconoGuardar = new ImageIcon("src/iconos/diskette.png");
        ImageIcon iconoMenu = new ImageIcon("src/iconos/menu_1.png");
        
        //**Iconos del personal
            ImageIcon adrian=new ImageIcon("src/iconos/adrian.png");
            ImageIcon alex=new ImageIcon("src/iconos/alex.png");
            ImageIcon cesar=new ImageIcon("src/iconos/cesar.png");
            ImageIcon jesus=new ImageIcon("src/iconos/jesus.png");
        
        //****
        
        //Cargar las imagenes en las label
        this.jLabelFondoDegradado.setIcon(fondoDegradado);
        this.jLabelIconoGrandeUsuario.setIcon(iconoUsuarioGrande);
        this.jLabelIconoGuardar.setIcon(iconoGuardar);
        this.jLabelIconoMenu.setIcon(iconoMenu);
        
        //Establecemos el icono del usuario dependiendo de quein haya iniciado sesion
        this.jLabelNomUsuario.setText(this.usuario);
        if(this.usuario.equals("Adrian")){
            this.jLabelIconoGrandeUsuario.setIcon(adrian);
        }else if(this.usuario.equals("Alejandro")){
            this.jLabelIconoGrandeUsuario.setIcon(alex);
        }else if(this.usuario.equals("Cesar")){
            this.jLabelIconoGrandeUsuario.setIcon(cesar);
        }else if(this.usuario.equals("Jesus")){
            this.jLabelIconoGrandeUsuario.setIcon(jesus);
        }

    }

    public void elementosOcultos() {
        //Deshabilitamos opciones que no pueden ser usadas desde un principio
        this.jButtonConfirmarModif.setEnabled(false);
        this.jTextFieldNuevaCiudad.setEditable(false);
        this.jTextFieldNuevoNombre.setEditable(false);
        this.jTextFieldNuevosDias.setEditable(false);
        this.jTextFieldNuevosOcupantes.setEditable(false);
        this.jDateChooserFechaNueva.setEnabled(false);
        this.jLabelIconoGuardar.setEnabled(false);
    }

}
