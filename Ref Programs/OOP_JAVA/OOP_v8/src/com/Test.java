package com;

import com.car.Car;
import com.wheel.DubaiWheel;
import com.wheel.MRFWheel;
import com.wheel.Wheel;

public class Test {

	public static void main(String[] args) {

		Car car = new Car();
		
		Wheel wheel=new MRFWheel();
		wheel=new DubaiWheel();
		
		car.move(wheel);

	}

}
