/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smacomit.sosapp.ebj.beans.session;

import com.smacomit.sosapp.ebj.beans.entity.Administrator;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author donald
 */
@Local
public interface AdministratorFacadeLocal {

    void create(Administrator administrator);

    void edit(Administrator administrator);

    void remove(Administrator administrator);

    Administrator find(Object id);

    List<Administrator> findAll();

    List<Administrator> findRange(int[] range);

    int count();
    
}
