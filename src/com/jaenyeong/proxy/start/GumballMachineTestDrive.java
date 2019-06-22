package com.jaenyeong.proxy.start;

public class GumballMachineTestDrive {
	/**
	 * RMI : Remote Method Invocation
	 * stub(proxy) : 클라이언트 보조객체
	 * skeleton : 서비스(서버) 보조 객체
	 */

	public static void main(String[] args) {
		int count = 0;

		if (args.length < 2) {
			System.out.println("GumballMachine <name> <inventory>");
			System.exit(1);
		}

		count = Integer.parseInt(args[1]);
		GumballMachine gumballMachine = new GumballMachine(args[0], count);

		GumballMonitor monitor = new GumballMonitor(gumballMachine);

		// 기타 코드

		monitor.report();
	}
}
