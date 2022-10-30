/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment2_model;

import javax.swing.ImageIcon;

/**
 *
 * @author prath
 */
public class Patient {
    private String ptID;
    private String ptName;
    private int ptAge;
    private String ptCity;
    private String ptCommunity;
    private String ptAddress;
    private ImageIcon empImage;

    public String getPtID() {
        return ptID;
    }

    public void setPtID(String ptID) {
        this.ptID = ptID;
    }

    public String getPtName() {
        return ptName;
    }

    public void setPtName(String ptName) {
        this.ptName = ptName;
    }

    public int getPtAge() {
        return ptAge;
    }

    public void setPtAge(int ptAge) {
        this.ptAge = ptAge;
    }

    public String getPtCity() {
        return ptCity;
    }

    public void setPtCity(String ptCity) {
        this.ptCity = ptCity;
    }

    public String getPtCommunity() {
        return ptCommunity;
    }

    public void setPtCommunity(String ptCommunity) {
        this.ptCommunity = ptCommunity;
    }

    public String getPtAddress() {
        return ptAddress;
    }

    public void setPtAddress(String ptAddress) {
        this.ptAddress = ptAddress;
    }
//
//    public ImageIcon getEmpImage() {
//        return empImage;
//    }
//
//    public void setEmpImage(ImageIcon empImage) {
//        this.empImage = empImage;
//    }
    
    @Override 
    public String toString(){
       return ptID;
    }
    
}
