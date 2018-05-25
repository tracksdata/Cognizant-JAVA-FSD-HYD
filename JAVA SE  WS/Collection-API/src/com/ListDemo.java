package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {

		List<Object> list = new ArrayList<>();

		list.add("Praveen");
		list.add("Amith");
		list.add("Sam");
		list.add("Mamta");
		list.add("Jessi");

		System.out.println(list);

		// Iterating list data

		/*
		 * 1. for loop 2. for each 3. Iterator interface 4. ListIterator
		 */

		// 1. for loop

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// -----------------------------------------------

		System.out.println("-------------------------------------");
		//2. For Each
		for (Object obj : list) {
			/*if(obj.equals("Praveen")) {
				list.remove(obj);
			}*/
			System.out.println(obj);
		}
		
		
		//-------------------------------------------------
		System.out.println("--------------------------------------");
		// 3. Iterator
		
		Iterator<Object> it=list.iterator();
		
		while(it.hasNext()) {
			Object obj=it.next();
			if(obj.equals("Praveen")) {
				it.remove();
				continue;
			}
			System.out.println(obj);
			
		}
		
		
		// ---------------------------------------------------------------
		
		System.out.println("---------------------------------------------");
		
		//4. ListIterator
		
	
		ListIterator<Object> li=list.listIterator();
		
		while(li.hasNext()) {
			if(list.size()<=4)
			li.add("Ozvitha");
	
			Object obj=li.next();
			
			if(obj.equals("Mamta")) {
				li.remove();
				continue;
			}
			
			if(obj.equals("Jessi")) {
				li.set("Bucky Wall");
			}
			
			
			System.out.println(obj);
		}
		
		System.out.println(list);
		
		
		
		

	}

}
