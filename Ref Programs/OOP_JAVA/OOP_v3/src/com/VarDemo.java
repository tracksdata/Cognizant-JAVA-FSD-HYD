package com;

public class VarDemo {

	byte byteVar = -128;
	short shortVar = 1212;
	int intVar = 121212;
	long longVar = 23234234;
	// Note
	long longVar2 = 121212121212L;

	public void a() {
		b(121212121212L);
	}

	public void b(long val) {
		System.out.println(val);
	}

	// -----------------------------

	double doubleVar = 12.1212;
	float floatVar = 12.12F;

	// --------------------------------

	char charVar1 = 'A';
	char charVar2 = 65;
	char charVar3 = '\u3453';

	// -----------------------------------

	boolean b1 = true;
	boolean b2 = false;

	// -----------------------------------

	public static void main(String[] args) {

		int var1 = 12; // decimal : base 10
		int var2 = 012; // Octal : base 8
		int var3 = 0X12; // Hexa : base 16
		System.out.println(var1);

	}

}
