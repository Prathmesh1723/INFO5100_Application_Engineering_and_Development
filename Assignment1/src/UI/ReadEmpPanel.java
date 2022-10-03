/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Assignment1_model.Employee;
import Assignment1_model.EmployeeData;
import java.util.ArrayList;
import javafx.scene.control.TableRow;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author prath
 */
public class ReadEmpPanel extends javax.swing.JPanel {
    
    EmployeeData employeeData;

    /**
     * Creates new form ReadEmpPanel
     */
    public ReadEmpPanel(EmployeeData employeeData) {
        initComponents();
        this.employeeData = employeeData;
        UpdateButton.setVisible(false);
        SearchEmp.setVisible(false);
        SearchField.setVisible(false);
        SearchLabel.setVisible(false);
        GeneralSearch.setVisible(false);
        EmpTable();
    }
    
    public void activateSearchButton(){
        SearchEmp.setVisible(true);
        SearchField.setVisible(true);
        DeleteButton.setEnabled(false);
        SearchLabel.setVisible(true);
        GeneralSearch.setVisible(true);
        
        DefaultTableModel model = (DefaultTableModel) EmployeeTable.getModel();
        model.setRowCount(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        EmployeeTable = new javax.swing.JTable();
        DeleteButton = new javax.swing.JButton();
        ViewButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        EmpTeamInfo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        EmpContactNum = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        EmpEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        EmpAge = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        EmpName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        EmpId = new javax.swing.JTextField();
        EmpPosition = new javax.swing.JTextField();
        EmpStartDate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        EmpLevel = new javax.swing.JTextField();
        UpdateButton = new javax.swing.JButton();
        ViewPhoto = new javax.swing.JLabel();
        SearchEmp = new javax.swing.JButton();
        SearchField = new javax.swing.JTextField();
        SearchLabel = new javax.swing.JLabel();
        GeneralSearch = new javax.swing.JLabel();
        EmpGender = new javax.swing.JTextField();

        EmployeeTable.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        EmployeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Emp ID", "Contact No.", "Email", "Gender", "Age", "Start date", "Team info", "Level", "Position Title"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        EmployeeTable.setRowHeight(60);
        jScrollPane1.setViewportView(EmployeeTable);
        if (EmployeeTable.getColumnModel().getColumnCount() > 0) {
            EmployeeTable.getColumnModel().getColumn(0).setPreferredWidth(170);
            EmployeeTable.getColumnModel().getColumn(1).setPreferredWidth(150);
            EmployeeTable.getColumnModel().getColumn(2).setPreferredWidth(120);
            EmployeeTable.getColumnModel().getColumn(3).setPreferredWidth(150);
            EmployeeTable.getColumnModel().getColumn(4).setPreferredWidth(60);
            EmployeeTable.getColumnModel().getColumn(5).setPreferredWidth(40);
            EmployeeTable.getColumnModel().getColumn(6).setPreferredWidth(60);
            EmployeeTable.getColumnModel().getColumn(7).setPreferredWidth(100);
            EmployeeTable.getColumnModel().getColumn(8).setPreferredWidth(50);
            EmployeeTable.getColumnModel().getColumn(9).setPreferredWidth(100);
        }

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        ViewButton.setText("View");
        ViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Employee ID:");

        EmpTeamInfo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        EmpTeamInfo.setPreferredSize(new java.awt.Dimension(325, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Gender:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Age:");

        EmpContactNum.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        EmpContactNum.setMinimumSize(new java.awt.Dimension(325, 50));
        EmpContactNum.setPreferredSize(new java.awt.Dimension(325, 50));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Start date:");

        EmpEmail.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        EmpEmail.setMinimumSize(new java.awt.Dimension(325, 50));
        EmpEmail.setPreferredSize(new java.awt.Dimension(325, 50));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setText("Team info:");

        EmpAge.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        EmpAge.setPreferredSize(new java.awt.Dimension(96, 50));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setText("Contact No:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setText("Email:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel14.setText("Level:");

        EmpName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        EmpName.setPreferredSize(new java.awt.Dimension(325, 50));
        EmpName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpNameActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel15.setText("Position Title:");

        EmpId.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        EmpId.setPreferredSize(new java.awt.Dimension(325, 50));
        EmpId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpIdActionPerformed(evt);
            }
        });

        EmpPosition.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        EmpPosition.setPreferredSize(new java.awt.Dimension(325, 50));

        EmpStartDate.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        EmpStartDate.setPreferredSize(new java.awt.Dimension(325, 50));
        EmpStartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpStartDateActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Name:");

        EmpLevel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        EmpLevel.setPreferredSize(new java.awt.Dimension(325, 50));

        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        ViewPhoto.setMaximumSize(new java.awt.Dimension(330, 330));

        SearchEmp.setText("Search");
        SearchEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchEmpMouseClicked(evt);
            }
        });
        SearchEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchEmpActionPerformed(evt);
            }
        });

        SearchField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SearchFieldFocusGained(evt);
            }
        });
        SearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchFieldActionPerformed(evt);
            }
        });
        SearchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SearchFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SearchFieldKeyTyped(evt);
            }
        });

        SearchLabel.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        SearchLabel.setText("Please enter a keyword to search in appropiate fields: Name, Emp ID, Email, Contact No.");

        GeneralSearch.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        GeneralSearch.setText("General Search:");

        EmpGender.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel15))
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EmpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(EmpAge, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(EmpId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EmpGender, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(EmpContactNum, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel9)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(EmpPosition, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                    .addComponent(EmpStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EmpLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(EmpTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(ViewPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SearchEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(GeneralSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))))
                .addGap(14, 14, 14))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(SearchLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SearchLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EmpGender)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(EmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmpStartDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(EmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel7)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmpContactNum, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel9)
                            .addComponent(EmpPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(EmpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel6)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(EmpAge, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(EmpLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(EmpTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(ViewPhoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GeneralSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void EmpNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpNameActionPerformed

    private void EmpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpIdActionPerformed

    private void EmpStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpStartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpStartDateActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = EmployeeTable.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) EmployeeTable.getModel();
        Employee selectedEmp = (Employee) model.getValueAt(selectedRowIndex, 1);
        
        employeeData.deleteEmployee(selectedEmp);  
        
        JOptionPane.showMessageDialog(this, "Employee Data deleted.");
        
        EmpTable();
        
        EmpName.setText("");
        EmpId.setText("");
        EmpContactNum.setText("");
        EmpEmail.setText("");
        EmpLevel.setText("");
        EmpPosition.setText("");
        EmpTeamInfo.setText("");
        EmpStartDate.setText("");
        EmpAge.setText("");
        ViewPhoto.setText("");
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void ViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewButtonActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = EmployeeTable.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }
        
        
        DefaultTableModel model = (DefaultTableModel) EmployeeTable.getModel();
        Employee selectedEmp = (Employee) model.getValueAt(selectedRowIndex, 0);
        
        EmpName.setText(String.valueOf(selectedEmp.getEmpName()));
        EmpId.setText(String.valueOf(selectedEmp.getEmpId()));
        EmpContactNum.setText(String.valueOf(selectedEmp.getEmpContactNum()));
        EmpEmail.setText(String.valueOf(selectedEmp.getEmpEmail()));
        EmpAge.setText(String.valueOf(selectedEmp.getEmpAge()));
        EmpGender.setText(String.valueOf(selectedEmp.getEmpGender()));
        EmpLevel.setText(String.valueOf(selectedEmp.getEmpLevel()));
        EmpPosition.setText(String.valueOf(selectedEmp.getEmpPosition()));
        EmpTeamInfo.setText(String.valueOf(selectedEmp.getEmpTeamInfo()));
        EmpStartDate.setText(String.valueOf(selectedEmp.getEmpStartDate()));
        ViewPhoto.setIcon((Icon) selectedEmp.getEmpImage());
        
        UpdateButton.setVisible(true);
    }//GEN-LAST:event_ViewButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = EmployeeTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) EmployeeTable.getModel();
        
        
        
        if(selectedRowIndex >= 0 ){
            model.setValueAt(EmpName.getText(), selectedRowIndex, 0);
            model.setValueAt(EmpId.getText(), selectedRowIndex, 1);
            model.setValueAt(EmpContactNum.getText(), selectedRowIndex, 2);
            model.setValueAt(EmpEmail.getText(), selectedRowIndex, 3);
            model.setValueAt(EmpGender.getText(), selectedRowIndex, 4);
            model.setValueAt(EmpAge.getText(), selectedRowIndex, 5);
            model.setValueAt(EmpStartDate.getText(), selectedRowIndex, 6);
            model.setValueAt(EmpTeamInfo.getText(), selectedRowIndex, 7);
            model.setValueAt(EmpLevel.getText(), selectedRowIndex, 8);
            model.setValueAt(EmpPosition.getText(), selectedRowIndex, 9);
            
            JOptionPane.showMessageDialog(this, "Entry Updated successfully!");
            
        }
        else{
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
        }
        
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void SearchFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchFieldKeyPressed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) EmployeeTable.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        EmployeeTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(SearchField.getText().trim()));
        
    }//GEN-LAST:event_SearchFieldKeyPressed

    private void SearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchFieldActionPerformed

    private void SearchEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchEmpActionPerformed
        // TODO add your handling code here:
        String searchempName = EmpName.getText();
        String searchEmpId = EmpId.getText();
        String searchEmpEmail = EmpEmail.getText();
        String searchEmpContactNo = EmpContactNum.getText();
        
        ArrayList<Employee> searchEmp = new ArrayList<>();
        
        for(Employee emp : employeeData.getEmployeeData()){
            if(emp.getEmpName().equalsIgnoreCase(searchempName)){
                searchEmp.add(emp);
            }
            
            else if(searchEmpId.equals(String.valueOf(emp.getEmpId()))){
                searchEmp.add(emp);
            }
            
            else if(searchEmpEmail.equals(emp.getEmpEmail()))
            {
                searchEmp.add(emp);
            }
            
            else if(searchEmpContactNo.equals(String.valueOf(emp.getEmpContactNum()))){
                searchEmp.add(emp);
            }
            
        }
        
        for (Employee emp:searchEmp){
            SearchEmpTable(searchEmp);
        }
        
    }//GEN-LAST:event_SearchEmpActionPerformed

    private void SearchEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchEmpMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_SearchEmpMouseClicked

    private void SearchFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SearchFieldFocusGained
        // TODO add your handling code here:
        EmpName.setText("");
        EmpId.setText("");
        EmpContactNum.setText("");
        EmpEmail.setText("");
        EmpLevel.setText("");
        EmpPosition.setText("");
        EmpTeamInfo.setText("");
        EmpStartDate.setText("");
        EmpGender.setText("");
        EmpAge.setText("");
        ViewPhoto.setText("");
    }//GEN-LAST:event_SearchFieldFocusGained

    private void SearchFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchFieldKeyTyped
        // TODO add your handling code here:
