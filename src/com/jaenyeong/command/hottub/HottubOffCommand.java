package com.jaenyeong.command.hottub;

import com.jaenyeong.command.Command;

public class HottubOffCommand implements Command {
	Hottub hottub;

	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	@Override
	public void execute() {
		hottub.setTemperature(98);
		hottub.off();
	}

	@Override
	public void undo() {
		hottub.on();
	}
}
