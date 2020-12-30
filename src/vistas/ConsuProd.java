/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.Metodos;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.Producto;

/**
 *
 * @author ArtemSupa
 */
public class ConsuProd extends javax.swing.JPanel {

    private TableRowSorter trsfiltro;

    /**
     * Creates new form MenuProd
     */
    public ConsuProd() {
        initComponents();
    }
    
    public int CambiaInt(String Valor ){
        int res = 0;

        try{

            res=Integer.parseInt(Valor);

        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());   
            return 0;
        }
        return res; 
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
        Nombrecolumna.add("Nombre");
        Nombrecolumna.add("Valor compra");
        Nombrecolumna.add("Valor venta");
        Nombrecolumna.add("Stock");
        Nombrecolumna.add("Estado");
        for (Object column :Nombrecolumna){
            modeloLista.addColumn(column);
        }
        this.tbl_grillaProd.setModel(modeloLista);


        
        Metodos met = new Metodos();
        ArrayList<Producto> listProducto = new ArrayList<Producto>();
        
        listProducto = met.ListarDatosProducto();
        
        
        if(txt_filtronomprod.getText().equals("")){
         
        }else{
            
            if(listProducto.size()<=0){
                JOptionPane.showMessageDialog(null, "Nombre de producto no existe en nuestros registros");
                txt_filtronomprod.setText("");
                txt_filtronomprod.requestFocus();
            }
        }    
        
        Iterator<Producto> intProducto = listProducto.iterator();
        while(intProducto.hasNext()){
            
            Producto elemento=intProducto.next();
            
            Object[] vi = new Object[]{elemento.getNombreProd(),elemento.getValorCompraProd(),elemento.getValorVentaProd(),elemento.getStockProd(),elemento.getEstadoProd()};
            modeloLista.addRow(vi);
            
        }    
        
