/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;



import controlador.Metodos;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.VentaMercaderia;
import modelo.VentaMercaderiaDetalle;




/**
 *
 * @author ArtemSupa
 */
public class VENT_ingeVent extends javax.swing.JFrame {

    /**
     * Creates new form VENT_ingeVent
     */
    public static DefaultTableModel modeloLista2 = new DefaultTableModel();
    
    int x,y;
    public VENT_ingeVent() {
        initComponents();
        modeloLista2.setColumnCount(0);
        modeloLista2.setRowCount(0);
        llenargrilla();
        Date objdate = new Date();
        Date fecha = objdate;
        date_fecha.setDatoFecha(fecha);
        txt_subtotalV.setText("0");
        txt_totalV.setText("0");
        txt_descuentoV.setText("0");
        txt_delivery.setText("0");
        
    }
    
public void LimpiarPantalla(){

    Date objdate = new Date();
    Date fecha = objdate;
    date_fecha.setDatoFecha(fecha);
    
    DefaultTableModel tabla = (DefaultTableModel) tbl_venta.getModel();
    tabla.setRowCount(0);
    txt_descuentoV.setText("0");
    txt_subtotalV.setText("0");
    txt_totalV.setText("0");
    txt_delivery.setText("0");
    


} 
    
public void llenargrilla(){
    
   
    ArrayList<Object> Nombrecolumna = new ArrayList<Object>();
        Nombrecolumna.add("Nombre producto");
        Nombrecolumna.add("Codigo producto");
        Nombrecolumna.add("Cantidad");
        Nombrecolumna.add("Precio");
        for (Object column :Nombrecolumna){
            modeloLista2.addColumn(column);
        }
        this.tbl_venta.setModel(modeloLista2);
        

}    

public boolean Validar(){

    if(date_fecha.getDatoFecha()==null){
        JOptionPane.showMessageDialog(rootPane,"Debe seleccionar una fecha");
        date_fecha.requestFocus();
        return false;
    }
    
    if(txt_totalV.getText().equals("0")){
        JOptionPane.showMessageDialog(rootPane,"Debe agregar minimo un producto");
        btn_AgregarProd.requestFocus();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_venta = new RSMaterialComponent.RSTableMetroCustom();
        jLabel5 = new javax.swing.JLabel();
        btn_AgregarProd = new RSMaterialComponent.RSButtonMaterialIconTwo();
        txt_totalV = new RSMaterialComponent.RSTextFieldMaterial();
        txt_descuentoV = new RSMaterialComponent.RSTextFieldMaterial();
        txt_subtotalV = new RSMaterialComponent.RSTextFieldMaterial();
        rSButtonMaterialIconOne1 = new RSMaterialComponent.RSButtonMaterialIconOne();
        jLabel6 = new javax.swing.JLabel();
        btn_grabarCompra = new RSMaterialComponent.RSButtonMaterialIconTwo();
        date_fecha = new rojeru_san.rsdate.RSDateChooser();
        btn_AgregarProd1 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        txt_delivery = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel7 = new javax.swing.JLabel();
        rSButtonMaterialIconOne2 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne3 = new RSMaterialComponent.RSButtonMaterialIconOne();
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

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Subtotal");
        rSPanelMaterial1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 460, 110, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Total Venta");
        rSPanelMaterial1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 500, 110, 50));

