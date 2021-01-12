package com.cg.eis.exception;

public class InvalidNameException extends Exception {
	
	public InvalidNameException()
	{
		super();
	}
	
	public InvalidNameException(String errMsg)
	{
		super(errMsg);
	}

}
