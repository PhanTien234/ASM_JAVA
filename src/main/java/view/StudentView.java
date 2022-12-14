/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Student;
import model.StudentList;
import utilities.Validation;
import utilities.validator;

/**
 *
 * @author PHANMINHTIEN
 */
public class StudentView extends javax.swing.JFrame {
    SimpleDateFormat date_form = new SimpleDateFormat("dd/MM/yyyy");
    StudentList listStudent = new StudentList();
//    private DefaultTableModel tbmodel = null;
    String strImage = null;
    /**
     * Creates new form SinhVienView
     */
    public StudentView() {
       
        initComponents();
        fOpen();
    }

//    StudentView(FrMain aThis, boolean b) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
    public void  fillDataTABLE(){
        DefaultTableModel tbmodel = (DefaultTableModel)table.getModel();
        tbmodel.setRowCount(0);//clear table
        for(Student student : listStudent.getAllStudents()){
          Object rowData[] = new Object[6];
          rowData[0] = student.getStudentID();
          rowData[1] = student.getStudentName();
          rowData[2] = date_form.format(student.getdOB());
          rowData[3] = student.isSex()?"MALE" : "FEMALE";
          rowData[4] = student.getAddress();
          rowData[5] = student.getImages();
          tbmodel.addRow(rowData);
        }
    }
//    
//    public void loadSinhVienData(){
//        try {
//            listSV.loadFormToFile();
//            listSV.renderToTable(tbmodel);  
//        } catch (IOException ex) {
//            ex.printStackTrace();
//            JOptionPane.showMessageDialog(this, "File Error: " + ex.getMessage());
//        }catch(ClassNotFoundException ex){
//            JOptionPane.showMessageDialog(this, "Not Found Error: " + ex.getMessage());
//        }
//    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lable_MaSinhVien = new javax.swing.JLabel();
        textfield_StudentID = new javax.swing.JTextField();
        lable_HoVaTen = new javax.swing.JLabel();
        textfield_StudentName = new javax.swing.JTextField();
        lable_NgaySinh = new javax.swing.JLabel();
        textfield_DayofBirth = new javax.swing.JTextField();
        lable_GioiTinh = new javax.swing.JLabel();
        radiobutton_Female = new javax.swing.JRadioButton();
        radiobutton_Male = new javax.swing.JRadioButton();
        lable_DiaChi = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea_Address = new javax.swing.JTextArea();
        lb_Image = new javax.swing.JLabel();
        button_Add = new javax.swing.JButton();
        button_Save = new javax.swing.JButton();
        button_Edit = new javax.swing.JButton();
        button_Delete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        button_ChooseImages = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        textfield_StudentIDFind = new javax.swing.JTextField();
        btn_Search = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuItem_Open = new javax.swing.JMenuItem();
        menuItem_Save = new javax.swing.JMenuItem();
        menuItem_Exit = new javax.swing.JMenuItem();
        menuAbout = new javax.swing.JMenu();
        menuItem_AboutMe = new javax.swing.JMenuItem();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("QUAN LI SINH VIEN");

        lable_MaSinhVien.setText("STUDENT ID");

        lable_HoVaTen.setText("FULL NAME");

        lable_NgaySinh.setText("BIRTHDAY");

        lable_GioiTinh.setText("SEX");

        buttonGroup1.add(radiobutton_Female);
        radiobutton_Female.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        radiobutton_Female.setText("FEMALE");

        buttonGroup1.add(radiobutton_Male);
        radiobutton_Male.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        radiobutton_Male.setSelected(true);
        radiobutton_Male.setText("MALE");

        lable_DiaChi.setText("ADDRESS");

        textarea_Address.setColumns(20);
        textarea_Address.setRows(5);
        jScrollPane1.setViewportView(textarea_Address);

