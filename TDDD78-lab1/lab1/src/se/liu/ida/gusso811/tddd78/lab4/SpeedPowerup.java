package se.liu.ida.gusso811.tddd78.lab4;

/**
 * Created by gurra on 4/19/16.
 */
import java.awt.*;

public class SpeedPowerup implements Powerup
{
    @Override public String getDescription() {
        return "Makes a player faster";
    }

    public void paint(Graphics g, int x, int y) {
        g.fillRect(x, y, 10, 10);
    }

    @Override
    public void playerHitMe(Player player) {
        player.setSpeed(Speed.FAST);

    }
}