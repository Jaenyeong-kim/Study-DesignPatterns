package com.jaenyeong.command;

public class NoCommand implements Command {
	@Override
	public void execute() {
		System.out.println("NoCommand execute");
	}

	public void undo() {
		System.out.println("NoCommand undo");
	}
}
