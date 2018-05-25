package com;

import java.util.TreeMap;

public class TreemapDemo {

	public static void main(String[] args) {

		TreeMap<Integer, Object> hp = new TreeMap<>();

		hp.put(100, "Praveen");
		hp.put(13, "James");
		hp.put(30, 654.65f);
		hp.put(8, "Robin");
		hp.put(11, "Praveen");
		hp.put(20, "James Goedic");
		//hp.put(null, "Sita");
		//hp.put(21, null);
		// hp.put(null, null);

		System.out.println(hp);
		System.out.println(hp.size());

	}

}
