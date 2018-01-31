package com.practia.asm.core.com.security;

public class SecurityCredentials {
	private char[] value;
	private char[] decriptedValue;
	
	public char[] getValue() {
		return value;
	}
	public void setValue(char[] value) {
		this.value = value;
	}
	public char[] getDecriptedValue() {
		return decriptedValue;
	}
	public void setDecriptedValue(char[] decriptedValue) {
		this.decriptedValue = decriptedValue;
	}
}
