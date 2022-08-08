package com.pratik.graphQL.exception;

public class NotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private final String errorCode;

	private final String errorMessage;

	public NotFoundException(String errorMessage) {
		this.errorCode = "NF01";
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	@Override
	public String toString() {
		return "NotFoundException [errorCode=" + errorCode + ", errorMessage=" + errorMessage + "]";
	}

}
