package com.practia.asm.core.user.context;

public enum ContextRoot {
	ABP("ABP-CONTEXT-ROOT"),
	OMS("OMS-CONTEXT-ROOT");
	
	private final String value;

	private ContextRoot(final String value) {
		this.value = value;
	}
	
	public String value() {
		return this.value;
	}
}
