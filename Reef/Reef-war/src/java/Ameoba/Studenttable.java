/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ameoba;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sujay
 */
@Entity
@Table(name = "studenttable", catalog = "test", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Studenttable.findAll", query = "SELECT s FROM Studenttable s"),
    @NamedQuery(name = "Studenttable.findById", query = "SELECT s FROM Studenttable s WHERE s.id = :id"),
    @NamedQuery(name = "Studenttable.findByLastName", query = "SELECT s FROM Studenttable s WHERE s.lastName = :lastName"),
    @NamedQuery(name = "Studenttable.findByFirstName", query = "SELECT s FROM Studenttable s WHERE s.firstName = :firstName"),
    @NamedQuery(name = "Studenttable.findByEmail", query = "SELECT s FROM Studenttable s WHERE s.email = :email"),
    @NamedQuery(name = "Studenttable.findByPhonenumber", query = "SELECT s FROM Studenttable s WHERE s.phonenumber = :phonenumber"),
    @NamedQuery(name = "Studenttable.findByDaysattending", query = "SELECT s FROM Studenttable s WHERE s.daysattending = :daysattending"),
    @NamedQuery(name = "Studenttable.findByComments", query = "SELECT s FROM Studenttable s WHERE s.comments = :comments"),
    @NamedQuery(name = "Studenttable.findByItemscheckedcurrently", query = "SELECT s FROM Studenttable s WHERE s.itemscheckedcurrently = :itemscheckedcurrently"),
    @NamedQuery(name = "Studenttable.findByItemCheckedHistory", query = "SELECT s FROM Studenttable s WHERE s.itemCheckedHistory = :itemCheckedHistory"),
    @NamedQuery(name = "Studenttable.findByMessages", query = "SELECT s FROM Studenttable s WHERE s.messages = :messages"),
    @NamedQuery(name = "Studenttable.findByTimeSlot", query = "SELECT s FROM Studenttable s WHERE s.timeSlot = :timeSlot"),
    @NamedQuery(name = "Studenttable.findByVacation", query = "SELECT s FROM Studenttable s WHERE s.vacation = :vacation"),
    @NamedQuery(name = "Studenttable.findBySick", query = "SELECT s FROM Studenttable s WHERE s.sick = :sick"),
    @NamedQuery(name = "Studenttable.findByFlagged", query = "SELECT s FROM Studenttable s WHERE s.flagged = :flagged"),
    @NamedQuery(name = "Studenttable.findByAttended", query = "SELECT s FROM Studenttable s WHERE s.attended = :attended"),
    @NamedQuery(name = "Studenttable.findByAbsent", query = "SELECT s FROM Studenttable s WHERE s.absent = :absent")})
public class Studenttable implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID", nullable = false)
    private Integer id;
    @Size(max = 45)
    @Column(name = "LastName", length = 45)
    private String lastName;
    @Size(max = 45)
    @Column(name = "FirstName", length = 45)
    private String firstName;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 45)
    @Column(name = "Email", length = 45)
    private String email;
    @Column(name = "Phone number")
    private Integer phonenumber;
    @Size(max = 45)
    @Column(name = "daysattending", length = 45)
    private String daysattending;
    @Size(max = 45)
    @Column(name = "Comments", length = 45)
    private String comments;
    @Size(max = 45)
    @Column(name = "Itemscheckedcurrently", length = 45)
    private String itemscheckedcurrently;
    @Size(max = 45)
    @Column(name = "ItemCheckedHistory", length = 45)
    private String itemCheckedHistory;
    @Size(max = 45)
    @Column(name = "Messages", length = 45)
    private String messages;
    @Column(name = "TimeSlot")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeSlot;
    @Size(max = 45)
    @Column(name = "Vacation", length = 45)
    private String vacation;
    @Size(max = 45)
    @Column(name = "Sick", length = 45)
    private String sick;
    @Size(max = 45)
    @Column(name = "Flagged", length = 45)
    private String flagged;
    @Size(max = 45)
    @Column(name = "attended", length = 45)
    private String attended;
    @Size(max = 45)
    @Column(name = "absent", length = 45)
    private String absent;

    public Studenttable() {
    }

    public Studenttable(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(Integer phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getDaysattending() {
        return daysattending;
    }

    public void setDaysattending(String daysattending) {
        this.daysattending = daysattending;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getItemscheckedcurrently() {
        return itemscheckedcurrently;
    }

    public void setItemscheckedcurrently(String itemscheckedcurrently) {
        this.itemscheckedcurrently = itemscheckedcurrently;
    }

    public String getItemCheckedHistory() {
        return itemCheckedHistory;
    }

    public void setItemCheckedHistory(String itemCheckedHistory) {
        this.itemCheckedHistory = itemCheckedHistory;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    public Date getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(Date timeSlot) {
        this.timeSlot = timeSlot;
    }

    public String getVacation() {
        return vacation;
    }

    public void setVacation(String vacation) {
        this.vacation = vacation;
    }

    public String getSick() {
        return sick;
    }

    public void setSick(String sick) {
        this.sick = sick;
    }

    public String getFlagged() {
        return flagged;
    }

    public void setFlagged(String flagged) {
        this.flagged = flagged;
    }

    public String getAttended() {
        return attended;
    }

    public void setAttended(String attended) {
        this.attended = attended;
    }

    public String getAbsent() {
        return absent;
    }

    public void setAbsent(String absent) {
        this.absent = absent;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Studenttable)) {
            return false;
        }
        Studenttable other = (Studenttable) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ameoba.Studenttable[ id=" + id + " ]";
    }
    
}
