/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ashen_Cafe.Support;

import java.util.concurrent.TimeUnit;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MaLindu DiLshan
 */
public class TimeUnitThread implements Runnable{
    
    private String hms;
    private int threadID;
    private int id,row;
    private long millis;
    private DefaultTableModel model;

    public int getThreadID() {
        return threadID;
    }

    public int getRow() {
        return row;
    }

    public void setTimeUnit(DefaultTableModel model,int id,int time,int row){
    
        this.id=id;
        this.model=model;
        //System.out.println("Time of passing :" + time);
        this.millis=(long)time*1000;
        this.threadID = id;
        this.row=row;
    
    }
    
    @Override
            public void run() {
                Object waiter = new Object();
                synchronized (waiter) {
                    //System.out.println("inside thread ID is :" + id);
                    //System.out.println("Milliseconds are :" + millis);
                    while(true) {
                        try {
                            //System.out.println("inside thread progreassBarThread Thread ID is :" + i);
                            
hms = String.format("%02d:%02d:%02d",  TimeUnit.MILLISECONDS.toHours(millis),
TimeUnit.MILLISECONDS.toMinutes(millis) % TimeUnit.HOURS.toMinutes(1),
TimeUnit.MILLISECONDS.toSeconds(millis) % TimeUnit.MINUTES.toSeconds(1));

                            //System.out.println("Time unit :" + hms);                 
                            model.setValueAt(hms, row, 3);
                            waiter.wait(1000);
                        if(millis==0)
                            break;
                            millis=millis-1000;

                            
                        } catch (InterruptedException ex) {
                            System.out.println("InterruptedException inside Thread :" + ex.getMessage());
                        } catch (Exception ex) {
                            System.out.println("Exception inside Thread :" + ex.getMessage());
                    }
               }
                 //System.out.println("Time is ended..");
           }
        }
    
}
