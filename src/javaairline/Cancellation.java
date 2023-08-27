
package javaairline;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Cancellation extends javax.swing.JFrame {

    public Cancellation() {
        initComponents();
        GetBooking();
        cancelFlightCode.setEditable(false);
        DisplayCancelTickets();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        flightDataPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ticketEdit = new javax.swing.JButton();
        ticketBack = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        cancelTicketId = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cancelFlightCode = new javax.swing.JTextField();
        cancelDate = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        cancelTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));

        topPanel.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Sri Lanka Airline Cancellation");

        back.setText("back");
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
                .addContainerGap(292, Short.MAX_VALUE))
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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Cancel Date");

        ticketEdit.setBackground(new java.awt.Color(0, 153, 255));
        ticketEdit.setForeground(new java.awt.Color(255, 255, 255));
        ticketEdit.setText("Reset");

        ticketBack.setBackground(new java.awt.Color(0, 153, 255));
        ticketBack.setForeground(new java.awt.Color(255, 255, 255));
        ticketBack.setText("Back");

        cancelBtn.setBackground(new java.awt.Color(0, 153, 255));
        cancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtn.setText("Book");
        cancelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelBtnMouseClicked(evt);
            }
        });

        cancelTicketId.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                cancelTicketIdMouseDragged(evt);
            }
        });
        cancelTicketId.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cancelTicketIdPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cancelTicketId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelTicketIdMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cancelTicketIdMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Ticket ID");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Flight Code");

        javax.swing.GroupLayout flightDataPanelLayout = new javax.swing.GroupLayout(flightDataPanel);
        flightDataPanel.setLayout(flightDataPanelLayout);
        flightDataPanelLayout.setHorizontalGroup(
            flightDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(flightDataPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(flightDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(flightDataPanelLayout.createSequentialGroup()
                        .addComponent(cancelBtn)
                        .addGap(43, 43, 43)
                        .addComponent(ticketEdit))
                    .addGroup(flightDataPanelLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(ticketBack))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelTicketId, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelFlightCode, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        flightDataPanelLayout.setVerticalGroup(
            flightDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(flightDataPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelTicketId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(cancelFlightCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(flightDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn)
                    .addComponent(ticketEdit))
                .addGap(18, 18, 18)
                .addComponent(ticketBack)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        cancelTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(cancelTable);

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
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flightDataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    
    private void cancelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseClicked
        
            try{
                CountCancellations();
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
                PreparedStatement Add = Con.prepareStatement("insert into cancellationtbl values(?,?,?,?)");
                Add.setInt(1, cancelId);
                Add.setString(2, cancelTicketId.getSelectedItem().toString());
                Add.setString(3, cancelFlightCode.getText());
                Add.setString(4, cancelDate.getDate().toString());
                
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Ticket cancelled");
                Con.close();
                DisplayCancelTickets();
                DeleteTicket();
//                ClearBooking();
            } catch(Exception e){
                JOptionPane.showMessageDialog(this,e);
            }
        
    }//GEN-LAST:event_cancelBtnMouseClicked

    int cancelId =0;
    private void CountCancellations(){
        try{
            St1 = Con.createStatement();
            Rs1 = St1.executeQuery("select Max(CancId) from cancellationtbl");
            Rs1.next();
            cancelId = Rs1.getInt(1)+1;
        }catch (Exception e){
        
        }
    }
    private void DeleteTicket(){
        String deleteTicket = (String)cancelTicketId.getSelectedItem();
        try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
                String Query = "Delete from bookingtbl where TicketId='"+deleteTicket+"'";
                Statement Del = Con.createStatement();
                Del.executeUpdate(Query);
                
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
    }
    private void DisplayCancelTickets(){
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from cancellationtbl");
            cancelTable.setModel(DbUtils.resultSetToTableModel(Rs));
            
        } catch (Exception e){
        
        }
    }
    private void cancelTicketIdMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelTicketIdMouseDragged
        
    }//GEN-LAST:event_cancelTicketIdMouseDragged

    private void cancelTicketIdPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cancelTicketIdPopupMenuWillBecomeInvisible
        String item = (String)cancelTicketId.getSelectedItem();
        String sql = "select * from bookingtbl where TicketId = ?";

        try{
            pst  = Con.prepareStatement(sql);
            pst.setString(1, item);
            Rs = pst.executeQuery();
            if(Rs.next()){
                String flightCode = Rs.getString("FlCode");
                cancelFlightCode.setText(flightCode);
            }
        }catch(Exception e){

        }
    }//GEN-LAST:event_cancelTicketIdPopupMenuWillBecomeInvisible

    private void GetBooking(){
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
            St = Con.createStatement();
            String Query = "select * from bookingtbl";
            Rs = St.executeQuery(Query);
            while(Rs.next()){
                String PId = String.valueOf(Rs.getInt("TicketId"));
                cancelTicketId.addItem(PId);
            }
        }catch(Exception e){
            
        }
    }
    private void cancelTicketIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelTicketIdMouseClicked
        
    }//GEN-LAST:event_cancelTicketIdMouseClicked

    private void cancelTicketIdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelTicketIdMousePressed
        
    }//GEN-LAST:event_cancelTicketIdMousePressed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        new MainForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cancellation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton cancelBtn;
    private com.toedter.calendar.JDateChooser cancelDate;
    private javax.swing.JTextField cancelFlightCode;
    private javax.swing.JTable cancelTable;
    private javax.swing.JComboBox<String> cancelTicketId;
    private javax.swing.JPanel flightDataPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton ticketBack;
    private javax.swing.JButton ticketEdit;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
