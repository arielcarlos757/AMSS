package com.practia.asm.core.enviroment;

import java.util.Map;

public enum EnvironmentType {

	TEST("test:no required login in test"),
	TICKET("ticket:logged by ticket"),
	CRED("credentials:logged by credentials");
	
	private final String value;
	public static final String TEST_ENVIRONMENT = "test";
	public static final String AMDOCS_ENVIRONMENT = "amdocs";
	
	private EnvironmentType(final String value) {
		this.value = value;
	}
	
	public String value() {
		return this.value.split(":")[1];
	}
	
	public String key() {
		return this.value.split(":")[0];
	}
	
	public static String type(final String key) {
		if(TEST_ENVIRONMENT.equals(key))
			return "test";
		return AMDOCS_ENVIRONMENT;
	}
}
