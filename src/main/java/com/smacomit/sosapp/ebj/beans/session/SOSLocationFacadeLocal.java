/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smacomit.sosapp.ebj.beans.session;

import com.smacomit.sosapp.ebj.beans.entity.SOSLocation;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author donald
 */
@Local
public interface SOSLocationFacadeLocal {

    void create(SOSLocation sOSLocation);

    void edit(SOSLocation sOSLocation);

    void remove(SOSLocation sOSLocation);

    SOSLocation find(Object id);

    List<SOSLocation> findAll();

    List<SOSLocation> findRange(int[] range);

    int count();
    
}
