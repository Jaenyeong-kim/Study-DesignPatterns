package com.jaenyeong.templateMethod.refactor;

public abstract class CaffeineBeverage {

	/**
	 * 템플릿 메소드 - prepareRecipe()
	 * 하위 클래스에서 오버라이딩 하는 것을 막기 위해 final 선언
	 */
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

	abstract void brew();

	abstract void addCondiments();

	void boilWater() {
		System.out.println("물 끓이는 중");
	}

	void pourInCup() {
		System.out.println("컵에 따르는 중");
	}
}
