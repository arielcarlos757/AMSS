package com.practia.abp.jndi;

import java.util.Properties;

import org.springframework.jndi.JndiTemplate;

public class ABPJndiTemplate extends JndiTemplate {

	@Override
	public void setEnvironment(Properties environment) {
		super.setEnvironment(environment);
	}
}
