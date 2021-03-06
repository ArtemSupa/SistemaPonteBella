/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.Metodos;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import modelo.IngresoMercaderia;
import modelo.IngresoMercaderiaDetalle;
import modelo.Producto;
import modelo.VentaMercaderia;
import modelo.VentaMercaderiaDetalle;

/**
 *
 * @author ArtemSupa
 */
public class VENT_histVent extends javax.swing.JFrame {

    /**
     * Creates new form COMP_histComp
     */
    public VENT_histVent() {
        initComponents();
        LlenaGrilla();
    }
    
    
    public void LlenaGrilla(){
    
    DefaultTableModel modeloLista = new DefaultTableModel()
        {
            @Override
            public boolean isCellEditable(int row, int col)
            {
                return false;
            }
        };
      
        ArrayList<Object> Nombrecolumna = new ArrayList<Object>();
        Nombrecolumna.add("Id");
        Nombrecolumna.add("Fecha");
        Nombrecolumna.add("Total");
        Nombrecolumna.add("Estado");
        Nombrecolumna.add("Descuento");
        for (Object column :Nombrecolumna){
            modeloLista.addColumn(column);
        }
        this.tbl_historial.setModel(modeloLista);


        
        Metodos met = new Metodos();
        ArrayList<VentaMercaderia> listVenta = new ArrayList<VentaMercaderia>();
        
        //listProducto = met.ListarDatosProductocompletoconCondicion();
        listVenta = met.ListarHistorialVentacompleto();
        
        
        
        IngresoMercaderia ingreso = new IngresoMercaderia();
        Iterator<VentaMercaderia> intIngreso = listVenta.iterator();
        while(intIngreso.hasNext()){
            
            VentaMercaderia elemento=intIngreso.next();
            
            
            Object[] vi = new Object[]{elemento.getId(),elemento.getIngrFecha(),elemento.getIngrTotal(),elemento.getIngrEstado(),elemento.getIngrDescuento()};
            
            modeloLista.addRow(vi);
            
        }    
        
        this.tbl_historial.setModel(modeloLista);
    
    
    
    } 
    
