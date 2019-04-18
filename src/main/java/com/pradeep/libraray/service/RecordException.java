package com.pradeep.libraray.service;

public class RecordException extends RuntimeException{
	
	String errorMessage;
	String errorCode;
	
	public RecordException(String errorMessage,String errorCode) {
		super(errorMessage);
		this.errorCode=errorCode;
		this.errorMessage=errorMessage;
	}
}
