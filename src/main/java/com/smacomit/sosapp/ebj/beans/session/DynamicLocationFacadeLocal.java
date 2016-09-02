/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smacomit.sosapp.ebj.beans.session;

import com.smacomit.sosapp.ebj.beans.entity.DynamicLocation;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author donald
 */
@Local
public interface DynamicLocationFacadeLocal {

    void create(DynamicLocation dynamicLocation);

    void edit(DynamicLocation dynamicLocation);

    void remove(DynamicLocation dynamicLocation);

    DynamicLocation find(Object id);

    List<DynamicLocation> findAll();

    List<DynamicLocation> findRange(int[] range);

    int count();
    
}
