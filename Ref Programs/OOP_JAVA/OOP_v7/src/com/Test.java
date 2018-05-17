package com;

public class Test {

	public static void main(String[] args) {

		// ----------

		int var = 12;

		// ----------

		God god = new God();

		// LivingThing lt=new LivingThing();

		Human human = new Male();
		Animal animal = new Animal();

		god.manageLT(human);
		System.out.println("--------------");
		god.manageLT(animal);

	}

}
