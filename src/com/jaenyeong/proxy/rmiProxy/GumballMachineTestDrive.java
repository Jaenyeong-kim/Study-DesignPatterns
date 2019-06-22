package com.jaenyeong.proxy.rmiProxy;

import java.rmi.Naming;

public class GumballMachineTestDrive {
	/**
	 * RMI : Remote Method Invocation
	 * stub(proxy) : 클라이언트 보조객체
	 * skeleton : 서비스(서버) 보조 객체
	 */

	public static void main(String[] args) {
		GumballMachineRemote gumballMachine = null;
		int count;
		if (args.length < 2) {
			System.out.println("GumballMachine <name> <inventory>");
			System.exit(1);
		}

		try {
			count = Integer.parseInt(args[1]);

			gumballMachine = new GumballMachine(args[0], count);
			Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
