package Minnow;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Coral.CoralClassDivider.Item;
import Coral.CoralClassDivider.Student;
import java.awt.List;
import javax.ejb.*;
import javax.persistence.*;
import javax.transaction.NotSupportedException;
public class Schooling {

    @PersistenceContext
    private EntityManager em;
    

public List getStudents() throws StudentsNotFoundException {
    try {
        return (List) em.createQuery(
            "SELECT bd FROM Students bd ORDER BY bd.StudentID").
                getResultList();
    } catch(Exception ex){
        throw new StudentsNotFoundException("Could not get student: "
             + ex.getMessage());
    }
}
public Student getStudents(String StudentID) throws StudentsNotFoundException {
    Student requestedStudent = em.find(Student.class, StudentID);
    if (requestedStudent == null) {
        throw new StudentsNotFoundException("Couldn’t find student: "
             + StudentID);
    }
    return requestedStudent;
}
    private static class StudentsNotFoundException extends Exception {

   
        private StudentsNotFoundException(String string) {
        }
    }
    public List getItem() throws ItemNotFoundException {
    try {
        return (List) em.createQuery(
            "SELECT bd FROM Items bd ORDER BY bd.ISBN").
                getResultList();
    } catch(Exception ex){
        throw new ItemNotFoundException("Could not get Item: "
             + ex.getMessage());
    }
}
public Item getItem(String ISBN) throws ItemNotFoundException {
    Item requestedItem = em.find(Item.class, ISBN);
    if (requestedItem == null) {
        throw new ItemNotFoundException("Couldn’t find Item: "
             + ISBN);
    }
    return requestedItem;
}

    private static class ItemNotFoundException extends Exception {

        public ItemNotFoundException() {
        }

        private ItemNotFoundException(String string) {
        }
    }
   
    }
