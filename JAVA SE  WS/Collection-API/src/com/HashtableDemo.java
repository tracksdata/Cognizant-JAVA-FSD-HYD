package com;

import java.util.Hashtable;

public class HashtableDemo {

	public static void main(String[] args) {

		Hashtable<Integer, Object> hp = new Hashtable<>();

		hp.put(10, "Praveen");
		hp.put(20, "James");
		hp.put(30, 654.65f);
		hp.put(12, "Robin");
		hp.put(11, "Praveen");
		hp.put(20, "James Goedic");
		//hp.put(null, "Sita");
		//hp.put(21, null);
		// hp.put(null, null);

		System.out.println(hp);
		System.out.println(hp.size());

	}

}
