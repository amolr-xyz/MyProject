package com.example.irs.exception;

public class InvalidCityException extends MyGoBootException {
	private static final long serialVersionUID = 1L;
	
	public InvalidCityException(String message) {
		super(message);
	}

}
