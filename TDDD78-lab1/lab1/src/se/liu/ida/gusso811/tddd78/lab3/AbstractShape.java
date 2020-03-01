package se.liu.ida.gusso811.tddd78.lab3;

import java.awt.*;

/**
 * Created by Gustaf on 2016-04-10.
 */
public abstract class AbstractShape implements Shape {


    protected int x;
    protected int y;
    protected Color color;

    public AbstractShape(int y, Color color, int x) {
        this.y = y;
        this.color = color;
        this.x = x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractShape that = (AbstractShape) o;

        if (x != that.x) return false;
        if (y != that.y) return false;
        return color != null ? color.equals(that.color) : that.color == null;

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public Color getColor() {
        return color;
    }
}
