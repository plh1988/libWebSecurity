package com.pradeep.libraray.service;

import org.springframework.stereotype.Component;

@Component
public class ExceptionResponse {
	
	String message;
	String errorCode;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
	
	
}
