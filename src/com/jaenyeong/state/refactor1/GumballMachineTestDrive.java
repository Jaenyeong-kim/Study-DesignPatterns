package com.jaenyeong.state.refactor1;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrack();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrack();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrack();

		System.out.println(gumballMachine);
	}
}
