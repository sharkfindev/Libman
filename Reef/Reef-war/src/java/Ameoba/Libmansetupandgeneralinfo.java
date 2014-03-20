/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ameoba;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sujay
 */
@Entity
@Table(name = "libmansetupandgeneralinfo", catalog = "test", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Libmansetupandgeneralinfo.findAll", query = "SELECT l FROM Libmansetupandgeneralinfo l"),
    @NamedQuery(name = "Libmansetupandgeneralinfo.findByCenternum", query = "SELECT l FROM Libmansetupandgeneralinfo l WHERE l.centernum = :centernum"),
    @NamedQuery(name = "Libmansetupandgeneralinfo.findByBusinessname", query = "SELECT l FROM Libmansetupandgeneralinfo l WHERE l.businessname = :businessname"),
    @NamedQuery(name = "Libmansetupandgeneralinfo.findByOwner", query = "SELECT l FROM Libmansetupandgeneralinfo l WHERE l.owner = :owner"),
    @NamedQuery(name = "Libmansetupandgeneralinfo.findByEmployeelist", query = "SELECT l FROM Libmansetupandgeneralinfo l WHERE l.employeelist = :employeelist"),
    @NamedQuery(name = "Libmansetupandgeneralinfo.findByDaysoperating", query = "SELECT l FROM Libmansetupandgeneralinfo l WHERE l.daysoperating = :daysoperating"),
    @NamedQuery(name = "Libmansetupandgeneralinfo.findByTimes", query = "SELECT l FROM Libmansetupandgeneralinfo l WHERE l.times = :times")})
public class Libmansetupandgeneralinfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "centernum", nullable = false)
    private Integer centernum;
    @Size(max = 45)
    @Column(name = "businessname", length = 45)
    private String businessname;
    @Size(max = 45)
    @Column(name = "owner", length = 45)
    private String owner;
    @Size(max = 45)
    @Column(name = "employeelist", length = 45)
    private String employeelist;
    @Size(max = 45)
    @Column(name = "daysoperating", length = 45)
    private String daysoperating;
    @Size(max = 45)
    @Column(name = "times", length = 45)
    private String times;

    public Libmansetupandgeneralinfo() {
    }

    public Libmansetupandgeneralinfo(Integer centernum) {
        this.centernum = centernum;
    }

    public Integer getCenternum() {
        return centernum;
    }

    public void setCenternum(Integer centernum) {
        this.centernum = centernum;
    }

    public String getBusinessname() {
        return businessname;
    }

    public void setBusinessname(String businessname) {
        this.businessname = businessname;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getEmployeelist() {
        return employeelist;
    }

    public void setEmployeelist(String employeelist) {
        this.employeelist = employeelist;
    }

    public String getDaysoperating() {
        return daysoperating;
    }

    public void setDaysoperating(String daysoperating) {
        this.daysoperating = daysoperating;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (centernum != null ? centernum.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Libmansetupandgeneralinfo)) {
            return false;
        }
        Libmansetupandgeneralinfo other = (Libmansetupandgeneralinfo) object;
        if ((this.centernum == null && other.centernum != null) || (this.centernum != null && !this.centernum.equals(other.centernum))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ameoba.Libmansetupandgeneralinfo[ centernum=" + centernum + " ]";
    }
    
}
