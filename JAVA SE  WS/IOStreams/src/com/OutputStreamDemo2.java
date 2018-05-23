package com;

import java.io.File;
import java.io.FileOutputStream;
public class OutputStreamDemo2 {

	public static void main(String[] args) {

		FileOutputStream fos = null;
		File fileLoc=new File("src/abc.txt");
		
		try {

			
			fos = new FileOutputStream(fileLoc,true);
			
			String msg="Praveen";

			// Convert String into byte array
			
			byte[] bytes=msg.getBytes();
			
			
		/*	for(byte b:bytes) {
				System.out.print(b);
			}
			*/
			
			fos.write(bytes);
			System.out.println("--- Writing is Done");
			System.out.println("File Size is "+fileLoc.length());
			
			
			
			
		} catch (Exception e) {
			System.out.println("Failed due to " + e);
		}

	}

}
