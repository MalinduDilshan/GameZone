/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ashen_Cafe.Support;

import com.Ashen_Cafe.database.DataBaseComputer;
import com.Ashen_Cafe.database.DataBaseMember;
import com.Ashen_Cafe.database.DataBaseSystemUsers;
import com.Ashen_Cafe.database.DataBaseTerminal;

/**
 *
 * @author MaLindu DiLshan
 */
public class GetRowCount {
    private int i;
    public int getRowCount(String keyword){
        
        if(keyword.equals("terminals")){
        DataBaseTerminal dbt=new DataBaseTerminal();
        dbt.getConnection();
        
        i=dbt.searchRows();
        //System.out.println("Rows in terminals table :"+i);
        }
        else if(keyword.equals("members")){
        DataBaseMember dbm=new DataBaseMember();
        dbm.getConnection();
        
        i=dbm.searchRows();
        //System.out.println("Rows in member table  :"+i);   
        }
        else if(keyword.equals("systemusers")){
        DataBaseSystemUsers dbs=new DataBaseSystemUsers();
        dbs.getConnection();
        
        i=dbs.searchRows();
        //System.out.println("Rows in systemusers table  :"+i);   
        }
        else if(keyword.equals("computers")){
        DataBaseComputer dbc=new DataBaseComputer();
        dbc.getConnection();
        
        i=dbc.searchRows();   
        //System.out.println("Rows in computers table  :"+i);   
        }
         return i;
    }
    
}
