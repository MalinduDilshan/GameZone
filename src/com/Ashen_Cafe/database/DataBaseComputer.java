/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ashen_Cafe.database;

import com.Ashen_Cafe.entity.Computer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author MaLindu DiLshan
 */
public class DataBaseComputer {
    private Connection con;
    private PreparedStatement pst;
    private Statement st;
    private ResultSet rs;

 
public void getConnection(){//connection
    DataBaseConnection dbpc=new DataBaseConnection();
    con=dbpc.connection();
}
public void insert(Computer pc){//insert method
    this.getConnection();
    String query="insert into computers (id, pcname, ipaddress)values(?,?,?)";
        try {
            pst=con.prepareStatement(query);
                pst.setInt(1,pc.getId());
		pst.setString(2,pc.getPcName());
		pst.setString(3,pc.getIpAddress());
		pst.executeUpdate();				
		con.close();
	    }
catch(SQLException e){
		System.out.println("My SQL Error in insert method"+"\n"+e.getMessage());
	    }
}
public void update(Computer pc,int tempid){//update method
    this.getConnection();
	try{
		st=con.createStatement();
		st.executeUpdate("update computers set pcname='"+pc.getPcName()+"', ipaddress='"+pc.getIpAddress()+"' where id='"+tempid+"'");
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
		st.executeUpdate("delete from computers where id='"+tempid+"'");		
		con.close();
	    }
catch(SQLException e){
		System.out.println("SQL Error in delete method"+"\n"+e.getMessage());
	    }
}
public Computer search(int tempid){//search method
    this.getConnection();
    Computer pc=new Computer();
	try{
		st=con.createStatement();
		rs=st.executeQuery("select *from computers where id='"+tempid+"'");

			while(rs.next()){
			pc.setId(rs.getInt(1));
			pc.setPcName(rs.getString(2));
			pc.setIpAddress(rs.getString(3));
			}				
		con.close();
            }
catch(SQLException e){
		System.out.println("SQL Error in search method"+"\n"+e.getMessage());
	    }
	return pc;		
	}
public Computer searchAll(){//searchAll method
    this.getConnection();
    Computer pc=new Computer();
	try{
		st=con.createStatement();
		rs=st.executeQuery("select *from computers" );

			while(rs.next()){
			pc.setId(rs.getInt(1));
			pc.setPcName(rs.getString(2));
			pc.setIpAddress(rs.getString(3));
			}				
		con.close();
            }
catch(SQLException e){
		System.out.println("SQL Error in search All method"+"\n"+e.getMessage());
	    }
	return pc;		
	}

public int searchRows(){//searchRows method
    this.getConnection();
    Computer pc=new Computer();
    int i=0;
	try{
		st=con.createStatement();
		rs=st.executeQuery("select * from computers" );

			while(rs.next()){
			pc.setId(rs.getInt(1));
			pc.setPcName(rs.getString(2));
			pc.setIpAddress(rs.getString(3));
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
