/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package teacher_portal_GUI;

/**
 *
 * @author hp
 */
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import methods.*;
import users.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PageOne extends javax.swing.JFrame {

    /**
     * Creates new form Welcome
     */
    public PageOne() {
        initComponents();
        SignUpPane.setVisible(false);
        login.setVisible(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Root = new javax.swing.JPanel();
        center = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        SignUpPane = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        SignUpSec = new javax.swing.JTextField();
        SIgnUpButton = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        SignUpName1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        SignUpEmail = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        SignUpConfirmPassword = new javax.swing.JPasswordField();
        SignUpCreatePassword = new javax.swing.JPasswordField();
        login = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        loginENTER = new javax.swing.JButton();
        logInName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        LogInPassword = new javax.swing.JPasswordField();
        sideBar = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        HomeBotton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        SignUp = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);
        setLocation(new java.awt.Point(50, 25));

        Root.setLayout(new java.awt.BorderLayout());

        center.setBackground(new java.awt.Color(24, 27, 25));
        center.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SignUpPane.setBackground(new java.awt.Color(24, 27, 25));
        SignUpPane.setAutoscrolls(true);
        SignUpPane.setPreferredSize(new java.awt.Dimension(520, 500));
        SignUpPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("SIGN UP");
        SignUpPane.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 127, 26));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Choose Section Name");
        SignUpPane.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 170, 28));

        SignUpSec.setBackground(new java.awt.Color(24, 27, 25));
        SignUpSec.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SignUpSec.setForeground(new java.awt.Color(153, 153, 153));
        SignUpSec.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        SignUpSec.setSelectionColor(new java.awt.Color(102, 204, 255));
        SignUpSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpSecActionPerformed(evt);
            }
        });
        SignUpPane.add(SignUpSec, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 252, 300, 60));

        SIgnUpButton.setBackground(new java.awt.Color(24, 27, 25));
        SIgnUpButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SIgnUpButton.setForeground(new java.awt.Color(153, 153, 153));
        SIgnUpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/login_32px.png"))); // NOI18N
        SIgnUpButton.setText("SIGN UP");
        SIgnUpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SIgnUpButton.setFocusPainted(false);
        SIgnUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIgnUpButtonActionPerformed(evt);
            }
        });
        SignUpPane.add(SIgnUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, 120, 50));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Confirm Password");
        SignUpPane.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 120, 40));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Create Password");
        SignUpPane.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 120, 40));

        SignUpName1.setBackground(new java.awt.Color(24, 27, 25));
        SignUpName1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SignUpName1.setForeground(new java.awt.Color(153, 153, 153));
        SignUpName1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        SignUpName1.setSelectionColor(new java.awt.Color(102, 204, 255));
        SignUpName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpName1ActionPerformed(evt);
            }
        });
        SignUpPane.add(SignUpName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 300, 52));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Name");
        SignUpPane.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 82, 28));

        SignUpEmail.setBackground(new java.awt.Color(24, 27, 25));
        SignUpEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SignUpEmail.setForeground(new java.awt.Color(153, 153, 153));
        SignUpEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        SignUpEmail.setSelectionColor(new java.awt.Color(102, 204, 255));
        SignUpEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpEmailActionPerformed(evt);
            }
        });
        SignUpPane.add(SignUpEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 300, 52));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Email");
        SignUpPane.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 82, 28));

        SignUpConfirmPassword.setBackground(new java.awt.Color(24, 27, 25));
        SignUpConfirmPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SignUpConfirmPassword.setForeground(new java.awt.Color(153, 153, 153));
        SignUpConfirmPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        SignUpConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpConfirmPasswordActionPerformed(evt);
            }
        });
        SignUpPane.add(SignUpConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 300, 60));

        SignUpCreatePassword.setBackground(new java.awt.Color(24, 27, 25));
        SignUpCreatePassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SignUpCreatePassword.setForeground(new java.awt.Color(153, 153, 153));
        SignUpCreatePassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        SignUpPane.add(SignUpCreatePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 249, 300, 60));

        login.setBackground(new java.awt.Color(24, 27, 25));
        login.setDoubleBuffered(false);
        login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOG-IN");
        login.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 56, 127, 26));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("User Name");
        login.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 82, 28));

        loginENTER.setBackground(new java.awt.Color(24, 27, 25));
        loginENTER.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        loginENTER.setForeground(new java.awt.Color(153, 153, 153));
        loginENTER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/login_32px.png"))); // NOI18N
        loginENTER.setText("ENTER");
        loginENTER.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginENTER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginENTERActionPerformed(evt);
            }
        });
        login.add(loginENTER, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 110, 39));

        logInName.setBackground(new java.awt.Color(24, 27, 25));
        logInName.setForeground(new java.awt.Color(153, 153, 153));
        logInName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        logInName.setSelectionColor(new java.awt.Color(102, 204, 255));
        logInName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInNameActionPerformed(evt);
            }
        });
        login.add(logInName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 300, 52));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Password");
        login.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 82, 28));

        LogInPassword.setBackground(new java.awt.Color(24, 27, 25));
        LogInPassword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LogInPassword.setForeground(new java.awt.Color(153, 153, 153));
        LogInPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        login.add(LogInPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 300, 60));

        jLayeredPane1.setLayer(SignUpPane, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(login, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addComponent(SignUpPane, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(SignUpPane, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        center.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 1030, 610));

        Root.add(center, java.awt.BorderLayout.CENTER);

        sideBar.setBackground(new java.awt.Color(78, 151, 126));
        sideBar.setPreferredSize(new java.awt.Dimension(70, 100));

        jPanel1.setBackground(new java.awt.Color(78, 151, 126));
        jPanel1.setPreferredSize(new java.awt.Dimension(63, 220));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 63, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        sideBar.add(jPanel1);

        HomeBotton.setBackground(new java.awt.Color(0, 0, 0));
        HomeBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/home_32px.png"))); // NOI18N
        HomeBotton.setBorderPainted(false);
        HomeBotton.setContentAreaFilled(false);
        HomeBotton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeBotton.setFocusPainted(false);
        HomeBotton.setPreferredSize(new java.awt.Dimension(40, 40));
        HomeBotton.setSelected(true);
        HomeBotton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeBottonMouseEntered(evt);
            }
        });
        HomeBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeBottonActionPerformed(evt);
            }
        });
        sideBar.add(HomeBotton);

        jPanel2.setBackground(new java.awt.Color(78, 151, 126));
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 60));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        sideBar.add(jPanel2);

        SignUp.setBackground(new java.awt.Color(0, 0, 0));
        SignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/upload_to_cloud_32px.png"))); // NOI18N
        SignUp.setBorderPainted(false);
        SignUp.setContentAreaFilled(false);
        SignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignUp.setFocusPainted(false);
        SignUp.setPreferredSize(new java.awt.Dimension(40, 40));
        SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpActionPerformed(evt);
            }
        });
        sideBar.add(SignUp);

        jPanel3.setBackground(new java.awt.Color(78, 151, 126));
        jPanel3.setPreferredSize(new java.awt.Dimension(100, 30));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        sideBar.add(jPanel3);

        Root.add(sideBar, java.awt.BorderLayout.WEST);

        getContentPane().add(Root, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeBottonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBottonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeBottonMouseEntered

    private void HomeBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBottonActionPerformed
        // TODO add your handling code here:
        SignUpPane.setVisible(false);
        login.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_HomeBottonActionPerformed

    private void SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpActionPerformed
        // TODO add your handling code here:
        login.setVisible(false);
         SignUpPane.setVisible(true);
    }//GEN-LAST:event_SignUpActionPerformed

    private void loginENTERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginENTERActionPerformed
        // TODO add your handling code here:
        String userName = "";
        char[] rpassword;
        
        userName = logInName.getText();
        rpassword = LogInPassword.getPassword();
        String password = new String(rpassword);
        if("".equals(userName) || "".equals(password))
        {
            JOptionPane.showMessageDialog(this,"Please Comlete the Input!!");
        }
        else
        {
            if(Password.teachers(userName, password))
            {
                String fileName = "Admin.csv";
                String[] loggedTeacher = new String[5];
                loggedTeacher = Search.admin(fileName, userName);
                int id = Integer.valueOf(loggedTeacher[0]);
                Transporter logged = new Transporter(id , loggedTeacher[1] ,loggedTeacher[2] , loggedTeacher[3],loggedTeacher[4]);
                
                loggedIn newLog = new loggedIn();
                newLog.setVisible(true);
                dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Wrong User Name or Password!");
            }
        }

    }//GEN-LAST:event_loginENTERActionPerformed

    private void logInNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInNameActionPerformed
        // TODO add your handling code here:
        String userName;
        userName = logInName.getText();

    }//GEN-LAST:event_logInNameActionPerformed

    private void SignUpName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpName1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_SignUpName1ActionPerformed

    private void SignUpEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignUpEmailActionPerformed

    private void SignUpSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpSecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignUpSecActionPerformed

    private void SIgnUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIgnUpButtonActionPerformed
        // TODO add your handling code here:
        String name ="";
        char[] fPassword;
        char[] sPassword;
        String email = "";
        String sec = "";
        boolean flag = true;
       
        name = SignUpName1.getText();
        fPassword = SignUpCreatePassword.getPassword();
        sec = SignUpSec.getText();
        sPassword = SignUpConfirmPassword.getPassword();
        email = SignUpEmail.getText();
        
          String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
          Pattern pattern = Pattern.compile(EMAIL_PATTERN);
          Matcher matcher = pattern.matcher(email);
          
          if(SignUpName1.getText().isEmpty() || fPassword.length == 0 || sPassword.length == 0 || SignUpEmail.getText().isEmpty() || SignUpSec.getText().isEmpty())
          {
              JOptionPane.showMessageDialog(this, "Please Complete The Form");
              flag = false;
          }
          
          if(!matcher.matches())
          {
              JOptionPane.showMessageDialog(this,"Invalid Email Adress");
              flag = false;
          }
          if (!Password.isSectionValiad(sec))
          {
              JOptionPane.showMessageDialog(this,"Section name Already Exists");
              flag = false;
          }
          if(!Password.isNameValid(name))
          {
              JOptionPane.showMessageDialog(this,"User Name already exists, Please choose another name!");
              flag = false;
          }
          
          if(flag)
          {
              // next page
              Admin SignUp = new Admin("SignUp" , 1 , "em" , "em" , "em");
              String password = new String(fPassword);
              Teacher newTeacher = new Teacher(name ,Write.getnewId(), password,email , sec);
              SignUp.addTeacher(newTeacher, sec);
              JOptionPane.showMessageDialog(this,"Sign Up Completed :)");
              SignUpPane.setVisible(false);
              SignUpName1.setText("");
              SignUpCreatePassword.setText("");
              SignUpSec.setText("");
              SignUpConfirmPassword.setText("");
              SignUpEmail.setText("");
              
              Transporter T = new Transporter(newTeacher);
              EnrollStudents en = new EnrollStudents();
              en.setVisible(true);   
          }
          
    }//GEN-LAST:event_SIgnUpButtonActionPerformed

    private void SignUpConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpConfirmPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignUpConfirmPasswordActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PageOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PageOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PageOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PageOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PageOne().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HomeBotton;
    private javax.swing.JPasswordField LogInPassword;
    private javax.swing.JPanel Root;
    private javax.swing.JButton SIgnUpButton;
    private javax.swing.JButton SignUp;
    private javax.swing.JPasswordField SignUpConfirmPassword;
    private javax.swing.JPasswordField SignUpCreatePassword;
    private javax.swing.JTextField SignUpEmail;
    private javax.swing.JTextField SignUpName1;
    private javax.swing.JPanel SignUpPane;
    private javax.swing.JTextField SignUpSec;
    private javax.swing.JPanel center;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField logInName;
    private javax.swing.JPanel login;
    private javax.swing.JButton loginENTER;
    private javax.swing.JPanel sideBar;
    // End of variables declaration//GEN-END:variables
}