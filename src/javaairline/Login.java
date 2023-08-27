/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaairline;

import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    
    public Login() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundPanal = new javax.swing.JPanel();
        RightPanal = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        UserNameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        loginTxt = new javax.swing.JTextField();
        loginPasswordTxt = new javax.swing.JPasswordField();
        LoginBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginClose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        BackgroundPanal.setBackground(new java.awt.Color(255, 255, 255));

        RightPanal.setBackground(new java.awt.Color(0, 153, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Standing");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Security");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Confort");

        javax.swing.GroupLayout RightPanalLayout = new javax.swing.GroupLayout(RightPanal);
        RightPanal.setLayout(RightPanalLayout);
        RightPanalLayout.setHorizontalGroup(
            RightPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightPanalLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(RightPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        RightPanalLayout.setVerticalGroup(
            RightPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightPanalLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        UserNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        UserNameLabel.setText("User Name");

        PasswordLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        PasswordLabel.setText("Password");

        LoginBtn.setBackground(new java.awt.Color(0, 153, 255));
        LoginBtn.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        LoginBtn.setText("Login");
        LoginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginBtnMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Sri Lanka Airline");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaairline/jovanas181100087.jpg"))); // NOI18N

        loginClose.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        loginClose.setForeground(new java.awt.Color(0, 153, 255));
        loginClose.setText("X");
        loginClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BackgroundPanalLayout = new javax.swing.GroupLayout(BackgroundPanal);
        BackgroundPanal.setLayout(BackgroundPanalLayout);
        BackgroundPanalLayout.setHorizontalGroup(
            BackgroundPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPanalLayout.createSequentialGroup()
                .addComponent(RightPanal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BackgroundPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundPanalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(BackgroundPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(loginClose))
                        .addGap(19, 19, 19))
                    .addGroup(BackgroundPanalLayout.createSequentialGroup()
                        .addGroup(BackgroundPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundPanalLayout.createSequentialGroup()
                                .addGap(285, 285, 285)
                                .addComponent(LoginBtn))
                            .addGroup(BackgroundPanalLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(BackgroundPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UserNameLabel)
                                    .addComponent(PasswordLabel))
                                .addGap(59, 59, 59)
                                .addGroup(BackgroundPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(loginTxt)
                                    .addComponent(loginPasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(BackgroundPanalLayout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(jLabel1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        BackgroundPanalLayout.setVerticalGroup(
            BackgroundPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RightPanal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BackgroundPanalLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(loginClose)
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(BackgroundPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UserNameLabel)
                    .addComponent(loginTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(BackgroundPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PasswordLabel)
                    .addComponent(loginPasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(LoginBtn)
                .addGap(88, 88, 88))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginBtnMouseClicked
        if(loginTxt.getText().isEmpty() || loginPasswordTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter User Name and Password");
        }else if(loginTxt.getText().equals("admin") && loginPasswordTxt.getText().equals("1234")){
            new MainForm().setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(this, "Enter correct User Name and correct Password");
            loginTxt.setText(null);
            loginPasswordTxt.setText(null);
        }
    }//GEN-LAST:event_LoginBtnMouseClicked

    private void loginCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_loginCloseMouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundPanal;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JPanel RightPanal;
    private javax.swing.JLabel UserNameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel loginClose;
    private javax.swing.JPasswordField loginPasswordTxt;
    private javax.swing.JTextField loginTxt;
    // End of variables declaration//GEN-END:variables
}
