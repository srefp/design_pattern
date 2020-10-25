package com.atguigu.principle.composite.improve_dependency;

public class B {
    public void depends(A a) {
        a.operation1();
        a.operation2();
        a.operation3();
    }
}
