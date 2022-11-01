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
public class Hospital {
    private String HosName;
    private String Hoscommunity;
    private int Hosid;
    private String HosCity;
    private ArrayList<Hospital> hospitalDirectory;
    
    public Hospital(String HosName, String Hoscommunity, int Hosid, String HosCity) {
        this.HosName = HosName;
        this.Hoscommunity = Hoscommunity;
        this.Hosid = Hosid;
        this.HosCity = HosCity;
    }

    public String getHosName() {
        return HosName;
    }

    public void setHosName(String HosName) {
        this.HosName = HosName;
    }

    public String getHoscommunity() {
        return Hoscommunity;
    }

    public void setHoscommunity(String Hoscommunity) {
        this.Hoscommunity = Hoscommunity;
    }

    public int getHosid() {
        return Hosid;
    }

    public void setHosid(int Hosid) {
        this.Hosid = Hosid;
    }

    public String getHosCity() {
        return HosCity;
    }

    public void setHosCity(String HosCity) {
        this.HosCity = HosCity;
    }

    public ArrayList<Hospital> getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(ArrayList<Hospital> hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }
    
     @Override
    public String toString() {
        return HosName;
    }
}
