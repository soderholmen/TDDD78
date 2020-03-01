package se.liu.ida.gusso811.tddd78.lab4;

/**
 * Created by gurra on 4/19/16.
 */
public enum Speed {
    SLOW(0), MEDIUM(1), FAST(2);

    public int value;
    Speed(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.name();
    }
}
