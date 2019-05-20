package com.jaenyeong.singleton;

public class DclSingleton {
	/*
	DCL (Double-checking Locking)
	인스턴스가 생성되지 않았을 때만 동기화
	volatile 키워드를 사용하면 멀티스레딩을 사용해도 싱글톤 인스턴스 초기화 과정이 올바르게 진행됨.
	 */
	private volatile static DclSingleton uniqueInstance;

	private DclSingleton() {}

	public static DclSingleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (DclSingleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new DclSingleton();
				}
			}
		}
		return uniqueInstance;
	}
}
