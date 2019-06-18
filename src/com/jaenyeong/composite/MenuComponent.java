package com.jaenyeong.composite;

import java.util.Iterator;

public abstract class MenuComponent {

	// MenuComponent를 추가하는 메소드
	public void add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}

	// MenuComponent를 삭제하는 메소드
	public void remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}

	// MenuComponent를 가져오는 메소드
	public MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}

	// MenuItem 작업 메소드
	public String getName() {
		throw new UnsupportedOperationException();
	}

	// MenuItem 작업 메소드
	public String getDescription() {
		throw new UnsupportedOperationException();
	}

	// MenuItem 작업 메소드
	public double getPrice() {
		throw new UnsupportedOperationException();
	}

	// MenuItem 작업 메소드
	public boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}

	// Menu, MenuItem 작업 메소드
	public void print() {
		throw new UnsupportedOperationException();
	}

	// Iterator 리턴 메소드
	public abstract Iterator<MenuComponent> createIterator();
}
