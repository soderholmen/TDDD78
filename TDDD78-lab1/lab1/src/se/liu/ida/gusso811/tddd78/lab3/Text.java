package se.liu.ida.gusso811.tddd78.lab3;

import java.awt.*;

/**
 * Created by Gustaf on 2016-04-10.
 */
public class Text extends AbstractShape{
    private int size;
    private String text;

    @Override
    public String toString() {
        return "Text{" +
                "x=" + x +
                ", y=" + y +
                ", size=" + size +
                ", color=" + color +
                ", text='" + text + '\'' +
                '}';
    }

    public Text(int x, int y, int size, Color color, String text) {
        super(y, color, x);
        this.size = size;
        this.text = text;
    }

    @Override
    public void draw(Graphics g) {
        /*System.out.println("Ritar: " + this);*/
        g.setColor(color);
        g.setFont(new Font("serif", Font.PLAIN, size));
        g.drawString(text, x, y);

    }
}
