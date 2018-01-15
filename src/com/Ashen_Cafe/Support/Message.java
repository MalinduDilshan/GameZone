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
import javax.swing.*;



public class Message{
	

	
public void warningMsg(String value, JFrame frame){
		
JOptionPane.showMessageDialog(frame, value , "Warning", JOptionPane.WARNING_MESSAGE);
	
}

	
	
public int confirmMsg(String value, JFrame frame){	
		
int result = JOptionPane.showConfirmDialog(frame, value , "Confirmation" ,JOptionPane.YES_NO_OPTION);
		return result;
	}

	
	
public void informMsg(String value, JFrame frame){
		
JOptionPane.showMessageDialog(frame, value, "Message", JOptionPane.INFORMATION_MESSAGE);
	
}

public void pcMsg(int time,String pc,double bill, JFrame frame){
    
GetHoursAndMin t=new GetHoursAndMin();
String value=pc+" will assign for  "+t.getTime(time)+"  minutes"+"\n"+"Bill Amount is Rs: "+bill;	
JOptionPane.showMessageDialog(frame, value, "Message", JOptionPane.INFORMATION_MESSAGE);
	
}

public void pcMsgForRunningTerminal(int time,String pc,double bill, JFrame frame){
    
GetHoursAndMin t=new GetHoursAndMin();
String value=pc+" will assign for  "+t.getTime(time)+"  minutes"+"\n"+"New Bill Amount is Rs: "+bill;	
JOptionPane.showMessageDialog(frame, value, "Message", JOptionPane.INFORMATION_MESSAGE);
	
}


public void serevrMsg(String msg, JFrame frame){
	
JOptionPane.showMessageDialog(frame, msg , "Server Warning", JOptionPane.WARNING_MESSAGE);
	
}

public void serevrMsg(String msg,String pc, JFrame frame){
	
String value=msg.substring(0,16)+"\n"+"please check  "+"\t:  "+pc;    
JOptionPane.showMessageDialog(frame, value , "Server Warning", JOptionPane.WARNING_MESSAGE);
	
}

}
	