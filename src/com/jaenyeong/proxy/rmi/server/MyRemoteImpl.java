package com.jaenyeong.proxy.rmi.server;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * [[2]] 서비스 구현 클래스 만들기
 *
 *  1) 원격 인터페이스 구현
 *  2) UnicastRemoteObject 클래스 확장(원격 객체가 되기 위한 가장 간단한 방법)
 *  3) RemoteException 선언하는 인자 없는 생성자 만들기 - UnicastRemoteObject 클래스 생성자가 RemoteException 던짐
 *  4) 서비스를 RMI 레지스트리에 등록
 *     - 원격 클라이언트에서 사용할 수 있게 인스턴스 생성 후 RMI 레지스트리에 등록(RMI 레지스트리가 돌아가고 있어야 함)
 *     - 서비스를 구현한 객체를 등록하면 RMI 시스템에서는 스터브만 레지스트리에 등록(클라이언트는 스터브만 필요)
 *     - 서비스 등록 시 java.rmi.Naming 안에 rebind() 정적 메소드 사용
 *
 * [[3]] 스터브 및 스켈레톤 생성
 *
 *  1) 서비스를 구현한 클래스에 대해서 rmic 돌림
 *     - JDK에 포함된 rmic 툴은 스터브, 스켈레톤 생성(클래스명 끝에 각각 _Stub, _Skel 붙음)
 *     - 새로 생성되는 클래스는 현재 디렉토리에 저장(실제 사용시 패키지, 디렉토리 구조 등 고려)
 *
 * [[4]] rmiregistry 실행
 *
 *  1) 터미널에서 rmiregistry 실행
 *     - 클래스에 접근할 수 있는 디렉토리에서 실행(ex - classes 디렉토리)
 *
 * [[5]] 서비스 가동
 *
 *  1) 다른 터미널에서 서비스 시작
 *     - 원격 서비스를 구현한 클래스의 main() 메소드에서 실행할 수 있지만 별도의 클래스로부터 할 수 있음
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

	public MyRemoteImpl() throws RemoteException {
	}

	@Override
	public String sayHello() throws RemoteException {
		return "Server says, 'Hey' ";
	}

	/**
	 * 서비스 등록 시 이름을 지정해야 클라이언트에서 그 이름으로 레지스트리를 검색
	 * rebind() 메소드로 서비스 객체를 결합시키면 RMI에서는 서비스에 해당하는 스터브를 레지스트리에 집어 넣음
	 */
	public static void main(String[] args) {
		try {
			MyRemote service = new MyRemoteImpl();
			Naming.rebind("RemoteHello", service);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
