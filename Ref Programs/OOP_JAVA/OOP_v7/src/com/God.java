package com;

public class God {

	public void manageLT(LivingThing lt) {

		if (lt instanceof Human) {
			((Human) lt).read();
		}

		lt.eat();
		lt.walk();
		lt.sleep();
		
	}

}
