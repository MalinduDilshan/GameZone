/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ashen_Cafe.database;

import com.Ashen_Cafe.entity.Member;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author MaLindu DiLshan
 */
public class DataBaseMember {
 
    private Connection con;
    private PreparedStatement pst;
    private Statement st;
    private ResultSet rs;

 
public void getConnection(){//connection
    DataBaseConnection dbdox=new DataBaseConnection();
    con=dbdox.connection();
}
public void insert(Member dox){//insert method
    this.getConnection();
    String query="insert into members (memberid, nic, fname, lname, mobile, email, photopath)values(?,?,?,?,?,?,?)";
        try {
            pst=con.prepareStatement(query);
                pst.setInt(1,dox.getId());
		pst.setString(2,dox.getNic());
		pst.setString(3,dox.getFname());
                pst.setString(4,dox.getLname());
                pst.setString(5,dox.getMobile());            
		pst.setString(6,dox.getEmail());
                pst.setString(7,dox.getPhotopath());
		pst.executeUpdate();				
		con.close();
	    }
catch(SQLException e){
		System.out.println("My SQL Error in insert method"+"\n"+e.getMessage());
	    }
}
public void update(Member dox,int tempid){//update method
    this.getConnection();
	try{
		st=con.createStatement();
		st.executeUpdate("update members set nic='"+dox.getNic()+"', fname='"+dox.getFname()+"', lname='"+dox.getLname()+"', mobile='"+dox.getMobile()+"', email='"+dox.getEmail()+"', photopath='"+dox.getPhotopath()+"' where memberid='"+tempid+"'");
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
		st.executeUpdate("delete from members where memberid='"+tempid+"'");		
		con.close();
	    }
catch(SQLException e){
		System.out.println("SQL Error in delete method"+"\n"+e.getMessage());
	    }
}
public Member search(int tempid){//search method
    this.getConnection();
    Member dox=new Member();
	try{
		st=con.createStatement();
		rs=st.executeQuery("select*from members where memberid='"+tempid+"'");

			while(rs.next()){
			dox.setId(rs.getInt(1));
			dox.setNic(rs.getString(2));
			dox.setFname(rs.getString(3));
                        dox.setLname(rs.getString(4));
                        dox.setMobile(rs.getString(5));
                        dox.setEmail(rs.getString(6));
			dox.setPhotopath(rs.getString(7));
			}				
		con.close();
            }
catch(SQLException e){
		System.out.println("SQL Error in search method"+"\n"+e.getMessage());
	    }
	return dox;		
	}
public Member searchAll(){//searchAll method
    this.getConnection();
    Member dox=new Member();
	try{
		st=con.createStatement();
		rs=st.executeQuery("select *from members" );

			while(rs.next()){
			dox.setId(rs.getInt(1));
			dox.setNic(rs.getString(2));
			dox.setFname(rs.getString(3));
                        dox.setLname(rs.getString(4));
                        dox.setMobile(rs.getString(5));
                        dox.setEmail(rs.getString(6));
			dox.setPhotopath(rs.getString(7));
			}				
		con.close();
            }
catch(SQLException e){
		System.out.println("SQL Error in search All method"+"\n"+e.getMessage());
	    }
	return dox;		
	}

public int searchRows(){//searchRows method
    this.getConnection();
    Member dox=new Member();
    int i=0;
	try{
		st=con.createStatement();
		rs=st.executeQuery("select *from members" );

			while(rs.next()){
			dox.setId(rs.getInt(1));
			dox.setNic(rs.getString(2));
			dox.setFname(rs.getString(3));
                        dox.setLname(rs.getString(4));
                        dox.setMobile(rs.getString(5));
                        dox.setEmail(rs.getString(6));
			dox.setPhotopath(rs.getString(7));
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
