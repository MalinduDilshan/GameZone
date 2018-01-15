/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ashen_Cafe.database;

import com.Ashen_Cafe.entity.ProgressBar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author MaLindu DiLshan
 */
public class DataBaseProgressBar {
    private Connection con;
    private PreparedStatement pst;
    private Statement st;
    private ResultSet rs;

 
public void getConnection(){//connection
    DataBaseConnection dbpc=new DataBaseConnection();
    con=dbpc.connection();
}
public void insert(ProgressBar pb){//insert method
    this.getConnection();
    String query="insert into progressbar (id, pvalue, timeclosed)values(?,?,?)";
        try {
            pst=con.prepareStatement(query);
                pst.setInt(1,pb.getId());
                pst.setInt(2,pb.getPvalue());
		pst.setString(3,pb.getTimeclosed());
		pst.executeUpdate();				
		con.close();
	    }
catch(SQLException e){
		System.out.println("My SQL Error in DBPb insert method"+"\n"+e.getMessage());
	    }
}
public void update(ProgressBar pb,int tempid){//update method
    this.getConnection();
	try{
		st=con.createStatement();
		st.executeUpdate("update progressbar set pvalue='"+pb.getPvalue()+"', timeclosed='"+pb.getTimeclosed()+"' where id='"+tempid+"'");
		con.close();
	    }
catch(SQLException e){
		System.out.println("SQL Error in DBPb update method"+"\n"+e.getMessage());
	    }
}
public void delete(int tempid){//delete method
    this.getConnection();
	try{
		st=con.createStatement();
		st.executeUpdate("delete from progressbar where id='"+tempid+"'");		
		con.close();
	    }
catch(SQLException e){
		System.out.println("SQL Error in DBPb delete method"+"\n"+e.getMessage());
	    }
}
public ProgressBar search(int tempid){//search method
    this.getConnection();
    ProgressBar pb=new ProgressBar();
	try{
		st=con.createStatement();
		rs=st.executeQuery("select *from progressbar where id='"+tempid+"'");

			while(rs.next()){
			pb.setId(rs.getInt(1));
                        pb.setPvalue(rs.getInt(2));
			pb.setTimeclosed(rs.getString(3));
			}				
		con.close();
            }
catch(SQLException e){
		System.out.println("SQL Error in DBPb search method"+"\n"+e.getMessage());
	    }
	return pb;		
	}
public ProgressBar searchAll(){//searchAll method
    this.getConnection();
    ProgressBar pb=new ProgressBar();
	try{
		st=con.createStatement();
		rs=st.executeQuery("select *from progressbar");

			while(rs.next()){
			pb.setId(rs.getInt(1));
                        pb.setPvalue(rs.getInt(2));
			pb.setTimeclosed(rs.getString(3));
			}				
		con.close();
            }
catch(SQLException e){
		System.out.println("SQL Error in DBPb searchAll method"+"\n"+e.getMessage());
	    }
	return pb;		
	}
} 

