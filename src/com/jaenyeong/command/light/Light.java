package com.jaenyeong.command.light;

public class Light {
	String location = "";

	public Light() {
	}

	public Light(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println("Light On");
	}

	public void off() {
		System.out.println("Light Off");
	}
}
