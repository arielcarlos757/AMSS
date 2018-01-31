package com.practia.asm.core.enviroment;

import java.util.Properties;

public interface EnvironmentServices {

	public abstract void getEnvironment(Properties properties);
	public abstract String getEnvironmentType();
}
