/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ashen_Cafe.view;

import com.Ashen_Cafe.database.DataBaseComputer;
import com.Ashen_Cafe.database.DataBaseConnection;
import com.Ashen_Cafe.entity.Computer;
import com.Ashen_Cafe.Support.Message;
import com.Ashen_Cafe.Support.Validation;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author MaLindu DiLshan
 */
public class EditPC extends javax.swing.JFrame {

    /**
     *
     */
    public EditPC() {
        initComponents();
    }
    
    public void setMenu(MainMenu menu){
        this.menu=menu;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_heading = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();
        lbl_newpc = new javax.swing.JLabel();
        txt_newpc = new javax.swing.JTextField();
        lbl_newip = new javax.swing.JLabel();
        txt_newip = new javax.swing.JTextField();
        btn_update = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        jcb_id = new javax.swing.JComboBox();
        lbl_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update PC");
        setAlwaysOnTop(true);
        setPreferredSize(new java.awt.Dimension(400, 500));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        lbl_heading.setFont(new java.awt.Font("Adobe Caslon Pro", 2, 36)); // NOI18N
        lbl_heading.setForeground(new java.awt.Color(255, 255, 255));
        lbl_heading.setText("Update PC...");
        getContentPane().add(lbl_heading);
        lbl_heading.setBounds(100, 10, 240, 40);

        lbl_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_id.setForeground(new java.awt.Color(255, 255, 255));
        lbl_id.setText("ID                         :");
        getContentPane().add(lbl_id);
        lbl_id.setBounds(20, 80, 140, 30);

        lbl_newpc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_newpc.setForeground(new java.awt.Color(255, 255, 255));
        lbl_newpc.setText("New PC Name     :");
        getContentPane().add(lbl_newpc);
        lbl_newpc.setBounds(20, 140, 140, 30);
        getContentPane().add(txt_newpc);
        txt_newpc.setBounds(160, 140, 210, 30);

        lbl_newip.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_newip.setForeground(new java.awt.Color(255, 255, 255));
        lbl_newip.setText("New IP Address  :");
        getContentPane().add(lbl_newip);
        lbl_newip.setBounds(20, 200, 140, 30);
        getContentPane().add(txt_newip);
        txt_newip.setBounds(160, 200, 210, 30);

        btn_update.setText("Update");
        btn_update.setToolTipText("click here to update profile");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_update);
        btn_update.setBounds(60, 320, 100, 30);

        btn_clear.setText("Clear");
        btn_clear.setToolTipText("clear all fields");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        getContentPane().add(btn_clear);
        btn_clear.setBounds(250, 320, 100, 30);

        jcb_id.setModel(new javax.swing.DefaultComboBoxModel());
        jcb_id.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_idItemStateChanged(evt);
            }
        });
        getContentPane().add(jcb_id);
        jcb_id.setBounds(160, 80, 210, 30);

        lbl_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Ashen_Cafe/view/BackgroundGameZone.jpg"))); // NOI18N
        lbl_background.setText("background");
        getContentPane().add(lbl_background);
        lbl_background.setBounds(0, 0, 400, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        DataBaseComputer db=new DataBaseComputer();
        
        Computer pc=new Computer();
        Message msg=new Message();
        Validation vd=new Validation();
        
        pc.setPcName(txt_newpc.getText());
        pc.setIpAddress(txt_newip.getText());
        
        if(String.valueOf(jcb_id.getSelectedItem()).equals("Select ID"))
            msg.warningMsg("Computer ID should be selected", this);
        else if(pc.getPcName().equals(""))
            msg.warningMsg("New computer name should be inserted", this);
        else if(vd.isNumeric(pc.getPcName()))
            msg.warningMsg("PC Name should not be numeric", this); 
        else if(pc.getIpAddress().equals(""))
            msg.warningMsg("New IP Address should be inserted", this);
        else if(!vd.isIPAddress(pc.getIpAddress()))
            msg.warningMsg("Insert a correct IP Address", this);
        else{
            
            pc.setId(Integer.parseInt(String.valueOf(jcb_id.getSelectedItem())));
            id=pc.getId();
            
        int dialogResult = msg.confirmMsg("Do you want to update this PC? ", this);
            if( dialogResult ==  0 ){
	try{
            db.update(pc,id);
            
            menu.setTable();
            menu.setComputerTable();
            
            clearAll();
	    msg.informMsg("PC Successfully Updated", this);	
	    this.dispose();	
                }
        catch(Exception ex){
	    msg.warningMsg("Error in EditPC Form"+"\n"+ex.toString(), this);
		}	
            }
        }    
    }//GEN-LAST:event_btn_updateActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try{
   DataBaseConnection dbcon=new DataBaseConnection();
   
   con=dbcon.connection();
   Statement st=con.createStatement();
				
ResultSet rs = st.executeQuery("select id from computers");				
jcb_id.addItem("Select ID");
while(rs.next()){											
jcb_id.addItem(rs.getInt(1));			
}	
con.close();
}
catch(SQLException e){
		System.out.println("SQL Error in EditPC Form"+"\n"+e.getMessage());
            }
    }//GEN-LAST:event_formWindowOpened

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        Message msg=new Message();
        int dialogResult = msg.confirmMsg("Do you want to clear all the fields? ", this);
				if(dialogResult ==  0){
					clearAll();
				}
    }//GEN-LAST:event_btn_clearActionPerformed

    private void jcb_idItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_idItemStateChanged
        if(String.valueOf(jcb_id.getSelectedItem()).equals("Select ID")){
            System.out.println("******Select id to update PC******");    
        }
        else
        id=Integer.parseInt(String.valueOf(jcb_id.getSelectedItem()));
    }//GEN-LAST:event_jcb_idItemStateChanged
    public void clearAll(){
        jcb_id.setSelectedItem("Select ID");
        txt_newpc.setText("");
        txt_newip.setText("");
    }
    /**
     * @param args the command line arguments
     */
    private Connection con;
    private MainMenu menu;
    private int id;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox jcb_id;
    private javax.swing.JLabel lbl_background;
    private javax.swing.JLabel lbl_heading;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_newip;
    private javax.swing.JLabel lbl_newpc;
    private javax.swing.JTextField txt_newip;
    private javax.swing.JTextField txt_newpc;
    // End of variables declaration//GEN-END:variables
}
