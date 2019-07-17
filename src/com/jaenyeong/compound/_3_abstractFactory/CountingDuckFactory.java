package com.jaenyeong.compound._3_abstractFactory;

import com.jaenyeong.compound._0_basic.*;
import com.jaenyeong.compound._1_adapter.Goose;
import com.jaenyeong.compound._1_adapter.GooseAdapter;
import com.jaenyeong.compound._2_decorator.QuackCounter;

// 추상 팩토리 패턴 (데코레이터 있을 때)
public class CountingDuckFactory extends AbstractDuckFactory {
	@Override
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}

	@Override
	public Quackable createRedheadDuck() {
		return new QuackCounter(new RedheadDuck());
	}

	@Override
	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}

	@Override
	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}

	// 거위 구현 메소드 추가
	public Quackable createGooseDuck() {
		return new QuackCounter(new GooseAdapter(new Goose()));
	}
}
