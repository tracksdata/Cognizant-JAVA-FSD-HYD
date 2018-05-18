package com;

public class Bank implements Customer, Manager, BankEmployee, ClerkerOperations  {

	@Override
	public void passCheque() {
		System.out.println("-- cheque is being passed");
	}

	@Override
	public void deposit() {
		System.out.println("-- depositing");
	}

	@Override
	public void withDraw() {
		System.out.println("-- withdrawing");
	}

	@Override
	public void openAccount() {
		System.out.println("--- Account is opening");
	}

	@Override
	public void closeAccount() {
		System.out.println("-- Account is closing");
	}

	@Override
	public void lockerAccess() {
		System.out.println("-- locker access granted");
	}

	@Override
	public void displatchCach() {
		System.out.println("-- Cash is dispatching");
	}

}
