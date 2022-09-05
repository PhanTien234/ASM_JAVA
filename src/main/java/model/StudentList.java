/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author PHANMINHTIEN
 */
public class StudentList extends Student{
    public ArrayList<Student> list = new ArrayList<>();
    
    
    public int add(Student student){
       list.add(student);
       return 1;
    }
    
    public ArrayList<Student> getAllStudents(){
       return list;
    }
    public int deleteSinhVienByID(String student_ID){
        for(Student student : list){
            if(student.getStudentID().equalsIgnoreCase(student_ID)){
                list.remove(student);
                return 1;
            }
        }
        return -1;
    }
    public Student getStudentByID(String student_ID){
        for(Student student : list){
            if(student.getStudentID().equalsIgnoreCase(student_ID)){
                return student;
            }
        }
        return null;
    }
    public int updateStudentByID(Student studentNew){
        for(Student student : list){
            if(student.getStudentID().equalsIgnoreCase(studentNew.getStudentID())){
                student.setStudentName(studentNew.getStudentName());
                student.setdOB(studentNew.getdOB());
                student.setAddress(studentNew.getAddress());
                student.setSex(studentNew.isSex());
                student.setImages(studentNew.getImages());
                return 1;
            }
        }
        return -1;
    }
   
    public Student getOneStudentByStudentID(String student_ID){
        for(Student student : list){
            if(student.getStudentID().equalsIgnoreCase(student_ID)){
                return student;
            }
        }
        return null;
    }
    

}

