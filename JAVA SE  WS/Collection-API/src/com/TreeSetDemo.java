package com;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet<Object> ts = new TreeSet<>();
		
		ts.add(209);
		ts.add(100);
		ts.add(23);
		ts.add(4);
		ts.add(76);
		ts.add(100);

		
		System.out.println(ts);
		
		
		Iterator<Object> it=ts.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
		

	}

}
