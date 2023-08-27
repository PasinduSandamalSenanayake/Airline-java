/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaairline;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Passanger extends javax.swing.JFrame {

    public Passanger() {
        initComponents();
        DisplayPassengers();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        flightDataPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PassengerNameTxt = new javax.swing.JTextField();
        NationalityCombo = new javax.swing.JComboBox<>();
        genderCombo = new javax.swing.JComboBox<>();
        PassengerEdit = new javax.swing.JButton();
        PassengerDelete = new javax.swing.JButton();
        passengerSave = new javax.swing.JButton();
        passportNoTxt1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        passengerPhoneTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        passengerAddressTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        passengerTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));

        topPanel.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Sri Lanka Airline Passangers");

        backBtn.setText("Back");
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addGap(285, 285, 285)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        flightDataPanel.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Nationality");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Passenger Name");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Gender");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Passport Number");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Address");

        NationalityCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sri lanka", "India" }));

        genderCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        PassengerEdit.setBackground(new java.awt.Color(0, 153, 255));
        PassengerEdit.setForeground(new java.awt.Color(255, 255, 255));
        PassengerEdit.setText("Edit");
        PassengerEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PassengerEditMouseClicked(evt);
            }
        });

        PassengerDelete.setBackground(new java.awt.Color(0, 153, 255));
        PassengerDelete.setForeground(new java.awt.Color(255, 255, 255));
        PassengerDelete.setText("Delete");
        PassengerDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PassengerDeleteMouseClicked(evt);
            }
        });
        PassengerDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassengerDeleteActionPerformed(evt);
            }
        });

        passengerSave.setBackground(new java.awt.Color(0, 153, 255));
        passengerSave.setForeground(new java.awt.Color(255, 255, 255));
        passengerSave.setText("Save");
        passengerSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passengerSaveMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Phone Number");

        passengerAddressTextArea1.setColumns(20);
        passengerAddressTextArea1.setRows(5);
        jScrollPane1.setViewportView(passengerAddressTextArea1);

        javax.swing.GroupLayout flightDataPanelLayout = new javax.swing.GroupLayout(flightDataPanel);
        flightDataPanel.setLayout(flightDataPanelLayout);
        flightDataPanelLayout.setHorizontalGroup(
            flightDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(flightDataPanelLayout.createSequentialGroup()
                .addGroup(flightDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(flightDataPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(flightDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passengerPhoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addGroup(flightDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(passportNoTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addComponent(genderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NationalityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addGroup(flightDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PassengerNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(flightDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(flightDataPanelLayout.createSequentialGroup()
                                    .addComponent(passengerSave)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PassengerEdit))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(flightDataPanelLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(PassengerDelete)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        flightDataPanelLayout.setVerticalGroup(
            flightDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(flightDataPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PassengerNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NationalityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(genderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passportNoTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passengerPhoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(flightDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passengerSave)
                    .addComponent(PassengerEdit))
                .addGap(18, 18, 18)
                .addComponent(PassengerDelete)
                .addGap(25, 25, 25))
        );

        passengerTable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passengerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        passengerTable.setRowHeight(30);
        passengerTable.setSelectionBackground(new java.awt.Color(0, 153, 255));
        passengerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passengerTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(passengerTable);

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(flightDataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
                .addContainerGap())
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(flightDataPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    Connection Con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null,Rs1 =null;
    Statement St = null,St1 =null;
    
    private void DisplayPassengers(){
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from passengerstbl");
            passengerTable.setModel(DbUtils.resultSetToTableModel(Rs));
            
        } catch (Exception e){
        
        }
    }
    
    int passId =0;
    private void CountPassengers(){
        try{
            St1 = Con.createStatement();
            Rs1 = St1.executeQuery("select Max(PId) from passengerstbl");
            Rs1.next();
            passId = Rs1.getInt(1)+1;
        }catch (Exception e){
        
        }
    }
    
    private void ClearPassenger(){
        PassengerNameTxt.setText("");
        passportNoTxt1.setText("");
        passengerPhoneTxt.setText("");
        passengerAddressTextArea1.setText("");
    }
    
    private void passengerSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passengerSaveMouseClicked
        if(PassengerNameTxt.getText().isEmpty() || passportNoTxt1.getText().isEmpty() || passengerPhoneTxt.getText().isEmpty() || passengerAddressTextArea1.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Misssing Information!!");
        }else{
            try{
                CountPassengers();
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
                PreparedStatement Add = Con.prepareStatement("insert into passengerstbl values(?,?,?,?,?,?,?)");
                Add.setInt(1, passId);
                Add.setString(2, PassengerNameTxt.getText());
                Add.setString(3, NationalityCombo.getSelectedItem().toString());
                Add.setString(4, genderCombo.getSelectedItem().toString());
                Add.setString(5, passportNoTxt1.getText());
                Add.setString(7, passengerPhoneTxt.getText());
                Add.setString(6, passengerAddressTextArea1.getText());
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Passenger Added");
                Con.close();
                DisplayPassengers();
                ClearPassenger();
            } catch(Exception e){
                JOptionPane.showMessageDialog(this,e);
            }
        }
    }//GEN-LAST:event_passengerSaveMouseClicked

    private void PassengerDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassengerDeleteMouseClicked
        if(key == 0){
            JOptionPane.showMessageDialog(this, "Select the passenger");
        }else{
            try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
                String Query = "Delete from passengerstbl where PId="+key;
                Statement Del = Con.createStatement();
                Del.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Passenger Deleted");
                DisplayPassengers();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_PassengerDeleteMouseClicked
    
    int key =0;
    private void passengerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passengerTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)passengerTable.getModel();
        int MyIndex = passengerTable.getSelectedRow();
        key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        PassengerNameTxt.setText(model.getValueAt(MyIndex, 1).toString());
        NationalityCombo.setSelectedItem(model.getValueAt(MyIndex, 2).toString());
        genderCombo.setSelectedItem(model.getValueAt(MyIndex, 3).toString());
        passportNoTxt1.setText(model.getValueAt(MyIndex, 4).toString());
        passengerPhoneTxt.setText(model.getValueAt(MyIndex, 6).toString());
        passengerAddressTextArea1.setText(model.getValueAt(MyIndex, 5).toString());
    }//GEN-LAST:event_passengerTableMouseClicked

    private void PassengerEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassengerEditMouseClicked
        if(key == 0){
            JOptionPane.showMessageDialog(this,"Select a passenger");
        }else{
            try{
//                CountPassengers();
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
                String Query = "Update passengerstbl set PName=?,PNat=?,PGen=?,PPass=?,PAdd=?,Pphone=? where PId=?";
                PreparedStatement Add = Con.prepareStatement(Query);
                Add.setInt(7, key);
                Add.setString(1, PassengerNameTxt.getText());
                Add.setString(2, NationalityCombo.getSelectedItem().toString());
                Add.setString(3, genderCombo.getSelectedItem().toString());
                Add.setString(4, passportNoTxt1.getText());
                Add.setString(6, passengerPhoneTxt.getText());
                Add.setString(5, passengerAddressTextArea1.getText());
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Passenger Updated");
                Con.close();
                DisplayPassengers();
                ClearPassenger();
            } catch(Exception e){
                JOptionPane.showMessageDialog(this,e);
            }
        }
    }//GEN-LAST:event_PassengerEditMouseClicked

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        new MainForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnMouseClicked

    private void PassengerDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassengerDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassengerDeleteActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Passanger().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> NationalityCombo;
    private javax.swing.JButton PassengerDelete;
    private javax.swing.JButton PassengerEdit;
    private javax.swing.JTextField PassengerNameTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JPanel flightDataPanel;
    private javax.swing.JComboBox<String> genderCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea passengerAddressTextArea1;
    private javax.swing.JTextField passengerPhoneTxt;
    private javax.swing.JButton passengerSave;
    private javax.swing.JTable passengerTable;
    private javax.swing.JTextField passportNoTxt1;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
