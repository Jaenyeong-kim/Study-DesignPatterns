package com.jaenyeong.proxy.rmiProxy;

import java.io.Serializable;

// 직렬화
public interface State extends Serializable {
	void insertQuarter();
	void ejectQuarter();
	void turnCrack();
	void dispense();
	void refill();
}
