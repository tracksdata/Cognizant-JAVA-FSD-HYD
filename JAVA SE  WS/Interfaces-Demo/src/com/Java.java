package com;

public class Java implements Teacher {

	@Override
	public void doTeach() {
		System.out.println("--- Teaching Java");

	}

	@Override
	public void trrigerExam() {
		System.out.println("--- Java exam got triggered");

	}

}
