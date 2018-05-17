package com;
public class Test {

	public static void main(String[] args) {
		Employee emp=new Employee();
		
		emp.setPassCode("CTS123");
		emp.setEmpId(10);
		emp.setEmpName("Ozvitha");
		emp.setSalary(23242);
		
		
		//emp.display();
		DisplayData.displayData(emp);

	}

}
