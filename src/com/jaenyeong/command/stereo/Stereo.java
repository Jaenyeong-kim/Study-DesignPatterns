package com.jaenyeong.command.stereo;

public class Stereo {
	String location = "";

	public Stereo() {
	}

	public Stereo(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println("Stereo On");
	}

	public void off() {
		System.out.println("Stereo off");
	}

	public void setCd() {
		System.out.println("Stereo setCd");
	}

	public void setDvd() {
		System.out.println("Stereo setDvd");
	}

	public void setRadio() {
		System.out.println("Stereo setRadio");
	}

	public void setVolume() {
		System.out.println("Stereo setVolume");
	}

}
