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
public class PersonDirectory {
     ArrayList<Person> personlist ;
    
      public PersonDirectory (){
          
       personlist = new ArrayList();

    }

   public ArrayList<Person> getPersonData(){
        return personlist;
    }
    
    public ArrayList<Person> setEmployeeData(){
        return personlist;
    }
    
    public Person addNewPerson(){
        Person newPerson = new Person();
        personlist.add(newPerson);
        return newPerson; 
       
    }
    
//    public void getEmployeeData(){
//        this.employeeData = employeeData;
//    }
    
//    public void deleteEmployee(Employee emp){
//        employeeData.remove(emp);
//    }
//
//    public Person findPerson(String id) {
//
//        for (Person p : personlist) {
//
//            if (p.isMatch(id)) {
//                return p;
//            }
//        }
//            return null; //not found after going through the whole list
//         }
}
