/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smacomit.sosapp.ebj.beans.session;

import com.smacomit.sosapp.ebj.beans.entity.StaticLocation;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author donald
 */
@Local
public interface StaticLocationFacadeLocal {

    void create(StaticLocation staticLocation);

    void edit(StaticLocation staticLocation);

    void remove(StaticLocation staticLocation);

    StaticLocation find(Object id);

    List<StaticLocation> findAll();

    List<StaticLocation> findRange(int[] range);

    int count();
    
}
