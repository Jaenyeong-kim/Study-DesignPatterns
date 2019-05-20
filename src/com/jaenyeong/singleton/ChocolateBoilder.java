package com.jaenyeong.singleton;

public class ChocolateBoilder {
	private boolean empty;
	private boolean boiled;

	// 보일러가 비어 있을 때만 작동
	public ChocolateBoilder() {
		empty = true;
		boiled = false;
	}

	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			// 보일러에 혼합 재료 삽입
		}
	}

	public void drain() {
		if (!isEmpty() && isBoiled()) {
			// 끓인 재료를 다음 단계로 넘김
			empty = true;
		}
	}

	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			// 재료 끓임
			boiled = true;
		}
	}

	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}

}
