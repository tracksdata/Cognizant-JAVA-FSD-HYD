package com;

class Outer {

	// 1. State
	private int out_ins;
	static int out_sta;

	// 2. Cons
	// 3. Methods
	public void out_ins_methos() {

		Inner inner = new Inner();
		System.out.println(inner.inn_ins);
		inner.inn_ins();

	}

	public void out_sta_methos() {

	}

	// 4. Inner Class
	private class Inner {

		int inn_ins;

		// static int inn_sta;

		void inn_ins() {
			// System.out.println(out_ins);
			System.out.println(out_sta);
			// out_ins_methos();
			// out_sta_methos();
		}

	}

}

public class InnerClassDemo {

	public static void main(String[] args) {

		// Outer.Inner i = new Outer().new Inner();
		// i.inn_ins();

	}

}
