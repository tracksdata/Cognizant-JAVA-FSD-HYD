package com;

class City {

	String[] cities = { "Chennai", "Bangalore", "Hyderabad", "Pune", "Kolkatha" };

	public String findCity(String cn) {

		boolean flag = false;
		String cityName = null;
		try {
			for (String city : cities) {

				if (city.equalsIgnoreCase(cn)) {
					flag = true;
					cityName = cn;
				}

			} // end of for

			if (flag == true) {
				return cityName;
			} else {
				throw new NoCityFoundException();
			}
		} catch (NoCityFoundException ncfe) {
			System.out.println("-- Failed due to " + ncfe);
		}

		return cityName;

	}

}

public class UserDefinedExceptionDemo {

	public static void main(String[] args) {

		City city = new City();

		String cityName = city.findCity("CHENNAI");
		System.out.println("City Name is " + cityName);

	}

}
