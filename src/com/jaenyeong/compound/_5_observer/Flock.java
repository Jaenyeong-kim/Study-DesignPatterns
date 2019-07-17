package com.jaenyeong.compound._5_observer;

import java.util.ArrayList;
import java.util.Iterator;

// 컴포지트 패턴
public class Flock implements Quackable {
	ArrayList<Quackable> ducks = new ArrayList<>();

	public void add(Quackable quacker) {
		ducks.add(quacker);
	}

	@Override
	public void quack() {
		// 이터레이터 패턴
		Iterator iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable quacker = (Quackable) iterator.next();
			quacker.quack();
		}
	}

	@Override
	public void registerObserver(Observer observer) {
		Iterator<Quackable> iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = iterator.next();
			duck.registerObserver(observer);
		}
	}

	@Override
	public void notifyObservers() {

	}

	@Override
	public String toString() {
		return "Flock{" +
				"ducks=" + ducks +
				'}';
	}
}
