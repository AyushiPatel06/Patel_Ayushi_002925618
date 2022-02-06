/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarModel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;


/**
 *
 * @author dpsmv
 */
public class PersonRecords {
  
//   ArrayList<PersonRecords>  personList;
 ArrayList<PersonsRecList> PersonRecords;
   /* public ArrayList<PersonRecords> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<PersonRecords> personList) {
        this.personList = personList;
    }*/
   public PersonRecords(){
       this.PersonRecords = new ArrayList<PersonsRecList>();
       
         }
  
   public void Srecords (ArrayList<PersonsRecList> SrecordList){
       this.PersonRecords =SrecordList;
   }
   public void addCarrecords(PersonsRecList perrecords){
       PersonRecords.add(perrecords);
       
   }
   public ArrayList<PersonsRecList> getPersonsRecLists(){
       return PersonRecords;
      
   }
   
}