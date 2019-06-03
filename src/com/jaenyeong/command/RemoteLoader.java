package com.jaenyeong.command;

import com.jaenyeong.command.ceilingFan.*;
import com.jaenyeong.command.garage.GarageDoor;
import com.jaenyeong.command.garage.GarageDoorDownCommand;
import com.jaenyeong.command.garage.GarageDoorUpCommand;
import com.jaenyeong.command.hottub.Hottub;
import com.jaenyeong.command.hottub.HottubOffCommand;
import com.jaenyeong.command.hottub.HottubOnCommand;
import com.jaenyeong.command.light.Light;
import com.jaenyeong.command.light.LightOffCommand;
import com.jaenyeong.command.light.LightOnCommand;
import com.jaenyeong.command.stereo.Stereo;
import com.jaenyeong.command.stereo.StereoOffCommand;
import com.jaenyeong.command.stereo.StereoOnCommand;
import com.jaenyeong.command.stereo.StereoOnWithCDCommand;
import com.jaenyeong.command.tv.TV;
import com.jaenyeong.command.tv.TVOffCommand;
import com.jaenyeong.command.tv.TVOnCommand;

public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
//		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

		// 리시버 세팅
		Light livingRoomLight = new Light("Living room");
		Light kitchenLight = new Light("kitchen room");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("");
		Stereo stereo = new Stereo("Living Room");
		TV tv = new TV("Living Room");
		Hottub hottub = new Hottub();

		// 리시버를 매개변수로 각 커맨드 객체 생성
		LightOnCommand lightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand lightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOnCommand kitchenLightOff = new LightOnCommand(kitchenLight);
		CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
		CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
		CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOnCommand stereoOn = new StereoOnCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		TVOnCommand tvOn = new TVOnCommand(tv);
		TVOffCommand tvOff = new TVOffCommand(tv);
		HottubOnCommand hottubOn = new HottubOnCommand(hottub);
		HottubOffCommand hottubOff = new HottubOffCommand(hottub);

		// 리모트 컨트롤 객체에 커맨드 객체 세팅
		remoteControl.setCommand(0, lightOn, lightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
		remoteControl.setCommand(4, ceilingFanMedium, ceilingFanOff);
		remoteControl.setCommand(5, ceilingFanHigh, ceilingFanOff);

		Command[] partyOn = {lightOn, stereoOn, tvOn, hottubOn};
		Command[] partyOff = {lightOff, stereoOff, tvOff, hottubOff};

		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);

		System.out.println(remoteControl);

		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl); // undo
		remoteControl.undoButtonWasPushed(); // undo
		remoteControl.offButtonWasPushed(0); // undo
		remoteControl.onButtonWasPushed(0); // undo
		System.out.println(remoteControl); // undo
		remoteControl.undoButtonWasPushed(); // undo
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);

		remoteControl.onButtonWasPushed(4);
		remoteControl.offButtonWasPushed(4);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();

		remoteControl.onButtonWasPushed(5);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();

		remoteControl.setCommand(6, partyOnMacro, partyOffMacro);
		System.out.println(remoteControl);
		System.out.println("--- Pushing Macro On ---");
		remoteControl.onButtonWasPushed(6);
		System.out.println("--- Pushing Macro Off ---");
		remoteControl.offButtonWasPushed(6);
	}
}
