package com.jaenyeong.proxy.rmiProxy;

// 매진 상태
public class SoldOutState implements State {
	private static final long serialVersionUID = 2L;
	// transient 키워드는 직렬화 하지 않을 때 사용
	// 다만 이 키워드를 붙인 객체를 직렬화로 전송 후에 호출시 문제 발생 소지 있음
	transient GumballMachine gumballMachine;

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
