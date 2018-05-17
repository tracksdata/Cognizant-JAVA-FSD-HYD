package com;

public class Use {

	public static void main(String[] args) {
		
		
		Employee emp=new Employee();
		emp.empId=10;
		emp.empName="Ozvitha";
		emp.salary=834638;
		
		
		Project proj=new Project();
		proj.projId=10000;
		proj.projName="JP";
		
		emp.setProject(proj);
		
		emp.display();
		
		
		
		
		
		
	}
}
