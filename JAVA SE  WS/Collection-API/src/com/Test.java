package com;
/*
class Employee{
	
}*/
public class Test<E> {

	void print(E element) {
		System.out.println("Element: "+element.getClass().getTypeName()+" --> "+element);
	}
	
	/*void print(int x) {
		System.out.println("Int: " + x);
	}

	void print(String str) {
		System.out.println("String: " + str);
	}

	void print(double d) {
		System.out.println("Double: " + d);
	}

	void print(char ch) {
		System.out.println("Character: " + ch);
	}*/

	public static void main(String[] args) {
		
		//Test<Employee> t=new Test<>();
		
		//t.print(1000);
		//t.print("Praveen");
		//t.print(new Employee());
		
		/*t.print("Praveen");
		t.print(100);
		t.print('A');
		t.print(877.45f);
		t.print(new Employee());*/

	}

}
