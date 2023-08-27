
package javaairline;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class TicketBooking extends javax.swing.JFrame {

    
    public TicketBooking() {
        initComponents();
        GetPassenger();
        GetFlight();
        DisplayTickets();
        ticketPassengerNameTxt.setEditable(false);
        ticketPassportNoTxt1.setEditable(false);
//        ticketFlightCodeCombo.setEditable(false);
//        ticketGenderCombo.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        flightDataPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ticketNationalityCombo = new javax.swing.JComboBox<>();
        ticketGenderCombo = new javax.swing.JComboBox<>();
        ticketEdit = new javax.swing.JButton();
        ticketBack = new javax.swing.JButton();
        ticketSave = new javax.swing.JButton();
        ticketPassportNoTxt1 = new javax.swing.JTextField();
        ticketPassengerIDCombo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        ticketPassengerNameTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ticketFlightCodeCombo = new javax.swing.JComboBox<>();
        ticketAmount = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookingTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));

        topPanel.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Sri Lanka Airline Tickets");

        back.setText("Back");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back)
                .addGap(285, 285, 285)
                .addComponent(jLabel1)
                .addContainerGap(381, Short.MAX_VALUE))
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
                        .addComponent(back)))
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

        ticketNationalityCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sri lanka", "India" }));

        ticketGenderCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", " " }));

        ticketEdit.setBackground(new java.awt.Color(0, 153, 255));
        ticketEdit.setForeground(new java.awt.Color(255, 255, 255));
        ticketEdit.setText("Reset");

        ticketBack.setBackground(new java.awt.Color(0, 153, 255));
        ticketBack.setForeground(new java.awt.Color(255, 255, 255));
        ticketBack.setText("Back");

        ticketSave.setBackground(new java.awt.Color(0, 153, 255));
        ticketSave.setForeground(new java.awt.Color(255, 255, 255));
        ticketSave.setText("Book");
        ticketSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ticketSaveMouseClicked(evt);
            }
        });

        ticketPassengerIDCombo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ticketPassengerIDComboMouseDragged(evt);
            }
        });
        ticketPassengerIDCombo.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                ticketPassengerIDComboPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        ticketPassengerIDCombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ticketPassengerIDComboMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ticketPassengerIDComboMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Passenger ID");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Flight Code");

        ticketFlightCodeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Amount");

        javax.swing.GroupLayout flightDataPanelLayout = new javax.swing.GroupLayout(flightDataPanel);
        flightDataPanel.setLayout(flightDataPanelLayout);
        flightDataPanelLayout.setHorizontalGroup(
            flightDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(flightDataPanelLayout.createSequentialGroup()
                .addGroup(flightDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(flightDataPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(flightDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(flightDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ticketPassportNoTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addComponent(ticketGenderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(flightDataPanelLayout.createSequentialGroup()
                                .addComponent(ticketSave)
                                .addGap(43, 43, 43)
                                .addComponent(ticketEdit))
                            .addComponent(ticketPassengerNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(flightDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ticketAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ticketPassengerIDCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(flightDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ticketFlightCodeCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ticketNationalityCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(flightDataPanelLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(ticketBack)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        flightDataPanelLayout.setVerticalGroup(
            flightDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(flightDataPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ticketPassengerIDCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ticketPassengerNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(3, 3, 3)
                .addComponent(ticketFlightCodeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ticketNationalityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ticketGenderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ticketPassportNoTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ticketAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(flightDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ticketSave)
                    .addComponent(ticketEdit))
                .addGap(18, 18, 18)
                .addComponent(ticketBack)
                .addGap(25, 25, 25))
        );

        bookingTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(bookingTable);

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(flightDataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(flightDataPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    Connection Con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null,Rs1 =null;
    Statement St = null,St1 =null;
    
    private void GetPassenger(){
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
            St = Con.createStatement();
            String Query = "select * from passengerstbl";
            Rs = St.executeQuery(Query);
            while(Rs.next()){
                String PId = String.valueOf(Rs.getInt("PId"));
                ticketPassengerIDCombo.addItem(PId);
            }
        }catch(Exception e){
            
        }
    }
    
    private void GetFlight(){
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
            St = Con.createStatement();
            String Query = "select * from flighttbl";
            Rs = St.executeQuery(Query);
            while(Rs.next()){
                String fiCode = Rs.getString("FlCode");
                ticketFlightCodeCombo.addItem(fiCode);
            }
        }catch(Exception e){
        
        }
    }
    
    private void ticketSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ticketSaveMouseClicked
        if(ticketPassengerNameTxt.getText().isEmpty() || ticketPassportNoTxt1.getText().isEmpty() || ticketAmount.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Misssing Information!!");
        }else{
            try{
                CountBookinds();
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
                PreparedStatement Add = Con.prepareStatement("insert into bookingtbl values(?,?,?,?,?,?,?)");
                Add.setInt(1, bookId);
                Add.setString(2, ticketPassengerNameTxt.getText());
                Add.setString(3, ticketFlightCodeCombo.getSelectedItem().toString());
                Add.setString(4, ticketGenderCombo.getSelectedItem().toString());
                Add.setString(5, ticketPassportNoTxt1.getText());
                Add.setString(6, ticketAmount.getText());
                Add.setString(7, ticketNationalityCombo.getSelectedItem().toString());
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Ticket Added");
                Con.close();
                DisplayTickets();
                ClearBooking();
            } catch(Exception e){
                JOptionPane.showMessageDialog(this,e);
            }
        }
    }//GEN-LAST:event_ticketSaveMouseClicked

    private void DisplayTickets(){
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
            St = Con.createStatement();
            Rs = St.executeQuery("select PName,FlCode,PGen,Natianality,PPass,Amount from bookingtbl");
            bookingTable.setModel(DbUtils.resultSetToTableModel(Rs));
            
        } catch (Exception e){
        
        }
    }
    
    int bookId =0;
    private void CountBookinds(){
        try{
            St1 = Con.createStatement();
            Rs1 = St1.executeQuery("select Max(TicketId) from bookingtbl");
            Rs1.next();
            bookId = Rs1.getInt(1)+1;
        }catch (Exception e){
        
        }
    }
    
    private void ClearBooking(){
        ticketPassengerNameTxt.setText("");
        ticketPassportNoTxt1.setText("");
        ticketAmount.setText("");
    }
    private void ticketPassengerIDComboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ticketPassengerIDComboMouseClicked
        JOptionPane.showMessageDialog(this, "Passenger Added");
    }//GEN-LAST:event_ticketPassengerIDComboMouseClicked

    private void ticketPassengerIDComboMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ticketPassengerIDComboMousePressed
        JOptionPane.showMessageDialog(this, "Passenger Added v");
    }//GEN-LAST:event_ticketPassengerIDComboMousePressed

    private void ticketPassengerIDComboMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ticketPassengerIDComboMouseDragged
        JOptionPane.showMessageDialog(this, "Passenger Added 2");
    }//GEN-LAST:event_ticketPassengerIDComboMouseDragged

    private void ticketPassengerIDComboPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_ticketPassengerIDComboPopupMenuWillBecomeInvisible
        String item = (String)ticketPassengerIDCombo.getSelectedItem();
        String sql = "select * from passengerstbl where PId = ?";
        
        try{
            pst  = Con.prepareStatement(sql);
            pst.setString(1, item);
            Rs = pst.executeQuery();
            if(Rs.next()){
                String name = Rs.getString("PName");
                String passport = Rs.getString("PPass");
                String nation = Rs.getString("PNat");
                String gender = Rs.getString("PGen");
                ticketPassengerNameTxt.setText(name);
                ticketPassportNoTxt1.setText(passport);
                ticketNationalityCombo.setSelectedItem(nation);
                ticketGenderCombo.setSelectedItem(gender);
            }
        }catch(Exception e){
        
        }
    }//GEN-LAST:event_ticketPassengerIDComboPopupMenuWillBecomeInvisible

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        new MainForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicketBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JTable bookingTable;
    private javax.swing.JPanel flightDataPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField ticketAmount;
    private javax.swing.JButton ticketBack;
    private javax.swing.JButton ticketEdit;
    private javax.swing.JComboBox<String> ticketFlightCodeCombo;
    private javax.swing.JComboBox<String> ticketGenderCombo;
    private javax.swing.JComboBox<String> ticketNationalityCombo;
    private javax.swing.JComboBox<String> ticketPassengerIDCombo;
    private javax.swing.JTextField ticketPassengerNameTxt;
    private javax.swing.JTextField ticketPassportNoTxt1;
    private javax.swing.JButton ticketSave;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
