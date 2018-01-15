/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ashen_Cafe.database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author MaLindu DiLshan
 */
public class DataBaseConnection {
    private Connection con;
    private String dbpath;
public Connection connection(){
    try{
		Class.forName("com.mysql.jdbc.Driver");
		dbpath="jdbc:mysql://localhost/gamezone";
                con=DriverManager.getConnection(dbpath,"root","");
        }
    catch (ClassNotFoundException e){
      		System.out.println("My SQL Error class not found Exception occured"+"\n"+e.getMessage());      
    }   catch (SQLException e) {
                System.out.println("My SQL Error in insert method"+"\t"+e.getMessage());
        }
        return con;
}
}