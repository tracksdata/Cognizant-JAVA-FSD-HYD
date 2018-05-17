package com;

public class Use {

	public static void main(String[] args) {
		
		Student s=new Student();
		s.studentId=10;
		s.studentName="Praveen";
		
		Student s1=new Student();
		s1.studentId=101;
		s1.studentName="Ozvitha";
		
		System.out.println("Main: Student hashCode: "+s.hashCode());
		
		Marks m=new Marks();
		m.maths=87;
		m.phy=34;
		m.che=76;
		
		Marks m1=new Marks();
		m1.maths=77;
		m1.phy=34;
		m1.che=96;
		
		s.registerMarks(m);
		s1.registerMarks(m1);
		s.getStudentInfo();
		s1.getStudentInfo();
		
		
		
	}
}
