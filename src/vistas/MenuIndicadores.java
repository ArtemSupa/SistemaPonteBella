/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.Metodos;
import java.text.DecimalFormat;

/**
 *
 * @author ArtemSupa
 */
public class MenuIndicadores extends javax.swing.JFrame {

    /**
     * Creates new form VENT_ingVent
     */
    
    int x,y;
    public MenuIndicadores() {
        initComponents();
        Metodos met = new Metodos();
        int inversion = met.TraerInversion();
        int totalVendido = met.TraerVentas();
        int ganancias = totalVendido-inversion;
        
        DecimalFormat formatearApesos = new DecimalFormat("###,###.###");
        lbl_invertido.setText("$"+formatearApesos.format(inversion));
        lbl_totalVenta.setText("$"+formatearApesos.format(totalVendido));
        lbl_ganancia.setText("$"+formatearApesos.format(ganancias));
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
        rSPanelMaterial2 = new RSMaterialComponent.RSPanelMaterial();
        jLabel3 = new javax.swing.JLabel();
        lbl_invertido = new javax.swing.JLabel();
        rSPanelMaterial3 = new RSMaterialComponent.RSPanelMaterial();
        lbl_totalVenta = new javax.swing.JLabel();
        lblblblbl1 = new javax.swing.JLabel();
        rSPanelMaterial4 = new RSMaterialComponent.RSPanelMaterial();
        lbl_ganancia = new javax.swing.JLabel();
        lblblblbl = new javax.swing.JLabel();
        rSPanelMaterial5 = new RSMaterialComponent.RSPanelMaterial();
        rSButtonIcon_new1 = new newscomponents.RSButtonIcon_new();
        rSButtonIconOne1 = new RSMaterialComponent.RSButtonIconOne();
        rSButtonIconOne2 = new RSMaterialComponent.RSButtonIconOne();
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

        rSPanelMaterial2.setBackground(new java.awt.Color(227, 166, 248));
        rSPanelMaterial2.setRound(50);
        rSPanelMaterial2.setShadowBottom(false);
        rSPanelMaterial2.setShadowLeft(false);
        rSPanelMaterial2.setShadowRight(false);
        rSPanelMaterial2.setShadowTop(false);

        jLabel3.setFont(new java.awt.Font("Lucida Fax", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Invertido");

        lbl_invertido.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_invertido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout rSPanelMaterial2Layout = new javax.swing.GroupLayout(rSPanelMaterial2);
        rSPanelMaterial2.setLayout(rSPanelMaterial2Layout);
        rSPanelMaterial2Layout.setHorizontalGroup(
            rSPanelMaterial2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelMaterial2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelMaterial2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_invertido, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        rSPanelMaterial2Layout.setVerticalGroup(
            rSPanelMaterial2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelMaterial2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_invertido, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
        );

        rSPanelMaterial1.add(rSPanelMaterial2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 270, 140));

        rSPanelMaterial3.setBackground(new java.awt.Color(227, 166, 248));
        rSPanelMaterial3.setRound(50);
        rSPanelMaterial3.setShadowBottom(false);
        rSPanelMaterial3.setShadowLeft(false);
        rSPanelMaterial3.setShadowRight(false);
        rSPanelMaterial3.setShadowTop(false);

        lbl_totalVenta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_totalVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblblblbl1.setFont(new java.awt.Font("Lucida Fax", 0, 24)); // NOI18N
        lblblblbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblblblbl1.setText("Total Ventas");

        javax.swing.GroupLayout rSPanelMaterial3Layout = new javax.swing.GroupLayout(rSPanelMaterial3);
        rSPanelMaterial3.setLayout(rSPanelMaterial3Layout);
        rSPanelMaterial3Layout.setHorizontalGroup(
            rSPanelMaterial3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelMaterial3Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(lbl_totalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(rSPanelMaterial3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblblblbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        rSPanelMaterial3Layout.setVerticalGroup(
            rSPanelMaterial3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelMaterial3Layout.createSequentialGroup()
                .addComponent(lblblblbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_totalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        rSPanelMaterial1.add(rSPanelMaterial3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 270, 140));

        rSPanelMaterial4.setBackground(new java.awt.Color(227, 166, 248));
        rSPanelMaterial4.setRound(50);
        rSPanelMaterial4.setShadowBottom(false);
        rSPanelMaterial4.setShadowLeft(false);
        rSPanelMaterial4.setShadowRight(false);
        rSPanelMaterial4.setShadowTop(false);

        lbl_ganancia.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_ganancia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblblblbl.setFont(new java.awt.Font("Lucida Fax", 0, 24)); // NOI18N
        lblblblbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblblblbl.setText("Ganancias");

        javax.swing.GroupLayout rSPanelMaterial4Layout = new javax.swing.GroupLayout(rSPanelMaterial4);
        rSPanelMaterial4.setLayout(rSPanelMaterial4Layout);
        rSPanelMaterial4Layout.setHorizontalGroup(
            rSPanelMaterial4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelMaterial4Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(lbl_ganancia, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
            .addComponent(lblblblbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        rSPanelMaterial4Layout.setVerticalGroup(
            rSPanelMaterial4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelMaterial4Layout.createSequentialGroup()
                .addComponent(lblblblbl, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_ganancia, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        rSPanelMaterial1.add(rSPanelMaterial4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 270, 140));

        rSPanelMaterial5.setBackground(new java.awt.Color(227, 166, 248));
        rSPanelMaterial5.setRound(50);
        rSPanelMaterial5.setShadowBottom(false);
        rSPanelMaterial5.setShadowLeft(false);
        rSPanelMaterial5.setShadowRight(false);
        rSPanelMaterial5.setShadowTop(false);

        javax.swing.GroupLayout rSPanelMaterial5Layout = new javax.swing.GroupLayout(rSPanelMaterial5);
        rSPanelMaterial5.setLayout(rSPanelMaterial5Layout);
        rSPanelMaterial5Layout.setHorizontalGroup(
            rSPanelMaterial5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        rSPanelMaterial5Layout.setVerticalGroup(
            rSPanelMaterial5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        rSPanelMaterial1.add(rSPanelMaterial5, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 10, 270, 140));

        getContentPane().add(rSPanelMaterial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1330, 550));

        rSButtonIcon_new1.setBackground(new java.awt.Color(255, 204, 204));
        rSButtonIcon_new1.setText("Menu");
        rSButtonIcon_new1.setBackgroundHover(new java.awt.Color(201, 162, 162));
        rSButtonIcon_new1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.KEYBOARD_ARROW_LEFT);
        rSButtonIcon_new1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIcon_new1ActionPerformed(evt);
            }
        });
        getContentPane().add(rSButtonIcon_new1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, -1));

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

    private void rSButtonIcon_new1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIcon_new1ActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_rSButtonIcon_new1ActionPerformed

    private void rSButtonIconOne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconOne1ActionPerformed
        this.setExtendedState(1);
    }//GEN-LAST:event_rSButtonIconOne1ActionPerformed

    private void rSButtonIconOne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconOne2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_rSButtonIconOne2ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuIndicadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuIndicadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuIndicadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuIndicadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuIndicadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl_ganancia;
    private javax.swing.JLabel lbl_invertido;
    private javax.swing.JLabel lbl_totalVenta;
    private javax.swing.JLabel lblblblbl;
    private javax.swing.JLabel lblblblbl1;
    private RSMaterialComponent.RSButtonIconOne rSButtonIconOne1;
    private RSMaterialComponent.RSButtonIconOne rSButtonIconOne2;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new1;
    private RSMaterialComponent.RSPanelMaterial rSPanelMaterial1;
    private RSMaterialComponent.RSPanelMaterial rSPanelMaterial2;
    private RSMaterialComponent.RSPanelMaterial rSPanelMaterial3;
    private RSMaterialComponent.RSPanelMaterial rSPanelMaterial4;
    private RSMaterialComponent.RSPanelMaterial rSPanelMaterial5;
    // End of variables declaration//GEN-END:variables
}
