package com;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Abc");
		System.out.println("SB : "+sb);
		System.out.println("Hashcode of sb: "+System.identityHashCode(sb));
		sb.append(" Xyz");
		
		System.out.println("SB : "+sb);
		System.out.println("Hashcode of sb: "+System.identityHashCode(sb));

		sb.replace(0, 3, "Praveen");
		//sb.reverse();
		System.out.println("SB : "+sb);
		System.out.println("Hashcode of sb: "+System.identityHashCode(sb));
		
		
		
		
	}

}
