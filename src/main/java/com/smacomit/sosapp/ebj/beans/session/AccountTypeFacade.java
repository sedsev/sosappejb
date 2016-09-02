/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smacomit.sosapp.ebj.beans.session;

import com.smacomit.sosapp.ebj.beans.entity.AccountType;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author donald
 */
@Stateless
public class AccountTypeFacade extends AbstractFacade<AccountType> implements AccountTypeFacadeLocal {

    @PersistenceContext(unitName = "com.smacomit_sosappejb_ejb")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AccountTypeFacade() {
        super(AccountType.class);
    }
    
}
