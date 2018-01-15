/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ashen_Cafe.Support;

import com.Ashen_Cafe.view.MainMenu;
import com.Ashen_Cafe.view.login;
import java.awt.Component;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author MaLindu DiLshan
 */
public class ProgressRenderer extends JProgressBar implements TableCellRenderer {
    
    private Message msg;
    private MainMenu menu;
    
  public void setMainMenu(MainMenu menu){
      this.menu=menu;
      msg=new Message();
  }
    
    
  public ProgressRenderer(int min, int max) {
    super(min, max);
    this.setStringPainted(true);
  }

  @Override
  public Component getTableCellRendererComponent(JTable table, Object value,
      boolean isSelected, boolean hasFocus, int row, int column) {
      try{
      this.setValue((Integer) value);
      }
      catch(Exception ex){
          System.out.println("ProgressRenderer :"+ex.getMessage());
          msg.serevrMsg("Warning!"+"\n"+"Terminal table data modified"+"\n"+"Please login again", menu);
          menu.exit();
      }
    return this;
  }
}
