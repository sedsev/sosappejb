/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smacomit.sosapp.ebj.beans.session;

import com.smacomit.sosapp.ebj.beans.entity.SOSUser;
import java.util.Date;
import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author donald
 */
public class SOSUserFacadeTest {
    
    public SOSUserFacadeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of create method, of class SOSUserFacade.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        SOSUser user = new SOSUser();
        user.setUserName("sedco");
        user.setEmail("dimitrieloundou@yahoo.fr");
        user.setLastName("donald");
        user.setFirstName("Eloundou");
        user.setDateOfBirth(new Date());
        user.setPassword("merci");
        user.setSex("masculin");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        SOSUserFacadeLocal instance = (SOSUserFacadeLocal)container.getContext().lookup("java:global/classes/SOSUserFacade");
        instance.create(user);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertNotNull("Echec Enregistrement", user.getId());
    }

    /**
     * Test of edit method, of class SOSUserFacade.
     */
    //@Test
   /* public void testEdit() throws Exception {
        System.out.println("edit");
        SOSUser entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        SOSUserFacadeLocal instance = (SOSUserFacadeLocal)container.getContext().lookup("java:global/classes/SOSUserFacade");
        instance.edit(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of remove method, of class SOSUserFacade.
     */
    //@Test
    /*public void testRemove() throws Exception {
        System.out.println("remove");
        SOSUser entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        SOSUserFacadeLocal instance = (SOSUserFacadeLocal)container.getContext().lookup("java:global/classes/SOSUserFacade");
        instance.remove(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of find method, of class SOSUserFacade.
     */
    //@Test
    /*public void testFind() throws Exception {
        System.out.println("find");
        Object id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        SOSUserFacadeLocal instance = (SOSUserFacadeLocal)container.getContext().lookup("java:global/classes/SOSUserFacade");
        SOSUser expResult = null;
        SOSUser result = instance.find(id);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of findAll method, of class SOSUserFacade.
     */
    //@Test
    /*public void testFindAll() throws Exception {
        System.out.println("findAll");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        SOSUserFacadeLocal instance = (SOSUserFacadeLocal)container.getContext().lookup("java:global/classes/SOSUserFacade");
        List<SOSUser> expResult = null;
        List<SOSUser> result = instance.findAll();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of findRange method, of class SOSUserFacade.
     */
    //@Test
    /*public void testFindRange() throws Exception {
        System.out.println("findRange");
        int[] range = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        SOSUserFacadeLocal instance = (SOSUserFacadeLocal)container.getContext().lookup("java:global/classes/SOSUserFacade");
        List<SOSUser> expResult = null;
        List<SOSUser> result = instance.findRange(range);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of count method, of class SOSUserFacade.
     */
    //@Test
    /* void testCount() throws Exception {
        System.out.println("count");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        SOSUserFacadeLocal instance = (SOSUserFacadeLocal)container.getContext().lookup("java:global/classes/SOSUserFacade");
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
