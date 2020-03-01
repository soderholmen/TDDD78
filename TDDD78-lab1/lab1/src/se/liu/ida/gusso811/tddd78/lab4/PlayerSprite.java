package se.liu.ida.gusso811.tddd78.lab4;

/**
 * Created by gurra on 4/16/16.
 */

public class PlayerSprite extends MovableObject
{
    private final String name;

    public PlayerSprite(final String name, final int x, final int y) {
        super(x, y);
        this.name = name;
    }
}