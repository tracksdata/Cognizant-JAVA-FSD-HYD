package com;

public class Examples {

	public static void main(String[] args) {

		// 1.

		String ssn = "15-1222-122";

		if (ssn.matches("\\d{2}-\\d{4}-\\d{3}")) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}

		// 2.

		boolean isValid = false;

		if (ssn.length() == 11) {

			for (int i = 0; i < 11; i++) {

				if (i == 2 || i == 7) {

					if (ssn.charAt(i) == '-') {
						isValid = true;
					} else {
						isValid = false;
						break;
					}

				} else {

					if (("0123456789".indexOf(ssn.charAt(i)) != -1)) {
						isValid = true;
					} else {
						isValid = false;
						break;
					}

				}

			}

		}

		if (isValid) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}

	}

}
