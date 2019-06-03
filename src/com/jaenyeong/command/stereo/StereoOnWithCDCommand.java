package com.jaenyeong.command.stereo;

import com.jaenyeong.command.Command;

public class StereoOnWithCDCommand implements Command {
	Stereo stereo;

	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.on();
		stereo.setCd();
		stereo.setVolume();
	}

	@Override
	public void undo() {
		System.out.println("StereoOnWithCDCommand undo()");
	}
}
