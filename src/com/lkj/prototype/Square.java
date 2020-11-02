package com.lkj.prototype;

import java.awt.*;

public class Square extends Shape {

    private int x, y, a;

    public Square(int x, int y, int a) {
        this.x = x;
        this.y = y;
        this.a = a;
    }

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }

    @Override
    public void paint(Graphics g) {
        Color c = g.getColor();
        g.setColor(Color.RED);

        g.drawRect(x, y, a, a);


        g.setColor(c);
    }
}
