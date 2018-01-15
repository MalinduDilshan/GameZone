/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ashen_Cafe.Reports;

import com.Ashen_Cafe.Support.GetCurrentTime;
import com.Ashen_Cafe.database.DataBaseConnection;
import java.sql.Connection;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.*;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.engine.data.*;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.engine.design.JasperDesign;
/**
 *
 * @author MaLindu DiLshan
 */
public class GenerateReport {
    
    private DataBaseConnection dbc;
    private Connection con;
    private String myquery;
    private String date;
    
    public void dayEndReport(){//Done
        
        GetCurrentTime gct=new GetCurrentTime();
        date=gct.getDate();
        System.out.println("Today is..."+date);
        
    try{
	myquery = "select*from computerusage inner join members on computerusage.memberid=members.memberid where computerusage.usedate='"+date+"'";
        
	dbc=new DataBaseConnection();
        con = dbc.connection();
	JasperDesign jd = JRXmlLoader.load(getClass().getResourceAsStream("dayEndReport.jrxml"));
	JRDesignQuery newQuery = new JRDesignQuery();
	newQuery.setText(myquery);
	jd.setQuery(newQuery);
	JasperReport jr = JasperCompileManager.compileReport(jd);
	JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
	JasperViewer.viewReport(jp, false);	
	}
	catch(Exception ex){
            System.out.println("Error in dayEndReport..."+ex.getMessage());
			}
        
    }
    
    public void allPCPaymentReport(String startDate,String endDate){//not working
        
        System.out.println("Start date :"+startDate);
        System.out.println("End date :"+endDate);
        
    try{
	myquery = "select pcid,pcname,usedate,sum(payment) from computerusage where computerusage.usedate >= '"+startDate+"' and computerusage.usedate <= '"+endDate+"' group by pcid,pcname";
	
        dbc=new DataBaseConnection();
        con = dbc.connection();
	JasperDesign jd = JRXmlLoader.load(getClass().getResourceAsStream("allPCUsageReport.jrxml"));
	JRDesignQuery newQuery = new JRDesignQuery();
	newQuery.setText(myquery);
	jd.setQuery(newQuery);
	JasperReport jr = JasperCompileManager.compileReport(jd);
	JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
	JasperViewer.viewReport(jp, false);	
	}
	catch(Exception ex){
            System.out.println("Error in allPCPaymentReport..."+ex.getMessage());
			}
        
    }
    
    public void pcUsageReport(String startDate,String endDate,int pcid){//Done

        System.out.println("Start date :"+startDate);
        System.out.println("End date :"+endDate);
        System.out.println("PC ID :"+pcid);
        
    try{
	myquery = "select*from computerusage inner join members on computerusage.memberid=members.memberid where computerusage.usedate >= '"+startDate+"' and computerusage.usedate <= '"+endDate+"' and computerusage.pcid='"+pcid+"'"; 
				
        dbc=new DataBaseConnection();
        con = dbc.connection();
	JasperDesign jd = JRXmlLoader.load(getClass().getResourceAsStream("pcUsageReport.jrxml"));
	JRDesignQuery newQuery = new JRDesignQuery();
	newQuery.setText(myquery);
	jd.setQuery(newQuery);
	JasperReport jr = JasperCompileManager.compileReport(jd);
	JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
	JasperViewer.viewReport(jp, false);	
	}
	catch(Exception ex){
            System.out.println("Error in pcUsageReport..."+ex.getMessage());
			}    
        
    }
    
    /*public void allMemberPaymentReport(int memid){//Not working
        System.out.println("Member id :"+memid);
    try{
	myquery = "";
				
        dbc=new DataBaseConnection();
        con = dbc.connection();
	JasperDesign jd = JRXmlLoader.load(getClass().getResourceAsStream("allMemberUsageReport.jrxml"));
	JRDesignQuery newQuery = new JRDesignQuery();
	newQuery.setText(myquery);
	jd.setQuery(newQuery);
	JasperReport jr = JasperCompileManager.compileReport(jd);
	JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
	JasperViewer.viewReport(jp, false);	
	}
	catch(Exception ex){
            System.out.println("Error in allMemberPaymentReport..."+ex.getMessage());
			}    
    }*/
    
    public void memberUsageReport(String startDate,String endDate,int mid){//Done
        
        System.out.println("Start date :"+startDate);
        System.out.println("End date :"+endDate);
        System.out.println("Member ID :"+mid);
        
    try{
	myquery = "select*from computerusage inner join members on computerusage.memberid=members.memberid where computerusage.usedate >= '"+startDate+"' and computerusage.usedate <= '"+endDate+"' and computerusage.memberid='"+mid+"'";
				
        dbc=new DataBaseConnection();
        con = dbc.connection();
	JasperDesign jd = JRXmlLoader.load(getClass().getResourceAsStream("memberUsageReport.jrxml"));
	JRDesignQuery newQuery = new JRDesignQuery();
	newQuery.setText(myquery);
	jd.setQuery(newQuery);
	JasperReport jr = JasperCompileManager.compileReport(jd);
	JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
	JasperViewer.viewReport(jp, false);	
	}
	catch(Exception ex){
            System.out.println("Error in memberUsageReport..."+ex.getMessage());
			}    
    }
    
    public void monthlyEndReport(String startDate,String endDate){//Not working
    try{
	myquery = "select*from computerusage where computerusage.usedate >= '"+startDate+"' and computerusage.usedate <= '"+endDate+"'";
				
        dbc=new DataBaseConnection();
        con = dbc.connection();
	JasperDesign jd = JRXmlLoader.load(getClass().getResourceAsStream("monthlyEndReport.jrxml"));
	JRDesignQuery newQuery = new JRDesignQuery();
	newQuery.setText(myquery);
	jd.setQuery(newQuery);
	JasperReport jr = JasperCompileManager.compileReport(jd);
	JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
	JasperViewer.viewReport(jp, false);	
	}
	catch(Exception ex){
            System.out.println("Error in monthlyEndReport..."+ex.getMessage());
			}    
    }
}
