/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ashen_Cafe.Support;

import com.Ashen_Cafe.database.DataBaseTerminal;
import com.Ashen_Cafe.entity.Terminal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author MaLindu DiLshan
 */
public class GetTimeLeft {
    
    private int hours,min,sec,ahours,amin,asec,leftTime;
    private String currentDate,assignedDate,yyyy,mm,dd,xyyy,xm,xd,time;

    public GetTimeLeft() {
        this.hours = 0;
        this.min = 0;
        this.sec = 0;
    }
    
    public int getTime(int id){
        
        DataBaseTerminal dt=new DataBaseTerminal();
        dt.getConnection();
        Terminal te= new Terminal();
        te=dt.search(id);
              //System.out.println(te.getSystime());
              //System.out.println(te.getDuration());
        
        Calendar cal = Calendar.getInstance();
        Date dNow = new Date();
        
        Validation vd=new Validation();
        
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy.MM.dd"); 
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        
        time=sdf.format(cal.getTime());
        
        currentDate=ft.format(dNow);
        //System.out.println("Current Date: " + currentDate);
        
        assignedDate=te.getSysdate();
        //System.out.println("Assigned Date: " + assignedDate);
        
            yyyy=te.getSysdate().substring(0,4);
            mm=te.getSysdate().substring(5,7);
            dd=te.getSysdate().substring(8,10);
            
          /*  System.out.println("Assign Year :" + yyyy);
            System.out.println("Assign Month :" + mm);
            System.out.println("Assign Day :" + dd);*/
            
            
            xyyy=currentDate.substring(0,4);
            xm=currentDate.substring(5,7);
            xd=currentDate.substring(8,10);
            
          /*  System.out.println("Year :" + xyyy);
            System.out.println("Month :" + xm);
            System.out.println("Day :" + xd);*/
            
        if(currentDate.equals(assignedDate)){   //should be same date
            

        ahours=Integer.parseInt(te.getSystime().substring(0,2));
        amin=Integer.parseInt(te.getSystime().substring(3,5));
        asec=Integer.parseInt(te.getSystime().substring(6,8));
        
          /*  System.out.println("Assign hours :" + ahours);
            System.out.println("Assign Min :" + amin);
            System.out.println("Assign sec :" + asec);*/
            
        hours=Integer.parseInt(time.substring(0,2));
        min=Integer.parseInt(time.substring(3,5));
        sec=Integer.parseInt(time.substring(6,8));
        
          /*  System.out.println("hours :" + hours);
            System.out.println("Min :" + min);
            System.out.println("sec :" + sec);*/
        
       
         //Date1 Assign values
        Calendar cal1 = Calendar.getInstance();
        cal1.set(Integer.parseInt(yyyy),Integer.parseInt(mm), Integer.parseInt(dd), ahours, amin, asec);
        Date date1 = cal1.getTime();
 
        //Date2 System values
        Calendar cal2 = Calendar.getInstance();
        cal2.set(Integer.parseInt(xyyy), Integer.parseInt(xm), Integer.parseInt(xd), hours, min, sec);
        Date date2 = cal2.getTime();
 
 
        //Time Difference Calculations Begin
        long milliSec1 = date1.getTime();
        long milliSec2 = date2.getTime();
 
        long timeDifInMilliSec;
        if(milliSec1 > milliSec2)
        {
            timeDifInMilliSec = milliSec1 - milliSec2;
            //System.out.println("Invalid time is beyond 24 hours");
        }
        else
        {
            timeDifInMilliSec = milliSec2 - milliSec1;    
        }
 
        long timeDifSeconds = timeDifInMilliSec / 1000;
        long timeDifMinutes = timeDifInMilliSec / (60 * 1000);
        long timeDifHours = timeDifInMilliSec / (60 * 60 * 1000);
        long timeDifDays = timeDifInMilliSec / (24 * 60 * 60 * 1000);
        
        if(Integer.parseInt(te.getDuration())*60>timeDifSeconds && vd.isPositive((int)timeDifSeconds))
            leftTime=Integer.parseInt(te.getDuration())*60-(int)timeDifSeconds;
        else
            leftTime=0;
 
        /*System.out.println("Time differences expressed in various units are given below");
        System.out.println(timeDifInMilliSec + " Milliseconds");
        System.out.println(timeDifSeconds + " Seconds");
        System.out.println(timeDifMinutes + " Minutes");
        System.out.println(timeDifHours + " Hours");
        System.out.println(timeDifDays + " Days");*/
        }
        return leftTime;
    }
    
    public long getTime(String assginTime,String currentTime){
        
        
        ahours=Integer.parseInt(assginTime.substring(0,2));
        amin=Integer.parseInt(assginTime.substring(3,5));
        asec=Integer.parseInt(assginTime.substring(6,8));
        
         /*   System.out.println("Assign hours :" + ahours);
            System.out.println("Assign Min :" + amin);
            System.out.println("Assign sec :" + asec);*/
        
        hours=Integer.parseInt(currentTime.substring(0,2));
        min=Integer.parseInt(currentTime.substring(3,5));
        sec=Integer.parseInt(currentTime.substring(6,8));
        
         /*   System.out.println("hours :" + hours);
            System.out.println("Min :" + min);
            System.out.println("sec :" + sec);*/
            
        Calendar cal = Calendar.getInstance();
        Date dNow = new Date();
        
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy.MM.dd"); 
        currentDate=ft.format(dNow);
        
        yyyy=currentDate.substring(0,4);
        mm=currentDate.substring(5,7);
        dd=currentDate.substring(8,10);
        
        //assgin time
        Calendar cal1 = Calendar.getInstance();
        cal1.set(Integer.parseInt(yyyy),Integer.parseInt(mm), Integer.parseInt(dd),ahours, amin, asec);
        Date date1 = cal1.getTime();
        
        //current time
        Calendar cal2 = Calendar.getInstance();
        cal1.set(Integer.parseInt(yyyy),Integer.parseInt(mm), Integer.parseInt(dd),hours, min, sec);
        Date date2 = cal1.getTime();
        
        long milliSec1 = date1.getTime();
        long milliSec2 = date2.getTime();
        
       /* System.out.println(milliSec1 + " milliSec1");
        System.out.println(milliSec2 + " milliSec2");*/
        
        long timeDifInMilliSec = milliSec2 - milliSec1;
        //System.out.println(timeDifInMilliSec + " Milliseconds");
        
        return timeDifInMilliSec;
    }
    
}
