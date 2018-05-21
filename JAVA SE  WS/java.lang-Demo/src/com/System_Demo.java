package com;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Date;
import java.util.Enumeration;
import java.util.Properties;

/*
 *  java.lang.System
 *  -----------------
 *  
 *     --> To Get Current system info to Java Appln
 *     
 *     --> We cant instantiate,
 * 
 */

abstract class Abcd {

	abstract void abs();

	native void pqr(); // Non java Methods defined in other programming lang

	void method() {
		pqr();
	}

}

public class System_Demo {

	public static void main(String[] args) throws IOException {

		// 1. To get system's default input/output source.

		// System.in --> K.B , System.out,System.err --> console

		// 2. Change system's default input/output sources.

		// File file = new File("d:/myoutput.txt");
		// PrintStream ps = new PrintStream(file);

		// System.setOut(ps);
		// System.setIn(arg0)

		System.out.println("Hello");
		System.out.println("How r u");

		// 3. To Get System's properties to Java Appln:
		String osName = System.getProperty("os.name");
		System.out.println(osName);

		// ---------------------------

		Properties props = System.getProperties();
		Enumeration<Object> e = props.keys();
		while (e.hasMoreElements()) {
			String key = (String) e.nextElement();
			System.out.println(key + "\t" + System.getProperty(key));
		}

		System.getenv();

		// ------------------------------------------------

		// 4. Array Copy

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] b = new int[10];

		System.arraycopy(a, 0, b, 0, 10);
		for (int num : b) {
			System.out.print(num + "  ");
		}
		System.out.println();

		// ----------------------------------------------

		// 5. To Get Current Time in Milli seconds.
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			System.out.println("hello..");
		}
		long end = System.currentTimeMillis();

		System.out.println(end - start);

		System.out.println(System.currentTimeMillis());

		System.out.println(new Date(1341741192197L));

		// ---------------------------------------------

		// To terminate Current Process.

		// System.exit(0);

		// ---------------------------------------

		System.gc(); // Requesting JRE for GC.

		// ------------------------------

		// System.nanoTime();

		// ---------------------------

		// System.load() // To Load any dll or
		// properties files to java applsn

		// ----------------------------

	}
}
