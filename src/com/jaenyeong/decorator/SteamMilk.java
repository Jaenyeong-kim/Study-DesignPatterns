package com.jaenyeong.decorator;

public class SteamMilk extends CondimentDecorator {
	Beverage beverage;

	public SteamMilk(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", 스팀 밀크";
	}

	@Override
	public double cost() {
		return .1 + beverage.cost();
	}
}
