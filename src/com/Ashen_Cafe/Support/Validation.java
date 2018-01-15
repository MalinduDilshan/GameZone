/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ashen_Cafe.Support;

import java.net.InetAddress;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;


/**
 *
 * @author MaLindu DiLshan
 */
public class Validation{

public boolean isNumeric(String temp){
	try{
		int value=Integer.parseInt(temp.trim());
		return true;
	   }
	catch(Exception ex){
		return false;
	}
	}
public boolean isPositive(int temp){
    if(temp<0)
    return false;
    else
    return true;
    }
public boolean isIPAddress(String temp){
    
    boolean booleanValue = false;

    try {
        InetAddress IPAddress = InetAddress.getByName(temp);
        if(temp.trim().length()<=16){
            booleanValue=true;
        }
    } 
    catch (Exception ex) {
        System.out.println("Error in isIPAddress Method.."+ex.getMessage());
    }
    return booleanValue;
    }

public boolean isNIC(String nic){
    
    int numericPartflag=0;
    
    if(nic.length()==12){
        System.out.println("NIC :"+nic);
        return true;
    }
    else{
        return false;
    }
}
    

public boolean isEmail(String email){
    
    boolean result = true;
   try {
      InternetAddress emailAddr = new InternetAddress(email);
      emailAddr.validate();
    } catch (AddressException ex){
      result = false;
    }
   return result;
    }

}

