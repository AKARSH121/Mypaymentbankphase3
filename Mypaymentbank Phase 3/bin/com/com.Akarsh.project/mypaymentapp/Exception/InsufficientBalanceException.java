package com.Akarsh.mypaymentapp.Exception;

public class InsufficientBalanceException extends RuntimeException{

	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}
