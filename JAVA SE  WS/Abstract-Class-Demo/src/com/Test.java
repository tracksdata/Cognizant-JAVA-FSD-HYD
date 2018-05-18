package com;

public class Test {

	public static void main(String[] args) {

		Teacher teach;
		teach = new Java();
		teach.doTeach();
		teach.triggerExam();
		
		teach=new Angular_V1();
		teach.doTeach();
		teach.triggerExam();

	}

}
