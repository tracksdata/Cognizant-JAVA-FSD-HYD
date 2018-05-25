package com;

import java.util.Date;

public class DateDemo {
	
	public static void main(String[] args) {
		
		Date d=new Date();
		System.out.println(d);
		System.out.println("Month: "+(d.getMonth()+1));
		System.out.println("day: "+d.getDate());
		System.out.println("Year: "+(d.getYear()+1900));
		System.out.println("Hour: "+d.getHours());
		System.out.println("Min: "+d.getMinutes());
		
		
		
		
	}

}
