/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import bd.Conexion;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import modelo.IngresoMercaderia;
import modelo.IngresoMercaderiaDetalle;
import modelo.Producto;
import modelo.VentaMercaderia;
import modelo.VentaMercaderiaDetalle;




/**
 *
 * @author ArtemSupa
 */
public class Metodos {
    Conexion con = new Conexion();
    public boolean InsertarDatosProd( Producto objProducto ){
       
        Producto prod = new Producto();
        Connection c = con.conectar();
        
        try {
            
            
            Statement s = c.createStatement();           
            String consulta="";
            consulta += "Insert Into producto (PROD_CODIGO, PROD_NOMBRE, PROD_VALORCOMPRA, PROD_VALORVENTA, PROD_STOCK, ID_CATEGORIA, PROD_ESTADO,PROD_IMAGEN) values( ";       
            consulta += "'"+objProducto.getCodigoProd()+"',";
            consulta += "'"+objProducto.getNombreProd()+"',";
            consulta += "'"+objProducto.getValorCompraProd()+"',";
            consulta += "'"+objProducto.getValorVentaProd()+"',";
            consulta += "'"+objProducto.getStockProd()+"',";
            consulta += "'"+objProducto.getIdCategoriaProd()+"',";
            consulta += "'"+objProducto.getEstadoProd()+"',";
            consulta += "'"+objProducto.getRutaImg()+"'";
            consulta += ")";
            
            
            
            s.executeUpdate(consulta);
            
            c.close();
           
        } catch (SQLException ex) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }        
        
        return true;
    }
    
    
    
    public boolean InsertarImagenProd(Producto objProducto){
        
        String consulta;
       
        Connection c = con.conectar();
        PreparedStatement pst = null;
        File foto;
        try{
        
                //foto = new File(ruta);
                
                
                consulta="Update producto set prod_imagen =? where prod_codigo = ?";
                
                pst= c.prepareStatement(consulta);
                pst.setString(1,objProducto.getRutaImg());
                pst.setString(2,objProducto.getCodigoProd());
                
                pst.executeUpdate();
                c.close();
        }catch (SQLException ex) {
        
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }


    

        return true;
    }
    
    
public boolean QuitarImagen(Producto objProducto){
        
        String consulta;
       
        Connection c = con.conectar();
        PreparedStatement pst = null;
        
        try{
        
            
                
                consulta="Update producto set prod_imagen =? where prod_codigo = ?";
                
                pst= c.prepareStatement(consulta);
                pst.setString(1,objProducto.getRutaImg());
                
                pst.setString(2,objProducto.getCodigoProd());
                
                pst.executeUpdate();
                c.close();
        }catch (SQLException ex) {
        
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }


    

        return true;
    }    

    
    
    
    public boolean UpdateDatosProducto(Producto objProducto, String id){
    Conexion con =  new Conexion();
    Connection c = con.conectar();
    InputStream entrada = null;
    File foto;
    
    try {
        

        Statement s = c.createStatement();           
        String consultas="";
        consultas += " Update producto  Set ";       
        consultas += " prod_nombre = '"+objProducto.getNombreProd()+"', ";
        consultas += " prod_valorcompra = '"+objProducto.getValorCompraProd()+"', ";
        consultas += " prod_valorventa =  '"+objProducto.getValorVentaProd()+"' , ";
        consultas += " id_categoria =  '"+objProducto.getIdCategoriaProd()+"' , ";
        consultas += " prod_imagen = '"+objProducto.getRutaImg()+"' ";
        consultas += " Where prod_codigo ='"+id+"' ";

            s.executeUpdate(consultas);
            c.close();
           
        } catch (SQLException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }        
        
        return true;
    }
    
   public void ConsultaComboboxCategoria(JComboBox cbox_categoria){
        java.sql.Connection conectar = null;
        
        
        
        // PreparedStatement pst = null; 
        //ResultSet resultado = null;
        String consulta = "Select cate_nombre from categoriaproducto order by cate_nombre asc ";
        
        try{
            conectar = con.conectar();
            PreparedStatement pst = conectar.prepareStatement(consulta);
            ResultSet resultado= pst.executeQuery();
            //cbox_categoria.addItem("Seleccione una categoria");
            
            while( resultado.next()){
            
                cbox_categoria.addItem(resultado.getString("cate_nombre"));
                
                
            }
            
            conectar.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
        
            if(conectar!=null)
                try{
                    conectar.close();
                    
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, e);
                }
            
        }
   
   
   
   
   
   }
   
   
