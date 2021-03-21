
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
   Connection con;
   
   public Conexion (){
       
       try{
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/disquera","root","");
           JOptionPane.showMessageDialog(null, "Conexión Exitosa");
       }catch (ClassNotFoundException | SQLException e){
           JOptionPane.showMessageDialog(null, "Conexión Erronea");
       }
   }
   
   
   public Connection getConnection(){
       return con;
   }
}
