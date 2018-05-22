package com;

public class NoCityFoundException extends RuntimeException {

	public NoCityFoundException() {
		System.out.println("--- No City in the given state ");
	}

}
