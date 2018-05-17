package com.emp;

class A {

	public A() {
		super();
		System.out.println("I am A");
	}

}

class B extends A {

	public B() {
		super();
		System.out.println("I am B");
	}
}

class C extends B {

	public C() {
		super();
		System.out.println("I am C");
	}
}

// ---------------

class P {
	int var = 12;
}

class Q extends P {

	int var = 13;

	void show() {
		System.out.println(super.var);
		System.out.println(var);
	}
}

public class InheritanceSyntax {

	public static void main(String[] args) {

		C cobj = new C();

		Q q = new Q();
		q.show();
	}

}
