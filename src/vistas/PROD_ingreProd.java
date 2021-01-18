/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.Metodos;
import java.awt.Image;
import java.io.File;
import java.util.Calendar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelo.Producto;
import static vistas.Productos.cbox_categoria;

/**
 *
 * @author ArtemSupa
 */
public class PROD_ingreProd extends javax.swing.JFrame {

    /**
     * Creates new form PROD_ingreProd
     */
    
int x,y;    
    public PROD_ingreProd() {
        initComponents();
        Metodos met = new Metodos();
        met.ConsultaComboboxCategoria(cbox_categoria);
    }
 private void limpiarCajasDatos(){
    
    txt_nombreProd.setText("");
    txt_valorC.setText("");
    txt_valorV.setText("");
    cbox_categoria.setSelectedIndex(0);
            
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
 
  public boolean validacionProductos(){
        
        if(txt_nombreProd.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe ingresar un nombre de producto");
            txt_nombreProd.requestFocus();
            return false;
        }
        
        if(txt_valorC.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe ingresar un valor de compra");
            txt_valorC.requestFocus();
            return false;
        }else{
            if(CambiaInt(txt_valorC.getText())<0){  
                JOptionPane.showMessageDialog(null,"El valor de compra debe ser mayor o igual a 0");
                txt_valorC.requestFocus();
                return false;
            }
        
        }
        
        if(txt_valorV.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe ingresar un valor de venta");
            txt_valorV.requestFocus();
            return false;
        }else{
            if(CambiaInt(txt_valorV.getText())<0){  
                JOptionPane.showMessageDialog(null,"El valor de venta debe ser mayor o igual a 0");
                txt_valorV.requestFocus();
                return false;
            }
        
        }
        
        if(cbox_categoria.getSelectedItem().equals("Seleccione una categoria")){
            JOptionPane.showMessageDialog(null,"Debe ingresar una categoria de producto");
            cbox_categoria.requestFocus();
            return false;
        }
        
    
    return true;
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
        txt_nombreProd = new RSMaterialComponent.RSTextFieldTwo();
        rSButtonMaterialIconTwo1 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        txt_valorC = new RSMaterialComponent.RSTextFieldTwo();
        txt_valorV = new RSMaterialComponent.RSTextFieldTwo();
        txt_imagen1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbox_categoria = new RSMaterialComponent.RSComboBoxMaterial();
        btn_subirImg = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo2 = new RSMaterialComponent.RSButtonMaterialIconTwo();
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

        txt_nombreProd.setBackground(new java.awt.Color(255, 204, 204));
        txt_nombreProd.setForeground(new java.awt.Color(0, 0, 0));
        txt_nombreProd.setBorderColor(new java.awt.Color(0, 0, 0));
        txt_nombreProd.setPhColor(new java.awt.Color(102, 102, 102));
        txt_nombreProd.setPlaceholder("Nombre de ejemplo");
        txt_nombreProd.setSelectionColor(new java.awt.Color(102, 102, 102));
        txt_nombreProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreProdActionPerformed(evt);
            }
        });
        rSPanelMaterial1.add(txt_nombreProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        rSButtonMaterialIconTwo1.setBackground(new java.awt.Color(255, 153, 204));
        rSButtonMaterialIconTwo1.setText("Cancelar");
        rSButtonMaterialIconTwo1.setBackgroundHover(new java.awt.Color(218, 132, 175));
        rSButtonMaterialIconTwo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rSButtonMaterialIconTwo1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CANCEL);
        rSButtonMaterialIconTwo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo1ActionPerformed(evt);
            }
        });
        rSPanelMaterial1.add(rSButtonMaterialIconTwo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 150, -1));

        txt_valorC.setBackground(new java.awt.Color(255, 204, 204));
        txt_valorC.setForeground(new java.awt.Color(0, 0, 0));
        txt_valorC.setBorderColor(new java.awt.Color(0, 0, 0));
        txt_valorC.setPhColor(new java.awt.Color(102, 102, 102));
        txt_valorC.setPlaceholder("$1000");
        txt_valorC.setSelectionColor(new java.awt.Color(102, 102, 102));
        txt_valorC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_valorCKeyTyped(evt);
            }
        });
        rSPanelMaterial1.add(txt_valorC, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        txt_valorV.setBackground(new java.awt.Color(255, 204, 204));
        txt_valorV.setForeground(new java.awt.Color(0, 0, 0));
        txt_valorV.setBorderColor(new java.awt.Color(0, 0, 0));
        txt_valorV.setPhColor(new java.awt.Color(102, 102, 102));
        txt_valorV.setPlaceholder("$1000");
        txt_valorV.setSelectionColor(new java.awt.Color(102, 102, 102));
        txt_valorV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_valorVKeyTyped(evt);
            }
        });
        rSPanelMaterial1.add(txt_valorV, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        txt_imagen1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_imagen1.setText("Foto");
        txt_imagen1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rSPanelMaterial1.add(txt_imagen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 759, 420));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Categoria");
        rSPanelMaterial1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 140, 42));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nombre de producto");
        rSPanelMaterial1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 140, 42));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Valor de compra");
        rSPanelMaterial1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 140, 42));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Valor de venta");
        rSPanelMaterial1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 140, 42));

        cbox_categoria.setBackground(new java.awt.Color(255, 204, 204));
        cbox_categoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione una categoria" }));
        rSPanelMaterial1.add(cbox_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 240, -1));

        btn_subirImg.setBackground(new java.awt.Color(255, 153, 204));
        btn_subirImg.setText("Subir imagen");
        btn_subirImg.setBackgroundHover(new java.awt.Color(218, 132, 175));
        btn_subirImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_subirImg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_subirImg.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.IMAGE);
        btn_subirImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subirImgActionPerformed(evt);
            }
        });
        rSPanelMaterial1.add(btn_subirImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 470, 380, -1));

        rSButtonMaterialIconTwo2.setBackground(new java.awt.Color(255, 153, 204));
        rSButtonMaterialIconTwo2.setText("Guardar");
        rSButtonMaterialIconTwo2.setBackgroundHover(new java.awt.Color(218, 132, 175));
        rSButtonMaterialIconTwo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rSButtonMaterialIconTwo2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        rSButtonMaterialIconTwo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo2ActionPerformed(evt);
            }
        });
        rSPanelMaterial1.add(rSButtonMaterialIconTwo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 150, -1));

        getContentPane().add(rSPanelMaterial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1330, 560));

        rSButtonIconOne1.setBackground(new java.awt.Color(255, 204, 204));
        rSButtonIconOne1.setBackgroundHover(new java.awt.Color(0, 0, 0));
        rSButtonIconOne1.setForegroundText(new java.awt.Color(0, 0, 0));
        rSButtonIconOne1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.REMOVE);
        rSButtonIconOne1.setSizeIcon(20.0F);
        rSButtonIconOne1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconOne1ActionPerformed(evt);
            }
        });
        getContentPane().add(rSButtonIconOne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 0, -1, 30));

        rSButtonIconOne2.setBackground(new java.awt.Color(255, 204, 204));
        rSButtonIconOne2.setBackgroundHover(new java.awt.Color(0, 0, 0));
        rSButtonIconOne2.setForegroundText(new java.awt.Color(0, 0, 0));
        rSButtonIconOne2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLOSE);
        rSButtonIconOne2.setSizeIcon(20.0F);
        rSButtonIconOne2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconOne2ActionPerformed(evt);
            }
        });
        getContentPane().add(rSButtonIconOne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 0, -1, 30));

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
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreProdActionPerformed
File fichero;
    private void rSButtonMaterialIconTwo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo1ActionPerformed
    
    MenuProductosF menf = new MenuProductosF();
    menf.setVisible(true);
    this.dispose();
       
    }//GEN-LAST:event_rSButtonMaterialIconTwo1ActionPerformed

    private void btn_subirImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_subirImgActionPerformed
             int resultado;
        
        CargarFoto cfoto = new CargarFoto();
        FileNameExtensionFilter filtroimagen = new FileNameExtensionFilter("JPG/PNG","png","jpg");
        cfoto.FileCargarFoto.setFileFilter(filtroimagen);
        resultado = cfoto.FileCargarFoto.showOpenDialog(null);
        if ( JFileChooser.APPROVE_OPTION==resultado){
            fichero = cfoto.FileCargarFoto.getSelectedFile();
            String ficheroConvert = fichero.toString();
            byte[] b = ficheroConvert.getBytes();
            Metodos met = new Metodos();
            Producto objProducto = new Producto();
            objProducto.setImagenProd(b);
            //objProducto.setCodigoProd(idproducto);
            
            try{
                ImageIcon icono = new ImageIcon(fichero.toString());
                Icon iconoL = new ImageIcon(icono.getImage().getScaledInstance(txt_imagen1.getWidth(),txt_imagen1.getHeight(),Image.SCALE_DEFAULT));
                txt_imagen1.setText(null);
                txt_imagen1.setIcon(iconoL);
                //met.InsertarImagenProd(objProducto, ficheroConvert);
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null,"No se pudo abrir la imagen"+ex);
            }
        }
        
    }//GEN-LAST:event_btn_subirImgActionPerformed

    private void rSButtonIconOne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconOne2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_rSButtonIconOne2ActionPerformed

    private void rSButtonIconOne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconOne1ActionPerformed
       this.setExtendedState(1);
    }//GEN-LAST:event_rSButtonIconOne1ActionPerformed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void txt_valorCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_valorCKeyTyped
        char datostipear = evt.getKeyChar();
        if((datostipear<'0' || datostipear>'9')) evt.consume();
    }//GEN-LAST:event_txt_valorCKeyTyped

    private void txt_valorVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_valorVKeyTyped
        char datostipear = evt.getKeyChar();
        if((datostipear<'0' || datostipear>'9')) evt.consume();
    }//GEN-LAST:event_txt_valorVKeyTyped

    private void rSButtonMaterialIconTwo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo2ActionPerformed
        if(validacionProductos()==false){
          return;
        }
        
        Metodos met = new Metodos();
        Producto objProducto = new Producto();
        String categoriaID = cbox_categoria.getSelectedItem().toString();
        
        objProducto.setNombreProd(txt_nombreProd.getText());
        objProducto.setValorCompraProd(Integer.parseInt(txt_valorC.getText()));
        objProducto.setValorVentaProd(Integer.parseInt(txt_valorV.getText()));
        objProducto.setStockProd(Integer.parseInt("0"));   
        objProducto.setEstadoProd("Activo");
        objProducto.setIdCategoriaProd(met.ObtenerIdCategoria(categoriaID));
        
        String id1  = txt_nombreProd.getText().substring(0,3);
        int largoultimo = txt_nombreProd.getText().length();
        String id2  = txt_nombreProd.getText().substring(largoultimo-3,largoultimo);
        String id3  = cbox_categoria.getSelectedItem().toString().substring(0,4);
        Calendar c1 = Calendar.getInstance();
        String dia = Integer.toString(c1.get(Calendar.DATE));
        int mesnumero = c1.get(Calendar.MONTH);
        int total =mesnumero+1;
        String mes = Integer.toString(total);
        String annio = Integer.toString(c1.get(Calendar.YEAR));
        String hora = Integer.toString(c1.get(Calendar.HOUR));
        String minutos = Integer.toString(c1.get(Calendar.MINUTE));
        String idproducto = id1+id2+id3+dia+mes+annio+hora+minutos;
        objProducto.setCodigoProd(idproducto);
        
        
        
           
        
        if(txt_imagen1.getText()=="Foto"){
            boolean resultado = met.InsertarDatosProd(objProducto);
            if(resultado==true){
            JOptionPane.showMessageDialog(null, "Producto Ingresado Exitosamente");
            limpiarCajasDatos();
            }else{
                JOptionPane.showMessageDialog(null, "Error al ingresar registro de producto");
            }
            
        }else{
            boolean resultado = met.InsertarDatosProd(objProducto);
            if(resultado==true){
            String ficheroConvert = fichero.toString();
            byte[] b = ficheroConvert.getBytes();
            objProducto.setImagenProd(b);
            objProducto.setCodigoProd(idproducto);
            met.InsertarImagenProd(objProducto, ficheroConvert);    
            JOptionPane.showMessageDialog(null, "Producto Ingresado Exitosamente");
            limpiarCajasDatos();
            }else{
                JOptionPane.showMessageDialog(null, "Error al ingresar registro de producto");
            }
            
        }
        
    }//GEN-LAST:event_rSButtonMaterialIconTwo2ActionPerformed

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
            java.util.logging.Logger.getLogger(PROD_ingreProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PROD_ingreProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PROD_ingreProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PROD_ingreProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PROD_ingreProd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconTwo btn_subirImg;
    private RSMaterialComponent.RSComboBoxMaterial cbox_categoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private RSMaterialComponent.RSButtonIconOne rSButtonIconOne1;
    private RSMaterialComponent.RSButtonIconOne rSButtonIconOne2;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo1;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo2;
    private RSMaterialComponent.RSPanelMaterial rSPanelMaterial1;
    private javax.swing.JLabel txt_imagen1;
    private RSMaterialComponent.RSTextFieldTwo txt_nombreProd;
    private RSMaterialComponent.RSTextFieldTwo txt_valorC;
    private RSMaterialComponent.RSTextFieldTwo txt_valorV;
    // End of variables declaration//GEN-END:variables
}