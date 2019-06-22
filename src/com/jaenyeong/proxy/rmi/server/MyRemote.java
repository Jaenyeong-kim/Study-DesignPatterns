package com.jaenyeong.proxy.rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * [[1]] 원격 인터페이스 만들기
 *
 *  1) Remote : maker interface. RMI에서 특별한 의미이기 때문에 확장
 *  2) java.rmi 에 존재
 *  3) argument, return value : 반드시 primitive or Serializable 형식으로 선언
 */
public interface MyRemote extends Remote {
	String sayHello() throws RemoteException;
}
