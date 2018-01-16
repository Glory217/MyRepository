/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.Beans;
import java.io.Serializable;

/**
 *
 * @author punjabi
 */
public class Student implements Serializable {
    private String FirstName;
     private String LastName;
      private String Email;
      private String Course;
       private String ID;
       
       public Student(){}

    public Student(String FirstName, String LastName, String Email, String Course, String ID) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Email = Email;
        this.Course = Course;
        this.ID = ID;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Student{" + "FirstName=" + FirstName + ", LastName=" + LastName + ", Email=" + Email + ", ID=" + ID + '}';
    }
       
       
    
    
}
