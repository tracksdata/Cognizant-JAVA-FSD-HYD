package com;

import java.io.IOException;

/*
 * 
 *  java.lang.Runtime
 *  -------------------
 *  
 *  To get JRE info to Java app
 *  
 *  
 *  // To Increate Java Heap Size
 *  
 *    Us VM commands
 *    
 *    		-Xmn512m -Xmx1g
 *    
 *    e.x
 *    
 *    java -Xmn512m -Xmx1g MainClass  --> console run
 * 
 */

public class RuntimeClass_Demo {

	public static void main(String[] args) {

		Runtime runtime = Runtime.getRuntime();

		System.out.println(runtime.totalMemory());
		System.out.println(runtime.freeMemory());

		// To Run External Process with Java Appln:

		try {
			runtime.exec("notepad");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
