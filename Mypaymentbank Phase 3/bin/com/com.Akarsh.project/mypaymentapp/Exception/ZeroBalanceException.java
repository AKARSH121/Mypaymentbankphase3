package com.Akarsh.mypaymentapp.Exception;

public class ZeroBalanceException  extends RuntimeException
{

	public ZeroBalanceException() {
		super();
		
	}

	public ZeroBalanceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public ZeroBalanceException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public ZeroBalanceException(String message) {
		super(message);
		
	}

	public ZeroBalanceException(Throwable cause) {
		super(cause);
		
	}

	
	
	
}
