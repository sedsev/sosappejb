/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smacomit.sosapp.ebj.beans.session;

import com.smacomit.sosapp.ebj.beans.entity.OperationType;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author donald
 */
@Local
public interface OperationTypeFacadeLocal {

    void create(OperationType operationType);

    void edit(OperationType operationType);

    void remove(OperationType operationType);

    OperationType find(Object id);

    List<OperationType> findAll();

    List<OperationType> findRange(int[] range);

    int count();
    
}
