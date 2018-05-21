package com;

public class StringBuffer_Demo {

	public static void main(String[] args) {

		// StringBuffer sb = new StringBuffer("A");

		// sb.append("B");
		// System.out.println(sb);
		// sb.reverse();
		// System.out.println(sb);
		// sb.delete(arg0, arg1)
		// sb.insert(arg0, arg1)

		// String str = sb.toString();
		
		StringBuffer sb1=new StringBuffer();
		sb1.append("a");
		StringBuffer sb2=sb1;
		sb1.append("b");
		sb2.append("c");
		StringBuffer sb3=sb1;
		sb1=sb3;
		
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb3);
		
		System.out.println(sb1==sb2);
		System.out.println(sb2==sb3);
		System.out.println(sb1==sb3);
		
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.equals(sb3));
		System.out.println(sb3.equals(sb2));
		
		
		
		
		

	}

}
