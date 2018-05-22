package com;

import java.util.Scanner;

public class NumberDemo {

	public static void main(String[] args) {

		boolean status = true;

		while (status) {
			try {

				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a Number: ");
				int x = sc.nextInt();
				System.out.println("Number is " + x);
				status = false;

			} catch (Exception e) {
				System.out.println("Invalid Input. try again");
			}
		} // end of while loop

	}

}
