/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ashen_Cafe.view.systemUserView;

import com.Ashen_Cafe.Support.Message;
import com.Ashen_Cafe.Support.Validation;
import com.Ashen_Cafe.database.DataBaseSystemUsers;
import com.Ashen_Cafe.entity.Systemusers;
import com.Ashen_Cafe.view.AddTime;
import com.Ashen_Cafe.view.MainMenu;
/**
 *
 * @author MaLindu DiLshan
 */
public class AddUser extends javax.swing.JFrame {

    /*
     *
     */
    public AddUser() {
        initComponents();
    }
    public void setMenuRef(MainMenu menu) {
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
        lbl_userid = new javax.swing.JLabel();
        lbl_fname = new javax.swing.JLabel();
        lbl_lname = new javax.swing.JLabel();
        txt_sysid = new javax.swing.JTextField();
        txt_fname = new javax.swing.JTextField();
        btn_create = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        txt_lname = new javax.swing.JTextField();
        lbl_nic = new javax.swing.JLabel();
        lbl_mobile = new javax.swing.JLabel();
        lbl_username = new javax.swing.JLabel();
        txt_nic = new javax.swing.JTextField();
        txt_mobile = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        lbl_password = new javax.swing.JLabel();
        lbl_confirmpassword = new javax.swing.JLabel();
        lbl_backgroundadduser = new javax.swing.JLabel();
        txt_pw = new javax.swing.JPasswordField();
        txt_confirmpw = new javax.swing.JPasswordField();
        lbl_type = new javax.swing.JLabel();
        jcb_type = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create System User");
        setAlwaysOnTop(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lbl_heading.setFont(new java.awt.Font("Adobe Caslon Pro", 2, 36)); // NOI18N
        lbl_heading.setForeground(new java.awt.Color(255, 255, 255));
        lbl_heading.setText("Create System User...");

        lbl_userid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_userid.setForeground(new java.awt.Color(255, 255, 255));
        lbl_userid.setText("User ID                     :");

        lbl_fname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_fname.setForeground(new java.awt.Color(255, 255, 255));
        lbl_fname.setText("First Name               :");

        lbl_lname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_lname.setForeground(new java.awt.Color(255, 255, 255));
        lbl_lname.setText("Last Name               :");

        txt_sysid.setEditable(false);

        btn_create.setText("Create");
        btn_create.setToolTipText("click here to create system user");
        btn_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createActionPerformed(evt);
            }
        });

        btn_clear.setText("Clear");
        btn_clear.setToolTipText("clear all fields");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        lbl_nic.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_nic.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nic.setText("NIC                          :");

        lbl_mobile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_mobile.setForeground(new java.awt.Color(255, 255, 255));
        lbl_mobile.setText("Mobile                      :");

        lbl_username.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_username.setForeground(new java.awt.Color(255, 255, 255));
        lbl_username.setText("User Name              :");

        lbl_password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_password.setForeground(new java.awt.Color(255, 255, 255));
        lbl_password.setText("Password                :");

        lbl_confirmpassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_confirmpassword.setForeground(new java.awt.Color(255, 255, 255));
        lbl_confirmpassword.setText("Confirm Password :");

        lbl_backgroundadduser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Ashen_Cafe/view/systemUserView/BackgroundGameZon.jpg"))); // NOI18N
        lbl_backgroundadduser.setText("Background");

        lbl_type.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_type.setForeground(new java.awt.Color(255, 255, 255));
        lbl_type.setText("User Type                :");

        jcb_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Type", "Admin", "User" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lbl_heading, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_userid, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt_sysid, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_type, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_nic, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt_nic, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_username, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_password, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_confirmpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(txt_confirmpw, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btn_create, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jcb_type, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(txt_pw, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(txt_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lbl_backgroundadduser, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lbl_heading, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_userid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sysid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(lbl_type, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(lbl_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_nic, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nic, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(lbl_password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lbl_confirmpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(txt_confirmpw, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(440, 440, 440)
                .addComponent(btn_create, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jcb_type, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(txt_pw, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(txt_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lbl_backgroundadduser, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        txt_sysid.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createActionPerformed
        DataBaseSystemUsers dbsys=new DataBaseSystemUsers();
        
        Systemusers sys=new Systemusers();
        Message msg=new Message();
        Validation vd=new Validation();
        
        sys.setId(id);
        sys.setFname(txt_fname.getText());
        sys.setLname(txt_lname.getText());
        sys.setNic(txt_nic.getText());
        sys.setMobile(txt_mobile.getText());
        sys.setUsername(txt_username.getText());
        sys.setPassword(txt_pw.getText());
        sys.setType(String.valueOf(jcb_type.getSelectedItem()));
        
        if(String.valueOf(jcb_type.getSelectedItem()).equals("Select Type"))
            msg.warningMsg("User type should be selected", this);
        else if(sys.getFname().isEmpty())
            msg.warningMsg("User First Name should not be empty", this);
        else if(sys.getLname().isEmpty())
            msg.warningMsg("User Last Name should not be empty", this);
        else if(sys.getNic().isEmpty())
            msg.warningMsg("User NIC should not be empty", this);   
        else if(!vd.isNIC(sys.getNic()))
            msg.warningMsg("NIC should be valid no", this);
        else if(sys.getMobile().isEmpty())
            msg.warningMsg("Mobile should not be empty", this); 
        else if(sys.getMobile().length()!=10)
            msg.warningMsg("Mobile should contain 10 digits", this);
        else if(!vd.isNumeric(sys.getMobile()))
            msg.warningMsg("Mobile should only contain numbers", this);
        else if(sys.getUsername().isEmpty())
            msg.warningMsg("Username should not be empty", this); 
        else if(sys.getPassword().isEmpty())
            msg.warningMsg("Password should not be empty", this);
        else if(txt_confirmpw.getText().isEmpty())
            msg.warningMsg("Confirm password should not be empty", this);
        else if(!txt_pw.getText().equals(txt_confirmpw.getText()))
            msg.warningMsg("Confirm password should match with password", this);
        else{
            int dialogResult = msg.confirmMsg("Do you want to create a new Profile ", this);
            if( dialogResult ==  0 ){
              try{  
                dbsys.insert(sys);
                
                clearAll();
                menu.setSystemUsersTable();
                msg.informMsg("Profile Successfully Created", this);
                this.dispose();
                        }
            catch(Exception ex){
                msg.warningMsg(ex.toString(), this);
                }
            }
        }
    }//GEN-LAST:event_btn_createActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
            Message msg=new Message();
        
        int dialogResult = msg.confirmMsg("Do you want to clear all the fields? ", this);
				if(dialogResult ==  0){
					clearAll();
				}
    }//GEN-LAST:event_btn_clearActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DataBaseSystemUsers dbsys=new DataBaseSystemUsers();
        
        int lastID=dbsys.searchRows();
        id=lastID+1;
        txt_sysid.setText(Integer.toString(id));
    }//GEN-LAST:event_formWindowOpened
    public void clearAll(){
        jcb_type.setSelectedItem("Select Type");
        txt_fname.setText("");
        txt_lname.setText("");
        txt_nic.setText("");
        txt_mobile.setText("");
        txt_username.setText("");
        txt_pw.setText("");
        txt_confirmpw.setText("");

    }
    /**
     * @param args the command line arguments
     */
    private int id;
    private MainMenu menu;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_create;
    private javax.swing.JComboBox jcb_type;
    private javax.swing.JLabel lbl_backgroundadduser;
    private javax.swing.JLabel lbl_confirmpassword;
    private javax.swing.JLabel lbl_fname;
    private javax.swing.JLabel lbl_heading;
    private javax.swing.JLabel lbl_lname;
    private javax.swing.JLabel lbl_mobile;
    private javax.swing.JLabel lbl_nic;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_type;
    private javax.swing.JLabel lbl_userid;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JPasswordField txt_confirmpw;
    private javax.swing.JTextField txt_fname;
    private javax.swing.JTextField txt_lname;
    private javax.swing.JTextField txt_mobile;
    private javax.swing.JTextField txt_nic;
    private javax.swing.JPasswordField txt_pw;
    private javax.swing.JTextField txt_sysid;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
