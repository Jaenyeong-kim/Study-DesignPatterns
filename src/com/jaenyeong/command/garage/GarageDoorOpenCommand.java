package com.jaenyeong.command.garage;

import com.jaenyeong.command.Command;

public class GarageDoorOpenCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.lightOn();
	}

	@Override
	public void undo() {
		garageDoor.lightOff();
	}

}
