package com;

public class Test extends Thread {

	@Override
	public void run() {

		f1();

	}

	void f1() {
		String tname = Thread.currentThread().getName();

		if (tname.equals("Second")) {
			try {
				System.out.println(tname + " is sleeping for 5 secs");
				Thread.sleep(5000);
				System.out.println(tname + " is Resumed from sleep");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		for (int i = 1; i <= 5; i++) {
			System.out.println("I= " + i + " By " + tname);
		}
	}

	/*
	 * void f2() { String tname=Thread.currentThread().getName(); for (int j = 1; j
	 * <= 5; j++) { System.out.println("J= " + j+" By "+tname); } }
	 */

	public static void main(String[] args) {

		Test t = new Test();
		// t.f1();

		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);

		t1.setName("First");
		t2.setName("Second");

		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);

		t1.start();
		t2.start();

	}

}
