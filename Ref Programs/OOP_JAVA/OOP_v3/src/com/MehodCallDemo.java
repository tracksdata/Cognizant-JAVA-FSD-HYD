package com;

public class MehodCallDemo {

	public void ins_a() {
		ins_b();
		sta_a();
	}

	public void ins_b() {

	}

	public static void sta_a() {
		sta_b();
		// ins_a(); cant invoke , Need Object reference

	}

	public static void sta_b() {

	}

}
