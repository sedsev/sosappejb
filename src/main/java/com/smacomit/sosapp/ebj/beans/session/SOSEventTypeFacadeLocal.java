/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smacomit.sosapp.ebj.beans.session;

import com.smacomit.sosapp.ebj.beans.entity.SOSEventType;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author donald
 */
@Local
public interface SOSEventTypeFacadeLocal {

    void create(SOSEventType sOSEventType);

    void edit(SOSEventType sOSEventType);

    void remove(SOSEventType sOSEventType);

    SOSEventType find(Object id);

    List<SOSEventType> findAll();

    List<SOSEventType> findRange(int[] range);

    int count();
    
}