    public void LlenaGrillaDetalle(String id){
    
    DefaultTableModel modeloLista = new DefaultTableModel()
        {
            @Override
            public boolean isCellEditable(int row, int col)
            {
                return false;
            }
        };
      
        ArrayList<Object> Nombrecolumna = new ArrayList<Object>();
        Nombrecolumna.add("Id");
        Nombrecolumna.add("Cantidad");
        Nombrecolumna.add("Precio");
        Nombrecolumna.add("Codigo del producto");
        for (Object column :Nombrecolumna){
            modeloLista.addColumn(column);
        }
        this.tbl_detallehistorial.setModel(modeloLista);

        
        
        Metodos met = new Metodos();
        ArrayList<VentaMercaderiaDetalle> listDetVenta = new ArrayList<VentaMercaderiaDetalle>();
        
        
        listDetVenta = met.ListarHistorialVentaDetcompleto(id);
        
        
        
        VentaMercaderiaDetalle Detingreso = new VentaMercaderiaDetalle();
        Iterator<VentaMercaderiaDetalle> intIngreso = listDetVenta.iterator();
        while(intIngreso.hasNext()){
            
            VentaMercaderiaDetalle elemento=intIngreso.next();
            
            
            Object[] vi = new Object[]{elemento.getIdDetalleVenta(),elemento.getDetaCantidad(),elemento.getDetaPrecio(),elemento.getProdCodigo()};
            
            modeloLista.addRow(vi);
            
        }    
        
        this.tbl_detallehistorial.setModel(modeloLista);
    
    
    
    } 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelMaterial1 = new RSMaterialComponent.RSPanelMaterial();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_historial = new RSMaterialComponent.RSTableMetroCustom();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_detallehistorial = new RSMaterialComponent.RSTableMetroCustom();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rSButtonIconOne1 = new RSMaterialComponent.RSButtonIconOne();
        rSButtonIconOne2 = new RSMaterialComponent.RSButtonIconOne();
        rSButtonIcon_new1 = new newscomponents.RSButtonIcon_new();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelMaterial1.setBackground(new java.awt.Color(255, 204, 204));
        rSPanelMaterial1.setShadowBottom(false);
        rSPanelMaterial1.setShadowLeft(false);
        rSPanelMaterial1.setShadowRight(false);
        rSPanelMaterial1.setShadowTop(false);
        rSPanelMaterial1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_historial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_historial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_historialMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_historial);

        rSPanelMaterial1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 1270, 180));

        tbl_detallehistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbl_detallehistorial);

        rSPanelMaterial1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 1270, 180));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Venta");
        rSPanelMaterial1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 250, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Detalle de la venta");
        rSPanelMaterial1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 284, 250, 30));

        getContentPane().add(rSPanelMaterial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1330, 550));

        rSButtonIconOne1.setBackground(new java.awt.Color(255, 204, 204));
        rSButtonIconOne1.setForeground(new java.awt.Color(0, 0, 0));
        rSButtonIconOne1.setBackgroundHover(new java.awt.Color(0, 0, 0));
        rSButtonIconOne1.setForegroundText(new java.awt.Color(0, 0, 0));
        rSButtonIconOne1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.REMOVE);
        rSButtonIconOne1.setSizeIcon(20.0F);
        rSButtonIconOne1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconOne1ActionPerformed(evt);
            }
        });
        getContentPane().add(rSButtonIconOne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, 27, 24));

        rSButtonIconOne2.setBackground(new java.awt.Color(255, 204, 204));
        rSButtonIconOne2.setForeground(new java.awt.Color(0, 0, 0));
        rSButtonIconOne2.setBackgroundHover(new java.awt.Color(0, 0, 0));
        rSButtonIconOne2.setForegroundText(new java.awt.Color(0, 0, 0));
        rSButtonIconOne2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLOSE);
        rSButtonIconOne2.setSizeIcon(20.0F);
        rSButtonIconOne2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconOne2ActionPerformed(evt);
            }
        });
        getContentPane().add(rSButtonIconOne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 0, 27, 24));

        rSButtonIcon_new1.setBackground(new java.awt.Color(255, 204, 204));
        rSButtonIcon_new1.setText("Atras");
        rSButtonIcon_new1.setBackgroundHover(new java.awt.Color(201, 162, 162));
        rSButtonIcon_new1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.KEYBOARD_ARROW_LEFT);
        rSButtonIcon_new1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIcon_new1ActionPerformed(evt);
            }
        });
        getContentPane().add(rSButtonIcon_new1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, -1));

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setOpaque(true);
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonIconOne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconOne1ActionPerformed
        this.setExtendedState(1);
    }//GEN-LAST:event_rSButtonIconOne1ActionPerformed

    private void rSButtonIconOne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconOne2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_rSButtonIconOne2ActionPerformed

    private void rSButtonIcon_new1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIcon_new1ActionPerformed
        MenuVentas m = new MenuVentas();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_rSButtonIcon_new1ActionPerformed

    private void tbl_historialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_historialMouseClicked
        int seleccionar= tbl_historial.rowAtPoint(evt.getPoint());
        
        String id = String.valueOf(tbl_historial.getValueAt(seleccionar,0));
        LlenaGrillaDetalle(id);
    }//GEN-LAST:event_tbl_historialMouseClicked
int x,y;
    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jLabel1MouseDragged

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
            java.util.logging.Logger.getLogger(VENT_histVent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VENT_histVent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VENT_histVent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VENT_histVent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VENT_histVent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private RSMaterialComponent.RSButtonIconOne rSButtonIconOne1;
    private RSMaterialComponent.RSButtonIconOne rSButtonIconOne2;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new1;
    private RSMaterialComponent.RSPanelMaterial rSPanelMaterial1;
    private RSMaterialComponent.RSTableMetroCustom tbl_detallehistorial;
    private RSMaterialComponent.RSTableMetroCustom tbl_historial;
    // End of variables declaration//GEN-END:variables
}
