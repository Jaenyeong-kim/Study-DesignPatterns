package com.jaenyeong.command.garage;

public class GarageDoor {
	String location = "";

	public GarageDoor() {
	}

	public GarageDoor(String location) {
		this.location = location;
	}

	public void up() {
		System.out.println("GarageDoor up");
	}
	public void down() {
		System.out.println("GarageDoor down");
	}
	public void stop() {
		System.out.println("GarageDoor stop");
	}
	public void lightOn() {
		System.out.println("GarageDoor lightOn");
	}
	public void lightOff() {
		System.out.println("GarageDoor lightOff");
	}
}
