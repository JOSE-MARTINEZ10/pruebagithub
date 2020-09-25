/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import static java.lang.Character.UnicodeBlock.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jose_
 */
public class conectar {
    
    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String usuario = "root";
    private static final String contraseña ="1234";
    private static final String url = "jdbc:mysql://localhost:3306/bdmobile";
    
    public conectar (){
        
        conn=null;
    try{
    
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    conn=DriverManager.getConnection(url,usuario,contraseña);
    
        System.out.println("CONEXION CON EXITO...");
    }
    catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e){
    JOptionPane.showMessageDialog(null,e.getMessage());
    }
    }
    
    //este metodo nos retorna la conexion
    public Connection getConnection (){
        
        return conn;
    }
    
    //con este metodo nos desconectamos de la base de datos
    public void desconectar(){
         conn=null;
          
         if(conn==null){
             System.out.println("CONExION TERMINADA...");  
         }        
    }
    
}
