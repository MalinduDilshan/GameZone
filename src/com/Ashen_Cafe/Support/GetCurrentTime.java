/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ashen_Cafe.Support;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author MaLindu DiLshan
 */
public class GetCurrentTime {
    
    private String time,year,month;
    
    public String getTime(){
        
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        time=sdf.format(cal.getTime());
        
        //System.out.println("Current System time is :"+time);
        return time;
    }
    
    public String getDate(){
        
        Calendar cal = Calendar.getInstance();
        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy.MM.dd");
        
        return ft.format(dNow);
    }
    
    public String getStartDate(){
        
        year=Integer.toString(Calendar.getInstance().get(Calendar.YEAR));
        month=Integer.toString(Calendar.getInstance().get(Calendar.MONTH)+1);   //month is not working if u not add 1
        
        //System.out.println("Year is :"+year);
        //System.out.println("Month is :"+month);
        
        String startDate=year.concat("."+month+".01");
        
        System.out.println("Start Date in GetCurrentTime class :"+startDate);

        return startDate;   
    }
    
    public String getEndDate(){
        
        year=Integer.toString(Calendar.getInstance().get(Calendar.YEAR));
        month=Integer.toString(Calendar.getInstance().get(Calendar.MONTH)+1);   //month is not working if u not add 1
        
        //System.out.println("Year is :"+year);
        //System.out.println("Month is :"+month);
        
        String endDate=year.concat("."+month+".31");

        System.out.println("End Date in GetCurrentTime class :"+endDate);

        return endDate;   
    }
    
}
