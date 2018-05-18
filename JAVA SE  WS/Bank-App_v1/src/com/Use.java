package com;

public class Use {
	public static void main(String[] args) {

		Customer cust = new Bank();
		cust.withDraw();
		cust.deposit();

		Manager mgr = new Bank();
		mgr.lockerAccess();
		mgr.openAccount();
		mgr.closeAccount();

		BankEmployee be = new Bank();
		be.displatchCach();

		ClerkerOperations co = new Bank();
		co.passCheque();

	}

}
