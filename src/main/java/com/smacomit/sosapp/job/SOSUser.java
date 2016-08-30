/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smacomit.sosapp.job;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author donald
 */
@Entity
@Table(name="user")
public class SOSUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="username", length=60, nullable = false)
    private String userName;
    @Column(name="first_name", length=60, nullable = false)
    private String firstName;
    @Column(name="last_name", length=60, nullable = false)
    private String lastName;
    @Column(name="phone_number", length=160, nullable = false, unique = true)
    private String email;
    @Column(name="phone_number", length=20, nullable = false, unique = true)
    private String phoneNumber;
    @Column(nullable = false)
    private String password;
    @Column(name="date_of_birth", nullable=false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfBirth;
    @Column(nullable = false, length = 12)
    private String sex;
    private List<Role> roles;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof SOSUser)) {
            return false;
        }
        SOSUser other = (SOSUser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.smacomit.sosapp.job.SOSUser[ id=" + id + " ]";
    }
    
}
