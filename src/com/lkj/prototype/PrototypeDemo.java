package com.lkj.prototype;

import com.lkj.prototype.Circle;
import com.lkj.prototype.Rectangle;
import com.lkj.prototype.Square;

import javax.swing.*;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static com.lkj.common.Constant.*;


public class PrototypeDemo extends JFrame {

    Circle circle = new Circle(100, 100, 50);
    Square square = new Square(400, 100, 50);
    Rectangle rectangle = new Rectangle(800, 100, 50, 70);

    public PrototypeDemo() {
        setBounds(W_X, W_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        setResizable(false);
        setTitle("设计模式");
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    Image offScreeImage = null;

    @Override
    public void update(Graphics g) {
        if (offScreeImage == null) {
            offScreeImage = this.createImage(WINDOW_WIDTH, WINDOW_HEIGHT);
        }
        Graphics gOffScreen = offScreeImage.getGraphics();
        Color c = gOffScreen.getColor();
        gOffScreen.fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
        gOffScreen.setColor(c);
        paint(gOffScreen);
        g.drawImage(offScreeImage, 0, 0, null);
    }

    @Override
    public void paint(Graphics g) {
        Color c = g.getColor();
        g.setColor(Color.RED);

        circle.paint(g);
        square.paint(g);
        rectangle.paint(g);

        g.setColor(c);
    }
}