        this.tbl_grillaProd.setModel(modeloLista);
    
    
    
    }
    
    public void filtro() {
        trsfiltro.setRowFilter(RowFilter.regexFilter("(?i)"+txt_filtronomprod.getText(), 0));
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
        txt_filtronomprod = new RSMaterialComponent.RSTextFieldIconTwo();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_grillaProd = new RSMaterialComponent.RSTableMetroCustom();
        jLabel1 = new javax.swing.JLabel();
        rSButtonMaterialIconOne1 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSPanelMaterial3 = new RSMaterialComponent.RSPanelMaterial();
        lbl_nombreProd = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_stock = new javax.swing.JLabel();
        rSLabelTextIcon1 = new RSMaterialComponent.RSLabelTextIcon();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelMaterial1.setBackground(new java.awt.Color(255, 204, 204));
        rSPanelMaterial1.setShadowBottom(false);
        rSPanelMaterial1.setShadowLeft(false);
        rSPanelMaterial1.setShadowRight(false);
        rSPanelMaterial1.setShadowTop(false);

        txt_filtronomprod.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        txt_filtronomprod.setPlaceholder("Nombre de producto");
        txt_filtronomprod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_filtronomprodKeyTyped(evt);
            }
        });

        tbl_grillaProd.setForeground(new java.awt.Color(255, 204, 204));
        tbl_grillaProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_grillaProd.setBackgoundHead(new java.awt.Color(255, 153, 153));
        tbl_grillaProd.setBackgoundHover(new java.awt.Color(255, 102, 102));
        tbl_grillaProd.setColorBorderHead(new java.awt.Color(255, 204, 204));
        tbl_grillaProd.setColorBorderRows(new java.awt.Color(255, 204, 204));
        tbl_grillaProd.setColorPrimary(new java.awt.Color(255, 102, 102));
        tbl_grillaProd.setColorPrimaryText(new java.awt.Color(255, 255, 255));
        tbl_grillaProd.setColorSecondary(new java.awt.Color(255, 153, 102));
        tbl_grillaProd.setColorSecundaryText(new java.awt.Color(255, 255, 255));
        tbl_grillaProd.setGridColor(new java.awt.Color(255, 204, 204));
        tbl_grillaProd.setSelectionBackground(new java.awt.Color(0, 255, 204));
        tbl_grillaProd.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tbl_grillaProd.setShowHorizontalLines(true);
        tbl_grillaProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_grillaProdMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_grillaProd);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Foto");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rSButtonMaterialIconOne1.setText("Buscar");
        rSButtonMaterialIconOne1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        rSButtonMaterialIconOne1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne1ActionPerformed(evt);
            }
        });

        rSPanelMaterial3.setBackground(new java.awt.Color(229, 125, 125));
        rSPanelMaterial3.setShadowBottom(false);
        rSPanelMaterial3.setShadowLeft(false);
        rSPanelMaterial3.setShadowRight(false);
        rSPanelMaterial3.setShadowTop(false);

        lbl_nombreProd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_nombreProd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout rSPanelMaterial3Layout = new javax.swing.GroupLayout(rSPanelMaterial3);
        rSPanelMaterial3.setLayout(rSPanelMaterial3Layout);
        rSPanelMaterial3Layout.setHorizontalGroup(
            rSPanelMaterial3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_nombreProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        rSPanelMaterial3Layout.setVerticalGroup(
            rSPanelMaterial3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_nombreProd, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nombre del producto");

        lbl_stock.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl_stock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        rSLabelTextIcon1.setForeground(new java.awt.Color(255, 255, 255));
        rSLabelTextIcon1.setText("Stock");
        rSLabelTextIcon1.setIconTextGap(3);
        rSLabelTextIcon1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.KITCHEN);

        javax.swing.GroupLayout rSPanelMaterial1Layout = new javax.swing.GroupLayout(rSPanelMaterial1);
        rSPanelMaterial1.setLayout(rSPanelMaterial1Layout);
        rSPanelMaterial1Layout.setHorizontalGroup(
            rSPanelMaterial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelMaterial1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(rSPanelMaterial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelMaterial1Layout.createSequentialGroup()
                        .addComponent(txt_filtronomprod, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rSButtonMaterialIconOne1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(rSPanelMaterial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(rSPanelMaterial1Layout.createSequentialGroup()
                        .addGroup(rSPanelMaterial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rSPanelMaterial1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(rSPanelMaterial3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(rSPanelMaterial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rSLabelTextIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(lbl_stock, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        rSPanelMaterial1Layout.setVerticalGroup(
            rSPanelMaterial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelMaterial1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(rSPanelMaterial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(rSPanelMaterial1Layout.createSequentialGroup()
                        .addGroup(rSPanelMaterial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_filtronomprod, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSButtonMaterialIconOne1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rSPanelMaterial1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(rSPanelMaterial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rSPanelMaterial3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSLabelTextIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        add(rSPanelMaterial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonMaterialIconOne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne1ActionPerformed
        LlenaGrilla();
    }//GEN-LAST:event_rSButtonMaterialIconOne1ActionPerformed

    private void txt_filtronomprodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtronomprodKeyTyped
        
        txt_filtronomprod.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String cadena = (txt_filtronomprod.getText());
                txt_filtronomprod.setText(cadena);
                repaint();
                filtro();
            }
        });
        
        trsfiltro = new TableRowSorter(tbl_grillaProd.getModel());
        tbl_grillaProd.setRowSorter(trsfiltro);

    }//GEN-LAST:event_txt_filtronomprodKeyTyped

    private void tbl_grillaProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_grillaProdMouseClicked
       int seleccionar= tbl_grillaProd.rowAtPoint(evt.getPoint());
       
       lbl_stock.setText(String.valueOf(tbl_grillaProd.getValueAt(seleccionar, 3)));
       lbl_nombreProd.setText(String.valueOf(tbl_grillaProd.getValueAt(seleccionar, 0)));
       
 
       if(CambiaInt(lbl_stock.getText())==0){
           this.lbl_stock.setOpaque(true);
           lbl_stock.setBackground(Color.RED.brighter());
       }
       if(CambiaInt(lbl_stock.getText())>0 && CambiaInt(lbl_stock.getText())<=4){
           this.lbl_stock.setOpaque(true);
           lbl_stock.setBackground(new Color(254, 93, 10));
       }
       if(CambiaInt(lbl_stock.getText())>4){
           this.lbl_stock.setOpaque(true);
           lbl_stock.setBackground(Color.green.darker());
       }
        
       
    }//GEN-LAST:event_tbl_grillaProdMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_nombreProd;
    private javax.swing.JLabel lbl_stock;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne1;
    private RSMaterialComponent.RSLabelTextIcon rSLabelTextIcon1;
    private RSMaterialComponent.RSPanelMaterial rSPanelMaterial1;
    private RSMaterialComponent.RSPanelMaterial rSPanelMaterial3;
    private RSMaterialComponent.RSTableMetroCustom tbl_grillaProd;
    private RSMaterialComponent.RSTextFieldIconTwo txt_filtronomprod;
    // End of variables declaration//GEN-END:variables
}
