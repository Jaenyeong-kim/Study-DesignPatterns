package com.jaenyeong.command.ceilingFan;

public class CeilingFan {
	String location = "";
//	int level;
	int speed;
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;

	public CeilingFan(String location) {
		this.location = location;
		speed = OFF;
	}

	public void high() {
//		level = HIGH;
		speed = HIGH;
		System.out.println(location + " ceiling fan is on high");

	}

	public void medium() {
//		level = MEDIUM;
		speed = MEDIUM;
		System.out.println(location + " ceiling fan is on medium");
	}

	public void low() {
//		level = LOW;
		speed = LOW;
		System.out.println(location + " ceiling fan is on low");
	}

	public void off() {
//		level = 0;
		speed = OFF;
		System.out.println(location + " ceiling fan is off");
	}

	public int getSpeed() {
//		return level;
		return speed;
	}
}
