package se.liu.ida.gusso811.tddd78.lab4;

/**
 * Created by gurra on 4/19/16.
 */
public enum Mode {

    NORMAL("Normal"),
    GHOST("Ghost"),
    INVULNERABLE("Invulnerable");

    public String mode;

    Mode(String mode) {
        this.mode = mode;
    }

    @Override
    public String toString() {
        return this.name();
    }
}
