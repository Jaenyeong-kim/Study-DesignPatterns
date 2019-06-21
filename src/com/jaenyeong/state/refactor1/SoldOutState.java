package com.jaenyeong.state.refactor1;

// 매진 상태
public class SoldOutState implements State {
	GumballMachine gumballMachine;

	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("매진 되었습니다.");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("매진 되었습니다.");
	}

	@Override
	public void turnCrack() {
		System.out.println("매진 되었습니다.");
	}

	@Override
	public void dispense() {
		System.out.println("알맹이가 나갈 수 없습니다.");
	}

	@Override
	public void refill() {
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public String toString() {
		return "매진";
	}
}
