package se.liu.ida.gusso811.tddd78.lab3;

import java.awt.*;

/**
 * Created by Gustaf on 2016-04-10.
 */
public interface Shape {
    int getX();

    int getY();

    Color getColor();

    public void draw(Graphics g);

}
