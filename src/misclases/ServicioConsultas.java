/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misclases;

import framesconsultas.FrameConsultaPrecios;
import framesconsultas.FrameTotalHabitaciones;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Adrian Quinn
 */
public class ServicioConsultas extends javax.swing.JFrame {

    /**
     * Creates new form ServicioConsultas
     */
    public ServicioConsultas() {
        initComponents();
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

        jDesktopPane2 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuConsultas = new javax.swing.JMenu();
        jMenuSubHotel = new javax.swing.JMenu();
        jMenuItemGaleriaFotos = new javax.swing.JMenuItem();
        jMenuItemIngresosHotel = new javax.swing.JMenuItem();
        jMenuItemPorcentajeOcu = new javax.swing.JMenuItem();
        jMenuSubHabitaciones = new javax.swing.JMenu();
        jMenuItemTotalHab = new javax.swing.JMenuItem();
        jMenuItemPorcOcupacion = new javax.swing.JMenuItem();
        jMenuItemCostoHabitacion = new javax.swing.JMenuItem();
        jMenuItemHabPiso = new javax.swing.JMenuItem();
        jMenuSubBusqueda = new javax.swing.JMenu();
        jMenuItemBusNombreHusped = new javax.swing.JMenuItem();
        jMenuItemBusHabitacion = new javax.swing.JMenuItem();
        jMenuItemListaHuespedes = new javax.swing.JMenuItem();
        jMenuOpciones = new javax.swing.JMenu();
        jMenuItemSubVolverMenu = new javax.swing.JMenuItem();
        jMenuItemMenuSubSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1018, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
        );

        jMenuConsultas.setText("Consultas");

        jMenuSubHotel.setText("Hotel");

        jMenuItemGaleriaFotos.setText("Galeria de fotos");
        jMenuSubHotel.add(jMenuItemGaleriaFotos);

        jMenuItemIngresosHotel.setText("Ingresos del hotel");
        jMenuSubHotel.add(jMenuItemIngresosHotel);

        jMenuItemPorcentajeOcu.setText("Porcentaje de ocupacion ");
        jMenuSubHotel.add(jMenuItemPorcentajeOcu);

        jMenuConsultas.add(jMenuSubHotel);

        jMenuSubHabitaciones.setText("Habitaciones");

        jMenuItemTotalHab.setText("Total de habitaciones");
        jMenuItemTotalHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTotalHabActionPerformed(evt);
            }
        });
        jMenuSubHabitaciones.add(jMenuItemTotalHab);

        jMenuItemPorcOcupacion.setText("Porcentaje de ocupacion por tipo habitacion");
        jMenuItemPorcOcupacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPorcOcupacionActionPerformed(evt);
            }
        });
        jMenuSubHabitaciones.add(jMenuItemPorcOcupacion);

        jMenuItemCostoHabitacion.setText("Costo por habitacion");
        jMenuItemCostoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCostoHabitacionActionPerformed(evt);
            }
        });
        jMenuSubHabitaciones.add(jMenuItemCostoHabitacion);

        jMenuItemHabPiso.setText("Habitaciones de piso");
        jMenuSubHabitaciones.add(jMenuItemHabPiso);

        jMenuConsultas.add(jMenuSubHabitaciones);

        jMenuSubBusqueda.setText("Busquedas");

        jMenuItemBusNombreHusped.setText("Busqueda por nombre huesped");
        jMenuSubBusqueda.add(jMenuItemBusNombreHusped);

        jMenuItemBusHabitacion.setText("Busqueda por habitacion");
        jMenuSubBusqueda.add(jMenuItemBusHabitacion);

        jMenuConsultas.add(jMenuSubBusqueda);

        jMenuItemListaHuespedes.setText("Lista de huespedes");
        jMenuConsultas.add(jMenuItemListaHuespedes);

        jMenuBar1.add(jMenuConsultas);

        jMenuOpciones.setText("Opciones");

        jMenuItemSubVolverMenu.setText("Menu");
        jMenuOpciones.add(jMenuItemSubVolverMenu);

        jMenuItemMenuSubSalir.setText("Salir");
        jMenuOpciones.add(jMenuItemMenuSubSalir);

        jMenuBar1.add(jMenuOpciones);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemTotalHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTotalHabActionPerformed
        // TODO add your handling code here:
        this.jDesktopPane2.removeAll();
        this.repaint();
        
        FrameTotalHabitaciones totalHabitaciones =new FrameTotalHabitaciones();
        this.jDesktopPane2.add(totalHabitaciones);//Agregamos altas al jDesktopPanel
        try{
            totalHabitaciones.setMaximum(true);
        }catch(PropertyVetoException ex){
            System.out.println("Error en despliegue!!");
        }
        totalHabitaciones.show();//mostrar el jDesktopPanel
    }//GEN-LAST:event_jMenuItemTotalHabActionPerformed

    private void jMenuItemCostoHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCostoHabitacionActionPerformed
        // TODO add your handling code here:
        this.jDesktopPane2.removeAll();
        this.repaint();
        
        FrameConsultaPrecios costoHabitaciones =new FrameConsultaPrecios();
        this.jDesktopPane2.add(costoHabitaciones);//Agregamos altas al jDesktopPanel
        try{
            costoHabitaciones.setMaximum(true);
        }catch(PropertyVetoException ex){
            System.out.println("Error en despliegue!!");
        }
        costoHabitaciones.show();//mostrar el jDesktopPanel
    }//GEN-LAST:event_jMenuItemCostoHabitacionActionPerformed

    private void jMenuItemPorcOcupacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPorcOcupacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemPorcOcupacionActionPerformed

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
            java.util.logging.Logger.getLogger(ServicioConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServicioConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServicioConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServicioConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServicioConsultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuConsultas;
    private javax.swing.JMenuItem jMenuItemBusHabitacion;
    private javax.swing.JMenuItem jMenuItemBusNombreHusped;
    private javax.swing.JMenuItem jMenuItemCostoHabitacion;
    private javax.swing.JMenuItem jMenuItemGaleriaFotos;
    private javax.swing.JMenuItem jMenuItemHabPiso;
    private javax.swing.JMenuItem jMenuItemIngresosHotel;
    private javax.swing.JMenuItem jMenuItemListaHuespedes;
    private javax.swing.JMenuItem jMenuItemMenuSubSalir;
    private javax.swing.JMenuItem jMenuItemPorcOcupacion;
    private javax.swing.JMenuItem jMenuItemPorcentajeOcu;
    private javax.swing.JMenuItem jMenuItemSubVolverMenu;
    private javax.swing.JMenuItem jMenuItemTotalHab;
    private javax.swing.JMenu jMenuOpciones;
    private javax.swing.JMenu jMenuSubBusqueda;
    private javax.swing.JMenu jMenuSubHabitaciones;
    private javax.swing.JMenu jMenuSubHotel;
    // End of variables declaration//GEN-END:variables

    public void cargarIconos(){
        ImageIcon iconoHotel=new ImageIcon("src/iconos/hotel.png");
        ImageIcon iconoLupa=new ImageIcon("src/iconos/loupe.png");
        ImageIcon iconoHabitacion=new ImageIcon("src/iconos/room.png");
        ImageIcon iconoUsuario=new ImageIcon("src/iconos/user_chico.png");
        
        this.jMenuSubHotel.setIcon(iconoHotel);
        this.jMenuSubBusqueda.setIcon(iconoLupa);
        this.jMenuSubHabitaciones.setIcon(iconoHabitacion);
        this.jMenuItemListaHuespedes.setIcon(iconoUsuario);
        
        
        
    }

}
