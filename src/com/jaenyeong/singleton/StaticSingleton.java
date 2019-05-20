package com.jaenyeong.singleton;

public class StaticSingleton {
	/*
	정적 싱글톤 인스턴스를 미리 생성하여 반환
	 */
	private static StaticSingleton uniqueInstance = new StaticSingleton();

	private StaticSingleton() {
	}

	public static StaticSingleton getInstance() {
		return uniqueInstance;
	}
}
