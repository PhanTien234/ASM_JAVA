/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author PHANMINHTIEN
 */
public class Grade implements Serializable{
    private int id;
    private Student student;
    private double mathGrade, physicsGrade, chemistry;

    public Grade() {
    }

    public Grade(int id, Student student, double mathGrade, double physicsGrade, double chemistry) {
        this.id = id;
        this.student = student;
        this.mathGrade = mathGrade;
        this.physicsGrade = physicsGrade;
        this.chemistry = chemistry;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(double mathGrade) {
        this.mathGrade = mathGrade;
    }

    public double getPhysicsGrade() {
        return physicsGrade;
    }

    public void setPhysicsGrade(double physicsGrade) {
        this.physicsGrade = physicsGrade;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }
    
    public double getAvarage(){
        double result = (getMathGrade()+getPhysicsGrade()+getChemistry())/3;
        return Math.round(result*10.0)/10.0;
    }
    public String getLevelRank(){
        String rank = "";
        double avarage = getAvarage();
        if(avarage>8){
            rank = "EXCELLENT";
        }else if(avarage >= 7){
            rank = "GOOD";
        }else if (avarage>= 5){
            rank = "NOMARL";
        }else{
            rank = "FAIL";
        }
        return rank;
    }
}
