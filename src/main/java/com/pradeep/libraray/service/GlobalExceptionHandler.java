package com.pradeep.libraray.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@Autowired
	ExceptionResponse exceptionResponse;
	
	@ExceptionHandler(DocumentException.class)
	public ResponseEntity<ExceptionResponse> documentExceptionHandler(DocumentException e){
		exceptionResponse.setMessage(e.errorMessage);
		exceptionResponse.setErrorCode(e.errorCode);
		return new ResponseEntity<>(exceptionResponse,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(RecordException.class)
	public ResponseEntity<ExceptionResponse> documentExceptionHandler(RecordException e){
		exceptionResponse.setMessage(e.errorMessage);
		exceptionResponse.setErrorCode(e.errorCode);
		return new ResponseEntity<>(exceptionResponse,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
