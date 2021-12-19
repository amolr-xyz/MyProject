package com.example.irs.exception;

public class InvalidNameException extends MyGoBootException  {
	
		private static final long serialVersionUID = 1L;
		
		public InvalidNameException(String message) {
			super(message);
		}
}
