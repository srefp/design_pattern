package com.atguigu.uml.composition;

public class Computer {
    private Mouse mouse = new Mouse(); //鼠标和computer不能分离
    private Moniter moniter = new Moniter(); //显示器和computer不能分离

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setMoniter(Moniter moniter) {
        this.moniter = moniter;
    }
}
