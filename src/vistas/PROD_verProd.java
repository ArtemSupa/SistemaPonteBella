/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.Metodos;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.Producto;

/**
 *
 * @author ArtemSupa
 */
public class PROD_verProd extends javax.swing.JFrame {
private TableRowSorter trsfiltro;
    /**
     * Creates new form PROD_verProd
     */
    public PROD_verProd() {
        initComponents();
        LlenaGrilla();
    }
 int x,y;
 
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
        Nombrecolumna.add("Id");
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
        
        
          
        
        Iterator<Producto> intProducto = listProducto.iterator();
        while(intProducto.hasNext()){
            
            Producto elemento=intProducto.next();
            
            Object[] vi = new Object[]{elemento.getCodigoProd(),elemento.getNombreProd(),elemento.getValorCompraProd(),elemento.getValorVentaProd(),elemento.getStockProd(),elemento.getEstadoProd()};
            modeloLista.addRow(vi);
            
        }    
        
        this.tbl_grillaProd.setModel(modeloLista);
    
    
    
    }     

public void filtro() {
        trsfiltro.setRowFilter(RowFilter.regexFilter("(?i)"+txt_filtronomprod.getText(), 1));
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
        tbl_grillaProd = new RSMaterialComponent.RSTableMetroCustom();
        txt_filtronomprod = new RSMaterialComponent.RSTextFieldIconTwo();
        lbl_imagen = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_nombreprod = new javax.swing.JLabel();
        lbl_stock = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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

        rSPanelMaterial1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 620, -1));

        txt_filtronomprod.setBackground(new java.awt.Color(255, 204, 204));
        txt_filtronomprod.setForeground(new java.awt.Color(0, 0, 0));
        txt_filtronomprod.setBorderColor(new java.awt.Color(0, 0, 0));
        txt_filtronomprod.setColorIcon(new java.awt.Color(255, 255, 255));
        txt_filtronomprod.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        txt_filtronomprod.setPlaceholder("Nombre de producto");
        txt_filtronomprod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_filtronomprodKeyTyped(evt);
            }
        });
        rSPanelMaterial1.add(txt_filtronomprod, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 320, -1));

        lbl_imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_imagen.setText("Foto");
        lbl_imagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rSPanelMaterial1.add(lbl_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 640, 440));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nombre del producto");
        rSPanelMaterial1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, -1, -1));

        lbl_nombreprod.setBackground(new java.awt.Color(207, 138, 138));
        lbl_nombreprod.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_nombreprod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_nombreprod.setOpaque(true);
        rSPanelMaterial1.add(lbl_nombreprod, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 430, 40));

        lbl_stock.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl_stock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_stock.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        rSPanelMaterial1.add(lbl_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 30, 90, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Stock");
        rSPanelMaterial1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 10, 90, 20));

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
        rSButtonIcon_new1.setText("Atrás");
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
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, 0, 1340, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void rSButtonIconOne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconOne1ActionPerformed
        this.setExtendedState(1);
    }//GEN-LAST:event_rSButtonIconOne1ActionPerformed

    private void rSButtonIconOne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconOne2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_rSButtonIconOne2ActionPerformed

    private void rSButtonIcon_new1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIcon_new1ActionPerformed
        MenuProductosF menprof = new MenuProductosF();
        menprof.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_rSButtonIcon_new1ActionPerformed

    private void tbl_grillaProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_grillaProdMouseClicked
        int seleccionar= tbl_grillaProd.rowAtPoint(evt.getPoint());

        lbl_stock.setText(String.valueOf(tbl_grillaProd.getValueAt(seleccionar, 4)));
        lbl_nombreprod.setText(String.valueOf(tbl_grillaProd.getValueAt(seleccionar, 1)));

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
            String ValorId = "";
            Metodos met = new Metodos();
            ValorId = String.valueOf(tbl_grillaProd.getValueAt(seleccionar,0));
            String ruta = "";
        
        try {            
        ruta = met.VerImagenProducto(ValorId);
        if(ruta == "" || ruta.equals("null")){
            lbl_imagen.setIcon(null);
            lbl_imagen.setText("Sin Foto en los registos");
            
        }else{
            File dir = new File(ruta);
            
            ImageIcon icono = new ImageIcon(dir.toString());
            Icon iconoL = new ImageIcon(icono.getImage().getScaledInstance(lbl_imagen.getWidth(),lbl_imagen.getHeight(),Image.SCALE_DEFAULT));
            lbl_imagen.setText(null);
            lbl_imagen.setIcon(iconoL);
           
            
            
        }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,ex+ " Error al ingresar registro de producto");
        }   
            
            
            
            
       
           
            
            
    }//GEN-LAST:event_tbl_grillaProdMouseClicked

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
            java.util.logging.Logger.getLogger(PROD_verProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PROD_verProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PROD_verProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PROD_verProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PROD_verProd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_imagen;
    private javax.swing.JLabel lbl_nombreprod;
    private javax.swing.JLabel lbl_stock;
    private RSMaterialComponent.RSButtonIconOne rSButtonIconOne1;
    private RSMaterialComponent.RSButtonIconOne rSButtonIconOne2;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new1;
    private RSMaterialComponent.RSPanelMaterial rSPanelMaterial1;
    private RSMaterialComponent.RSTableMetroCustom tbl_grillaProd;
    private RSMaterialComponent.RSTextFieldIconTwo txt_filtronomprod;
    // End of variables declaration//GEN-END:variables
}
