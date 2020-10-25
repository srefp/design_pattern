package com.atguigu.principle.composite.improve_composition;

public class B {

    private A a = new A();

    public void depends() {
        a.operation1();
        a.operation2();
        a.operation3();
    }
}
