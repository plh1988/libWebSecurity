package com.pradeep.libraray.service;

public class DocumentException extends Exception{
	
	String errorMessage;
	String errorCode;
	
	public DocumentException(String errorMessage,String errorCode) {
		super(errorMessage);
		this.errorMessage=errorMessage;
		this.errorCode=errorCode;
	}
}
