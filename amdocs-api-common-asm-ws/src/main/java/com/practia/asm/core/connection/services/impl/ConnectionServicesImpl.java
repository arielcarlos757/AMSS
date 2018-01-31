package com.practia.asm.core.connection.services.impl;

import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.practia.asm.core.configuration.CommonConfiguration;
import com.practia.asm.core.connection.services.ConnectionServices;
import com.practia.asm.core.enviroment.EnvironmentServices;
import com.practia.asm.core.enviroment.EnvironmentType;

public class ConnectionServicesImpl implements ConnectionServices {

	private static Logger logger = LogManager.getLogger();
	private CommonConfiguration configuration;
	private ConcurrentHashMap<String, EnvironmentServices> environmentServices;

	public void getEnviroment(Properties properties) {
		EnvironmentServices services = environmentServices.get(configuration.environmentType());
		logger.info(String.format("environment type : %s ",
				services.getEnvironmentType()));
		services.getEnvironment(properties);
	}

	public ConcurrentHashMap<String, EnvironmentServices> getEnvironmentServices() {
		return environmentServices;
	}

	public void setEnvironmentServices(ConcurrentHashMap<String, EnvironmentServices> environmentServices) {
		this.environmentServices = environmentServices;
	}

	public CommonConfiguration getConfiguration() {
		return configuration;
	}

	public void setConfiguration(CommonConfiguration configuration) {
		this.configuration = configuration;
	}
}
