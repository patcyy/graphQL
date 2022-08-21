package com.pratik.graphQL.exception;

import java.util.List;

import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

public class NotFoundException extends RuntimeException implements GraphQLError{

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
	
	@Override
	public StackTraceElement[] getStackTrace() {
        return null;
    }

	public String getErrorMessage() {
		return errorMessage;
	}

	@Override
	public String toString() {
		return "NotFoundException [errorCode=" + errorCode + ", errorMessage=" + errorMessage + "]";
	}

	@Override
	public List<SourceLocation> getLocations() {
		return null;
	}

	@Override
	public ErrorType getErrorType() {
		return null;
	}

}
