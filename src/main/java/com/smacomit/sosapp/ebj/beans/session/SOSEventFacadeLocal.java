/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smacomit.sosapp.ebj.beans.session;

import com.smacomit.sosapp.ebj.beans.entity.SOSEvent;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author donald
 */
@Local
public interface SOSEventFacadeLocal {

    void create(SOSEvent sOSEvent);

    void edit(SOSEvent sOSEvent);

    void remove(SOSEvent sOSEvent);

    SOSEvent find(Object id);

    List<SOSEvent> findAll();

    List<SOSEvent> findRange(int[] range);

    int count();
    
}
