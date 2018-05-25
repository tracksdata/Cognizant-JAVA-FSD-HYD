package com;

import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		
		Calendar cl=Calendar.getInstance();
		//System.out.println(cl);
		System.out.println(cl.getTime());
		
		System.out.println("Year: "+cl.get(Calendar.YEAR));
		System.out.println("Month: "+(cl.get(Calendar.MONTH)+1));
		System.out.println("date: "+cl.get(Calendar.DATE));
		
	}
}
