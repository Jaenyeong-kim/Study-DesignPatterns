package com.jaenyeong.compound._1_adapter;

import com.jaenyeong.compound._0_basic.Quackable;

// 어댑터 패턴
public class GooseAdapter implements Quackable {
	Goose goose;

	public GooseAdapter(Goose goose) {
		this.goose = goose;
	}

	@Override
	public void quack() {
		goose.honk();
	}
}
