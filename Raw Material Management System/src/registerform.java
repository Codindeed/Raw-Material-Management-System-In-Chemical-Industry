import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chinmay pc
 */
public class registerform extends javax.swing.JFrame {

    /**
     * Creates new form registerform
     */
    public registerform() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelclose1 = new javax.swing.JLabel();
        jLabelmin1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldFN = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldUN = new javax.swing.JTextField();
        jTextFieldPASS = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButtonregister = new javax.swing.JButton();
        jTextFieldLN = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Create Your Account");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(24, 11, 187, 34);

        jLabelclose1.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jLabelclose1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelclose1.setText("x");
        jLabelclose1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelclose1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelclose1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabelclose1);
        jLabelclose1.setBounds(699, 20, 20, 19);

        jLabelmin1.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jLabelmin1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelmin1.setText("-");
        jLabelmin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelmin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelmin1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabelmin1);
        jLabelmin1.setBounds(640, 20, 40, 20);

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(236, 240, 241));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("First Name");

        jLabel5.setBackground(new java.awt.Color(236, 240, 241));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password:");

        jTextFieldFN.setBackground(new java.awt.Color(108, 122, 131));
        jTextFieldFN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldFN.setForeground(new java.awt.Color(228, 254, 241));
        jTextFieldFN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFNActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(236, 240, 241));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Last Name:");

        jLabel7.setBackground(new java.awt.Color(236, 240, 241));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("UserName:");

        jTextFieldUN.setBackground(new java.awt.Color(108, 122, 131));

        jTextFieldPASS.setBackground(new java.awt.Color(108, 122, 131));
        jTextFieldPASS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPASSActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Cancel");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButtonregister.setBackground(new java.awt.Color(34, 167, 240));
        jButtonregister.setForeground(new java.awt.Color(255, 255, 255));
        jButtonregister.setText("Register");
        jButtonregister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonregisterMouseClicked(evt);
            }
        });
        jButtonregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonregisterActionPerformed(evt);
            }
        });

        jTextFieldLN.setBackground(new java.awt.Color(108, 122, 131));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel4)
                        .addGap(45, 45, 45)
                        .addComponent(jTextFieldFN, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(jLabel7))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(jLabel6)))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldUN)
                            .addComponent(jTextFieldLN, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel5)
                        .addGap(45, 45, 45)
                        .addComponent(jTextFieldPASS, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jButton4)
                        .addGap(46, 46, 46)
                        .addComponent(jButtonregister, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(487, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTextFieldFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldLN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jTextFieldUN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jTextFieldPASS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButtonregister))
                .addGap(80, 80, 80))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldFNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFNActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButtonregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonregisterActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:
    }//GEN-LAST:event_jButtonregisterActionPerformed

    private void jTextFieldPASSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPASSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPASSActionPerformed

    private void jButtonregisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonregisterMouseClicked
        String s= jTextFieldUN.getText();
     String s1 = jTextFieldFN.getText();
     String s2= jTextFieldLN.getText();
     
     
     String s3 = jTextFieldPASS.getText();
     
        try {
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","Chinmay@99");
            PreparedStatement ps= con.prepareStatement("insert into admin values(?,?,?,?)");
            ps.setString(1,s);
            ps.setString(2,s1);
            ps.setString(3,s2);
            ps.setString(4,s3);
            int rs  = ps.executeUpdate();
            JOptionPane.showMessageDialog(jButtonregister,"Registered!!!!");
            
            
        } catch (SQLException e) {
        }
    /* try
     {
         Class.forName("com.mysql.jdbs.Driver");
         Connection con;
         String dbUrl="jdbc:mysql://localhost:3306/db";
                 con=DriverManager.getConnection(dbUrl,"root","chinmay");
         String q ="insert into admin values('"+username+"','"+firstname+"','"+lastname+"','"+password+"')";
          //  Statement st=con.createStatement();
             // PreparedStatement pst= con.prepareStatement(q);
            CallableStatement cs = null;
         ResultSet rs  = pst.executeQuery();
        if(!rs.next())
        {
            
        }
            
     }  catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(registerform.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    
     logininform l = new logininform();
       l.setVisible(true);
       l.pack();
       l.setLocationRelativeTo(null);
       l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.dispose();
    }//GEN-LAST:event_jButtonregisterMouseClicked

    private void jLabelclose1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelclose1MouseClicked
System.exit(0);        
    }//GEN-LAST:event_jLabelclose1MouseClicked

    private void jLabelmin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelmin1MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelmin1MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked

        
jTextFieldFN.setText("");
jTextFieldLN.setText("");
jTextFieldPASS.setText("");
jTextFieldUN.setText("");      
    }//GEN-LAST:event_jButton4MouseClicked

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
            java.util.logging.Logger.getLogger(registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registerform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonregister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelclose1;
    private javax.swing.JLabel jLabelmin1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldFN;
    private javax.swing.JTextField jTextFieldLN;
    private javax.swing.JTextField jTextFieldPASS;
    private javax.swing.JTextField jTextFieldUN;
    // End of variables declaration//GEN-END:variables
}
