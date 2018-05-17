package com;

public class Student {
	
	int studentId;
	String studentName;

	Marks marks;
	
	void registerMarks(Marks marks) {
		this.marks=marks;
	}
	
	void getStudentInfo() {
		System.out.println("Student: Student hashCode: "+this.hashCode());
		marks.displayMarks(this);
		
	}
	
	
	
	
	

}
