package com.jaenyeong.compound._5_observer;

public interface QuackObservable {
	void registerObserver(Observer observer);

	void notifyObservers();
}
