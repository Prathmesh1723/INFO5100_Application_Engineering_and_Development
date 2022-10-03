/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment1_model;

import java.util.ArrayList;

/**
 *
 * @author prath
 */
public class EmployeeData {
    
    private ArrayList<Employee> employeeData;
    
    public  EmployeeData(){
         this.employeeData = new ArrayList<Employee>();
    }
    
    public ArrayList<Employee> getEmployeeData(){
        return employeeData;
    }
    
    public ArrayList<Employee> setEmployeeData(){
        return employeeData;
    }
    
    public Employee addNewEmployee(){
        Employee newEmployee = new Employee();
        employeeData.add(newEmployee);
        return newEmployee; 
       
    }
    
//    public void getEmployeeData(){
//        this.employeeData = employeeData;
//    }
    
    public void deleteEmployee(Employee emp){
        employeeData.remove(emp);
    }
}
