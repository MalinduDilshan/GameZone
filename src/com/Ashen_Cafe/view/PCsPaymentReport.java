/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ashen_Cafe.view;

import com.Ashen_Cafe.Reports.GenerateReport;
import com.Ashen_Cafe.Support.GetCurrentTime;
import com.Ashen_Cafe.Support.Message;
import com.Ashen_Cafe.database.DataBaseConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author MaLindu DiLshan
 */
public class PCsPaymentReport extends javax.swing.JFrame {

    /**
     * Creates new form MonthlyReport
     */
    public PCsPaymentReport() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dtp_date_from = new org.jdesktop.swingx.JXDatePicker();
        lbl_heading = new javax.swing.JLabel();
        lbl_datefrom = new javax.swing.JLabel();
        lbl_dateto = new javax.swing.JLabel();
        dtp_date_to = new org.jdesktop.swingx.JXDatePicker();
        btn_ok = new javax.swing.JButton();
        btn_cancle = new javax.swing.JButton();
        lbl_background = new javax.swing.JLabel();
        lbl_pcid = new javax.swing.JLabel();
        cmb_pcid = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PCs Payment Report");
        setAlwaysOnTop(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lbl_heading.setFont(new java.awt.Font("Adobe Caslon Pro", 2, 36)); // NOI18N
        lbl_heading.setForeground(new java.awt.Color(255, 255, 255));
        lbl_heading.setText("PCs Payment Report...");

        lbl_datefrom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_datefrom.setForeground(new java.awt.Color(255, 255, 255));
        lbl_datefrom.setText("Date from           :");

        lbl_dateto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_dateto.setForeground(new java.awt.Color(255, 255, 255));
        lbl_dateto.setText("Date to                :");

        btn_ok.setText("OK");
        btn_ok.setToolTipText("click here to create computer payment report");
        btn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okActionPerformed(evt);
            }
        });

        btn_cancle.setText("Cancle");
        btn_cancle.setToolTipText("click here to exit");
        btn_cancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancleActionPerformed(evt);
            }
        });

        lbl_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Ashen_Cafe/view/BackgroundGameZone.jpg"))); // NOI18N
        lbl_background.setText("Background");

        lbl_pcid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_pcid.setForeground(new java.awt.Color(255, 255, 255));
        lbl_pcid.setText("PC ID                   :");

        cmb_pcid.setModel(new javax.swing.DefaultComboBoxModel());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lbl_heading, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(lbl_pcid, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(cmb_pcid, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(btn_cancle, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(lbl_datefrom, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(lbl_dateto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(dtp_date_from, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(btn_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(dtp_date_to, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lbl_background, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbl_heading, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lbl_pcid, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmb_pcid, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126)
                .addComponent(btn_cancle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(lbl_datefrom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(lbl_dateto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(dtp_date_from, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(btn_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(dtp_date_to, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lbl_background, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed
        Message msg=new Message();
        
                
        GetCurrentTime gct=new GetCurrentTime();
        today=gct.getDate();
        
        //System.out.println("Today date :"+today);
        
        try{
        Date startDate = dtp_date_from.getDate();        
        DateFormat startDateFormat = new SimpleDateFormat("yyyy.MM.dd");
        datefrom = startDateFormat.format(startDate);
        
        Date endDate = dtp_date_to.getDate();        
        DateFormat endDateFormat = new SimpleDateFormat("yyyy.MM.dd");
        dateto = endDateFormat.format(endDate);
        }
        catch(Exception ex){
            msg.warningMsg("Do not edit the date selection field", this);
            System.out.println("Error in MonthlyReport form..."+ex.getMessage());
            datefrom=today;
            dateto=today;
        }
        //System.out.println("Date from :"+datefrom);
        //System.out.println("Date to :"+dateto);
        
        if(String.valueOf(cmb_pcid.getSelectedItem()).equals("Select ID"))
            msg.warningMsg("Computer ID should be selected", this);
        else if(datefrom.equals(today))
            msg.warningMsg("Please select the starting date", this);
        else if(String.valueOf(cmb_pcid.getSelectedItem()).equals("All PCs")){
            new Thread(new Runnable() {
                public void run() {
                 GenerateReport gr=new GenerateReport();
                 gr.allPCPaymentReport(datefrom, dateto);
                }
            }).start();
        }
        else{
            new Thread(new Runnable() {
                public void run() {
                 GenerateReport gr=new GenerateReport();
                 gr.pcUsageReport(datefrom, dateto,Integer.parseInt(String.valueOf(cmb_pcid.getSelectedItem())));
                }
            }).start();
        }
        
    }//GEN-LAST:event_btn_okActionPerformed

    private void btn_cancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancleActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cancleActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try{
   DataBaseConnection dbcon=new DataBaseConnection();
   
   con=dbcon.connection();
   Statement st=con.createStatement();
				
ResultSet rs = st.executeQuery("select id from computers");				
cmb_pcid.addItem("Select ID");
cmb_pcid.addItem("All PCs");
while(rs.next()){											
cmb_pcid.addItem(rs.getInt(1));			
}	
con.close();
}
catch(SQLException e){
		System.out.println("SQL Error in PCsPaymentReport Form"+"\n"+e.getMessage());
            }
        
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    private String datefrom,dateto,today;
    private Connection con;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancle;
    private javax.swing.JButton btn_ok;
    private javax.swing.JComboBox cmb_pcid;
    private org.jdesktop.swingx.JXDatePicker dtp_date_from;
    private org.jdesktop.swingx.JXDatePicker dtp_date_to;
    private javax.swing.JLabel lbl_background;
    private javax.swing.JLabel lbl_datefrom;
    private javax.swing.JLabel lbl_dateto;
    private javax.swing.JLabel lbl_heading;
    private javax.swing.JLabel lbl_pcid;
    // End of variables declaration//GEN-END:variables
}
