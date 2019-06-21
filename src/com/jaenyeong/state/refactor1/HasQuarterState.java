package com.jaenyeong.state.refactor1;

import java.util.Random;

// 동전 있음 상태
public class HasQuarterState implements State {
	GumballMachine gumballMachine;
	// 당첨 여부 추가
	Random randomWinner = new Random(System.currentTimeMillis());

	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("동전은 한 개만 넣어주세요.");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("동전이 반환됩니다.");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrack() {
		System.out.println("손잡이를 돌렸습니다.");
//		gumballMachine.setState(gumballMachine.getSoldState());
		int winner = randomWinner.nextInt(10);
		if ((winner == 0) && (gumballMachine.getCount() > 1)) {
			gumballMachine.setState(gumballMachine.getWinnerState());
		} else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}

	@Override
	public void dispense() {
		System.out.println("알맹이가 나갈 수 없습니다.");
	}

	@Override
	public void refill() {
	}

	@Override
	public String toString() {
		return "조작 대기중";
	}
}
