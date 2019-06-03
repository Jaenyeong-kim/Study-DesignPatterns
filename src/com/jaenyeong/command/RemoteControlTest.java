package com.jaenyeong.command;

import com.jaenyeong.command.garage.GarageDoor;
import com.jaenyeong.command.garage.GarageDoorOpenCommand;
import com.jaenyeong.command.light.Light;
import com.jaenyeong.command.light.LightOnCommand;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		GarageDoor garageDoor = new GarageDoor();
		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

		remote.setCommand(lightOn);
		remote.buttonWasPressed();

		remote.setCommand(garageOpen);
		remote.buttonWasPressed();
	}
}
