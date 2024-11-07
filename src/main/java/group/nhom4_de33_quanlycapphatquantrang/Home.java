package group.nhom4_de33_quanlycapphatquantrang;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author admin
 */

public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }
    
    public Home(String role) {
        initComponents();
        setLocationRelativeTo(null);
        if(role.equals("Admin")) {
            btnUSER.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUSER = new javax.swing.JButton();
        CATEGORY = new javax.swing.JButton();
        UNIFORM = new javax.swing.JButton();
        PERSONNEL = new javax.swing.JButton();
        DISTRIBUTION = new javax.swing.JButton();
        LOGOUT = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUSER.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUSER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Users.png"))); // NOI18N
        btnUSER.setText("User");
        btnUSER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUSERActionPerformed(evt);
            }
        });
        getContentPane().add(btnUSER, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 54, -1, -1));

        CATEGORY.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CATEGORY.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/category.png"))); // NOI18N
        CATEGORY.setText("Category");
        CATEGORY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CATEGORYActionPerformed(evt);
            }
        });
        getContentPane().add(CATEGORY, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 54, -1, -1));

        UNIFORM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UNIFORM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uniform .png"))); // NOI18N
        UNIFORM.setText("Uniform");
        getContentPane().add(UNIFORM, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 54, -1, -1));

        PERSONNEL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PERSONNEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/personnel.png"))); // NOI18N
        PERSONNEL.setText("Personnel");
        PERSONNEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PERSONNELActionPerformed(evt);
            }
        });
        getContentPane().add(PERSONNEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 54, -1, -1));

        DISTRIBUTION.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DISTRIBUTION.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Distribution.png"))); // NOI18N
        DISTRIBUTION.setText("Distribution");
        DISTRIBUTION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DISTRIBUTIONActionPerformed(evt);
            }
        });
        getContentPane().add(DISTRIBUTION, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 54, -1, -1));

        LOGOUT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LOGOUT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Exit.png"))); // NOI18N
        LOGOUT.setText("Logout");
        LOGOUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGOUTActionPerformed(evt);
            }
        });
        getContentPane().add(LOGOUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(1083, 54, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/View-Distribution.png"))); // NOI18N
        jButton1.setText("View Distribution ");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(869, 54, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home_background.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-220, -10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CATEGORYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CATEGORYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CATEGORYActionPerformed

    private void PERSONNELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PERSONNELActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PERSONNELActionPerformed

    private void DISTRIBUTIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DISTRIBUTIONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DISTRIBUTIONActionPerformed

    private void btnUSERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUSERActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUSERActionPerformed

    private void LOGOUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGOUTActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you want to logout application?", "Select",JOptionPane.YES_NO_OPTION);
        if (a==0) {
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_LOGOUTActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CATEGORY;
    private javax.swing.JButton DISTRIBUTION;
    private javax.swing.JButton LOGOUT;
    private javax.swing.JButton PERSONNEL;
    private javax.swing.JButton UNIFORM;
    private javax.swing.JButton btnUSER;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
