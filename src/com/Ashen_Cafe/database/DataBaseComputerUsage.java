/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ashen_Cafe.database;

import com.Ashen_Cafe.Support.GetHoursAndMin;
import com.Ashen_Cafe.entity.ComputerUsage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author MaLindu DiLshan
 */
public class DataBaseComputerUsage {
    private Connection con;
    private PreparedStatement pst;
    private Statement st;
    private ResultSet rs;
    private GetHoursAndMin ghm;

 
public void getConnection(){//connection
    DataBaseConnection dbpc=new DataBaseConnection();
    con=dbpc.connection();
}
public void insert(ComputerUsage pc){//insert method
    this.getConnection();
    ghm=new GetHoursAndMin();
    String query="insert into computerusage (pcid, memberid, pcname, startedtime, usages, usedate, payment)values(?,?,?,?,?,?,?)";
        try {
            pst=con.prepareStatement(query);
                pst.setInt(1,pc.getId());
		pst.setString(2,pc.getMemberid());
		pst.setString(3,pc.getPcname());
                pst.setString(4,pc.getStartedtime());
		pst.setString(5,ghm.setStdTimeDB(pc.getUsage()));
                pst.setString(6,pc.getDate());
                pst.setDouble(7,Double.parseDouble(pc.getPayment()));
		pst.executeUpdate();				
		con.close();
	    }
catch(SQLException e){
		System.out.println("My SQL Error in insert method DB Computer Usage "+"\n"+e.getMessage());
	    }
}
public void update(ComputerUsage pc,int tempid){//update method
    this.getConnection();
    ghm=new GetHoursAndMin();
	try{
		st=con.createStatement();
		st.executeUpdate("update computerusage set memberid='"+pc.getMemberid()+"', pcname='"+pc.getPcname()+"', startedtime='"+pc.getStartedtime()+"', usages='"+ghm.setStdTimeDB(pc.getUsage())+"', usedate='"+pc.getDate()+"', payment='"+pc.getPayment()+"' where id='"+tempid+"'");
		con.close();
	    }
catch(SQLException e){
		System.out.println("SQL Error in update method DB Computer Usage "+"\n"+e.getMessage());
	    }
}
public void delete(int tempid){//delete method
    this.getConnection();
	try{
		st=con.createStatement();
		st.executeUpdate("delete from computerusage where id='"+tempid+"'");		
		con.close();
	    }
catch(SQLException e){
		System.out.println("SQL Error in delete method DB Computer Usage "+"\n"+e.getMessage());
	    }
}
public ComputerUsage search(int tempid){//search method
    this.getConnection();
    ghm=new GetHoursAndMin();
    ComputerUsage pc=new ComputerUsage();
	try{
		st=con.createStatement();
		rs=st.executeQuery("select*from computerusage where id='"+tempid+"'");

			while(rs.next()){
			pc.setId(rs.getInt(1));
			pc.setMemberid(rs.getString(2));
                        pc.setPcname(rs.getString(3));
                        pc.setStartedtime(rs.getString(4));
                        pc.setUsage(ghm.getStdTimeDB(rs.getString(5)));
                        pc.setDate(rs.getString(6));
                        pc.setPayment(Double.toString(rs.getDouble(7)));
			}				
		con.close();
            }
catch(SQLException e){
		System.out.println("SQL Error in search method DB Computer Usage "+"\n"+e.getMessage());
	    }
	return pc;		
	}
public ComputerUsage searchAll(){//searchAll method
    this.getConnection();
    ghm=new GetHoursAndMin();
    ComputerUsage pc=new ComputerUsage();
	try{
		st=con.createStatement();
		rs=st.executeQuery("select*from computerusage" );

			while(rs.next()){
			pc.setId(rs.getInt(1));
			pc.setMemberid(rs.getString(2));
                        pc.setPcname(rs.getString(3));
                        pc.setStartedtime(rs.getString(4));
                        pc.setUsage(ghm.getStdTimeDB(rs.getString(5)));
                        pc.setDate(rs.getString(6));
                        pc.setPayment(Double.toString(rs.getDouble(7)));
			}				
		con.close();
            }
catch(SQLException e){
		System.out.println("SQL Error in search All method DB Computer Usage "+"\n"+e.getMessage());
	    }
	return pc;		
	}  
}
