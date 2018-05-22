package com;

class Operator extends Thread {

	int noOfSeats = 2;
	int wanted;

	public Operator(int wanted) {
		this.wanted = wanted;
	}

	@Override
	public void run() {

		bookTickt();
	}

	public void bookTickt() {

		String tname = Thread.currentThread().getName();
		System.out.println("Booking " + wanted + " Seats to " + tname);

		synchronized (this) {

			if (wanted <= noOfSeats) {

				noOfSeats = noOfSeats - wanted;
				System.out.println(wanted + " Seats Booked for " + tname);
				System.out.println("Available seats are: " + noOfSeats);

			} else {
				System.out.println("Sorry. No Seats are available");
			}

		} // sync block end
	}

}

public class Reservation {

	public static void main(String[] args) {

		Operator op = new Operator(2);

		Thread p1 = new Thread(op);
		Thread p2 = new Thread(op);

		p1.setName("Passenger-1");
		p2.setName("Passenger-2");

		p1.start();
		p2.start();

	}

}
