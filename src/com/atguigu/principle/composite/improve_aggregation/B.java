package com.atguigu.principle.composite.improve_aggregation;

public class B {

    private A a;

    public B(A a) {
        this.a = a;
    }

    public void depends() {
        a.operation1();
        a.operation2();
        a.operation3();
    }
}
