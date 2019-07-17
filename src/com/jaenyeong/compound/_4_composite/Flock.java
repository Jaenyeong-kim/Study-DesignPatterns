package com.jaenyeong.compound._4_composite;

import com.jaenyeong.compound._0_basic.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

// 컴포지트 패턴
public class Flock implements Quackable {
	ArrayList quackers = new ArrayList<>();

	public void add(Quackable quacker) {
		quackers.add(quacker);
	}

	@Override
	public void quack() {
		// 이터레이터 패턴
		Iterator iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Quackable quacker = (Quackable) iterator.next();
			quacker.quack();
		}
	}
}
