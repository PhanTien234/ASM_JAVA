/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Grade;
import model.GradeList;
import model.Student;
import model.StudentList;
import utilities.validator;

/**
 *
 * @author PHANMINHTIEN
 */
public class ManageGradeView extends javax.swing.JFrame {
    StudentList listStudent = new StudentList();
    GradeList listGrade = new GradeList();
    /**
     * Creates new form ManageGradeView
     */
    public ManageGradeView() {
        initComponents();
        textfield_StudentID.setEditable(false);
        textfield_StudentName.setEditable(false);
        fOpen();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lable_StudentID = new javax.swing.JLabel();
        textfield_StudentID = new javax.swing.JTextField();
        lable_StudentName = new javax.swing.JLabel();
        textfield_StudentName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textfield_MathGrade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textfield_PhysicsGrade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textfield_ChemistryGrade = new javax.swing.JTextField();
        button_Save = new javax.swing.JButton();
        button_Delete = new javax.swing.JButton();
        button_Edit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        textfield_FindStudentID = new javax.swing.JTextField();
        button_findStudentID = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableGrade = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        lable_AvarageGrade = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menubar_File = new javax.swing.JMenu();
        menuItem_Open = new javax.swing.JMenuItem();
        menuItem_Save = new javax.swing.JMenuItem();
        menuItem_Exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("MANAGE GRADE");

        lable_StudentID.setText("STUDENT_ID");

        lable_StudentName.setText("STUDENT NAME");

        jLabel2.setText("MATH GRADE");

        jLabel3.setText("PHYSICS GRADE");

        jLabel4.setText("CHEMISTRY GRADE");

        button_Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Actions-document-save-icon.png"))); // NOI18N
        button_Save.setText("SAVE");
        button_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_SaveActionPerformed(evt);
            }
        });

        button_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Remove-Male-User-icon.png"))); // NOI18N
        button_Delete.setText("DELETE");
        button_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_DeleteActionPerformed(evt);
            }
        });

        button_Edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Actions-document-edit-icon.png"))); // NOI18N
        button_Edit.setText("EDIT");
        button_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_EditActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 255, 0));

        jLabel5.setText("STUDENT_ID");

        textfield_FindStudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_FindStudentIDActionPerformed(evt);
            }
        });

        button_findStudentID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Search-icon.png"))); // NOI18N
        button_findStudentID.setText("Search");
        button_findStudentID.setAlignmentY(0.0F);
        button_findStudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_findStudentIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textfield_FindStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(button_findStudentID)
                .addContainerGap(172, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textfield_FindStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_findStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        tableGrade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student_ID", "Student Name", "Math Grade", "Physics Grade", "Chemistry Grade", "Avarage Grade", "Rank"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableGrade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableGradeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableGrade);

        jLabel6.setText("AVARAGE GRADE");

        lable_AvarageGrade.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lable_AvarageGrade.setText("0.0");

        menubar_File.setText("File");

        menuItem_Open.setText("Open");
        menuItem_Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_OpenActionPerformed(evt);
            }
        });
        menubar_File.add(menuItem_Open);

        menuItem_Save.setText("Save");
        menuItem_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_SaveActionPerformed(evt);
            }
        });
        menubar_File.add(menuItem_Save);

        menuItem_Exit.setText("Exit");
        menuItem_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_ExitActionPerformed(evt);
            }
        });
        menubar_File.add(menuItem_Exit);

        jMenuBar1.add(menubar_File);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lable_StudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(textfield_StudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lable_StudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(textfield_StudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textfield_PhysicsGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textfield_MathGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)))))
                        .addContainerGap(391, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(button_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lable_AvarageGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textfield_ChemistryGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfield_StudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lable_StudentID))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfield_StudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lable_StudentName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfield_MathGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfield_PhysicsGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfield_ChemistryGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lable_AvarageGrade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_Save)
                    .addComponent(button_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textfield_FindStudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_FindStudentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_FindStudentIDActionPerformed

    public void fillDataTable(){
        DefaultTableModel tbmodel = (DefaultTableModel)tableGrade.getModel();
        tbmodel.setRowCount(0);
        for(Grade grade : listGrade.getAllGrade() ){
            Object rowData[] = new Object[7];
            rowData[0] = grade.getStudent().getStudentID();
            rowData[1] = grade.getStudent().getStudentName();
            rowData[2] = grade.getMathGrade();
            rowData[3] = grade.getPhysicsGrade();
            rowData[4] = grade.getChemistry();
            rowData[5] = grade.getAvarage();
            rowData[6] = grade.getLevelRank();
            tbmodel.addRow(rowData);
            
        }
    }
    
    
    private void button_findStudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_findStudentIDActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        validator.checkId(textfield_FindStudentID, sb);
        if(sb.length() >0){
            JOptionPane.showMessageDialog(this, sb.toString(),"Error",JOptionPane.ERROR_MESSAGE);
        }else{
            Student student = listStudent.getStudentByID(textfield_FindStudentID.getText());
            if(student != null){
                Grade grade = listGrade.getOneGradeByStudentID(student.getStudentID());
                if(grade != null){
                    setModel(grade);
                }else{
                    textfield_StudentID.setText(student.getStudentID());
                    textfield_StudentName.setText(student.getStudentName());
                    textfield_MathGrade.setText("0");
                    textfield_PhysicsGrade.setText("0");
                    textfield_ChemistryGrade.setText("0");
                    lable_AvarageGrade.setText("0.0");
                }  
            }else{
                textfield_FindStudentID.setBackground(Color.orange);
                JOptionPane.showMessageDialog(this, "Student is not exist!");
            }
        }
    }//GEN-LAST:event_button_findStudentIDActionPerformed
    public boolean validateForm(){
        if(textfield_StudentID.getText().isEmpty() || textfield_StudentName.getText().isEmpty()|| textfield_MathGrade.getText().isEmpty()|| textfield_PhysicsGrade.getText().isEmpty()|| textfield_ChemistryGrade.getText().isEmpty()){
            
            return false;
        }else{
            try {
                 double mathGrade = Double.parseDouble(textfield_MathGrade.getText());
                 double physicGrade = Double.parseDouble(textfield_PhysicsGrade.getText());
                 double chemistryGrade = Double.parseDouble(textfield_ChemistryGrade.getText());
                if(mathGrade<0 || mathGrade>10){
                    JOptionPane.showMessageDialog(this, "Please type grage Math from 0-10!");
                    return false;
                }else if(physicGrade<0 || physicGrade>10){
                    JOptionPane.showMessageDialog(this, "Please type grage Physics from 0-10!");
                    return false;
                }else if(chemistryGrade<0 || chemistryGrade>10){
                    JOptionPane.showMessageDialog(this, "Please type grage Chemistry from 0-10!");
                    return false;
                }else{
                    return true;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please enter the number!");
                return false;
            }
        }
    }
    public Grade getModel(){
        Grade grade = new Grade();
        grade.setId(0);
        Student student = new Student(textfield_StudentID.getText(), textfield_StudentName.getText());
        grade.setStudent(student);
        grade.setMathGrade(Double.parseDouble(textfield_MathGrade.getText()));
        grade.setPhysicsGrade(Double.parseDouble(textfield_PhysicsGrade.getText()));
        grade.setChemistry(Double.parseDouble(textfield_ChemistryGrade.getText()));
        return grade;
    }
    private void button_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_SaveActionPerformed
        // TODO add your handling code here:
        if(validateForm()){
            Grade grade = getModel();
            if(listGrade.add(grade)>0){
                fillDataTable();
                JOptionPane.showMessageDialog(this, "Save successfully");
            }
        }else{
            return;
            
        }
    }//GEN-LAST:event_button_SaveActionPerformed
    public void setModel(Grade grade){
        
        textfield_MathGrade.setText(String.valueOf(grade.getMathGrade()));
        textfield_PhysicsGrade.setText(String.valueOf(grade.getPhysicsGrade()));
        textfield_ChemistryGrade.setText(String.valueOf(grade.getChemistry()));
        textfield_StudentID.setText(grade.getStudent().getStudentID());
        textfield_StudentName.setText(grade.getStudent().getStudentName());
        lable_AvarageGrade.setText(String.valueOf(grade.getAvarage()));
    }
    private void tableGradeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableGradeMouseClicked
        // TODO add your handling code here:
        int id = tableGrade.rowAtPoint(evt.getPoint());
        String studentID = tableGrade.getValueAt(id, 0).toString();
        Grade grade = listGrade.getOneGradeByStudentID(studentID);
        setModel(grade);
    }//GEN-LAST:event_tableGradeMouseClicked

    private void button_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_EditActionPerformed
        // TODO add your handling code here:
        if(validateForm()){
            Grade grade = getModel();
            if(listGrade.updateByStudentID(grade)>0){
                JOptionPane.showMessageDialog(this, "Edit successfully!");
                fillDataTable();
            }else{
                JOptionPane.showMessageDialog(this, "Please check infomation");
            }
        }
    }//GEN-LAST:event_button_EditActionPerformed

    private void button_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_DeleteActionPerformed
        // TODO add your handling code here:
        if(validateForm()){
            if(listGrade.deleteGrade(textfield_StudentID.getText())>0){
                JOptionPane.showMessageDialog(this, "Delete successfully!");
                fillDataTable();
            }else{
                JOptionPane.showMessageDialog(this, "Please check infomation");
            }
        }
    }//GEN-LAST:event_button_DeleteActionPerformed

    private void menuItem_OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_OpenActionPerformed
        // TODO add your handling code here:
        fOpen();
    }//GEN-LAST:event_menuItem_OpenActionPerformed

    private void menuItem_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_SaveActionPerformed
        // TODO add your handling code here:
         writeFile();
        JOptionPane.showMessageDialog(this, "Save file successfully");
    }//GEN-LAST:event_menuItem_SaveActionPerformed

    private void menuItem_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_ExitActionPerformed
        // TODO add your handling code here:
         int option = JOptionPane.showConfirmDialog(
			    this,
			    "Do you want exit this program?",
			    "Exit",
			    JOptionPane.YES_NO_OPTION);
		if (option == JOptionPane.YES_OPTION) {
                        writeFile();
			System.exit(0);
		}
    }//GEN-LAST:event_menuItem_ExitActionPerformed
