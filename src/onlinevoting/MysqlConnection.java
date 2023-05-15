/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinevoting;

import java.sql.*;

/**
 *
 * @author Bekrom
 */
public class MysqlConnection {
    public static Connection con;
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/voter","root","123456");
            System.out.println("Connection Success By Mr. Bekrom Roy.");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
