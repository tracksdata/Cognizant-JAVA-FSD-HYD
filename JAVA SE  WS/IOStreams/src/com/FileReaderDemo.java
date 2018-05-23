package com;

import java.io.File;
import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) {

		File file = new File("src/abc.txt");
		FileReader fr = null;

		try {

			if (file.exists())
				fr = new FileReader(file);
			else
				System.out.println("Invalid File SPecified");
			
			for(int i=0;i<file.length();i++) {
			
				//char ch=(char)fr.read();
				System.out.print((char)fr.read());
			}
			
			fr.close();
			

		} catch (Exception e) {
			System.out.println("-- Failed due to " + e);
		}

	}
}
