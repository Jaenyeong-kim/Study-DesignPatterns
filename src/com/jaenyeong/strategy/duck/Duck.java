package com.jaenyeong.strategy.duck;

import com.jaenyeong.strategy.fly.FlyBehavior;
import com.jaenyeong.strategy.quack.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    // 생성자
    public Duck() {}

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public abstract void display();

    public void swim() {
        System.out.println("모든 오리는 물에 뜹니다!");
    }

    // setter 추가
    public void setFlyBehavior(FlyBehavior fly) {
        flyBehavior = fly;
    }

    public void setQuackBehavior(QuackBehavior quack) {
        quackBehavior = quack;
    }
}
