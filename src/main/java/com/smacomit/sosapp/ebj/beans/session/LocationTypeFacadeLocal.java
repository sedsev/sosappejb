/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smacomit.sosapp.ebj.beans.session;

import com.smacomit.sosapp.ebj.beans.entity.LocationType;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author donald
 */
@Local
public interface LocationTypeFacadeLocal {

    void create(LocationType locationType);

    void edit(LocationType locationType);

    void remove(LocationType locationType);

    LocationType find(Object id);

    List<LocationType> findAll();

    List<LocationType> findRange(int[] range);

    int count();
    
}
