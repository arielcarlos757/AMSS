package com.practia.abp.jndi;

import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

import javax.naming.Context;
import javax.naming.NamingException;
import org.springframework.jndi.JndiCallback;
import org.springframework.jndi.JndiTemplate;

import com.practia.asm.core.configuration.CommonConfiguration;
import com.practia.asm.core.enviroment.EnvironmentServices;
import com.practia.asm.core.enviroment.EnvironmentType;

public class ASM3JndiTemplate extends JndiTemplate {

	private EnvironmentServices environmentServices;
	private Context context;

	@Override
	public Object execute(JndiCallback contextCallback) throws NamingException {
		if (context == null) {
			context = createInitialContext();
		}
		return contextCallback.doInContext(context);
	}

	@Override
	public Properties getEnvironment() {
		if (super.getEnvironment() == null) {
			super.setEnvironment(new Properties());
		}
		environmentServices.getEnvironment(super.getEnvironment());
		return super.getEnvironment();
	}

	public EnvironmentServices getEnvironmentServices() {
		return environmentServices;
	}

	public void setEnvironmentServices(EnvironmentServices environmentServices) {
		this.environmentServices = environmentServices;
	}
}
