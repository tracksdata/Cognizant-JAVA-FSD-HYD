package com;

import java.util.LinkedHashSet;

public class SetDemo {

	public static void main(String[] args) {

		LinkedHashSet<Object> hs = new LinkedHashSet<>();
		Emp e1 = new Emp("Praveen",100);
		Emp e2 = new Emp("Praveen",100);
		/*hs.add("Praveen");
		hs.add("James");
		hs.add("Ozvitha");
		hs.add("Rita");
		hs.add("James");*/
		
		hs.add(e1);
		hs.add(e2);

		System.out.println(hs);
		

		/*System.out.println(hs.remove("Rita"));
		System.out.println(hs);
		System.out.println("Size: "+hs.size());*/
	
		System.out.println("Size: "+hs.size());
	}
}
