package com.jaenyeong.templateMethod.refactor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class CaffeineBeverageWithHook {

	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}

	abstract void brew();

	abstract void addCondiments();

	void boilWater() {
		System.out.println("물 끓이는 중");
	}

	void pourInCup() {
		System.out.println("컵에 따르는 중");
	}

	/**
	 * hook method - 아무 행동도 하지 않거나 기본적인 행동을 정의한 메소드
	 * 서브 클래스에서 오버라이드 가능
	 */
	boolean customerWantsCondiments() {
		return true;
	}

	/**
	 * 중복된 로직, 따라서 원본 소스와 달리 추상클래스에 공통 로직 생성
	 */
	String getInputData() {
		String answer = null;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		try {
			answer = in.readLine();
		} catch (IOException ioe) {
			System.err.println("IO 에러");
		}

		if (answer == null) {
			return "no";
		}
		return answer;
	}
}
