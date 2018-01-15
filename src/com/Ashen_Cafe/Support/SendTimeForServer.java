/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ashen_Cafe.Support;

import com.Ashen_Cafe.Server.Server;
import java.io.IOException;
import com.Ashen_Cafe.Support.Message;
import com.Ashen_Cafe.view.AddTime;

/**
 *
 * @author MaLindu DiLshan
 */
public class SendTimeForServer {
  private Server s;
  private Message msg;
  private AddTime addtTRef;
  private String timeString;
  private String sentTime;
  
  public void setAddTimeRef(AddTime addTRef){
      this.addtTRef=addTRef;
  }
  
  public void setData(String ipaddress,int time){
      
      timeString=Integer.toString(time);
      
      if(timeString.length()==1){
          String s="000";
          sentTime=s.concat(timeString);
          System.out.println("Time sending.."+sentTime);
      }
      else if(timeString.length()==2){
          String s="00";
          sentTime=s.concat(timeString);
          System.out.println("Time sending.."+sentTime);
      }
      else if(timeString.length()==3){
          String s="0";
          sentTime=s.concat(timeString);
          System.out.println("Time sending.."+sentTime);
      }
      else{
          sentTime=timeString;
          System.out.println("Time sending.."+sentTime);
      }
      
      s=new Server();
      msg=new Message();
      
      try {
          s.sentDatatoClientThread(ipaddress, "ud", sentTime);
      } catch (IOException ex) {
                    //msg.serevrMsg(ex.getMessage(),addtTRef);
                    System.out.println("Error in shutdown method"+"\n"+ex.getMessage());
      }
      catch (Exception ex) {
                    //msg.warningMsg(ex.getMessage(),addtTRef);
                    System.out.println("Error in shutdown method"+"\n"+ex.getMessage()); 
      }
      
  }
}
