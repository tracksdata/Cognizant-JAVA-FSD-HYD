package com;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DataStreamDemo {

	public static void main(String[] args) {

		// DataInputStream dis = null;
		InputStreamReader isr = null;

		BufferedReader br = null;
		try {

			/*isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);*/

			br=new BufferedReader(new InputStreamReader(System.in));
			
			
			System.out.println("Enter a Number: ");
			int n = Integer.parseInt(br.readLine());
			System.out.println("Enter a String ");
			String s1 = br.readLine();
			System.out.println("Enter a Character: ");
			char ch=(char) br.read();
			
			System.out.println("Number is " + n);
			System.out.println("String: " + s1);
			System.out.println("Character: "+ch);

		} catch (Exception e) {
			System.out.println("--- Failed due to " + e);
		}

	}

}
