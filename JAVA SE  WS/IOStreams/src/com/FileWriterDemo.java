package com;

import java.io.File;
import java.io.FileWriter;

public class FileWriterDemo {

	public static void main(String[] args) {

		File fileLoc = new File("src/xyz.txt");
		FileWriter fw = null;
		try {

			fw = new FileWriter(fileLoc, true);
			String msg = "Good Morning!";
			fw.write(msg);
			System.out.println("-- Writing is Done");
			fw.close();

		} catch (Exception e) {
			System.out.println("Failed deu to " + e);
		}

	}

}