public String ObtenerNombreCategoria(int IdCategoria){
    String ret="";
    java.sql.Connection conectar = null;
        Producto prod = new Producto();
        
        String consulta = "Select cate_nombre from categoriaproducto where id_categoria=? ";
        
        try{
            conectar = con.conectar();
            PreparedStatement pst = conectar.prepareStatement(consulta);
            String Categoria =Integer.toString(IdCategoria);
            pst.setString(1,Categoria);
            ResultSet resultado= pst.executeQuery();
            if(resultado.next()){
                
                
                
               ret = resultado.getString("cate_nombre");
               return ret;
               
               
            }
            
             
            pst.close();
            
            
        
        }catch(SQLException e){
        
            JOptionPane.showMessageDialog(null,e);
            
        }
        
        

    return ret;
}   
   
   public int ObtenerIdCategoria(String categoriaID){
        java.sql.Connection conectar = null;
        Producto prod = new Producto();
        
        String consulta = "Select id_categoria from categoriaproducto where cate_nombre=? ";
        
        try{
            conectar = con.conectar();
            PreparedStatement pst = conectar.prepareStatement(consulta);
            pst.setString(1,categoriaID);
            ResultSet resultado= pst.executeQuery();
            if(resultado.next()){
                
                
                
               String ret = resultado.getString("id_categoria");
               int numero = Integer.parseInt(ret);
               return numero;
            }
            
             
            pst.close();
            
            
        
        }catch(SQLException e){
        
            JOptionPane.showMessageDialog(null,e);
            return 0;
        }
        return 0;
   }
   
   public ArrayList<Producto> ListarDatosProducto( ){
        ArrayList<Producto> listProducto = new ArrayList<Producto>();
   
        Conexion con =  new Conexion();
        Connection c = con.conectar();
                
        try {
           Statement s = c.createStatement();           
           String consulta = "Select prod_codigo,prod_nombre,prod_valorcompra,prod_valorventa,prod_stock,prod_estado from producto ";       
          

           ResultSet res = s.executeQuery(consulta);
           
           while (res.next()){
               
               Producto objProducto= new Producto();
               
               objProducto.setCodigoProd(res.getObject("prod_codigo").toString());
               objProducto.setNombreProd(res.getObject("prod_nombre").toString());
               objProducto.setValorCompraProd(Integer.parseInt(res.getObject("prod_valorcompra").toString()));
               objProducto.setValorVentaProd(Integer.parseInt(res.getObject("prod_valorventa").toString()));
               objProducto.setStockProd(Integer.parseInt(res.getObject("prod_stock").toString()));
               objProducto.setEstadoProd(res.getObject("prod_estado").toString());
               
               listProducto.add(objProducto);
               
           }
                    c.close();
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }        
        
        return listProducto;
    }  
   
 public ArrayList<Producto> ListarDatosProductoconWhere(String CodigoProd ){
        ArrayList<Producto> listProducto = new ArrayList<Producto>();
   
        Conexion con =  new Conexion();
        Connection c = con.conectar();
                
        try {
           Statement s = c.createStatement(); 
           String consulta = "Select prod_nombre,prod_valorcompra,prod_valorventa,id_categoria,prod_imagen from producto ";       
           consulta +=" Where prod_codigo='"+CodigoProd+"' ";
           ResultSet res = s.executeQuery(consulta);
           while (res.next()){
               
               Producto objProducto= new Producto();
               BufferedImage buffing = null;
               byte [] image = null;
               
               objProducto.setNombreProd(res.getObject("prod_nombre").toString());
               objProducto.setValorCompraProd(Integer.parseInt(res.getObject("prod_valorcompra").toString()));
               objProducto.setValorVentaProd(Integer.parseInt(res.getObject("prod_valorventa").toString()));
               objProducto.setIdCategoriaProd(Integer.parseInt(res.getObject("id_categoria").toString()));
               objProducto.setImagenProd(image = res.getBytes("prod_imagen"));
               
               
               
               listProducto.add(objProducto);
               
           }
                    c.close();
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }        
        
        return listProducto;
    }     
   
   
  public ArrayList<Producto> ListarDatosProductocompleto( ){
        ArrayList<Producto> listProducto = new ArrayList<Producto>();
   
        Conexion con =  new Conexion();
        Connection c = con.conectar();
                
        try {
           Statement s = c.createStatement();           
           String consulta = "Select prod_codigo,prod_nombre,prod_valorcompra,prod_valorventa,prod_stock,id_categoria,prod_estado from producto ";       
          

           ResultSet res = s.executeQuery(consulta);
           
           while (res.next()){
               
               Producto objProducto= new Producto();
               
               objProducto.setCodigoProd(res.getObject("prod_codigo").toString());
               objProducto.setNombreProd(res.getObject("prod_nombre").toString());
               objProducto.setValorCompraProd(Integer.parseInt(res.getObject("prod_valorcompra").toString()));
               objProducto.setValorVentaProd(Integer.parseInt(res.getObject("prod_valorventa").toString()));
               objProducto.setStockProd(Integer.parseInt(res.getObject("prod_stock").toString()));
               objProducto.setIdCategoriaProd(Integer.parseInt(res.getObject("id_categoria").toString()));
               objProducto.setEstadoProd(res.getObject("prod_estado").toString());
               
               listProducto.add(objProducto);
               
           }
                    c.close();
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }        
        
        return listProducto;
    }    
  
  public ArrayList<Producto> ListarDatosProductocompletoconCondicion( ){
        ArrayList<Producto> listProducto = new ArrayList<Producto>();
         
        //este metodo servira para el modulo de venta, osea solo se podra vender si el producto tiene stock, osea si es producto esta Activo
        Conexion con =  new Conexion();
        Connection c = con.conectar();
                
        try {
           Statement s = c.createStatement();           
           String consulta = "Select prod_codigo,prod_nombre,prod_valorcompra,prod_valorventa,prod_stock,id_categoria,prod_estado from producto where prod_estado = 'Activo' ";       
          

           ResultSet res = s.executeQuery(consulta);
           
           while (res.next()){
               
               Producto objProducto= new Producto();
               
               objProducto.setCodigoProd(res.getObject("prod_codigo").toString());
               objProducto.setNombreProd(res.getObject("prod_nombre").toString());
               objProducto.setValorCompraProd(Integer.parseInt(res.getObject("prod_valorcompra").toString()));
               objProducto.setValorVentaProd(Integer.parseInt(res.getObject("prod_valorventa").toString()));
               objProducto.setStockProd(Integer.parseInt(res.getObject("prod_stock").toString()));
               objProducto.setIdCategoriaProd(Integer.parseInt(res.getObject("id_categoria").toString()));
               objProducto.setEstadoProd(res.getObject("prod_estado").toString());
               
               listProducto.add(objProducto);
               
           }
                    c.close();
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }        
        
        return listProducto;
    }    
   
    public String VerImagenProducto(String CodigoProd) throws IOException{
       String image="";
       Conexion con =  new Conexion();
       Connection c = con.conectar();
       try{
           Statement s = c.createStatement();           
           String consulta = "select prod_imagen from producto where prod_codigo =? "; 
           PreparedStatement pst = c.prepareStatement(consulta);
           pst.setString(1,CodigoProd);
           ResultSet resultado= pst.executeQuery();
           while(resultado.next()){
               
                image = resultado.getObject("prod_imagen").toString();

           }
            pst.close();
       }catch(SQLException e)
       {    JOptionPane.showMessageDialog(null,e);   
            return null;
       }
        
        
       return image;
   }
    
    
    public void GuardarImagenLocal(String origen, String destino){
    
        try{
            
            Path From = Paths.get(origen);
            Path TO = Paths.get(destino);
            CopyOption[] options = new CopyOption[]{
            
                StandardCopyOption.REPLACE_EXISTING,
                StandardCopyOption.COPY_ATTRIBUTES
            };
            Files.copy(From,TO,options);
            System.out.println("Imagen guardada correctamente");
            
            
            
        }catch(IOException e){
            System.out.println("error en guardar la imagen");
            System.out.println("error: "+e.toString());
        
        }
    
    
    }
   
   
   
   public boolean InsertarDatosIngresoMerc( IngresoMercaderia objIngreso ){
       
        Producto prod = new Producto();
        Connection c = con.conectar();
        
        try {
                CallableStatement cs = c.prepareCall("{call Proc_IngresoCompra(?,?,?,?)}");
                String total = String.valueOf(objIngreso.getIngrTotal());
                String descuento = String.valueOf(objIngreso.getIngrDescuento());
                cs.setString(1,objIngreso.getIngrFecha());
                cs.setString(2,total);
                cs.setString(3,objIngreso.getIngrEstado());
                cs.setString(4,descuento);
                cs.executeQuery();
                System.out.println("Procedimiento ejecutado correctamente");

        } catch (SQLException ex) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }        
        
        return true;
    }
    
   public boolean InsertarDatosDetIngresoMerc( IngresoMercaderiaDetalle objIngresoDet ){
       
        Producto prod = new Producto();
        Connection c = con.conectar();
        
        try {
                CallableStatement cs = c.prepareCall("{call Proc_IngCompra(?,?,?)}");
                String Cantidad = String.valueOf(objIngresoDet.getDetaCantidad());
                String PrecioCompra = String.valueOf(objIngresoDet.getDetaPrecio());
                cs.setString(1,Cantidad);
                cs.setString(2,PrecioCompra);
                cs.setString(3,objIngresoDet.getProdCodigo());
                cs.executeQuery();
                System.out.println("Procedimiento ejecutado correctamente");

        } catch (SQLException ex) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }        
        
        return true;
    }
   
   public boolean InsertarDatosVentaMerc( VentaMercaderia objIngreso ){
       
        Producto prod = new Producto();
        Connection c = con.conectar();
        
        try {
                CallableStatement cs = c.prepareCall("{call Proc_Venta(?,?,?,?,?)}");
                String total = String.valueOf(objIngreso.getIngrTotal());
                String descuento = String.valueOf(objIngreso.getIngrDescuento());
                String subtotal = String.valueOf(objIngreso.getIngrsubtotal());
                cs.setString(1,objIngreso.getIngrFecha());
                cs.setString(2,total);
                cs.setString(3,subtotal);
                cs.setString(4,objIngreso.getIngrEstado());
                cs.setString(5,descuento);
                cs.executeQuery();
                System.out.println("Procedimiento ejecutado correctamente");

        } catch (SQLException ex) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }        
        
        return true;
    }
   
   
   public boolean InsertarDatosDetVentaMerc( VentaMercaderiaDetalle objIngresoDet ){
       
        Producto prod = new Producto();
        Connection c = con.conectar();
        
        try {
                CallableStatement cs = c.prepareCall("{call Proc_detVenta(?,?,?)}");
                String Cantidad = String.valueOf(objIngresoDet.getDetaCantidad());
                String PrecioCompra = String.valueOf(objIngresoDet.getDetaPrecio());
                cs.setString(1,Cantidad);
                cs.setString(2,PrecioCompra);
                cs.setString(3,objIngresoDet.getProdCodigo());
                cs.executeQuery();
                System.out.println("Procedimiento ejecutado correctamente");

        } catch (SQLException ex) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }        
        
        return true;
    }
   
   public int TraerStock(VentaMercaderiaDetalle objIngresoDet){
       
       int stock=0;
       Conexion con =  new Conexion();
       Connection c = con.conectar();
       try{
           Statement s = c.createStatement();           
           String consulta = "select prod_stock from producto where prod_codigo =? "; 
           PreparedStatement pst = c.prepareStatement(consulta);
           pst.setString(1,objIngresoDet.getProdCodigo());
           ResultSet resultado= pst.executeQuery();
           while(resultado.next()){
               
                
                stock = Integer.parseInt(resultado.getObject("prod_stock").toString()); 

           }
            pst.close();
       }catch(SQLException e)
       {    JOptionPane.showMessageDialog(null,e);   
            return 0;
       }
   
       return stock;
   
   }
   
     public void ConsultaComboboxProducto(JComboBox cbox_producto){
        java.sql.Connection conectar = null;
        
        
        
        // PreparedStatement pst = null; 
        //ResultSet resultado = null;
        String consulta = "Select prod_nombre from producto order by prod_nombre asc ";
        
        try{
            conectar = con.conectar();
            PreparedStatement pst = conectar.prepareStatement(consulta);
            ResultSet resultado= pst.executeQuery();
            //cbox_categoria.addItem("Seleccione una categoria");
            
            while( resultado.next()){
            
                cbox_producto.addItem(resultado.getString("prod_nombre"));
                
                
            }
            
            conectar.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
        
            if(conectar!=null)
                try{
                    conectar.close();
                    
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, e);
                }
            
        }
   
   
   
   
   
   }
     
      public String ObtenerIdProducto(String NomProducto){
        java.sql.Connection conectar = null;
        Producto prod = new Producto();
        
        String consulta = "Select prod_codigo from producto where prod_nombre=? ";
        
        try{
            conectar = con.conectar();
            PreparedStatement pst = conectar.prepareStatement(consulta);
            pst.setString(1,NomProducto);
            ResultSet resultado= pst.executeQuery();
            if(resultado.next()){
                
                
                
               String ret = resultado.getString("prod_codigo");
               
               return ret;
            }
            
             
            pst.close();
            
            
        
        }catch(SQLException e){
        
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
        return null;
   }  
      
      
       public ArrayList<IngresoMercaderia> ListarHistorialCompracompleto( ){
        ArrayList<IngresoMercaderia> listIngreso = new ArrayList<IngresoMercaderia>();
   
        Conexion con =  new Conexion();
        Connection c = con.conectar();
                
        try {
           Statement s = c.createStatement();           
           String consulta = "Select id_ingreso,ingr_fecha,ingr_total,ingr_estado,ingr_descuento from ingresomercaderia order by ingr_fecha desc";       
           

           ResultSet res = s.executeQuery(consulta);
           
           while (res.next()){
               
               IngresoMercaderia objIngreso= new IngresoMercaderia();
               
               
               objIngreso.setId(Integer.parseInt(res.getObject("id_ingreso").toString()));
               objIngreso.setIngrFecha(res.getObject("ingr_fecha").toString());
               objIngreso.setIngrTotal(Integer.parseInt(res.getObject("ingr_total").toString()));
               objIngreso.setIngrEstado(res.getObject("ingr_estado").toString());
               objIngreso.setIngrDescuento(Integer.parseInt(res.getObject("ingr_descuento").toString()));

               listIngreso.add(objIngreso);
               
           }
                    c.close();
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }        
        
        return listIngreso;
    }  
       
        public ArrayList<IngresoMercaderiaDetalle> ListarHistorialCompraDetcompleto(String idCompra ){
        ArrayList<IngresoMercaderiaDetalle> listDetIngreso = new ArrayList<IngresoMercaderiaDetalle>();
   
        Conexion con =  new Conexion();
        Connection c = con.conectar();
                
        try {
           //Statement s = c.createStatement();           
                 
           String consulta = "Select id_detalle_ingreso,detaingr_cantidad,detaingr_precio,prod_nombre "
                   + "from detalleingreso"
                   + " join producto using (prod_codigo) "
                   + "where id_ingreso=?";
           
           PreparedStatement pst = c.prepareStatement(consulta);
           pst.setString(1, idCompra);

           ResultSet res = pst.executeQuery();
           
           while (res.next()){
               
               IngresoMercaderiaDetalle objIngresodet= new IngresoMercaderiaDetalle();
               
               objIngresodet.setIdDetalleVenta(Integer.parseInt(res.getObject("id_detalle_ingreso").toString()));
               objIngresodet.setDetaCantidad(Integer.parseInt(res.getObject("detaingr_cantidad").toString()));
               objIngresodet.setDetaPrecio(Integer.parseInt(res.getObject("detaingr_precio").toString()));
               objIngresodet.setProdCodigo(res.getObject("prod_nombre").toString());

               listDetIngreso.add(objIngresodet);
               
           }
                    c.close();
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }        
        
        return listDetIngreso;
    }     
        
        
         public ArrayList<VentaMercaderia> ListarHistorialVentacompleto( ){
        ArrayList<VentaMercaderia> listVenta = new ArrayList<VentaMercaderia>();
   
        Conexion con =  new Conexion();
        Connection c = con.conectar();
                
        try {
           Statement s = c.createStatement();           
           String consulta = "Select id_venta,vent_fecha,venta_total,vent_estado,vent_descuento from venta order by vent_fecha desc";       
           

           ResultSet res = s.executeQuery(consulta);
           
           while (res.next()){
               
               VentaMercaderia objVentaMercaderia= new VentaMercaderia();
               
               
               objVentaMercaderia.setId(Integer.parseInt(res.getObject("id_venta").toString()));
               objVentaMercaderia.setIngrFecha(res.getObject("vent_fecha").toString());
               objVentaMercaderia.setIngrTotal(Integer.parseInt(res.getObject("venta_total").toString()));
               objVentaMercaderia.setIngrEstado(res.getObject("vent_estado").toString());
               objVentaMercaderia.setIngrDescuento(Integer.parseInt(res.getObject("vent_descuento").toString()));

               listVenta.add(objVentaMercaderia);
               
           }
                    c.close();
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }        
        
        return listVenta;
    }  
   
         
         
          public ArrayList<VentaMercaderiaDetalle> ListarHistorialVentaDetcompleto(String idventa ){
        ArrayList<VentaMercaderiaDetalle> listDetVenta = new ArrayList<VentaMercaderiaDetalle>();
   
        Conexion con =  new Conexion();
        Connection c = con.conectar();
                
        try {
    
           String consulta = "Select id_detalle_venta,deta_cantidad,deta_precio,prod_nombre "
                   + "from detalleventa"
                   + " join producto using (prod_codigo) "
                   + "where id_venta=?";
           
           PreparedStatement pst = c.prepareStatement(consulta);
           pst.setString(1, idventa);

           ResultSet res = pst.executeQuery();
           
           while (res.next()){
               
               VentaMercaderiaDetalle objVentaMercaderiaDetalle= new VentaMercaderiaDetalle();
               
               objVentaMercaderiaDetalle.setIdDetalleVenta(Integer.parseInt(res.getObject("id_detalle_venta").toString()));
               objVentaMercaderiaDetalle.setDetaCantidad(Integer.parseInt(res.getObject("deta_cantidad").toString()));
               objVentaMercaderiaDetalle.setDetaPrecio(Integer.parseInt(res.getObject("deta_precio").toString()));
               objVentaMercaderiaDetalle.setProdCodigo(res.getObject("prod_nombre").toString());

               listDetVenta.add(objVentaMercaderiaDetalle);
               
           }
                    c.close();
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }        
        
        return listDetVenta;
    }   
          
        public int TraerInversion() {
            java.sql.Connection conectar = null;

            
            String consulta = "Select sum(ingr_total) from ingresomercaderia";

            try {
                conectar = con.conectar();
                PreparedStatement pst = conectar.prepareStatement(consulta);
                ResultSet resultado = pst.executeQuery();
                resultado.next();
                
                int Invertido = Integer.parseInt(resultado.getString("sum(ingr_total)"));
                conectar.close();
                return Invertido;

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            } 
   
            return 0;
        }
   
        
        public int TraerVentas() {
            java.sql.Connection conectar = null;

            
            String consulta = "Select sum(venta_total) from venta";

            try {
                conectar = con.conectar();
                PreparedStatement pst = conectar.prepareStatement(consulta);
                ResultSet resultado = pst.executeQuery();
                resultado.next();
                
                int Invertido = Integer.parseInt(resultado.getString("sum(venta_total)"));
                conectar.close();
                return Invertido;

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            } 
   
            return 0;
        }
   
}


