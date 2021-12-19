package com.example.irs.exception;

public class InvalidPhoneException extends MyGoBootException {
	private static final long serialVersionUID = 1L;
	
	public InvalidPhoneException(String message) {
		super(message);
	}
}
