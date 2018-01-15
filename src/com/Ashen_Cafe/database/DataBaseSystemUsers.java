/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ashen_Cafe.database;

import com.Ashen_Cafe.entity.Systemusers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author MaLindu DiLshan
 */
public class DataBaseSystemUsers {
    
private Connection con;
    private PreparedStatement pst;
    private Statement st;
    private ResultSet rs;

 
public void getConnection(){//connection
    DataBaseConnection dbsys=new DataBaseConnection();
    con=dbsys.connection();
}
public void insert(Systemusers sys){//insert method
    this.getConnection();
    String query="insert into systemusers (id, nic, fname, lname, mobile, username, password,type)values(?,?,?,?,?,?,?,?)";
        try {
            pst=con.prepareStatement(query);
                pst.setInt(1,sys.getId());
		pst.setString(2,sys.getNic());
		pst.setString(3,sys.getFname());
                pst.setString(4,sys.getLname());
                pst.setString(5,sys.getMobile());    
                pst.setString(6,sys.getUsername());
                pst.setString(7,sys.getPassword());
                pst.setString(8,sys.getType());
		pst.executeUpdate();				
		con.close();
	    }
catch(SQLException e){
		System.out.println("My SQL Error in insert method"+"\n"+e.getMessage());
	    }
}
public void update(Systemusers sys,int tempid){//update method
    this.getConnection();
	try{
		st=con.createStatement();
		st.executeUpdate("update systemusers set nic='"+sys.getNic()+"', fname='"+sys.getFname()+"', lname='"+sys.getLname()+"', mobile='"+sys.getMobile()+"', username='"+sys.getUsername()+"', password='"+sys.getPassword()+"', type='"+sys.getType()+"' where id='"+tempid+"'");
		con.close();
	    }
catch(SQLException e){
		System.out.println("SQL Error in update method"+"\n"+e.getMessage());
	    }
}
public void delete(int tempid){//delete method
    this.getConnection();
	try{
		st=con.createStatement();
		st.executeUpdate("delete from systemusers where id='"+tempid+"'");		
		con.close();
	    }
catch(SQLException e){
		System.out.println("SQL Error in delete method"+"\n"+e.getMessage());
	    }
}
public Systemusers search(int tempid){//search method
    this.getConnection();
    Systemusers sys=new Systemusers();
	try{
		st=con.createStatement();
		rs=st.executeQuery("select*from systemusers where id='"+tempid+"'");

			while(rs.next()){
			sys.setId(rs.getInt(1));
			sys.setNic(rs.getString(2));
			sys.setFname(rs.getString(3));
                        sys.setLname(rs.getString(4));
                        sys.setMobile(rs.getString(5));
                        sys.setUsername(rs.getString(6));
			sys.setPassword(rs.getString(7));
                        sys.setType(rs.getString(8));
			}				
		con.close();
            }
catch(SQLException e){
		System.out.println("SQL Error in search method"+"\n"+e.getMessage());
	    }
	return sys;		
	}
public Systemusers searchAll(){//searchAll method
    this.getConnection();
    Systemusers sys=new Systemusers();
	try{
		st=con.createStatement();
		rs=st.executeQuery("select *from systemusers" );

			while(rs.next()){
			sys.setId(rs.getInt(1));
			sys.setNic(rs.getString(2));
			sys.setFname(rs.getString(3));
                        sys.setLname(rs.getString(4));
                        sys.setMobile(rs.getString(5));
                        sys.setUsername(rs.getString(6));
			sys.setPassword(rs.getString(7));
                        sys.setType(rs.getString(8));
			}				
		con.close();
            }
catch(SQLException e){
		System.out.println("SQL Error in search All method"+"\n"+e.getMessage());
	    }
	return sys;		
	}

public int searchRows(){//searchRows method
    this.getConnection();
    Systemusers sys=new Systemusers();
    int i=0;
	try{
		st=con.createStatement();
		rs=st.executeQuery("select *from systemusers" );

			while(rs.next()){
			sys.setId(rs.getInt(1));
			sys.setNic(rs.getString(2));
			sys.setFname(rs.getString(3));
                        sys.setLname(rs.getString(4));
                        sys.setMobile(rs.getString(5));
                        sys.setUsername(rs.getString(6));
			sys.setPassword(rs.getString(7));
                        sys.setType(rs.getString(8));
                        i++;
			}				
		con.close();
            }
catch(SQLException e){
		System.out.println("SQL Error in search All method"+"\n"+e.getMessage());
	    }
	return i;		
	}
}
