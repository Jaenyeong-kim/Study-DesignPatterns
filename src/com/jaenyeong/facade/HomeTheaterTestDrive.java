package com.jaenyeong.facade;

public class HomeTheaterTestDrive {
	public static void main(String[] args) {
		/**
		 * 보통은 클라이언트에서 퍼사드가 주어지기 때문에
		 * 직접 구성 요소들을 생성하지 않아도 된다.
		 */
		Amplifier amplifier = new Amplifier("Top O Line Amplifier");
		Tuner tuner = new Tuner("Top O Line AM/FM Tuner", amplifier);
		DvdPlayer dvdPlayer = new DvdPlayer("Top O Line DVD Player", amplifier);
		CdPlayer cdPlayer = new CdPlayer("Top O Line CD Player", amplifier);
		Projector projector = new Projector("Top O Line Projector", dvdPlayer);
		TheaterLights theaterLights = new TheaterLights("Theater Ceiling Lights");
		Screen screen = new Screen("Theater Screen");
		PopcornPopper popcornPopper = new PopcornPopper("PopcornPopper");

		HomeTheaterFacade homeTheaterFacade =
				new HomeTheaterFacade(amplifier, tuner, dvdPlayer, cdPlayer, projector, screen, theaterLights, popcornPopper);

		homeTheaterFacade.watchMovie("Raiders of the Lost Ark");
		homeTheaterFacade.endMovie();
	}
}
