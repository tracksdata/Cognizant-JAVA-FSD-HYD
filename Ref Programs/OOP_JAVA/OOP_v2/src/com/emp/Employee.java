package com.emp;

import com.trainer.Trainer;

public class Employee {

	public void learn(Trainer trainer) {

		System.out.println(trainer.getTrName());
		System.out.println(trainer.getTrSkill());

		// System.out.println(trainer.trSalary);
		// trainer.trSalary=10;

		trainer.teach();
		// trainer.trPersonalBehav();

		System.out.println("Emp Learned");
	}

}
