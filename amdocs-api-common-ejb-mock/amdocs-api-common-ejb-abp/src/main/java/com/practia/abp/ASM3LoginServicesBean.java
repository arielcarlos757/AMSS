/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practia.abp;

import amdocs.mock.ejb.APIEJBMock;
import amdocs.uams.exceptions.ASM3WSException;
import amdocs.uams.sessions.interfaces.api.ASM3LoginServices;
import amdocs.uams.sessions.interfaces.home.ASM3LoginServicesHome;
import java.rmi.RemoteException;
import javax.ejb.CreateException;

/**
 *
 * @author ccenturion
 */
public class ASM3LoginServicesBean extends APIEJBMock implements ASM3LoginServices,ASM3LoginServicesHome {

    @Override
    public String login(String string, String string1, String string2, String string3) throws RemoteException, ASM3WSException {
        return "DUMMY_TOKEN";
    }

    @Override
    public void logout(String string) throws RemoteException, ASM3WSException {
        System.out.println("called : amdocs.api.ar.ejb.mock.ASM3LoginServicesBean.logout()");
    }

    @Override
    public boolean isValid(String string) throws RemoteException, ASM3WSException {
        return true;
    }

    @Override
    public ASM3LoginServices create() throws CreateException, RemoteException {
        return new ASM3LoginServicesBean();
    }
    
}
