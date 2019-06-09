package com.jaenyeong.templateMethod.applet;

import java.applet.Applet;
import java.awt.*;

public class MyApplet extends Applet {
	String message;

	public void init() {
		message = "초기화";
		repaint();
	}

	public void start() {
		message = "시작";
		repaint();
	}

	public void stop() {
		message = "중지";
		repaint();
	}

	public void destroy() {
		// Applet 삭제
	}

	public void paint(Graphics g) {
		g.drawString(message, 5, 15);
	}

}
