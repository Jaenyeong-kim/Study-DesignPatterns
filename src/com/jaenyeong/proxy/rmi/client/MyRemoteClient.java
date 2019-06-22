package com.jaenyeong.proxy.rmi.client;

import com.jaenyeong.proxy.rmi.server.MyRemote;

import java.rmi.*;

/**
 * 클라이언트에서는 스터브 객체를 가져오기 위해 lookup을 통해 스터브 객체 요청
 */
public class MyRemoteClient {

	public static void main(String[] args) {
		new MyRemoteClient().go();
	}

	public void go() {
		try {
			MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
			String s = service.sayHello();

			System.out.println(s);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
