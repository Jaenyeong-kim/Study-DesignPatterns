package com.jaenyeong.singleton;

public class Singleton {
	private static Singleton uniqueInstance;

	private Singleton() {}

	public Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
}
