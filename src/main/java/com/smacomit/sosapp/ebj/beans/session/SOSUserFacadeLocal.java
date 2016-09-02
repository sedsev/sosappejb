/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smacomit.sosapp.ebj.beans.session;

import com.smacomit.sosapp.ebj.beans.entity.SOSUser;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author donald
 */
@Local
public interface SOSUserFacadeLocal {

    void create(SOSUser sOSUser);

    void edit(SOSUser sOSUser);

    void remove(SOSUser sOSUser);

    SOSUser find(Object id);

    List<SOSUser> findAll();

    List<SOSUser> findRange(int[] range);

    int count();
    
}
