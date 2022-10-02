/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment1_model;

/**
 *
 * @author prath
 */
public class Employee {
    private String empName;
    private String empId;
    private String empContactNum;
    private String empEmail;
    private String empGender;
    private String empAge;
    private String empStartDate;
    private String empLevel;
    private String empTeamInfo;
    private String empPosition;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpContactNum() {
        return empContactNum;
    }

    public void setEmpContactNum(String empContactNum) {
        this.empContactNum = empContactNum;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpGender() {
        return empGender;
    }

    public void setEmpGender(String empGender) {
        this.empGender = empGender;
    }

    public String getEmpAge() {
        return empAge;
    }

    public void setEmpAge(String empAge) {
        this.empAge = empAge;
    }

    public String getEmpStartDate() {
        return empStartDate;
    }

    public void setEmpStartDate(String empStartDate) {
        this.empStartDate = empStartDate;
    }

    public String getEmpLevel() {
        return empLevel;
    }

    public void setEmpLevel(String empLevel) {
        this.empLevel = empLevel;
    }

    public String getEmpTeamInfo() {
        return empTeamInfo;
    }

    public void setEmpTeamInfo(String empTeamInfo) {
        this.empTeamInfo = empTeamInfo;
    }

    public String getEmpPosition() {
        return empPosition;
    }

    public void setEmpPosition(String empPosition) {
        this.empPosition = empPosition;
    }
    
    @Override 
    public String toString(){
       return empName;
    }
    
}
