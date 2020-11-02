package com.atguigu.strategy.improve;

public class ToyDuck extends Duck {


    @Override
    public void display() {
        System.out.println("玩具鸭");
    }

    //需要重写父类的所以方法

    @Override
    public void quack() {
        System.out.println("玩具鸭不能叫");
    }

    @Override
    public void swim() {
        System.out.println("玩具鸭不能游泳");
    }

    @Override
    public void fly() {
        System.out.println("玩具鸭不能飞翔");
    }
}
