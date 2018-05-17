package com;

public class God {

	// public void manageHuman(Human human) {
	//
	// human.read();
	// human.eat();
	// human.walk();
	// human.sleep();
	//
	// }
	//
	// public void manageAnimal(Animal animal) {
	//
	// animal.eat();
	// animal.walk();
	// animal.sleep();
	//
	// }
	//
	// public void manageRobo(Robo robo) {
	//
	// robo.eat();
	// robo.walk();
	// robo.sleep();
	//
	// }

	public void manageLT(LivingThing lt) {

		if (lt instanceof Human) {
			Human human = (Human) lt;
			human.read();
		}

		lt.eat();
		lt.walk();  // Vertual Method Calll
		lt.sleep();
	}

}
