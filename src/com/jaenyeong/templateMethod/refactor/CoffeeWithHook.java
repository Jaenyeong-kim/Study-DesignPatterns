package com.jaenyeong.templateMethod.refactor;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

	@Override
	void brew() {
		System.out.println("필터로 커피를 우려내는 중");
	}

	@Override
	void addCondiments() {
		System.out.println("우유와 설탕을 추가하는 중");
	}

	/**
	 * hook method override
	 */
	@Override
	boolean customerWantsCondiments() {
		String answer = getUserInput();

		if (answer.toLowerCase().startsWith("y")) {
			return true;
		}
		return false;
	}

	private String getUserInput() {
		System.out.println("커피에 우유와 설탕을 넣어 드릴까요? (y/n) ");
		return getInputData();
	}
}
