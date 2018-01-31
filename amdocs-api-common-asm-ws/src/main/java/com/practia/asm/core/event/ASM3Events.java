package com.practia.asm.core.event;

public enum ASM3Events {
	EVENT_TYPE_INITIAL_CONTEXT("EVENT TRIGGERED IN INITIAL CONTEXT"), 
	EVENT_TYPE_NEW_TICKET("EVENT TRIGGERED BY INVALID TICKET");

	private final String msg;

	/**
	 * @param text
	 */
	private ASM3Events(final String msg) {
		this.msg = msg;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Enum#toString()
	 */
	@Override
	public String toString() {
		return msg;
	}
}
