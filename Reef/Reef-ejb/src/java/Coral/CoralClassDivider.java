/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Coral;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author sujay
 */
public class CoralClassDivider {
 CoralClassDivider(){
     
 }   
 //getters
 @Entity
@Table(name="Student")

public class Student implements Serializable {

    private String StudentID;
    private String LastName;
    private String FirstName;
    private String email;
    private String PhoneNumber;
    private String DaysAttending;
    private String Comments;
    private String ItemsCheckedCurrently;
    private String ItemsChecked;
    private String Messages;
    private String Timeslot;
    private String Vacation;
    private String Sick;
    private String Flagged;
    private String Attended;
    private String Absent;

    public Student() { }

    public Student(String StudentID, String LastName, String FirstName,String email,String PhoneNumber,String DaysAttending,String Comments,String ItemsCheckedCurrently,String ItemsChecked,String Timeslot,String Vacation,String Messages,String Sick,String Flagged,String Attended,String Absent) {
        this.StudentID = StudentID;
        this.LastName = LastName;
        this.FirstName=FirstName;
        this.PhoneNumber=PhoneNumber;
        this.email=email;
        this.Messages=Messages;
        this.DaysAttending=DaysAttending;
        this.Comments=Comments;
        this.ItemsCheckedCurrently=ItemsCheckedCurrently;
        this.ItemsChecked=ItemsChecked;
        this.Timeslot=Timeslot;
        this.Vacation=Vacation;
        this.Sick=Sick;
        this.Flagged=Flagged;
        this.Attended=Attended;
        this.Absent=Absent;
  
    }
     @Id
    public String getStudentID() {
        return this.StudentID;
    }

    public String getLastName() {
        return this.LastName;
    }
      public String getFirstName() {
        return this.FirstName;
    }

    public String getPhoneNumber() {
        return this.PhoneNumber;
    }
      public String getemail() {
        return this.email;
    }

    public String getMessages() {
        return this.Messages;
    }
      public String getDaysAttending() {
        return this.DaysAttending;
    }

    public String getComments() {
        return this.Comments;
    }
      public String getItemsCheckedCurrently() {
        return this.ItemsCheckedCurrently;
    }

    public String getItemsChecked() {
        return this.ItemsChecked;
    }
      public String getVacation() {
        return this.Vacation;
    }

    public String getSick() {
        return this.Sick;
    }
      public String getFlagged() {
        return this.Flagged;
    }

    public String getAttended() {
        return this.Attended;
    }
    public String getAbsent() {
        return this.Absent;
    }
     public void  setStudentID(String ID) {
   this.StudentID = ID;
     }

    public void setLastName(String last) {
        this.LastName=last;
    }
      public void setFirstName(String first) {
        this.FirstName=first;
    }

    public void setPhoneNumber(String phno) {
        this.PhoneNumber=phno;
    }
      public void setemail(String mail) {
        this.email=mail;
      }

    public void setMessages(String mssg) {
        this.Messages=mssg;
    }
      public void setDaysAttending(String days) {
     this.DaysAttending=days;
    }

    public void setComments(String cmmt) {
         this.Comments=cmmt;
    }
      public void setItemsCheckedCurrently(String CurrentItems) {
         this.ItemsCheckedCurrently=CurrentItems;
    }

    public void setItemsChecked(String checked) {
         this.ItemsChecked=checked;
    }
      public void setVacation(String vac) {
         this.Vacation=vac;
    }

    public void setSick(String sickstatus) {
         this.Sick=sickstatus;
    }
      public void setFlagged(String Flaggedstatus) {
         this.Flagged=Flaggedstatus;
    }

    public void setAttended(String present) {
         this.Attended=present;
    }
    public void setAbsent(String notpresent) {
        this.Absent=notpresent;
    }
    
 }
 public class Item implements Serializable {

    private String StudentID;
    private String LastName;
    private String FirstName;
    private String email;
    private String PhoneNumber;
    private String DaysAttending;
    private String Comments;
    private String ItemsCheckedCurrently;
    private String ItemsChecked;
    private String Messages;
    private String Timeslot;
    private String Vacation;
    private String Sick;
    private String Flagged;
    private String Attended;
    private String Absent;

    public Item() { }

    public Item(String StudentID, String LastName, String FirstName,String email,String PhoneNumber,String DaysAttending,String Comments,String ItemsCheckedCurrently,String ItemsChecked,String Timeslot,String Vacation,String Messages,String Sick,String Flagged,String Attended,String Absent) {
        this.StudentID = StudentID;
        this.LastName = LastName;
        this.FirstName=FirstName;
        this.PhoneNumber=PhoneNumber;
        this.email=email;
        this.Messages=Messages;
        this.DaysAttending=DaysAttending;
        this.Comments=Comments;
        this.ItemsCheckedCurrently=ItemsCheckedCurrently;
        this.ItemsChecked=ItemsChecked;
        this.Timeslot=Timeslot;
        this.Vacation=Vacation;
        this.Sick=Sick;
        this.Flagged=Flagged;
        this.Attended=Attended;
        this.Absent=Absent;
  
    }
     @Id
    public String getStudentID() {
        return this.StudentID;
    }

