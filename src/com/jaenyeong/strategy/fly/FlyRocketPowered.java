package com.jaenyeong.strategy.fly;

public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("로켓 추진력으로 날아갑니다!");
    }
}
