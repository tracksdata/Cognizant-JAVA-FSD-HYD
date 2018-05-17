package com;

public class Test {

	public static void main(String[] args) {

		God god = new God();

		Human human = new Human();
		Animal animal = new Animal();
		Robo robo=new Robo();

		// god.manageHuman(human);
		god.manageLT(human);
		System.out.println("---------------------");
		// god.manageAnimal(animal);
		god.manageLT(animal);
		System.out.println("---------------------");
		god.manageLT(robo);

	}

}
