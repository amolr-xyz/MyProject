package com.example.irs.exception;

public class InvalidUserIdException extends MyGoBootException{
	private static final long serialVersionUID = 1L;
	
	public InvalidUserIdException(String message) {
		super(message);
	}

}
