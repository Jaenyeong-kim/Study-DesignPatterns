package com.jaenyeong.proxy.rmiProxy;

import java.util.Random;

// 동전 있음 상태
public class HasQuarterState implements State {
	private static final long serialVersionUID = 2L;
	// transient 키워드는 직렬화 하지 않을 때 사용
	// 다만 이 키워드를 붙인 객체를 직렬화로 전송 후에 호출시 문제 발생 소지 있음
	transient GumballMachine gumballMachine;
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
