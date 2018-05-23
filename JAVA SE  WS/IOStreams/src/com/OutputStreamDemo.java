package com;

import java.io.FileOutputStream;
public class OutputStreamDemo {

	public static void main(String[] args) {

		FileOutputStream fos = null;
		try {

			fos = new FileOutputStream("src/abc.txt",true);
			
			String msg="How are you?";

			// Convert String into byte array
			
			byte[] bytes=msg.getBytes();
			
		/*	for(byte b:bytes) {
				System.out.print(b);
			}
			*/
			
			fos.write(bytes);
			System.out.println("--- Writing is Done");
			
			
			
			
		} catch (Exception e) {
			System.out.println("Failed due to " + e);
		}

	}

}
