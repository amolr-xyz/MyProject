package com.example.irs.exception;

public class InvalidPasswordException extends MyGoBootException  {
	
	private static final long serialVersionUID = 1L;
	
	public InvalidPasswordException(String message) {
		super(message);
	}
}


