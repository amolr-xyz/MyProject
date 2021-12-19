package com.example.irs.exception;

public class InvalidEmailException extends MyGoBootException {
	private static final long serialVersionUID = 1L;
	
	public InvalidEmailException(String message) {
		super(message);
	}
}
