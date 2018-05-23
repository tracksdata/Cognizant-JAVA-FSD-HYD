package com;

import java.io.File;
import java.io.FileInputStream;

public class InputStreamDemo {

	public static void main(String[] args) {

		File fileLoc = new File("src/abc.txt");
		FileInputStream fis = null;
		try {

			if (fileLoc.exists()) {
				fis = new FileInputStream(fileLoc);
			}else {
				System.out.println("Invalid File Location");
			}
			
			
			for(int i=0;i<fileLoc.length();i++) {
				System.out.print((char)fis.read());
			}
			
			
			
			
			

		} catch (Exception e) {
			System.out.println("--- Failed due to " + e);
		}

	}

}
