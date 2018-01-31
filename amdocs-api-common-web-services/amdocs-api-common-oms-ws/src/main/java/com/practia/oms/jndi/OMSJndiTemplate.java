package com.practia.oms.jndi;

import java.util.Properties;

import org.springframework.jndi.JndiTemplate;

public class OMSJndiTemplate extends JndiTemplate {

	@Override
	public void setEnvironment(Properties environment) {
		super.setEnvironment(environment);
	}
}
