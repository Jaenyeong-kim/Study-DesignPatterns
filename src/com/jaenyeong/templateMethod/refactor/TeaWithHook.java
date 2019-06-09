package com.jaenyeong.templateMethod.refactor;

public class TeaWithHook extends CaffeineBeverageWithHook {

	@Override
	void brew() {
		System.out.println("차를 우려내는 중");
	}

	@Override
	void addCondiments() {
		System.out.println("레몬을 추가하는 중");
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
		System.out.println("레몬을 넣을까요? (y/n) ");
		return getInputData();
	}
}
