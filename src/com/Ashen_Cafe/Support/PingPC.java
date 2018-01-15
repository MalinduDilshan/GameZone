/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ashen_Cafe.Support;

import com.Ashen_Cafe.Server.Server;
import java.io.IOException;

/**
 *
 * @author MaLindu DiLshan
 */
public class PingPC extends Thread{
    
    private String status,ip,pcname;
    private int threadID;
    private Server s;

    public String getPcname() {
        return pcname;
    }

    public void setPcname(String pcname) {
        this.pcname = pcname;
    }

    public String getStatus() {
        return status;
    }
    
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getThreadID() {
        return threadID;
    }

    public void setThreadID(int threadID) {
        this.threadID = threadID;
    }
    
    public void run(){
        
            s=new Server();
        try {
           status = s.sentDatatoClient(ip,"online");
       } catch (IOException ex) {
           System.out.println("Server Down..."+"\t"+"PingPC class...");
       }
       catch (Exception ex) {
           System.out.println("Error in PingPC class...");
       }
    }
    
}
