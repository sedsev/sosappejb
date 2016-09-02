/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smacomit.sosapp.ebj.beans.session;

import com.smacomit.sosapp.ebj.beans.entity.Ressource;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author donald
 */
@Local
public interface RessourceFacadeLocal {

    void create(Ressource ressource);

    void edit(Ressource ressource);

    void remove(Ressource ressource);

    Ressource find(Object id);

    List<Ressource> findAll();

    List<Ressource> findRange(int[] range);

    int count();
    
}
