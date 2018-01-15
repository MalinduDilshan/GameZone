/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ashen_Cafe.database;

import com.Ashen_Cafe.entity.Terminal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author MaLindu DiLshan
 */
public class DataBaseTerminal {
    private Connection con;
    private PreparedStatement pst;
    private Statement st;
    private ResultSet rs;

 
public void getConnection(){//connection
    DataBaseConnection dbpc=new DataBaseConnection();
    con=dbpc.connection();
}
public void insert(Terminal te){//insert method
    this.getConnection();
    String query="insert into terminals (id, pcname, systime, duration ,date)values(?,?,?,?,?)";
        try {
            pst=con.prepareStatement(query);
                pst.setInt(1,te.getId());
                pst.setString(2,te.getPcname());
		pst.setString(3,te.getSystime());
		pst.setString(4,te.getDuration());
                pst.setString(5,te.getSysdate());
		pst.executeUpdate();				
		con.close();
	    }
catch(SQLException e){
		System.out.println("My SQL Error in DBTe insert method"+"\n"+e.getMessage());
	    }
}
public void update(Terminal te,int tempid){//update method
    this.getConnection();
	try{
		st=con.createStatement();
		st.executeUpdate("update terminals set pcname='"+te.getPcname()+"', systime='"+te.getSystime()+"', duration='"+te.getDuration()+"',date='"+te.getSysdate()+"' where id='"+tempid+"'");
		con.close();
	    }
catch(SQLException e){
		System.out.println("SQL Error in DBTe update method"+"\n"+e.getMessage());
	    }
}
public void delete(int tempid){//delete method
    this.getConnection();
	try{
		st=con.createStatement();
		st.executeUpdate("delete from terminals where id='"+tempid+"'");		
		con.close();
	    }
catch(SQLException e){
		System.out.println("SQL Error in DBTe delete method"+"\n"+e.getMessage());
	    }
}
public Terminal search(int tempid){//search method
    this.getConnection();
    Terminal te=new Terminal();
	try{
		st=con.createStatement();
		rs=st.executeQuery("select *from terminals where id='"+tempid+"'");

			while(rs.next()){
			te.setId(rs.getInt(1));
                        te.setPcname(rs.getString(2));
			te.setSystime(rs.getString(3));
			te.setDuration(rs.getString(4));
                        te.setSysdate(rs.getString(5));
			}				
		con.close();
            }
catch(SQLException e){
		System.out.println("SQL Error in DBTe search method"+"\n"+e.getMessage());
	    }
	return te;		
	}
public Terminal searchAll(){//searchAll method
    this.getConnection();
    Terminal te=new Terminal();
	try{
		st=con.createStatement();
		rs=st.executeQuery("select *from terminals");

			while(rs.next()){
			te.setId(rs.getInt(1));
                        te.setPcname(rs.getString(2));
			te.setSystime(rs.getString(3));
			te.setDuration(rs.getString(4));
                        te.setSysdate(rs.getString(5));
			}				
		con.close();
            }
catch(SQLException e){
		System.out.println("SQL Error in DBTe searchAll method"+"\n"+e.getMessage());
	    }
	return te;		
	}
public int searchRows(){//searchRows method
    this.getConnection();
    Terminal te=new Terminal();
    int i=0;
	try{
		st=con.createStatement();
		rs=st.executeQuery("select *from terminals");

			while(rs.next()){
			te.setId(rs.getInt(1));
                        te.setPcname(rs.getString(2));
			te.setSystime(rs.getString(3));
			te.setDuration(rs.getString(4));
                        te.setSysdate(rs.getString(5));
                        i++;
			}				
		con.close();
            }
catch(SQLException e){
		System.out.println("SQL Error in DBTe searchAll method"+"\n"+e.getMessage());
	    }
	return i;		
	}
} 
