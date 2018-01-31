package com.practia.amdocs.bl3g.exceptions;

import amdocs.jutil.messageHandling.MessageRepository;

public class B1ErrorMessages extends MessageRepository {

	private static final long serialVersionUID = 1L;
	private static final String BUNDLE_NAME = "BL1Error";
	public static final B1ErrorMessages MISSING_OBJECT_WAS_NOT_SET_BA_ID_INFO = new B1ErrorMessages(
			"BL_MISSING_OBJECT_WAS_NOT_SET_BA_ID_INFO");
	public static final B1ErrorMessages MISSING_OBJECT_WAS_NOT_SET_PAGINATION_INFO = new B1ErrorMessages(
			"BL_MISSING_OBJECT_WAS_NOT_SET_PAGINATION_INFO");
	public static final B1ErrorMessages MISSING_MISSING_MANDATORY_FIELD = new B1ErrorMessages(
			"BL_MISSING_MISSING_MANDATORY_FIELD");
	public static final B1ErrorMessages MISSING_OBJECT_WAS_NOT_SET_DOC_ID_INFO = new B1ErrorMessages(
			"BL_MISSING_OBJECT_WAS_NOT_SET_DOC_ID_INFO");
	public static final B1ErrorMessages MISSING_OBJECT_WAS_NOT_SET_LEGAL_ID_INFO = new B1ErrorMessages(
			"BL_MISSING_OBJECT_WAS_NOT_SET_LEGAL_ID_INFO");
	public static final B1ErrorMessages INVALID_DATA_NOT_FOUND_DOC_ID = new B1ErrorMessages(
			"BL_INVALID_DATA_NOT_FOUND_DOC_ID");
	public static final B1ErrorMessages INVALID_DATA_NOT_FOUND_LEGAL_ID = new B1ErrorMessages(
			"BL_INVALID_DATA_NOT_FOUND_LEGAL_ID");
	public static final B1ErrorMessages INVALID_DATA_NOT_FOUND_BA_ID = new B1ErrorMessages(
			"BL_INVALID_DATA_NOT_FOUND_BA_ID");

	public B1ErrorMessages(String msgId) {
		this.messageId = msgId;
		this.bundleName = "BL1Error";
		this.applicationName = "BL";
	}
}
