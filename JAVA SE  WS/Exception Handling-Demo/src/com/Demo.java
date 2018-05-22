package com;

interface MI{
	
}
public class Demo {

	void f1() {
		
	}
	
	public static void main(String[] args) {
		
		try {

			int i[] = new int[10];
			int res = 10 /0;
			int x[] = new int[2];
			x[1] = 100;
			System.out.println("-- try");

		}catch (ArrayIndexOutOfBoundsException aiob) {
			aiob.printStackTrace();
		} catch (ArithmeticException ae) {
			System.out.println("-- Failed due to " + ae);
		} catch (Exception e) {
			System.out.println("-- Failed due to " + e);
			e.printStackTrace();
		}finally {
			System.out.println("-- alwsys");
		}

	}

}
