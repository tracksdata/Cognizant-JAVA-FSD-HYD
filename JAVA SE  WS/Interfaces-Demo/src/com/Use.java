package com;

public class Use {

	public static void main(String[] args) {

		Teacher teach = new Java();
		teach.doTeach();
		teach.trrigerExam();

		teach = new Angular_V1();
		teach.doTeach();
		teach.trrigerExam();

	}

}
