package se.liu.ida.gusso811.tddd78.lab3;

import java.awt.*;

/**
 * Created by gurra on 2/21/16.
 */
public class Circle extends AbstractShape{

    private int radius;

    public Circle(int x, int y, int radius, Color color) {
        super(y, color, x);
        if (radius < 0) {
            throw new IllegalArgumentException("Negativ radie!");
        }
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void draw(Graphics g) {
        /*System.out.println("Ritar: " + this);*/
        g.setColor(color);
        int width = radius;
        int height = radius;
        g.drawOval(x, y, width, height); // calculated from radius!
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", radius=" + radius +
                ", color=" + getColor() +
                '}';
    }
}
