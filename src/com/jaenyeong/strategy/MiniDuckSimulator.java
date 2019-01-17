package com.jaenyeong.strategy;

import com.jaenyeong.strategy.duck.Duck;
import com.jaenyeong.strategy.duck.MallardDuck;
import com.jaenyeong.strategy.duck.ModelDuck;
import com.jaenyeong.strategy.fly.FlyRocketPowered;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        System.out.println("MallardDuck");
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        System.out.println("ModelDuck");
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
