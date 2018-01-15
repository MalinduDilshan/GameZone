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
public class GetProgressValueFormLoad {
    
    private int index;
    private String currentTime;
    
    public int findIndex(String closedTime,int duration){
        
        GetCurrentTime gct=new GetCurrentTime(); 
        currentTime = gct.getTime();
      /*  System.out.println("Closed Time Time is :"+closedTime);
        System.out.println("Current Time is :"+currentTime);*/
        
        GetTimeLeft gtl=new GetTimeLeft();
        long timeDifInMilliSec=gtl.getTime(closedTime, currentTime);
        //System.out.println("timeDifInMilliSec is :"+timeDifInMilliSec);
        
        long miliSecForOneCycle=duration*600;   //Milliseconds for one cycle
        //System.out.println("miliSecForOneCycle is :"+miliSecForOneCycle);
        
        index=(int)((int)timeDifInMilliSec/miliSecForOneCycle); //additional progress bar values
        
        //System.out.println("Index is in GetProgressValueFormLoad class : "+index);
        
        return index;
    }
}
