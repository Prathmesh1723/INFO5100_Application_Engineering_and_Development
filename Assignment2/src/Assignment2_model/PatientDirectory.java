/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment2_model;

import java.util.ArrayList;

/**
 *
 * @author prath
 */
public class PatientDirectory {
    private ArrayList<Patient> PatientData;
    
    public  PatientDirectory(){
         this.PatientData = new ArrayList<Patient>();
    }
    
    public ArrayList<Patient> getPatientData(){
        return PatientData;
    }
    
    public ArrayList<Patient> setEmployeeData(){
        return PatientData;
    }
    
    public Patient addNewPatient(){
        Patient newPatient = new Patient();
        PatientData.add(newPatient);
        return newPatient; 
       
    }
    
}
