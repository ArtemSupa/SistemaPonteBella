/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;


import java.sql.Connection;
import java.sql.DriverManager;
import oracle.jdbc.OraclePooledConnectionBuilder;


/**
 *
 * @author ArtemSupa
 */
public class Conexion {
     Connection conectar = null;
    
    public Connection conectar(){
        try{
            
            conectar = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","bdpontebella","bdpontebella");
            
            System.out.println("Conexion Realizada");
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());            
        }
        return conectar;
    }
}