//        DeleteButton.setEnabled(true);
//        ViewButton.setEnabled(true);
    }//GEN-LAST:event_SearchFieldKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTextField EmpAge;
    private javax.swing.JTextField EmpContactNum;
    private javax.swing.JTextField EmpEmail;
    private javax.swing.JTextField EmpGender;
    private javax.swing.JTextField EmpId;
    private javax.swing.JTextField EmpLevel;
    private javax.swing.JTextField EmpName;
    private javax.swing.JTextField EmpPosition;
    private javax.swing.JTextField EmpStartDate;
    private javax.swing.JTextField EmpTeamInfo;
    private javax.swing.JTable EmployeeTable;
    private javax.swing.JLabel GeneralSearch;
    private javax.swing.JButton SearchEmp;
    private javax.swing.JTextField SearchField;
    private javax.swing.JLabel SearchLabel;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JButton ViewButton;
    private javax.swing.JLabel ViewPhoto;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void EmpTable(){
        DefaultTableModel model = (DefaultTableModel) EmployeeTable.getModel();
        
        model.setRowCount(0);
        int empCount = 1;
        
        for(Employee emp : employeeData.getEmployeeData()){
            Object[] tableRow = new Object[11];
            tableRow[0] = emp;
            tableRow[1] = emp.getEmpId();
            tableRow[2] = emp.getEmpContactNum();
            tableRow[3] = emp.getEmpEmail();
            tableRow[4] = emp.getEmpGender();
            tableRow[5] = emp.getEmpAge();
            tableRow[6] = emp.getEmpStartDate();
            tableRow[7] = emp.getEmpTeamInfo();
            tableRow[8] = emp.getEmpLevel();
            tableRow[9] = emp.getEmpPosition();
            
            model.addRow(tableRow);
            
        }
    }
    
    private void SearchEmpTable(ArrayList<Employee> SearchEmp){
        DefaultTableModel model = (DefaultTableModel) EmployeeTable.getModel();
        model.setRowCount(0);
        
        for(Employee employee: SearchEmp){
            Object[] searchtableRow = new Object[11];
            searchtableRow[0] = employee;
            searchtableRow[1] = employee.getEmpId();
            searchtableRow[2] = employee.getEmpContactNum();
            searchtableRow[3] = employee.getEmpEmail();
            searchtableRow[4] = employee.getEmpGender();
            searchtableRow[5] = employee.getEmpAge();
            searchtableRow[6] = employee.getEmpStartDate();
            searchtableRow[7] = employee.getEmpTeamInfo();
            searchtableRow[8] = employee.getEmpLevel();
            searchtableRow[9] = employee.getEmpPosition();
            
            model.addRow(searchtableRow);
        }
    }
}

