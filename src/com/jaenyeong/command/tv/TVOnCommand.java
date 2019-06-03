package com.jaenyeong.command.tv;

import com.jaenyeong.command.Command;

public class TVOnCommand implements Command {
	TV tv;

	public TVOnCommand(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.on();
	}

	@Override
	public void undo() {
		tv.off();
	}
}
