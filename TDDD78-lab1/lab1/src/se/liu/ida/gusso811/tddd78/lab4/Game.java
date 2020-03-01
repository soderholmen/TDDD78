package se.liu.ida.gusso811.tddd78.lab4;

/**
 * Created by gurra on 4/19/16.
 */
import java.util.ArrayList;
import java.util.List;

public class Game
{
    private Player player = new Player();
    private List<Powerup> activePowerups = new ArrayList<>();

    public void playerHitPowerup(Powerup power) {
        activePowerups.add(power);
        power.playerHitMe(player);
        }
}

