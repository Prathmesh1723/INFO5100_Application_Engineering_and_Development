/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Admin;
import Model.Person;
import Model.Resident;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sakshi Sasalate
 */
public class PatientDirectory extends javax.swing.JPanel {
    JPanel lowerPanel;
    Admin admin;
    /**
     * Creates new form PatientDirectory
     */
    public PatientDirectory(JPanel lowerPanel, Admin admin) {
        initComponents();
        this.admin = admin;
        this.lowerPanel = lowerPanel;
        loadPatientTable();

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
        jScrollPane1 = new javax.swing.JScrollPane();
        abnormalCaseTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        abnormalLabel = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        abnormalCaseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Patient Name", "Gender", "Age", "Illness", "House", "Community", "City", "isPatient", "Abnormality"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(abnormalCaseTable);
        if (abnormalCaseTable.getColumnModel().getColumnCount() > 0) {
            abnormalCaseTable.getColumnModel().getColumn(0).setResizable(false);
            abnormalCaseTable.getColumnModel().getColumn(0).setPreferredWidth(30);
            abnormalCaseTable.getColumnModel().getColumn(1).setResizable(false);
            abnormalCaseTable.getColumnModel().getColumn(1).setPreferredWidth(60);
            abnormalCaseTable.getColumnModel().getColumn(2).setResizable(false);
            abnormalCaseTable.getColumnModel().getColumn(2).setPreferredWidth(40);
            abnormalCaseTable.getColumnModel().getColumn(3).setResizable(false);
            abnormalCaseTable.getColumnModel().getColumn(3).setPreferredWidth(40);
            abnormalCaseTable.getColumnModel().getColumn(4).setResizable(false);
            abnormalCaseTable.getColumnModel().getColumn(4).setPreferredWidth(60);
            abnormalCaseTable.getColumnModel().getColumn(5).setResizable(false);
            abnormalCaseTable.getColumnModel().getColumn(5).setPreferredWidth(40);
            abnormalCaseTable.getColumnModel().getColumn(6).setResizable(false);
            abnormalCaseTable.getColumnModel().getColumn(6).setPreferredWidth(60);
            abnormalCaseTable.getColumnModel().getColumn(7).setResizable(false);
            abnormalCaseTable.getColumnModel().getColumn(7).setPreferredWidth(60);
            abnormalCaseTable.getColumnModel().getColumn(8).setResizable(false);
            abnormalCaseTable.getColumnModel().getColumn(9).setResizable(false);
            abnormalCaseTable.getColumnModel().getColumn(9).setPreferredWidth(100);
        }

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("COMMUNITY CASES");

        backButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        backButton.setText("<< BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setText("ABNORMAL CASES : ");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N

        abnormalLabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(313, 313, 313)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(abnormalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(128, 128, 128)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(324, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(47, 47, 47))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(abnormalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addContainerGap(168, Short.MAX_VALUE))
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
        AdminWindow adminWindow = new AdminWindow(lowerPanel, admin);
        lowerPanel.add("AdminWindow",adminWindow);
        CardLayout layout = (CardLayout)lowerPanel.getLayout();
        layout.next(lowerPanel);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable abnormalCaseTable;
    private javax.swing.JLabel abnormalLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void loadPatientTable() {
        int rowCount = abnormalCaseTable.getRowCount();
        int abnormal = 0;
        String abnormality = "High BP & Abnormal Heart Rate";

        DefaultTableModel model = (DefaultTableModel) abnormalCaseTable.getModel();

        for(int i=rowCount-1;i>=0;i--){
            model.removeRow(i);
        }

        for (Person p : admin.getPersonDirectory()) {
        if ((p.getBloodPressure()>150.0)||(p.getHB()<65.0)){
        abnormal++;
        if (p.getBloodPressure()>150.0){
            abnormality = "High BP";
        }
        if (p.getHB()<65.0){
            abnormality = "Abnormal Heart Rate";
         }

        System.out.print(abnormality);
            Object row[] = new Object[10];
            row[0] = p.getId();
            row[1] = p;
            row[2]= p.getGender();
            row[3] = p.getAge();
            row[4]= p.getIllness();
            Resident residence = p.getResidence();
            row[5] = residence.getHouse();
            row[6] = residence.getCommunity();
            row[7] = residence.getCity();
            row[8] = p.isIsPatient();
            row[9]=abnormality;
            model.addRow(row);
            }
            
        }

        abnormalLabel.setText(String.valueOf(abnormal));
    }

}
