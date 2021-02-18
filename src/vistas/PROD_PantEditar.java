/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.Metodos;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelo.Producto;

/**
 *
 * @author ArtemSupa
 */
public class PROD_PantEditar extends javax.swing.JFrame {
 int x,y;
 File fichero ;
 String destino = "C:/PonteBella/ImagenesProductos/";  
 Metodos met = new Metodos();
    private String CodigoProd;

    private PROD_PantEditar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCodigoProd() {
        return CodigoProd;
    }

    public void setCodigoProd(String CodigoProd) {
        this.CodigoProd = CodigoProd;
    }

    


    /**
     * Creates new form PROD_PantEditar
     */
    public PROD_PantEditar(String CodigoProd) throws IOException {
        this.CodigoProd = CodigoProd;
        
        initComponents();
        cargarDatos(CodigoProd);
        
        
    }
    
     public void cargarDatos(String CodigoProd) throws IOException{
        Image rpta = null;
        Metodos met = new Metodos();
       
        ArrayList<Producto> listProducto = new ArrayList<Producto>();
        
        String codigo =CodigoProd;
        listProducto = met.ListarDatosProductoconWhere(codigo);
        met.ConsultaComboboxCategoria(cbox_categoria);
        Iterator<Producto> intProducto = listProducto.iterator();
        while(intProducto.hasNext()){
            Producto elemento=intProducto.next();
            txt_nombreProd.setText(elemento.getNombreProd());
            txt_valorC.setText(Integer.toString(elemento.getValorCompraProd()));
            txt_valorV.setText(Integer.toString(elemento.getValorVentaProd()));
            int idcat = elemento.getIdCategoriaProd();
            String resultadoCat = met.ObtenerNombreCategoria(idcat);
            cbox_categoria.setSelectedItem(resultadoCat);
            
            
           
            
            
            
        }
        
        
                   
            String rutaimagenBD = met.VerImagenProducto(CodigoProd);
            if(rutaimagenBD == "" || rutaimagenBD.equals("null")){
                txt_imagen1.setIcon(null);
                txt_imagen1.setText("Foto");
                

            }else{


                ImageIcon icono = new ImageIcon(rutaimagenBD);
                Icon iconoL = new ImageIcon(icono.getImage().getScaledInstance(txt_imagen1.getWidth(),txt_imagen1.getHeight(),Image.SCALE_DEFAULT));
                txt_imagen1.setText("null");
                txt_imagen1.setIcon(iconoL);
                File Imagen = new File(rutaimagenBD);
                fichero = Imagen;
            }
        //} catch (IOException ex) {
          //  JOptionPane.showMessageDialog(null,ex+ " Error al ingresar registro de producto");
        //}  
     }
    
