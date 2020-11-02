package com.atguigu.strategy.improve;

public abstract class Duck {

    private FlyBehavior flyBehavior;
    public Duck() {
    }

    public abstract void display(); //显示鸭子的信息

    public void quack() {
        System.out.println("鸭子嘎嘎叫~~");
    }

    public void swim() {
        System.out.println("鸭子会游泳~~");
    }

    public void fly() {
        System.out.println("鸭子在飞翔~~");
    }

}
