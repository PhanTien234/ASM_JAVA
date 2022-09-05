/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PHANMINHTIEN
 */
public class GradeList extends Grade{
    List<Grade> listGrade = new ArrayList<>();
    public int add(Grade grade){
       listGrade.add(grade);
       return 1;
    }
    public List<Grade> getAllGrade(){
        return listGrade;
    }
    public Grade getOneGradeByStudentID(String studentID){
        for(Grade grade : listGrade){
            if(grade.getStudent().getStudentID().equalsIgnoreCase(studentID)){
                return grade;
            }
        }
        return null;
    }
    public int updateByStudentID(Grade newGrade){
        for (Grade grade : listGrade) {
            if(grade.getStudent().getStudentID().equalsIgnoreCase(newGrade.getStudent().getStudentID())){
                grade.setMathGrade(newGrade.getMathGrade());
                grade.setPhysicsGrade(newGrade.getPhysicsGrade());
                grade.setChemistry(newGrade.getChemistry());
                return 1;
            }
        }
        return -1;
    }
    public int deleteGrade(String studentID){
        Grade grade = getOneGradeByStudentID(studentID);
        if(grade!=null){
            listGrade.remove(grade);
            return 1;
        }
        return -1;
    }
}
