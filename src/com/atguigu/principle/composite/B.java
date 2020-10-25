package com.atguigu.principle.composite;

public class B extends A {
    public void depends() {
        operation1();
        operation2();
        operation3();
    }
}
