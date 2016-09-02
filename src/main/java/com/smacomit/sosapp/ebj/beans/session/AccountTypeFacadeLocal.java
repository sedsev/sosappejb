/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smacomit.sosapp.ebj.beans.session;

import com.smacomit.sosapp.ebj.beans.entity.AccountType;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author donald
 */
@Local
public interface AccountTypeFacadeLocal {

    void create(AccountType accountType);

    void edit(AccountType accountType);

    void remove(AccountType accountType);

    AccountType find(Object id);

    List<AccountType> findAll();

    List<AccountType> findRange(int[] range);

    int count();
    
}
