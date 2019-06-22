package com.jaenyeong.proxy.rmiProxy;

// 동전 없음 상태
public class NoQuarterState implements State {
	private static final long serialVersionUID = 2L;
	// transient 키워드는 직렬화 하지 않을 때 사용
	// 다만 이 키워드를 붙인 객체를 직렬화로 전송 후에 호출시 문제 발생 소지 있음
	transient GumballMachine gumballMachine;

	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("동전을 넣으셨습니다.");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("동전을 넣어주세요.");
	}

	@Override
	public void turnCrack() {
		System.out.println("동전을 넣어주세요.");
	}

	@Override
	public void dispense() {
		System.out.println("동전을 넣어주세요.");
	}

	@Override
	public void refill() {
	}

	@Override
	public String toString() {
		return "동전 투입 대기중";
	}
}
