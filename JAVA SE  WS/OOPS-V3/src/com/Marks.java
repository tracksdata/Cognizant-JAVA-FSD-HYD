package com;

public class Marks {

	int maths;
	int phy;
	int che;
	
	void displayMarks(Student std) {
		System.out.println("Marks: Student hashCode: "+std.hashCode());
		System.out.println("Name: "+std.studentName);
		System.out.println("Student Id: "+std.studentId);
		System.out.println("Marks: ");
		System.out.println("Maths: "+maths);
		System.out.println("Physics: "+phy);
		System.out.println("Chemistry: "+che);
		System.out.println("Total: "+(maths+phy+che));
		System.out.println("-----------------------------------------");
	}
	
}
