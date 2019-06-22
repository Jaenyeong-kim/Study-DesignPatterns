package com.jaenyeong.proxy.rmiProxy;

public class WinnerState implements State {
	private static final long serialVersionUID = 2L;
	// transient 키워드는 직렬화 하지 않을 때 사용
	// 다만 이 키워드를 붙인 객체를 직렬화로 전송 후에 호출시 문제 발생 소지 있음
	transient GumballMachine gumballMachine;

	public WinnerState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("잠깐만 기다려 주세요. 알맹이가 나가고 있습니다.");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("이미 알맹이를 뽑으셨습니다.");
	}

	@Override
	public void turnCrack() {
		System.out.println("손잡이는 한 번만 돌려주세요.");
	}

	@Override
	public void dispense() {
		System.out.println("축하드립니다! 알맹이를 하나 더 받으실 수 있습니다.");
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			gumballMachine.releaseBall();
			if (gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
				System.out.println("더 이상 알맹이가 없습니다.");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}

	@Override
	public void refill() {
	}

	@Override
	public String toString() {
		return "당첨!";
	}
}
