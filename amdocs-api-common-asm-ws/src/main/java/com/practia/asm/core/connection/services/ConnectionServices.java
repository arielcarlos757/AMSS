package com.practia.asm.core.connection.services;

import java.rmi.RemoteException;
import java.util.Properties;

import amdocs.uams.exceptions.ASM3WSException;

public interface ConnectionServices {

	public void getEnviroment(Properties properties);
}
