package com.lkj.common;

import com.lkj.prototype.PrototypeDemo;

public class Main {
    public static void main(String[] args) throws Exception {
        //1. 演示原型模式
        prototypePattern();

        //2. 演示
    }

    public static void prototypePattern() throws InterruptedException {
        PrototypeDemo prototypeDemo = new PrototypeDemo();

        while (true) {
            Thread.sleep(50);
            prototypeDemo.repaint();
        }
    }
}