private void writeFile(){
         FileOutputStream fos = null;
         ObjectOutputStream oos = null;
        try{
        fos = new FileOutputStream("data.dat");
        oos = new ObjectOutputStream(fos);
        oos.writeObject(listStudent);
        oos.writeObject(listGrade);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                oos.close();
                fos.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
    private void readFile(){
         FileInputStream fis = null;
         ObjectInputStream ois = null;
        try{
        fis = new FileInputStream("data.dat");
        ois = new ObjectInputStream(fis);
        listGrade = (GradeList)ois.readObject();
        listStudent = (StudentList)ois.readObject();
        }catch(FileNotFoundException e){
            
        
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(ois!=null && fis!=null){
                    ois.close();
                    fis.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    private void fOpen(){
       
        readFile();
        fillDataTable();
        
    }
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
            java.util.logging.Logger.getLogger(ManageGradeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageGradeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageGradeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageGradeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageGradeView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Delete;
    private javax.swing.JButton button_Edit;
    private javax.swing.JButton button_Save;
    private javax.swing.JButton button_findStudentID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lable_AvarageGrade;
    private javax.swing.JLabel lable_StudentID;
    private javax.swing.JLabel lable_StudentName;
    private javax.swing.JMenuItem menuItem_Exit;
    private javax.swing.JMenuItem menuItem_Open;
    private javax.swing.JMenuItem menuItem_Save;
    private javax.swing.JMenu menubar_File;
    private javax.swing.JTable tableGrade;
    private javax.swing.JTextField textfield_ChemistryGrade;
    private javax.swing.JTextField textfield_FindStudentID;
    private javax.swing.JTextField textfield_MathGrade;
    private javax.swing.JTextField textfield_PhysicsGrade;
    private javax.swing.JTextField textfield_StudentID;
    private javax.swing.JTextField textfield_StudentName;
    // End of variables declaration//GEN-END:variables
}
