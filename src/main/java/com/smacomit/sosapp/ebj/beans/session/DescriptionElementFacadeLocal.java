/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smacomit.sosapp.ebj.beans.session;

import com.smacomit.sosapp.ebj.beans.entity.DescriptionElement;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author donald
 */
@Local
public interface DescriptionElementFacadeLocal {

    void create(DescriptionElement descriptionElement);

    void edit(DescriptionElement descriptionElement);

    void remove(DescriptionElement descriptionElement);

    DescriptionElement find(Object id);

    List<DescriptionElement> findAll();

    List<DescriptionElement> findRange(int[] range);

    int count();
    
}
