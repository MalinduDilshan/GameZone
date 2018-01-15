/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ashen_Cafe.Support;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MaLindu DiLshan
 */
public class ProgressBarThread implements Runnable{

    private int threadID;
    private int id,row;
    private int time;
    private int pvalue=0;
    private DefaultTableModel model;
    private String pc;

    public void setProgressBar(DefaultTableModel model,int id,String pc,int time,int row) {
    
        this.id=id;
        this.model=model;
        this.pc=pc;
        this.time=time;
        this.threadID = id;
        this.row=row;
    
    }
    
        public void setProgressBarFormLoad(DefaultTableModel model,int id, String pc,int time,int pvalue,int row){
    
        this.id=id;
        this.model=model;
        this.pc=pc;
        this.time=time;
        this.pvalue=pvalue;
        this.threadID = id;
        this.row=row;
        
    }
        
        public int getThreadID(){
            return threadID;
        }

    public int getRow() {
        return row;
    }

    @Override
            public void run() {
                Object waiter = new Object();
                synchronized (waiter) {                   
                    //System.out.println("inside thread ID is :" + id);
                    for (int i = 0; i <= 100; i++) {
                        try {
                            //System.out.println("inside thread progreassBarThread Thread ID is :" + i);
                            model.setValueAt(id, row, 0);
                            model.setValueAt(pc, row, 1);
                            model.setValueAt(i+pvalue, row, 2);
                            waiter.wait(time*10);
                        } catch (InterruptedException ex) {
                            System.out.println("InterruptedException inside Thread :" + ex.getMessage());
                        } catch (Exception ex) {
                            System.out.println("Exception inside Thread :" + ex.getMessage());
                        }
                    }
                }
            }
}
