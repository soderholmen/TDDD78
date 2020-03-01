package se.liu.ida.gusso811.tddd78.lab4;

/**
 * Created by gurra on 4/19/16.
 */
import java.awt.*;

public interface Powerup
{
    String getDescription();

    public void paint(Graphics g, int x, int y);

    public void playerHitMe(Player player);

}