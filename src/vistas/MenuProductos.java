/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.Metodos;
import rojerusan.RSPanelsSlider;
import static vistas.Productos.cbox_categoria;


/**
 *
 * @author ArtemSupa
 */
public class MenuProductos extends javax.swing.JPanel {

    /**
     * Creates new form MenuProductos
     */
    public MenuProductos() {
        initComponents();
        pnl_ingreProd.setVisible(false);
        pnl_consultarProd.setVisible(false);
        pnl_sliderProd.setPanelSlider(1,cargaMenuProd1 , RSPanelsSlider.DIRECT.RIGHT);
        
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
        btn_consProd = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne3 = new RSMaterialComponent.RSButtonMaterialIconOne();
        btn_ingProd = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSPanelMaterial2 = new RSMaterialComponent.RSPanelMaterial();
        pnl_sliderProd = new rojerusan.RSPanelsSlider();
        cargaMenuProd1 = new vistas.CargaMenuProd();
        pnl_ingreProd = new vistas.Productos();
        pnl_consultarProd = new vistas.ConsuProd();

        setMinimumSize(new java.awt.Dimension(1140, 550));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelMaterial1.setBackground(new java.awt.Color(251, 164, 164));
        rSPanelMaterial1.setShadowBottom(false);
        rSPanelMaterial1.setShadowLeft(false);
        rSPanelMaterial1.setShadowRight(false);
        rSPanelMaterial1.setShadowTop(false);

        btn_consProd.setBackground(new java.awt.Color(251, 119, 119));
        btn_consProd.setText("Consultar");
        btn_consProd.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        btn_consProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consProdActionPerformed(evt);
            }
        });

        rSButtonMaterialIconOne3.setBackground(new java.awt.Color(251, 119, 119));
        rSButtonMaterialIconOne3.setText("????");

        btn_ingProd.setBackground(new java.awt.Color(251, 119, 119));
        btn_ingProd.setText("Ingresar");
        btn_ingProd.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ADD);
        btn_ingProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rSPanelMaterial1Layout = new javax.swing.GroupLayout(rSPanelMaterial1);
        rSPanelMaterial1.setLayout(rSPanelMaterial1Layout);
        rSPanelMaterial1Layout.setHorizontalGroup(
            rSPanelMaterial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_consProd, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
            .addComponent(rSButtonMaterialIconOne3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btn_ingProd, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        rSPanelMaterial1Layout.setVerticalGroup(
            rSPanelMaterial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelMaterial1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btn_ingProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_consProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rSButtonMaterialIconOne3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        add(rSPanelMaterial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 150, 230));

        rSPanelMaterial2.setBackground(new java.awt.Color(255, 204, 204));
        rSPanelMaterial2.setShadowBottom(false);
        rSPanelMaterial2.setShadowLeft(false);
        rSPanelMaterial2.setShadowRight(false);
        rSPanelMaterial2.setShadowTop(false);

        javax.swing.GroupLayout rSPanelMaterial2Layout = new javax.swing.GroupLayout(rSPanelMaterial2);
        rSPanelMaterial2.setLayout(rSPanelMaterial2Layout);
        rSPanelMaterial2Layout.setHorizontalGroup(
            rSPanelMaterial2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        rSPanelMaterial2Layout.setVerticalGroup(
            rSPanelMaterial2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        add(rSPanelMaterial2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 550));

        pnl_sliderProd.setBackground(new java.awt.Color(255, 204, 204));

        cargaMenuProd1.setName("cargaMenuProd1"); // NOI18N

        pnl_ingreProd.setName("pnl_ingreProd"); // NOI18N

        pnl_consultarProd.setName("pnl_consultarProd"); // NOI18N

        javax.swing.GroupLayout pnl_sliderProdLayout = new javax.swing.GroupLayout(pnl_sliderProd);
        pnl_sliderProd.setLayout(pnl_sliderProdLayout);
        pnl_sliderProdLayout.setHorizontalGroup(
            pnl_sliderProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_sliderProdLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_sliderProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cargaMenuProd1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_ingreProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_consultarProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pnl_sliderProdLayout.setVerticalGroup(
            pnl_sliderProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cargaMenuProd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnl_ingreProd, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnl_consultarProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        add(pnl_sliderProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 1000, 550));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingProdActionPerformed
         if(!btn_ingProd.isSelected()){
            
            btn_ingProd.setSelected(true);
            btn_consProd.setSelected(false);
            pnl_sliderProd.setPanelSlider(1,pnl_ingreProd , RSPanelsSlider.DIRECT.RIGHT);
            
        }
    }//GEN-LAST:event_btn_ingProdActionPerformed

    private void btn_consProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consProdActionPerformed
        if(!btn_consProd.isSelected()){
            
            btn_ingProd.setSelected(false);
            btn_consProd.setSelected(true);
            pnl_sliderProd.setPanelSlider(1, pnl_consultarProd, RSPanelsSlider.DIRECT.RIGHT);
            
        }
      
    }//GEN-LAST:event_btn_consProdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public RSMaterialComponent.RSButtonMaterialIconOne btn_consProd;
    public RSMaterialComponent.RSButtonMaterialIconOne btn_ingProd;
    public vistas.CargaMenuProd cargaMenuProd1;
    public vistas.ConsuProd pnl_consultarProd;
    public vistas.Productos pnl_ingreProd;
    public rojerusan.RSPanelsSlider pnl_sliderProd;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne3;
    private RSMaterialComponent.RSPanelMaterial rSPanelMaterial1;
    private RSMaterialComponent.RSPanelMaterial rSPanelMaterial2;
    // End of variables declaration//GEN-END:variables
}