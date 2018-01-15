/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ashen_Cafe.database;

import com.Ashen_Cafe.entity.MembershipTime;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author MaLindu DiLshan
 */
public class DataBaseMembershipTime {
    
private Connection con;
    private PreparedStatement pst;
    private Statement st;
    private ResultSet rs;

 
public void getConnection(){//connection
    DataBaseConnection dbmship=new DataBaseConnection();
    con=dbmship.connection();
}
public void insert(MembershipTime mship){//insert method
    this.getConnection();
    String query="insert into membershiptime (membertype, charge)values(?,?)";
        try {
            pst=con.prepareStatement(query);
		pst.setString(1,mship.getMembertype());
		pst.setInt(2,mship.getCharge());
		pst.executeUpdate();				
		con.close();
	    }
catch(SQLException e){
		System.out.println("My SQL Error in insert method"+"\n"+e.getMessage());
	    }
}
public void update(MembershipTime mship,String temptype){//update method
    this.getConnection();
	try{
		st=con.createStatement();
		st.executeUpdate("update membershiptime set charge='"+mship.getCharge()+"' where membertype='"+temptype+"'");
		con.close();
	    }
catch(SQLException e){
		System.out.println("SQL Error in update method"+"\n"+e.getMessage());
	    }
}
public void delete(String temptype){//delete method
    this.getConnection();
	try{
		st=con.createStatement();
		st.executeUpdate("delete from membershiptime where membertype='"+temptype+"'");		
		con.close();
	    }
catch(SQLException e){
		System.out.println("SQL Error in delete method"+"\n"+e.getMessage());
	    }
}
public MembershipTime search(String temptype){//search method
    this.getConnection();
    MembershipTime mship=new MembershipTime();
	try{
		st=con.createStatement();
		rs=st.executeQuery("select*from membershiptime where membertype='"+temptype+"'");

			while(rs.next()){
			mship.setMembertype(rs.getString(1));
                        mship.setCharge(rs.getInt(2));
			}				
		con.close();
            }
catch(SQLException e){
		System.out.println("SQL Error in search method"+"\n"+e.getMessage());
	    }
	return mship;		
	}
public MembershipTime searchAll(){//searchAll method
    this.getConnection();
    MembershipTime mship=new MembershipTime();
	try{
		st=con.createStatement();
		rs=st.executeQuery("select *from membershiptime" );

			while(rs.next()){
			mship.setMembertype(rs.getString(1));
                        mship.setCharge(rs.getInt(2));
			}				
		con.close();
            }
catch(SQLException e){
		System.out.println("SQL Error in search All method"+"\n"+e.getMessage());
	    }
	return mship;		
	}
}