    public String getLastName() {
        return this.LastName;
    }
      public String getFirstName() {
        return this.FirstName;
    }

    public String getPhoneNumber() {
        return this.PhoneNumber;
    }
      public String getemail() {
        return this.email;
    }

    public String getMessages() {
        return this.Messages;
    }
      public String getDaysAttending() {
        return this.DaysAttending;
    }

    public String getComments() {
        return this.Comments;
    }
      public String getItemsCheckedCurrently() {
        return this.ItemsCheckedCurrently;
    }

    public String getItemsChecked() {
        return this.ItemsChecked;
    }
      public String getVacation() {
        return this.Vacation;
    }

    public String getSick() {
        return this.Sick;
    }
      public String getFlagged() {
        return this.Flagged;
    }

    public String getAttended() {
        return this.Attended;
    }
    public String getAbsent() {
        return this.Absent;
    }
     public void  setStudentID(String ID) {
   this.StudentID = ID;
     }

    public void setLastName(String last) {
        this.LastName=last;
    }
      public void setFirstName(String first) {
        this.FirstName=first;
    }

    public void setPhoneNumber(String phno) {
        this.PhoneNumber=phno;
    }
      public void setemail(String mail) {
        this.email=mail;
      }

    public void setMessages(String mssg) {
        this.Messages=mssg;
    }
      public void setDaysAttending(String days) {
     this.DaysAttending=days;
    }

    public void setComments(String cmmt) {
         this.Comments=cmmt;
    }
      public void setItemsCheckedCurrently(String CurrentItems) {
         this.ItemsCheckedCurrently=CurrentItems;
    }

    public void setItemsChecked(String checked) {
         this.ItemsChecked=checked;
    }
      public void setVacation(String vac) {
         this.Vacation=vac;
    }

    public void setSick(String sickstatus) {
         this.Sick=sickstatus;
    }
      public void setFlagged(String Flaggedstatus) {
         this.Flagged=Flaggedstatus;
    }

    public void setAttended(String present) {
         this.Attended=present;
    }
    public void setAbsent(String notpresent) {
        this.Absent=notpresent;
    }
    
 }
 public class General implements Serializable {

    private String centernum;
    private String businessname;
    private String owner;
    private String employeelist;
    private String daysoperating;
    private String times;

    public General() { }

    public General(String centernum, String businessname, String owner,String employeelist,String daysoperating,String times) {
        this.centernum = centernum;
        this.businessname = businessname;
        this.owner=owner;
        this.employeelist=employeelist;
        this.daysoperating=daysoperating;
        this.times=times;
    }
     @Id
    public String getStudentID() {
        return this.StudentID;
    }

    public String getLastName() {
        return this.LastName;
    }
      public String getFirstName() {
        return this.FirstName;
    }

    public String getPhoneNumber() {
        return this.PhoneNumber;
    }
      public String getemail() {
        return this.email;
    }

    public String getMessages() {
        return this.Messages;
    }
      public String getDaysAttending() {
        return this.DaysAttending;
    }

    public String getComments() {
        return this.Comments;
    }
      public String getItemsCheckedCurrently() {
        return this.ItemsCheckedCurrently;
    }

    public String getItemsChecked() {
        return this.ItemsChecked;
    }
      public String getVacation() {
        return this.Vacation;
    }

    public String getSick() {
        return this.Sick;
    }
      public String getFlagged() {
        return this.Flagged;
    }

    public String getAttended() {
        return this.Attended;
    }
    public String getAbsent() {
        return this.Absent;
    }
     public void  setStudentID(String ID) {
   this.StudentID = ID;
     }

    public void setLastName(String last) {
        this.LastName=last;
    }
      public void setFirstName(String first) {
        this.FirstName=first;
    }

    public void setPhoneNumber(String phno) {
        this.PhoneNumber=phno;
    }
      public void setemail(String mail) {
        this.email=mail;
      }

    public void setMessages(String mssg) {
        this.Messages=mssg;
    }
      public void setDaysAttending(String days) {
     this.DaysAttending=days;
    }

    public void setComments(String cmmt) {
         this.Comments=cmmt;
    }
      public void setItemsCheckedCurrently(String CurrentItems) {
         this.ItemsCheckedCurrently=CurrentItems;
    }

    public void setItemsChecked(String checked) {
         this.ItemsChecked=checked;
    }
      public void setVacation(String vac) {
         this.Vacation=vac;
    }

    public void setSick(String sickstatus) {
         this.Sick=sickstatus;
    }
      public void setFlagged(String Flaggedstatus) {
         this.Flagged=Flaggedstatus;
    }

    public void setAttended(String present) {
         this.Attended=present;
    }
    public void setAbsent(String notpresent) {
        this.Absent=notpresent;
    }
    
 }
 
}
