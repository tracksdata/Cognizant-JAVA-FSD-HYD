package com;

class Person {

	String name;
	double cash;

	@Override
	protected void finalize() throws Throwable {
		System.out.println("From " + this.name + 
				"\t collected " + this.cash);
	}

}

public class FinalizeDemo {

	public static void main(String[] args) {

		Person person = new Person();
		person.name = "Pavithra";
		person.cash = 1000000;

		person = null;

		System.gc();
		
		System.out.println("END..");

	}

}