  private void limpiarCajasDatos(){
    
    txt_nombreProd.setText("");
    txt_valorC.setText("");
    txt_valorV.setText("");
    cbox_categoria.setSelectedIndex(0);
    txt_imagen1.setIcon(null);
    txt_imagen1.setText("Foto");
            
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
        jLabel3 = new javax.swing.JLabel();
        txt_nombreProd = new RSMaterialComponent.RSTextFieldTwo();
        jLabel4 = new javax.swing.JLabel();
        txt_valorC = new RSMaterialComponent.RSTextFieldTwo();
        jLabel5 = new javax.swing.JLabel();
        txt_valorV = new RSMaterialComponent.RSTextFieldTwo();
        jLabel2 = new javax.swing.JLabel();
        cbox_categoria = new RSMaterialComponent.RSComboBoxMaterial();
        rSButtonMaterialIconTwo2 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        txt_imagen1 = new javax.swing.JLabel();
        btn_subirImg1 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        btn_subirImg2 = new RSMaterialComponent.RSButtonMaterialIconTwo();
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

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nombre de producto");
        rSPanelMaterial1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 140, 42));

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

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Valor de compra");
        rSPanelMaterial1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 140, 42));

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

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Valor de venta");
        rSPanelMaterial1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 140, 42));

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Categoria");
        rSPanelMaterial1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 140, 42));

        cbox_categoria.setBackground(new java.awt.Color(255, 204, 204));
        cbox_categoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione una categoria" }));
        rSPanelMaterial1.add(cbox_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 240, -1));

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
        rSPanelMaterial1.add(rSButtonMaterialIconTwo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 150, -1));

        txt_imagen1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_imagen1.setText("Foto");
        txt_imagen1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rSPanelMaterial1.add(txt_imagen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 759, 420));

        btn_subirImg1.setBackground(new java.awt.Color(255, 153, 204));
        btn_subirImg1.setText("Subir imagen");
        btn_subirImg1.setBackgroundHover(new java.awt.Color(218, 132, 175));
        btn_subirImg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_subirImg1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_subirImg1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.IMAGE);
        btn_subirImg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subirImg1ActionPerformed(evt);
            }
        });
        rSPanelMaterial1.add(btn_subirImg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 460, 390, -1));

        btn_subirImg2.setBackground(new java.awt.Color(255, 153, 204));
        btn_subirImg2.setText("Quitar Imagen");
        btn_subirImg2.setBackgroundHover(new java.awt.Color(218, 132, 175));
        btn_subirImg2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_subirImg2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_subirImg2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        btn_subirImg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subirImg2ActionPerformed(evt);
            }
        });
        rSPanelMaterial1.add(btn_subirImg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 460, 210, -1));

        getContentPane().add(rSPanelMaterial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1330, 550));

        rSButtonIcon_new1.setBackground(new java.awt.Color(255, 204, 204));
        rSButtonIcon_new1.setText("Atrás");
        rSButtonIcon_new1.setBackgroundHover(new java.awt.Color(201, 162, 162));
        rSButtonIcon_new1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.KEYBOARD_ARROW_LEFT);
        rSButtonIcon_new1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIcon_new1ActionPerformed(evt);
            }
        });
        getContentPane().add(rSButtonIcon_new1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, -1));

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
        PROD_editProd editprod = new PROD_editProd();
        editprod.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_rSButtonIcon_new1ActionPerformed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void rSButtonIconOne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconOne1ActionPerformed
        this.setExtendedState(1);
    }//GEN-LAST:event_rSButtonIconOne1ActionPerformed

    private void rSButtonIconOne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconOne2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_rSButtonIconOne2ActionPerformed

    private void txt_nombreProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreProdActionPerformed

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
        
        objProducto.setCodigoProd(CodigoProd);
        objProducto.setNombreProd(txt_nombreProd.getText());
        objProducto.setValorCompraProd(Integer.parseInt(txt_valorC.getText()));
        objProducto.setValorVentaProd(Integer.parseInt(txt_valorV.getText()));
        objProducto.setIdCategoriaProd(met.ObtenerIdCategoria(categoriaID));
        objProducto.setRutaImg("null");
        String ruta="";
        String archivo="";
        if(fichero!=null){
            ruta = fichero.getAbsolutePath();
            String extensionArchivo = fichero.getName().substring(fichero.getName().length()-4);
            String nombreArchivo = CodigoProd+extensionArchivo;
            archivo = destino+""+nombreArchivo;


            File carpeta = new File(destino);

            if(!carpeta.exists()){

                carpeta.mkdirs();

            }
        }
        
        String cajaFoto = txt_imagen1.getText();
        if(cajaFoto.equals("Foto") ){
            boolean resultado = met.UpdateDatosProducto(objProducto, CodigoProd);
            if (resultado == true) {
                JOptionPane.showMessageDialog(null, "Producto Editado Exitosamente");
                PROD_editProd proedit = new PROD_editProd();
                proedit.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Error al editar registro de producto");
            }
        }else{
            
            objProducto.setRutaImg(archivo);
            boolean resultado = met.UpdateDatosProducto(objProducto, CodigoProd);
            if (resultado == true) {
                met.GuardarImagenLocal(ruta, archivo);
                met.InsertarImagenProd(objProducto);
                JOptionPane.showMessageDialog(null, "Producto editado Exitosamente");
                PROD_editProd proedit = new PROD_editProd();
                proedit.setVisible(true);
                this.dispose();  
            }else{
                JOptionPane.showMessageDialog(null, "Error al editar registro de producto");
            }
            
            
        }
 

    }//GEN-LAST:event_rSButtonMaterialIconTwo2ActionPerformed

    private void btn_subirImg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_subirImg1ActionPerformed
        int resultado;
        
        CargarFoto cfoto = new CargarFoto();
        FileNameExtensionFilter filtroimagen = new FileNameExtensionFilter("JPG/PNG","png","jpg");
        cfoto.FileCargarFoto.setFileFilter(filtroimagen);
        resultado = cfoto.FileCargarFoto.showOpenDialog(null);
        if ( JFileChooser.APPROVE_OPTION==resultado){
            fichero = cfoto.FileCargarFoto.getSelectedFile();
           
            try{
                ImageIcon icono = new ImageIcon(fichero.toString());
                Icon iconoL = new ImageIcon(icono.getImage().getScaledInstance(txt_imagen1.getWidth(),txt_imagen1.getHeight(),Image.SCALE_DEFAULT));
                txt_imagen1.setText("null");
                txt_imagen1.setIcon(iconoL);
               
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null,"No se pudo abrir la imagen"+ex);
            }
        }
    }//GEN-LAST:event_btn_subirImg1ActionPerformed

    private void btn_subirImg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_subirImg2ActionPerformed
        txt_imagen1.setText("Foto");
        txt_imagen1.setIcon(null);
    }//GEN-LAST:event_btn_subirImg2ActionPerformed

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
            java.util.logging.Logger.getLogger(PROD_PantEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PROD_PantEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PROD_PantEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PROD_PantEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PROD_PantEditar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconTwo btn_subirImg1;
    private RSMaterialComponent.RSButtonMaterialIconTwo btn_subirImg2;
    private RSMaterialComponent.RSComboBoxMaterial cbox_categoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private RSMaterialComponent.RSButtonIconOne rSButtonIconOne1;
    private RSMaterialComponent.RSButtonIconOne rSButtonIconOne2;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new1;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo2;
    private RSMaterialComponent.RSPanelMaterial rSPanelMaterial1;
    private javax.swing.JLabel txt_imagen1;
    private RSMaterialComponent.RSTextFieldTwo txt_nombreProd;
    private RSMaterialComponent.RSTextFieldTwo txt_valorC;
    private RSMaterialComponent.RSTextFieldTwo txt_valorV;
    // End of variables declaration//GEN-END:variables
}
