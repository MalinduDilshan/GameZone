/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ashen_Cafe.entity;

/**
 *
 * @author MaLindu DiLshan
 */
public class ProgressBar {
    
    private int id,pvalue;
    private String timeclosed;

    public ProgressBar() {
        this.id = 0;
        this.pvalue = 0;
        this.timeclosed = "";
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPvalue() {
        return pvalue;
    }

    public void setPvalue(int pvalue) {
        this.pvalue = pvalue;
    }

    public String getTimeclosed() {
        return timeclosed;
    }

    public void setTimeclosed(String timeclosed) {
        this.timeclosed = timeclosed;
    }
    
}
