package com;

public class Test {

	int age = 100;
	static String personName = "James";

	// who can create an object to an inner class
	// call printAge method of an inner class

	public void invokeInner() {
		Fun f = new Fun();
		C2 c2 = new C2();
		c2.f3();
		f.printAge();
	}

	public void invokeStaticInner() {
		Animal a = new Animal();
		a.f1();
		// a.f2();
		Animal.f2();
	}

	protected class C2 {
		public void f3() {

		}
	}

	private class C3 {
		public void f3() {

		}
	}

	class Fun { // inner class

		C2 c2 = new C2();
		C3 c3 = new C3();
		/*
		 * public Fun() { // TODO Auto-generated constructor stub }
		 */

		public void printAge() {
			System.out.println("Age is " + age);
			System.out.println("name is " + personName);
		}
	}

	static class Animal {

		/*
		 * public Animal() { // TODO Auto-generated constructor stub }
		 */

		static Test t = new Test();

		public void f1() {

			System.out.println("Animal age is " + t.age);
			System.out.println("Person Name: " + personName);
		}

		public static void f2() {
			// Test t1 = new Test();
			System.out.println("Animal age is " + t.age);
			System.out.println("Person Name: " + personName);
		}

	}

	public static void main(String[] args) {

		Test t = new Test();
		t.invokeInner();

	}

}
