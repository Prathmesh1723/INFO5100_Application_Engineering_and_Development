/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Admin;
import Model.Person;
import Model.Doctor;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Prathmesh Pardeshi
 */
public class AdminLanding extends javax.swing.JPanel {
    Admin admin;
    JPanel lowerPanel;
    private ArrayList<Person> personDir;
    private ArrayList<Person> patientDir;
    private ArrayList<Doctor> doctorDir;
    /**
     * Creates new form AdminWindow
     */
    public AdminLanding(JPanel lowerPanel, Admin admin) {
        initComponents();
        this.lowerPanel =lowerPanel;
        this.admin = admin;
        personDir = admin.getPersonDirectory();
        patientDir = admin.getPatientDirectory();
        doctorDir = admin.getDoctorDirectory();
//        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//        setBounds(0,0,screenSize.width, screenSize.height);
//        setVisible(true);
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
        personDirectoryButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        patientDirectoryButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        personDirectoryButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        personDirectoryButton.setText("DIRECTORIES");
        personDirectoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personDirectoryButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        backButton.setText("LOGOUT");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        patientDirectoryButton1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        patientDirectoryButton1.setText("VIEW APPOINTMENTS");
        patientDirectoryButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientDirectoryButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 327, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(personDirectoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(patientDirectoryButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(317, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(personDirectoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(patientDirectoryButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(276, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        CommonScreen homePanel = new CommonScreen(lowerPanel, admin, patientDir, personDir);
        lowerPanel.add("HomePanel",homePanel);
        CardLayout layout = (CardLayout)lowerPanel.getLayout();
        layout.show(lowerPanel,"HomePanel");
                                
    }//GEN-LAST:event_backButtonActionPerformed

    private void personDirectoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personDirectoryButtonActionPerformed
        // TODO add your handling code here:
        PersonDirectory personD = new PersonDirectory(lowerPanel, admin);
        lowerPanel.add("PersonPanel",personD);
        CardLayout layout = (CardLayout)lowerPanel.getLayout();
        layout.next(lowerPanel);
    }//GEN-LAST:event_personDirectoryButtonActionPerformed

    private void patientDirectoryButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientDirectoryButton1ActionPerformed
        // TODO add your handling code here:
        DoctorMainScreen doctorMain = new DoctorMainScreen(lowerPanel, admin);
        lowerPanel.add("ViewAppointments",doctorMain);
        CardLayout layout = (CardLayout) lowerPanel.getLayout();
        layout.next(lowerPanel);
    }//GEN-LAST:event_patientDirectoryButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton patientDirectoryButton1;
    private javax.swing.JButton personDirectoryButton;
    // End of variables declaration//GEN-END:variables

}