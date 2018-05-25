package com;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	
	public static void main(String[] args) {
		
		
		LinkedHashMap<Integer, Object> hp=new LinkedHashMap<>();
		
		hp.put(10, "Praveen");
		hp.put(20, "James");
		hp.put(30, 654.65f);
		hp.put(12, "Robin");
		hp.put(11, "Praveen");
		hp.put(20, "James Goedic");
		hp.put(null, "Sita");
		hp.put(21, null);
		//hp.put(null, null);
		
		System.out.println(hp);
		System.out.println(hp.size());
		
		
	}

}
