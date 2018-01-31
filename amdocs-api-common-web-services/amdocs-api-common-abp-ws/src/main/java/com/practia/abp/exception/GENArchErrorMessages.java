package com.practia.abp.exception;

public enum GENArchErrorMessages {

	GENERIC_ERROR("GEN-000123", "Generic error for services that report technical errors or business errors.");

	private final String code;
	private final String message;

	GENArchErrorMessages(final String code, final String message) {
		this.code = code;
		this.message = message;
	}

	public String getFormattedMessage() {
		return String.format("(%s) %s", this.code, this.message);
	}
	
	public String getCode() {
		return code;
	}
	
	public String getMessage() {
		return this.message;
	}
}
