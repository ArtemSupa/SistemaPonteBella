/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import bd.Conexion;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import modelo.Producto;




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
            consulta += "Insert Into producto (PROD_CODIGO, PROD_NOMBRE, PROD_VALORCOMPRA, PROD_VALORVENTA, PROD_STOCK, ID_CATEGORIA, PROD_ESTADO) values( ";       
            consulta += "'"+objProducto.getCodigoProd()+"',";
            consulta += "'"+objProducto.getNombreProd()+"',";
            consulta += "'"+objProducto.getValorCompraProd()+"',";
            consulta += "'"+objProducto.getValorVentaProd()+"',";
            consulta += "'"+objProducto.getStockProd()+"',";
            consulta += ""+objProducto.getIdCategoriaProd()+",";
            consulta += "'"+objProducto.getEstadoProd()+"'";
            consulta += ")";
            
            
            
            s.executeUpdate(consulta);
            
            c.close();
           
        } catch (SQLException ex) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }        
        
        return true;
    }
    
    
    
    public boolean InsertarImagenProd(Producto objProducto,String ruta){
        InputStream entrada = null;
        String consulta;
       
        Connection c = con.conectar();
        PreparedStatement pst = null;
        File foto;
        try{
        
            
                foto = new File(ruta);
                entrada = new FileInputStream(foto);
                consulta="Update producto set prod_imagen =? where prod_codigo = ?";
                
                pst= c.prepareStatement(consulta);
                pst.setBinaryStream(1,entrada,(int) foto.length());
                pst.setString(2,objProducto.getCodigoProd());
                
                pst.executeUpdate();
                c.close();
        }catch (SQLException ex) {
        
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
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
}
