/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smacomit.sosapp.ebj.beans.session;

import com.smacomit.sosapp.ebj.beans.entity.ServiceDescriptionType;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author donald
 */
@Local
public interface ServiceDescriptionTypeFacadeLocal {

    void create(ServiceDescriptionType serviceDescriptionType);

    void edit(ServiceDescriptionType serviceDescriptionType);

    void remove(ServiceDescriptionType serviceDescriptionType);

    ServiceDescriptionType find(Object id);

    List<ServiceDescriptionType> findAll();

    List<ServiceDescriptionType> findRange(int[] range);

    int count();
    
}
