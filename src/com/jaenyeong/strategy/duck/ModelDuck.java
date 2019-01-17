package com.jaenyeong.strategy.duck;

import com.jaenyeong.strategy.fly.FlyNoWay;
import com.jaenyeong.strategy.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("모형 오리입니다!");
    }
}
