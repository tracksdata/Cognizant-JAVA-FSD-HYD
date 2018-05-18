package com;

public class Java extends Teacher {

	@Override
	public void doTeach() {
		System.out.println("---- Teaching Java");

	}

	@Override
	public void triggerExam() {
		System.out.println("---- Java Exam triggered");

	}

	/*
	 * public static Java getObject() { Java j = new Java(); return j; }
	 */

}