        lb_Image.setText("IMAGE");
        lb_Image.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lb_Image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_ImageMouseClicked(evt);
            }
        });

        button_Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user-add-icon.png"))); // NOI18N
        button_Add.setText("ADD");
        button_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_AddActionPerformed(evt);
            }
        });

        button_Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Actions-document-save-icon.png"))); // NOI18N
        button_Save.setText("SAVE");
        button_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_SaveActionPerformed(evt);
            }
        });

        button_Edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Actions-document-edit-icon.png"))); // NOI18N
        button_Edit.setText("EDIT");
        button_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_EditActionPerformed(evt);
            }
        });

        button_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Remove-Male-User-icon.png"))); // NOI18N
        button_Delete.setText("DELETE");
        button_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_DeleteActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Student ID", "Full Name", "Birthday", "Sex", "Address", "Image"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        button_ChooseImages.setText("Choose Image");
        button_ChooseImages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ChooseImagesActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 255, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setText("STUDENT ID");

        btn_Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Search-icon.png"))); // NOI18N
        btn_Search.setText("Search");
        btn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textfield_StudentIDFind, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(btn_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_Search, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textfield_StudentIDFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        menuFile.setText("File");

        menuItem_Open.setText("Open");
        menuItem_Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_OpenActionPerformed(evt);
            }
        });
        menuFile.add(menuItem_Open);

        menuItem_Save.setText("Save");
        menuItem_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_SaveActionPerformed(evt);
            }
        });
        menuFile.add(menuItem_Save);

        menuItem_Exit.setText("Exit");
        menuItem_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_ExitActionPerformed(evt);
            }
        });
        menuFile.add(menuItem_Exit);

        jMenuBar1.add(menuFile);

        menuAbout.setText("About");

        menuItem_AboutMe.setText("About Me");
        menuItem_AboutMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_AboutMeActionPerformed(evt);
            }
        });
        menuAbout.add(menuItem_AboutMe);

        jMenuBar1.add(menuAbout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lable_HoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lable_NgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lable_GioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lable_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lable_MaSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textfield_StudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textfield_StudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textfield_DayofBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radiobutton_Male)
                                        .addGap(9, 9, 9)
                                        .addComponent(radiobutton_Female)))
                                .addGap(64, 64, 64)
                                .addComponent(lb_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(button_ChooseImages)
                                .addGap(21, 21, 21))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_Delete)))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button_ChooseImages))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textfield_StudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lable_MaSinhVien))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textfield_StudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lable_HoVaTen))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textfield_DayofBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lable_NgaySinh))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(radiobutton_Male)
                                .addComponent(lable_GioiTinh))
                            .addComponent(radiobutton_Female)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(lable_DiaChi)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(button_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(button_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lb_ImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_ImageMouseClicked
       
    }//GEN-LAST:event_lb_ImageMouseClicked
    public void reset(){
        textfield_StudentID.setText("");
        textfield_StudentName.setText("");
        textfield_DayofBirth.setText("");
        textarea_Address.setText("");
        radiobutton_Male.isSelected();
        lb_Image.setText("IMAGE");
        lb_Image.setIcon(null);
        strImage = null;
    }
    private void button_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_AddActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_button_AddActionPerformed
    
//    public boolean validateForm(){
//       if(textfield_MaSinhVien.getText().isEmpty() || textfield_HoVaTen.getText().isEmpty()){
//           return false;
//       } 
//       return true;
//    }
    public boolean validateForm(){
        if(Validation.isEmpty(textfield_StudentID, "Student ID is not empty!")){
            return false;
        }
        if(Validation.isEmpty(textfield_StudentName, "Full Name is not empty!")){
            return false;
        }
        if(Validation.isEmpty(textfield_DayofBirth, "Birthday is not empty!")){
            return false;
        }
        if(Validation.isDate(textfield_DayofBirth, "Birthday is wrong format")){
            return false;
        }
        if(Validation.isEmpty(textarea_Address, "Address is not empty!")){
            return false;
        }
        
        return true;
    }
    
    public Student getModel() throws ParseException{
        Student student = new Student();
        student.setStudentID(textfield_StudentID.getText());
        student.setStudentName(textfield_StudentName.getText());
        student.setdOB(date_form.parse(textfield_DayofBirth.getText()));
//        sv.setGioiTinh(rootPaneCheckingEnabled);
        boolean sex = false; // Initially, the default gender is Female
        if(radiobutton_Male.isSelected()){
            sex = true;//Male
        }
        student.setSex(sex);
        student.setAddress(textarea_Address.getText());
        if(strImage == null){
            student.setImages("NO AVATAR");
        }else{
            student.setImages(strImage);
        }
        return student;
    }
    
    
    private void button_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_SaveActionPerformed
        // TODO add your handling code here:
          
        
        try{    
            StringBuilder sb = new StringBuilder();
            validator.checkId(textfield_StudentID, sb);
            validator.checkName(textfield_StudentName, sb);
            
            if (sb.length() >0) {
                JOptionPane.showMessageDialog(this, sb.toString(),"Error",JOptionPane.ERROR_MESSAGE);
            }else if(!validateForm()){
                return;
            }else{
         
                Student student = getModel();
                if (listStudent.getStudentByID(student.getStudentID()) != null) {
                  JOptionPane.showMessageDialog(this, "ID of student exist!");
                  return;
                }
                else if(listStudent.add(student)>0){
                  JOptionPane.showMessageDialog(this, "Save successfully!");
                  fillDataTABLE();
              }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
       
    }//GEN-LAST:event_button_SaveActionPerformed
    // setmodel() push up data to form
    public void setModel(Student student){
        textfield_StudentID.setText(student.getStudentID());
        textfield_StudentName.setText(student.getStudentName());
        if(student.isSex()){
            radiobutton_Male.setSelected(true);
        }else{
            radiobutton_Female.setSelected(true);
        }
        //load Image
        lb_Image.setText("");
        if(student.getImages().equalsIgnoreCase("no avatar")){
            lb_Image.setText("NO AVATAR");
            lb_Image.setIcon(null);
        }else{
            lb_Image.setText("");
            ImageIcon imageIcon = new ImageIcon(getClass().getResource("/images/"+student.getImages()));
            Image img = imageIcon.getImage();
            img.getScaledInstance(lb_Image.getWidth(), lb_Image.getHeight(), 0);       
            lb_Image.setIcon(imageIcon);
        }
        textfield_DayofBirth.setText(date_form.format(student.getdOB()));
        textarea_Address.setText(student.getAddress());
    }
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        int id = table.rowAtPoint(evt.getPoint());
        String student_ID = table.getValueAt(id, 0).toString();//Find StudentID, then push up data to Form
        Student student = listStudent.getStudentByID(student_ID);
        setModel(student);
    }//GEN-LAST:event_tableMouseClicked
    

    private void button_ChooseImagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ChooseImagesActionPerformed
        try {
            // TODO add your handling code here:
            JFileChooser jfc = new JFileChooser("D:\\GUI Java\\ASM_STUDENTMANAGE\\src\\images");
            jfc.showOpenDialog(null);
            File file = jfc.getSelectedFile();
            Image img = ImageIO.read(file);
            strImage = file.getName();
            lb_Image.setText("");
            int width = lb_Image.getWidth();
            int height = lb_Image.getHeight();
            lb_Image.setIcon(new ImageIcon(img.getScaledInstance(width, height, 0)));
           
        } catch (IOException ex) {
                System.out.println("Error: " + ex.toString());
            }
        


       
    }//GEN-LAST:event_button_ChooseImagesActionPerformed

    private void writeFile(){
         FileOutputStream fos = null;
         ObjectOutputStream oos = null;
        try{
        fos = new FileOutputStream("data.dat");
        oos = new ObjectOutputStream(fos);
        oos.writeObject(listStudent);
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
//        curIdx = -1;
//        list.clear();
//        list.add(new Student("1", "Alo", new Date(), true, "danang", "NO AVATAR"));
//        list.add(new Student("2", "Alo", new Date(), false, "quang binh", "NO AVATAR"));
//        list.add(new Student("3", "Alo", new Date(), true, "nghe an", "NO AVATAR"));
        readFile();
        fillDataTABLE();
        
        
    }
    
    private void button_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_EditActionPerformed
        // TODO add your handling code here:
            try {
                StringBuilder sb = new StringBuilder();
                validator.checkName(textfield_StudentName, sb);
               
                if (sb.length() >0) {
                   JOptionPane.showMessageDialog(this, sb.toString(),"Error",JOptionPane.ERROR_MESSAGE);
                }else if(!validateForm()){
                    return;
                }
                else {
                     Student student = getModel();
                    if(listStudent.updateStudentByID(student) > 0) {
                    JOptionPane.showMessageDialog(this, "Edit sucessfully!");
                    fillDataTABLE();
                    }else{
                        JOptionPane.showMessageDialog(this, "Please do not change ID!");
                    }
                }
            } catch (ParseException ex) {
                Logger.getLogger(StudentView.class.getName()).log(Level.SEVERE, null, ex);
            }
       
    }//GEN-LAST:event_button_EditActionPerformed

    private void button_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_DeleteActionPerformed
        // TODO add your handling code here:
        
            if(listStudent.deleteSinhVienByID(textfield_StudentID.getText())>0){
                JOptionPane.showMessageDialog(this, "Delete successfully!");
                fillDataTABLE();
            }else{
                JOptionPane.showMessageDialog(this, "Not find Student to delete!");
            }
        
    }//GEN-LAST:event_button_DeleteActionPerformed
   
    private void menuItem_OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_OpenActionPerformed
        // TODO add your handling code here:
        fOpen();
    }//GEN-LAST:event_menuItem_OpenActionPerformed
    
    private void menuItem_AboutMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_AboutMeActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Manage Student App 4.0");
    }//GEN-LAST:event_menuItem_AboutMeActionPerformed

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
   
    private void menuItem_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_SaveActionPerformed
        // TODO add your handling code here:
        writeFile();
        JOptionPane.showMessageDialog(this, "Save file successfully!");
    }//GEN-LAST:event_menuItem_SaveActionPerformed

    private void btn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchActionPerformed
        // TODO add your handling code here:
            StringBuilder sb = new StringBuilder();
            validator.checkId(textfield_StudentIDFind, sb); 
            if (sb.length() >0) {
               JOptionPane.showMessageDialog(this, sb.toString(),"Error",JOptionPane.ERROR_MESSAGE);
            }else{
                Student student = listStudent.getStudentByID(textfield_StudentIDFind.getText());
                if(student != null){
                    Student st = listStudent.getOneStudentByStudentID(student.getStudentID());
                    if(st!= null){
                        setModel(st);
                    } else{
                    textfield_StudentID.setText("");
                    textfield_StudentName.setText("");
                    textfield_DayofBirth.setText("");
                    radiobutton_Female.isSelected();
                    textarea_Address.setText("");
                    lb_Image.setText(strImage);
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "Student ID is not exist!");
                }
        }
    }//GEN-LAST:event_btn_SearchActionPerformed

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
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Search;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton button_Add;
    private javax.swing.JButton button_ChooseImages;
    private javax.swing.JButton button_Delete;
    private javax.swing.JButton button_Edit;
    private javax.swing.JButton button_Save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lable_DiaChi;
    private javax.swing.JLabel lable_GioiTinh;
    private javax.swing.JLabel lable_HoVaTen;
    private javax.swing.JLabel lable_MaSinhVien;
    private javax.swing.JLabel lable_NgaySinh;
    private javax.swing.JLabel lb_Image;
    private javax.swing.JMenu menuAbout;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem menuItem_AboutMe;
    private javax.swing.JMenuItem menuItem_Exit;
    private javax.swing.JMenuItem menuItem_Open;
    private javax.swing.JMenuItem menuItem_Save;
    private javax.swing.JRadioButton radiobutton_Female;
    private javax.swing.JRadioButton radiobutton_Male;
    private javax.swing.JTable table;
    private javax.swing.JTextArea textarea_Address;
    private javax.swing.JTextField textfield_DayofBirth;
    private javax.swing.JTextField textfield_StudentID;
    private javax.swing.JTextField textfield_StudentIDFind;
    private javax.swing.JTextField textfield_StudentName;
    // End of variables declaration//GEN-END:variables

    
}
