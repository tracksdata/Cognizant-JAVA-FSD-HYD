package com.trainer;

public class Trainer {

	private String trName = "Naga";
	private String trSkill = "Java";
	private double trSalary = 100.00;

	public String getTrName() {
		return trName;
	}

	public String getTrSkill() {
		return trSkill;
	}

	public void teach() {
		System.out.println("Teach");
	}

	private void trPersonalBehav() {
		System.out.println("Tr Personal Behav");
	}

}
