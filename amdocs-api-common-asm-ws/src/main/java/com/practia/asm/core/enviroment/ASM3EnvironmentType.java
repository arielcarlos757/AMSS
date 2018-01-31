package com.practia.asm.core.enviroment;

public enum ASM3EnvironmentType {
	TEST("test"), AMDOCS("amdocs");

	private final String value;

	private ASM3EnvironmentType(final String value) {
		this.value = value;
	}

	public String value() {
		return this.value;
	}
}
