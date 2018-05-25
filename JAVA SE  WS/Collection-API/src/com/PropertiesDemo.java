package com;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream fis=new FileInputStream("src/data.properties");
			Properties props=new Properties();
			props.load(fis);
			
			System.out.println("Name: "+props.getProperty("name"));
			System.out.println("City: "+props.getProperty("city"));
			System.out.println("Phno: "+props.getProperty("phno"));
			System.out.println("COmpany: "+props.getProperty("company"));
			System.out.println("User Name: "+props.getProperty("user.name"));
			
		} catch (Exception e) {
			System.out.println("-- Failed due to "+e);
		}
		
		
		
		
	}
}
