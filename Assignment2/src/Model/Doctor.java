/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author prath
 */
public class Doctor {
    private String Docname;
    private String community;
    private int Docid;
    private ArrayList<Doctor> doctorDirectory;

    public Doctor(String Docname, String community, int Docid) {
        this.Docname = Docname;
        this.community = community;
        this.Docid = Docid;
    }
    

    public ArrayList<Doctor> getDoctorDirectory() {
        return doctorDirectory;
    }

    public String getDocname() {
        return Docname;
    }

    public void setDocname(String Docname) {
        this.Docname = Docname;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public int getDocid() {
        return Docid;
    }

    public void setDocid(int Docid) {
        this.Docid = Docid;
    }

    public void setDoctorDirectory(ArrayList<Doctor> doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }
    
    
    @Override
    public String toString() {
        return Docname;
    }
    
}
