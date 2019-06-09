package com.jaenyeong.templateMethod.refactor;

public class BeverageTestDrive {

	public static void main(String[] args) {

		Tea tea = new Tea();
		Coffee coffee = new Coffee();

		System.out.println("\n차 만들기");
		tea.prepareRecipe();

		System.out.println("\n커피 만들기");
		coffee.prepareRecipe();

		TeaWithHook teaWithHook = new TeaWithHook();
		CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

		System.out.println("\n차 준비중");
		teaWithHook.prepareRecipe();

		System.out.println("\n커피 준비중");
		coffeeWithHook.prepareRecipe();
	}
}
