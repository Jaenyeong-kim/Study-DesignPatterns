package com.jaenyeong.compound._2_decorator;

import com.jaenyeong.compound._0_basic.Quackable;

// 데코레이터 패턴
public class QuackCounter implements Quackable {
	Quackable duck;
	static int numberOfQuacks;

	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}

	@Override
	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}

	public static int getQuacks() {
		return numberOfQuacks;
	}
}
