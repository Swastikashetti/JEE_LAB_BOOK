package com.cg.eis.exception;

public class InvalidAgeException extends Exception{

	
	public InvalidAgeException() {
		super();
		
	}
	public InvalidAgeException(String errMsg)
	{
		super(errMsg);
	}
	
}