/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;

/**
 *
 * @author abhij
 */
public class ConnectionProvider {
    public static Connection getCon(){
        String username = "your_username";
        String password = "your_password";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagement",username,password);
            return(con);
        }
        catch(Exception e){
            return null;
        }
    }
    
}
