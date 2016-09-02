/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smacomit.sosapp.ebj.beans.session;

import com.smacomit.sosapp.ebj.beans.entity.ServiceDescription;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author donald
 */
@Local
public interface ServiceDescriptionFacadeLocal {

    void create(ServiceDescription serviceDescription);

    void edit(ServiceDescription serviceDescription);

    void remove(ServiceDescription serviceDescription);

    ServiceDescription find(Object id);

    List<ServiceDescription> findAll();

    List<ServiceDescription> findRange(int[] range);

    int count();
    
}
