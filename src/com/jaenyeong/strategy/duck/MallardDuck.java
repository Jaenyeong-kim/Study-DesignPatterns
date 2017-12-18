package com.jaenyeong.strategy.duck;

import com.jaenyeong.strategy.quack.Quack;
import com.jaenyeong.strategy.fly.FlyWithWings;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("나는 MallardDuck 입니다!");
    }
}
