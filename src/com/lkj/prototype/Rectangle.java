package com.lkj.prototype;

import java.awt.*;

public class Rectangle extends Shape {
    private int x,y,w,h;

    public Rectangle(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }

    @Override
    public void paint(Graphics g) {
        Color c = g.getColor();
        g.setColor(Color.RED);

        g.drawRect(x, y, w, h);


        g.setColor(c);
    }
}
