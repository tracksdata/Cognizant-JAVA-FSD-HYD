package com;

import java.io.File;
import java.net.StandardSocketOptions;

public class FileDemo {

	public static void main(String[] args) {

		try {

			File file = new File("d:/myfiles/abc.txt");
			File file1 = new File("d:/myfiles/abc1.txt");
			
			
			//file.mkdir();

			//file.mkdirs();
			
			file.renameTo(file1);
			// System.out.println(file.exists());

			/*
			 * if (!(file.exists())) { file.createNewFile();
			 * System.out.println(file.getName() + " Created at " + file.getPath());
			 * 
			 * }
			 */
			/*
			 * System.out.println("ReadOnly: " + file.canRead());
			 * System.out.println("Hidden: "+file.isHidden());
			 */

			System.out.println("-- Done ---");

		} catch (Exception e) {
			System.out.println("Failed due to " + e);
		}

	}
}
