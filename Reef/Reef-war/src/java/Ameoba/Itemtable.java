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
@Table(name = "itemtable", catalog = "test", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Itemtable.findAll", query = "SELECT i FROM Itemtable i"),
    @NamedQuery(name = "Itemtable.findByIsbn", query = "SELECT i FROM Itemtable i WHERE i.isbn = :isbn"),
    @NamedQuery(name = "Itemtable.findByItemtype", query = "SELECT i FROM Itemtable i WHERE i.itemtype = :itemtype"),
    @NamedQuery(name = "Itemtable.findByName", query = "SELECT i FROM Itemtable i WHERE i.name = :name"),
    @NamedQuery(name = "Itemtable.findByAuthor", query = "SELECT i FROM Itemtable i WHERE i.author = :author"),
    @NamedQuery(name = "Itemtable.findByCopiesavailable", query = "SELECT i FROM Itemtable i WHERE i.copiesavailable = :copiesavailable"),
    @NamedQuery(name = "Itemtable.findByItemhistory", query = "SELECT i FROM Itemtable i WHERE i.itemhistory = :itemhistory")})
public class Itemtable implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ISBN", nullable = false)
    private Integer isbn;
    @Size(max = 45)
    @Column(name = "itemtype", length = 45)
    private String itemtype;
    @Size(max = 45)
    @Column(name = "name", length = 45)
    private String name;
    @Size(max = 45)
    @Column(name = "author", length = 45)
    private String author;
    @Size(max = 45)
    @Column(name = "copiesavailable", length = 45)
    private String copiesavailable;
    @Size(max = 45)
    @Column(name = "itemhistory", length = 45)
    private String itemhistory;

    public Itemtable() {
    }

    public Itemtable(Integer isbn) {
        this.isbn = isbn;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public String getItemtype() {
        return itemtype;
    }

    public void setItemtype(String itemtype) {
        this.itemtype = itemtype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCopiesavailable() {
        return copiesavailable;
    }

    public void setCopiesavailable(String copiesavailable) {
        this.copiesavailable = copiesavailable;
    }

    public String getItemhistory() {
        return itemhistory;
    }

    public void setItemhistory(String itemhistory) {
        this.itemhistory = itemhistory;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (isbn != null ? isbn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Itemtable)) {
            return false;
        }
        Itemtable other = (Itemtable) object;
        if ((this.isbn == null && other.isbn != null) || (this.isbn != null && !this.isbn.equals(other.isbn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ameoba.Itemtable[ isbn=" + isbn + " ]";
    }
    
}
