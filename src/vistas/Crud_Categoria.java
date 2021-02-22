/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.Metodos;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.CategoriaProd;

/**
 *
 * @author ArtemSupa
 */
public class Crud_Categoria extends javax.swing.JFrame {

    /**
     * Creates new form MenuProductosF
     */
    int x,y;
    public Crud_Categoria() {
        initComponents();
        LlenaGrilla();
    }
    
    public boolean validacion(){
        if(txt_nombre.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe ingresar un nombre de categoria");
            txt_nombre.requestFocus();
            return false; 
        }
        
        if(txt_descripcion.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe ingresar una descripcion de categoria");
            txt_descripcion.requestFocus();
            return false; 
        }
        return true;
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
        Nombrecolumna.add("Descripcion");
        Nombrecolumna.add("Estado");
        for (Object column :Nombrecolumna){
            modeloLista.addColumn(column);
        }
        this.tbl_categoria.setModel(modeloLista);


        
        Metodos met = new Metodos();
        ArrayList<CategoriaProd> listCatProd = new ArrayList<CategoriaProd>();
        
        //listProducto = met.ListarDatosProductocompletoconCondicion();
        listCatProd = met.ListarCatProducto();
        
        
        
        // CategoriaProd cat = new CategoriaProd();
        Iterator<CategoriaProd> intIngreso = listCatProd.iterator();
        while(intIngreso.hasNext()){
            
            CategoriaProd elemento=intIngreso.next();
            
            
            Object[] vi = new Object[]{elemento.getId(),elemento.getNombre(),elemento.getDescripcion(),elemento.getEstado()};
            
            modeloLista.addRow(vi);
            
        }    
        
        this.tbl_categoria.setModel(modeloLista);
    
    
    
    } 
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSButtonIconOne1 = new RSMaterialComponent.RSButtonIconOne();
        rSButtonIconOne2 = new RSMaterialComponent.RSButtonIconOne();
        rSButtonIcon_new2 = new newscomponents.RSButtonIcon_new();
        jLabel1 = new javax.swing.JLabel();
        rSPanelMaterial1 = new RSMaterialComponent.RSPanelMaterial();
        txt_descripcion = new RSMaterialComponent.RSTextFieldMaterial();
        txt_nombre = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_categoria = new RSMaterialComponent.RSTableMetroCustom();
        btn_editar = new RSMaterialComponent.RSButtonMaterialIconOne();
        btn_borrar = new RSMaterialComponent.RSButtonMaterialIconOne();
        btn_guardar = new RSMaterialComponent.RSButtonMaterialIconOne();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        rSButtonIcon_new2.setBackground(new java.awt.Color(255, 204, 204));
        rSButtonIcon_new2.setText("Atras");
        rSButtonIcon_new2.setBackgroundHover(new java.awt.Color(201, 162, 162));
        rSButtonIcon_new2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.KEYBOARD_ARROW_LEFT);
        rSButtonIcon_new2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIcon_new1ActionPerformed(evt);
            }
        });
        getContentPane().add(rSButtonIcon_new2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, -1));

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

        rSPanelMaterial1.setBackground(new java.awt.Color(255, 204, 204));
        rSPanelMaterial1.setShadowBottom(false);
        rSPanelMaterial1.setShadowLeft(false);
        rSPanelMaterial1.setShadowRight(false);
        rSPanelMaterial1.setShadowTop(false);
        rSPanelMaterial1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_descripcion.setPlaceholder("Descripcion");
        rSPanelMaterial1.add(txt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, -1));

        txt_nombre.setPlaceholder("Nombre categoria");
        rSPanelMaterial1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Descripcion");
        rSPanelMaterial1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Nombre de categoria");
        rSPanelMaterial1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        tbl_categoria.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_categoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_categoriaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_categoria);

        rSPanelMaterial1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 490, 270));

        btn_editar.setBackground(new java.awt.Color(202, 164, 164));
        btn_editar.setText("Editar");
        btn_editar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EDIT);
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });
        rSPanelMaterial1.add(btn_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 120, 120, -1));

        btn_borrar.setBackground(new java.awt.Color(202, 164, 164));
        btn_borrar.setText("Borrar");
        btn_borrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_borrar.setIconTextGap(5);
        btn_borrar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.BACKSPACE);
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });
        rSPanelMaterial1.add(btn_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 120, -1));

        btn_guardar.setBackground(new java.awt.Color(202, 164, 164));
        btn_guardar.setText("Guardar");
        btn_guardar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        rSPanelMaterial1.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 50, 120, -1));

        getContentPane().add(rSPanelMaterial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 37, 1330, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void rSButtonIcon_new1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIcon_new1ActionPerformed
        MenuAjustes m = new MenuAjustes();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_rSButtonIcon_new1ActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        if(validacion()==false){
            return;
        }
        
        CategoriaProd Objetocat = new CategoriaProd();
        Objetocat.setNombre(txt_nombre.getText());
        Objetocat.setDescripcion(txt_descripcion.getText());
        Objetocat.setEstado("Activo");
        Metodos met = new Metodos();
        met.InsertarDatosCatProd(Objetocat);
        txt_descripcion.setText("");
        txt_nombre.setText("");
        LlenaGrilla();
        
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        txt_descripcion.setText("");
        txt_nombre.setText("");
        tbl_categoria.setSelectionMode(0);
    }//GEN-LAST:event_btn_borrarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        CategoriaProd cat = new CategoriaProd();
        cat.setNombre(txt_nombre.getText());
        cat.setDescripcion(txt_descripcion.getText());
        Metodos met = new Metodos();
        if(tbl_categoria.getSelectedRow()<0){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro para editar");
        }else{
            
            int id =(int)tbl_categoria.getValueAt(tbl_categoria.getSelectedRow(), 0);
            cat.setId(id);
            met.UpdateCatProd(cat);
            JOptionPane.showMessageDialog(null, "Categoria actualizada exitosamente!!");
            txt_descripcion.setText("");
            txt_nombre.setText("");
            LlenaGrilla();
        }
        
        
        
        
        
    }//GEN-LAST:event_btn_editarActionPerformed

    private void tbl_categoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_categoriaMouseClicked
        int seleccionar= tbl_categoria.rowAtPoint(evt.getPoint());
        CategoriaProd cat = new CategoriaProd();
        int id = (int) tbl_categoria.getValueAt(seleccionar, 0);
        cat.setId(id);
        txt_nombre.setText(String.valueOf(tbl_categoria.getValueAt(seleccionar, 1)));
        txt_descripcion.setText(String.valueOf(tbl_categoria.getValueAt(seleccionar, 2)));
    }//GEN-LAST:event_tbl_categoriaMouseClicked

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
            java.util.logging.Logger.getLogger(Crud_Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crud_Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crud_Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crud_Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crud_Categoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconOne btn_borrar;
    private RSMaterialComponent.RSButtonMaterialIconOne btn_editar;
    private RSMaterialComponent.RSButtonMaterialIconOne btn_guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private RSMaterialComponent.RSButtonIconOne rSButtonIconOne1;
    private RSMaterialComponent.RSButtonIconOne rSButtonIconOne2;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new1;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new2;
    private RSMaterialComponent.RSPanelMaterial rSPanelMaterial1;
    private RSMaterialComponent.RSTableMetroCustom tbl_categoria;
    private RSMaterialComponent.RSTextFieldMaterial txt_descripcion;
    private RSMaterialComponent.RSTextFieldMaterial txt_nombre;
    // End of variables declaration//GEN-END:variables
}
