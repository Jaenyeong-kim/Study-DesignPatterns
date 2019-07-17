package com.jaenyeong.compound;

import com.jaenyeong.compound._0_basic.*;
import com.jaenyeong.compound._1_adapter.Goose;
import com.jaenyeong.compound._1_adapter.GooseAdapter;
import com.jaenyeong.compound._2_decorator.QuackCounter;
import com.jaenyeong.compound._3_abstractFactory.AbstractDuckFactory;
import com.jaenyeong.compound._3_abstractFactory.CountingDuckFactory;
import com.jaenyeong.compound._4_composite.Flock;

public class DuckSimulator {

	public static void main(String[] args) {
		DuckSimulator duckSimulator = new DuckSimulator();
		// 팩토리 추가 (추상 팩토리 패턴)
		AbstractDuckFactory duckFactory = new CountingDuckFactory();

//		duckSimulator.simulate();
		// 팩토리 추가 (추상 팩토리 패턴)
		duckSimulator.simulate(duckFactory);
	}

	void simulate() {
//		Quackable mallardDuck = new MallardDuck();
//		Quackable redheadDuck = new RedheadDuck();
//		Quackable duckCall = new DuckCall();
//		Quackable rubberDuck = new RubberDuck();

		// 거위 추가 (어댑터 패턴)
//		Quackable gooseDuck = new GooseAdapter(new Goose());

		// 꽥 소리 횟수 세기 (데코레이터 패턴)
		Quackable mallardDuck = new QuackCounter(new MallardDuck());
		Quackable redheadDuck = new QuackCounter(new RedheadDuck());
		Quackable duckCall = new QuackCounter(new DuckCall());
		Quackable rubberDuck = new QuackCounter(new RubberDuck());
		Quackable gooseDuck = new QuackCounter(new GooseAdapter(new Goose()));

		System.out.println("\nDuck Simulator");

		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);

		// 거위 추가 (어댑터 패턴)
		simulate(gooseDuck);

        // 꽥 소리 횟수 세기 (데코레이터 패턴)
		System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
	}

	void simulate(AbstractDuckFactory duckFactory) {

		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());

//		System.out.println("\nDuck Simulator");
		System.out.println("\nDuck Simulator: With Composite - Flocks");

		// 전체 오리 무리가 들어가는 관리 객체 생성 (컴포지트 패턴)
		Flock flockOfDucks = new Flock();

		flockOfDucks.add(mallardDuck);
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);

		// 물 오리 무리만 들어가는 관리 객체 생성 (컴포지트 패턴)
		Flock flockOfMallards = new Flock();

		// 물 오리 무리 객체 (개별)생성 (컴포지트 패턴)
		Quackable mallardOne = duckFactory.createMallardDuck();
		Quackable mallardTwo = duckFactory.createMallardDuck();
		Quackable mallardThree = duckFactory.createMallardDuck();
		Quackable mallardFour = duckFactory.createMallardDuck();

		// 물 오리 무리 객체 삽입 (컴포지트 패턴)
		flockOfMallards.add(mallardOne);
		flockOfMallards.add(mallardTwo);
		flockOfMallards.add(mallardThree);
		flockOfMallards.add(mallardFour);

		// [물 오리 무리]만 관리하는 객체를 [전체 오리 무리]를 관리하는 객체에 삽입 (컴포지트 패턴)
		flockOfDucks.add(flockOfMallards);

//		simulate(mallardDuck);
//		simulate(redheadDuck);
//		simulate(duckCall);
//		simulate(rubberDuck);

		// 거위 추가 (어댑터 패턴)
//		simulate(gooseDuck);

		// 오리 무리 추가 (컴포지트 패턴)
		System.out.println("\nDuck Simulator: Whole Flock Simulation");
		simulate(flockOfDucks);
		System.out.println("\nDuck Simulator: Mallard Flock Simulation");
		simulate(flockOfMallards);

		// 꽥 소리 횟수 세기 (데코레이터 패턴)
		System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
	}

	void simulate(Quackable duck) {
		duck.quack();
	}
}