        tbl_venta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_venta.setBackgoundHead(new java.awt.Color(218, 175, 175));
        tbl_venta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ventaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_venta);

        rSPanelMaterial1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 1260, 290));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Fecha de venta");
        rSPanelMaterial1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        btn_AgregarProd.setBackground(new java.awt.Color(218, 175, 175));
        btn_AgregarProd.setText("Agregar Productos");
        btn_AgregarProd.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ADD);
        btn_AgregarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarProdActionPerformed(evt);
            }
        });
        rSPanelMaterial1.add(btn_AgregarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 270, -1));

        txt_totalV.setBackground(new java.awt.Color(255, 204, 204));
        txt_totalV.setForeground(new java.awt.Color(0, 0, 0));
        txt_totalV.setColorMaterial(new java.awt.Color(153, 153, 153));
        txt_totalV.setEnabled(false);
        txt_totalV.setPlaceholder("$0");
        txt_totalV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_totalVActionPerformed(evt);
            }
        });
        rSPanelMaterial1.add(txt_totalV, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 510, 150, 30));

        txt_descuentoV.setBackground(new java.awt.Color(255, 204, 204));
        txt_descuentoV.setForeground(new java.awt.Color(0, 0, 0));
        txt_descuentoV.setPlaceholder("$0");
        txt_descuentoV.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txt_descuentoVInputMethodTextChanged(evt);
            }
        });
        rSPanelMaterial1.add(txt_descuentoV, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 430, 150, 30));

        txt_subtotalV.setBackground(new java.awt.Color(255, 204, 204));
        txt_subtotalV.setForeground(new java.awt.Color(0, 0, 0));
        txt_subtotalV.setColorMaterial(new java.awt.Color(153, 153, 153));
        txt_subtotalV.setEnabled(false);
        txt_subtotalV.setPlaceholder("$0");
        txt_subtotalV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_subtotalVActionPerformed(evt);
            }
        });
        rSPanelMaterial1.add(txt_subtotalV, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 470, 150, 30));

        rSButtonMaterialIconOne1.setBackground(new java.awt.Color(218, 175, 175));
        rSButtonMaterialIconOne1.setText("Aplicar Descuento");
        rSButtonMaterialIconOne1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CARD_GIFTCARD);
        rSButtonMaterialIconOne1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne1ActionPerformed(evt);
            }
        });
        rSPanelMaterial1.add(rSButtonMaterialIconOne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 420, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Productos en carro de venta");
        rSPanelMaterial1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 170, 30));

        btn_grabarCompra.setBackground(new java.awt.Color(218, 175, 175));
        btn_grabarCompra.setText("Generar Venta");
        btn_grabarCompra.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        btn_grabarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_grabarCompraActionPerformed(evt);
            }
        });
        rSPanelMaterial1.add(btn_grabarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 210, -1));

        date_fecha.setFormatoFecha("dd/MM/yyyy");
        date_fecha.setPlaceholder("Seleccione Fecha");
        rSPanelMaterial1.add(date_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        btn_AgregarProd1.setBackground(new java.awt.Color(218, 175, 175));
        btn_AgregarProd1.setText("Quitar Productos");
        btn_AgregarProd1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        btn_AgregarProd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarProd1ActionPerformed(evt);
            }
        });
        rSPanelMaterial1.add(btn_AgregarProd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 80, 270, -1));

        txt_delivery.setBackground(new java.awt.Color(255, 204, 204));
        txt_delivery.setForeground(new java.awt.Color(0, 0, 0));
        txt_delivery.setPlaceholder("$0");
        txt_delivery.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txt_deliveryInputMethodTextChanged(evt);
            }
        });
        txt_delivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_deliveryActionPerformed(evt);
            }
        });
        rSPanelMaterial1.add(txt_delivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 20, 150, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Descuento");
        rSPanelMaterial1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 410, 110, 50));

        rSButtonMaterialIconOne2.setBackground(new java.awt.Color(218, 175, 175));
        rSButtonMaterialIconOne2.setText("Aplicar Delivery");
        rSButtonMaterialIconOne2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.LOCAL_SHIPPING);
        rSButtonMaterialIconOne2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne2ActionPerformed(evt);
            }
        });
        rSPanelMaterial1.add(rSButtonMaterialIconOne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, -1, -1));

        rSButtonMaterialIconOne3.setBackground(new java.awt.Color(218, 175, 175));
        rSButtonMaterialIconOne3.setText("Quitar Delivery");
        rSButtonMaterialIconOne3.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        rSButtonMaterialIconOne3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne3ActionPerformed(evt);
            }
        });
        rSPanelMaterial1.add(rSButtonMaterialIconOne3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 80, -1, -1));

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
        MenuVentas menC = new MenuVentas();
        menC.setVisible(true);
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

    private void btn_AgregarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarProdActionPerformed
        VENT_selectProd selectproducto = new VENT_selectProd();
        selectproducto.setVisible(true);
        
    }//GEN-LAST:event_btn_AgregarProdActionPerformed

    private void txt_totalVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_totalVActionPerformed
        
    }//GEN-LAST:event_txt_totalVActionPerformed

    private void txt_subtotalVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_subtotalVActionPerformed
        
    }//GEN-LAST:event_txt_subtotalVActionPerformed

    private void txt_descuentoVInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txt_descuentoVInputMethodTextChanged
        
    }//GEN-LAST:event_txt_descuentoVInputMethodTextChanged

    private void rSButtonMaterialIconOne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne1ActionPerformed
        String TraerDesc = txt_descuentoV.getText();
            String TraerSubt = txt_subtotalV.getText();
            
            TraerDesc = (String)TraerDesc;
            
            if(TraerDesc.isEmpty()==false){
                
                int desc = Integer.parseInt(TraerDesc);
                int sub = Integer.parseInt(TraerSubt);
                int mate = sub-desc;
                if(sub==0){
                    JOptionPane.showMessageDialog(rootPane,"Para aplicar un descuento, primero tiene que agregar uno o mas productos"); 
                    txt_descuentoV.setText("0");
                }else{
                    if(desc>=sub){
                        JOptionPane.showMessageDialog(rootPane,"El descuento no puede ser igual o mayor al valor total");

                        txt_descuentoV.setText("0");
                    }else{
                        String Total = String.valueOf(mate);
                        txt_totalV.setText(Total);    
                        }
                    }
                
            }else{
                txt_descuentoV.setText("0");
                JOptionPane.showMessageDialog(rootPane,"Debe ingresar una cantidad valida");
            }
            
            
            
            
            
    }//GEN-LAST:event_rSButtonMaterialIconOne1ActionPerformed

    private void btn_grabarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_grabarCompraActionPerformed
        if(Validar()==false){
            return;
        }
        
        
        Metodos met = new Metodos();
        VentaMercaderia objIngreso = new VentaMercaderia();
        VentaMercaderiaDetalle objIngresoDet = new VentaMercaderiaDetalle();
        if(date_fecha.getDatoFecha()==null){
            JOptionPane.showMessageDialog(rootPane,"Debe seleccionar una fecha");
            
        }else{
            String FormatoFecha = "dd/MM/yyyy";
            Date fecha = date_fecha.getDatoFecha();
            SimpleDateFormat formateador = new SimpleDateFormat(FormatoFecha);
            String fechaf = formateador.format(fecha);
            objIngreso.setIngrFecha(fechaf);
            objIngreso.setIngrTotal(Integer.parseInt(txt_totalV.getText()));
            objIngreso.setIngrEstado("Realizada");
            objIngreso.setIngrDescuento(Integer.parseInt(txt_descuentoV.getText()));
            objIngreso.setIngrsubtotal(Integer.parseInt(txt_subtotalV.getText()));
            int totalRegistros = tbl_venta.getRowCount();
            
            if(totalRegistros==0){
                JOptionPane.showMessageDialog(null, "Debe Agregar al menos un producto para realizar una venta");
            }else{
                boolean Resultado = met.InsertarDatosVentaMerc(objIngreso);
                String precioCompra="";
                String Cantidad="";
                String codigoProducto="";
                boolean Resultado2 = false;
                for(int i = 0 ; i < VENT_ingeVent.modeloLista2.getRowCount();i++){

                    Cantidad = (String) modeloLista2.getValueAt(i,2);
                    precioCompra = (String) modeloLista2.getValueAt(i,3);
                    codigoProducto = (String) modeloLista2.getValueAt(i,1);
                    objIngresoDet.setDetaCantidad(Integer.parseInt(Cantidad));
                    objIngresoDet.setDetaPrecio(Integer.parseInt(precioCompra));
                    objIngresoDet.setProdCodigo(codigoProducto);
                    Resultado2 = met.InsertarDatosDetVentaMerc(objIngresoDet);

                }



                if(Resultado==true){

                    if(Resultado2==true){
                        JOptionPane.showMessageDialog(null, "Venta realizada Exitosamente!!");
                        LimpiarPantalla();
                    }else{
                        JOptionPane.showMessageDialog(null, "Error al realizar la venta");
                    }



                }else{
                    JOptionPane.showMessageDialog(null, "Error al realizar la venta");
                }
            }
            
            

        }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_btn_grabarCompraActionPerformed

    private void btn_AgregarProd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarProd1ActionPerformed
  
        if(tbl_venta.getSelectedRow()<0){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro para eliminar");
        }else{
            
            int seleccion = tbl_venta.getSelectedRow();
            DefaultTableModel tablaPro =(DefaultTableModel) tbl_venta.getModel();
            String cod = (String)tbl_venta.getValueAt(seleccion, 1);
            String cant = (String)tbl_venta.getValueAt(seleccion, 2);
            String prec = (String)tbl_venta.getValueAt(seleccion, 3);
            
            
            int cantINT = Integer.parseInt(cant);
            int precINT = Integer.parseInt(prec);
            
            int calculo = precINT*cantINT;
            
            String SubTotal = txt_subtotalV.getText();
            String Total = txt_totalV.getText();
            int SubtotalINT = Integer.parseInt(SubTotal);
            int totalINT = Integer.parseInt(Total);
            int resta1 = SubtotalINT-calculo;
            int resta2 = totalINT-calculo;
            
            String Sresta1 = String.valueOf(resta1);
            String Sresta2 = String.valueOf(resta2);
            txt_subtotalV.setText(Sresta1);
            txt_totalV.setText(Sresta2);
            tablaPro.removeRow(tbl_venta.getSelectedRow());
        }
        
        
        
    
    }//GEN-LAST:event_btn_AgregarProd1ActionPerformed

    private void txt_deliveryInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txt_deliveryInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_deliveryInputMethodTextChanged

    private void rSButtonMaterialIconOne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne2ActionPerformed
        String Total = txt_totalV.getText();
        String Delivery = txt_delivery.getText();
        
        if(Delivery.isEmpty()==false){
            int STotal = Integer.parseInt(Total);
            int SDelivery = Integer.parseInt(Delivery);
            int Calculo = SDelivery+STotal;
            
            if(STotal==0){
                JOptionPane.showMessageDialog(rootPane,"Para aplicar un descuento, primero tiene que agregar uno o mas productos"); 
                 txt_delivery.setText("0");
            
            }else{
                if(SDelivery<=0){
                
                    JOptionPane.showMessageDialog(rootPane,"El delivery tiene que ser mayor a 0"); 
                    txt_delivery.setText("0");
                }else{
                    String TotalF = String.valueOf(Calculo);
                    txt_totalV.setText(TotalF);
                    txt_delivery.setEnabled(false);
                    
                }
            
            }
            
        }else{
            JOptionPane.showMessageDialog(rootPane,"Ingrese un valor valido!!"); 
            txt_delivery.setText("0");
        }
        
    }//GEN-LAST:event_rSButtonMaterialIconOne2ActionPerformed

    private void rSButtonMaterialIconOne3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne3ActionPerformed
        String Subtotal = txt_subtotalV.getText();
        String Total = txt_totalV.getText();
        String Descuento = txt_descuentoV.getText();
        int NSubtotal = Integer.parseInt(Subtotal);
        int NTotal = Integer.parseInt(Total);
        int NDesc = Integer.parseInt(Descuento);
        int Delivery = (NTotal-(NTotal-NSubtotal))-NDesc;
        String Cal = String.valueOf(Delivery);
        txt_totalV.setText(Cal);
        txt_delivery.setEnabled(true);
        txt_delivery.setText("0");
        
    }//GEN-LAST:event_rSButtonMaterialIconOne3ActionPerformed

    private void txt_deliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_deliveryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_deliveryActionPerformed

    private void tbl_ventaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ventaMouseClicked
       
        
        
    }//GEN-LAST:event_tbl_ventaMouseClicked

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
            java.util.logging.Logger.getLogger(VENT_ingeVent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VENT_ingeVent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VENT_ingeVent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VENT_ingeVent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VENT_ingeVent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconTwo btn_AgregarProd;
    private RSMaterialComponent.RSButtonMaterialIconTwo btn_AgregarProd1;
    private RSMaterialComponent.RSButtonMaterialIconTwo btn_grabarCompra;
    private rojeru_san.rsdate.RSDateChooser date_fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private RSMaterialComponent.RSButtonIconOne rSButtonIconOne1;
    private RSMaterialComponent.RSButtonIconOne rSButtonIconOne2;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new1;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne1;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne2;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne3;
    private RSMaterialComponent.RSPanelMaterial rSPanelMaterial1;
    public static RSMaterialComponent.RSTableMetroCustom tbl_venta;
    public static RSMaterialComponent.RSTextFieldMaterial txt_delivery;
    public static RSMaterialComponent.RSTextFieldMaterial txt_descuentoV;
    public static RSMaterialComponent.RSTextFieldMaterial txt_subtotalV;
    public static RSMaterialComponent.RSTextFieldMaterial txt_totalV;
    // End of variables declaration//GEN-END:variables
}
