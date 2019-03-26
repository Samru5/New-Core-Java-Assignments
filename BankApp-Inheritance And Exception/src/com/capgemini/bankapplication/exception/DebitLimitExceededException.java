package com.capgemini.bankapplication.exception;

public class DebitLimitExceededException extends RuntimeException {

	public DebitLimitExceededException(String message) {
		super(message);
	}

}
