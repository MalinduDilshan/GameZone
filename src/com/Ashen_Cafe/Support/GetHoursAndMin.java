/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ashen_Cafe.Support;

/**
 *
 * @author MaLindu DiLshan
 */
public class GetHoursAndMin {

    private String hours,min,sec,time,h,m,s,h1,m1;
    private int hrs,mins,secs,calTime;
    
    public String getTime(int value){
        
        if(value<1440){
        
        hours=String.valueOf(value/60);
        
        if(value<60)
            min=String.valueOf(value);
        else
            min=String.valueOf(value%60);
    
        /*System.out.println("Hours :"+hours);
        System.out.println("Mins :"+min);*/
        
        if(hours.trim().length()==1){
            h="0";
            h1=h.concat(hours);
        }
        else{
            h1=hours;
        }
        
        
        if(min.trim().length()==1){
            m="0";
            m1=m.concat(min);
        }
        else
            m1=min;
        sec="00";
     /*   System.out.println("Hours :"+h1);
        System.out.println("Mins :"+m1);
        System.out.println("Sec :"+sec);*/
        
        time=h1+":"+m1+":"+sec;
            return time;
        }
        else{
        time="00:00:00";
            return time;        }
            
    }
    
    public String setStdTimeDB(String timeUnit){

        int value=Integer.parseInt(timeUnit);
        
        hours=String.valueOf(value/60);
        
        if(value<60)
            min=String.valueOf(value);
        else
            min=String.valueOf(value%60);
    
        /*System.out.println("Hours :"+hours);
        System.out.println("Mins :"+min);*/
        
        if(hours.trim().length()==1){
            h="0";
            h1=h.concat(hours);
        }
        else{
            h1=hours;
        }
        
        
        if(min.trim().length()==1){
            m="0";
            m1=m.concat(min);
        }
        else
            m1=min;
        sec="00";
     /*   System.out.println("Hours :"+h1);
        System.out.println("Mins :"+m1);
        System.out.println("Sec :"+sec);*/
        
        time=h1+":"+m1+":"+sec;
            return time;
        }
    
    public String getStdTimeDB(String timeUnit){
        
            hrs=Integer.parseInt(timeUnit.substring(0,2));
            mins=Integer.parseInt(timeUnit.substring(3,5));
            secs=Integer.parseInt(timeUnit.substring(6,8));
            
            calTime=hrs*60+mins+secs;
            time=Integer.toString(calTime);
   
      return time;  
    }
}
