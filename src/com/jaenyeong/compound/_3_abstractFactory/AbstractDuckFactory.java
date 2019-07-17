package com.jaenyeong.compound._3_abstractFactory;

import com.jaenyeong.compound._0_basic.Quackable;

// 추상 팩토리 패턴
public abstract class AbstractDuckFactory {
	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedheadDuck();
	public abstract Quackable createDuckCall();
	public abstract Quackable createRubberDuck();
}
