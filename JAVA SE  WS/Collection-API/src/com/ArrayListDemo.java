package com;
import java.util.ArrayList;
import java.util.Stack;


public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Object> arr = new ArrayList<>();
		Stack<Object> arr1 = new Stack<>();
		arr.add(100);
		arr.add(3);
		arr.add("Praveen");
		arr.add(100.65f);
		arr.add(7766L);
		arr.add('A');
		arr.add(true);
		arr.add("Praveen");
		arr.add(new Object());

		System.out.println(arr);
		System.out.println(arr.get(4));
		arr.remove(5);
		arr.remove("Praveen");
		arr.remove(3);
		arr.add(1, "New Data");
		System.out.println(arr);
		System.out.println("Size: "+arr.size());
		System.out.println(arr.contains("Praveen S"));
		arr1.addAll(arr);
	//arr.clear();
		System.out.println(arr1);
		System.out.println("Size: "+arr1.size());

	}

}
