package com.jaenyeong.state.refactor1;

public class GumballMachine {
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;

	// 상태 인스턴스 변수
	State state = soldOutState;
	int count;

	// 당첨 상태 추가
	State winnerState;

	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);

		// 당첨 여부 추가
		winnerState = new WinnerState(this);
		this.count = numberGumballs;
		if (numberGumballs > 0) {
			state = noQuarterState;
		}
	}

	public void insertQuarter() {
		state.insertQuarter();
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}

	public void turnCrack() {
		state.turnCrack();
		state.dispense();
	}

	public void setState(State state) {
		this.state = state;
	}

	void releaseBall() {
		System.out.println("알맹이가 슬롯 밖으로 굴러 나옵니다.");
		if (count != 0) {
			count -= 1;
		}
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	// 당첨 상태 추가
	public State getWinnerState() {
		return winnerState;
	}

	public State getState() {
		return state;
	}

	public int getCount() {
		return count;
	}

	void refill(int count) {
		this.count += count;
		System.out.println("리필 되었습니다. 알맹이 수는 : " + this.count);
		state.refill();
	}

	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\n주식회사 왕뽑기");
		result.append("\n자바로 돌아가는 2004년형 뽑기 기계\n");
		result.append("남은 개수: " + count + " 개");
		result.append("\n");
		result.append("왕뽑기 상태는 " + state + "\n");
		return result.toString();
	}
}
