package com.jaenyeong.observer.subject;

import com.jaenyeong.observer.observer.Observer;

public interface Subject {
	void registerObserver(Observer observer);
	void removeObserver(Observer observer);
	void notifyObservers();
}
