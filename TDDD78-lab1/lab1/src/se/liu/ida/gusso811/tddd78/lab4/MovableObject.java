package se.liu.ida.gusso811.tddd78.lab4;

/**
 * Created by gurra on 4/16/16.
 */
/**
 * A movable object on the screen, with current x and y coordinates.
 */
public class MovableObject
{
    protected int x, y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public MovableObject(int x, int y) {
        this.x = x;
        this.y = y;
    }
}