package com;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapIterateDemo {

	public static void main(String[] args) {

		HashMap<Integer, Object> hp = new HashMap<>();

		hp.put(10, "Praveen");
		hp.put(20, "James");
		hp.put(30, 654.65f);
		hp.put(12, "Robin");
		hp.put(11, "Praveen");
		hp.put(20, "James Goedic");

		// Copy all kets of a map into Set interface

		Set<Integer> keys = hp.keySet();

		for (Integer key : keys) {
			System.out.println(hp.get(key));
		}

		System.out.println(hp);

		// Copy key and values to the set interface

		System.out.println("-------------------------------------");
		Set<Entry<Integer, Object>> mapData = hp.entrySet();
		
		System.out.println(mapData);

	}

}
