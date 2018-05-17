package com;

class Xyz {

	int ins;
	static int sta;

	void ins_method() {
		System.out.println(ins);
		System.out.println(sta);
	}

	static void sta_method(Xyz xyz) {
		// Xyz xyz=new Xyz();
		// System.out.println(ins) cant make direct access;
		System.out.println(xyz.ins);
		System.out.println(sta);
	}

}

public class VarUseDemo {

	// int objVar;

	public static void main(String[] args) {

		// System.out.println(objVar);

		Xyz xyz = new Xyz();
		xyz.ins_method();

		Xyz.sta_method(xyz);

	}

}
