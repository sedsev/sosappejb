/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smacomit.sosapp.ebj.beans.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author donald
 */
@Entity
@Table(name="admin")
public class Administrator extends SOSUser{

    private static final long serialVersionUID = 1L;
    @Column(name="cni_number", length=20, nullable = false, unique = true)
    private String cniNumber;

    public String getCniNumber() {
        return cniNumber;
    }

    public void setCniNumber(String cniNumber) {
        this.cniNumber = cniNumber;
    }
    
}
