package se.liu.ida.gusso811.tddd78.lab3;

/**
 * Created by Gustaf on 2016-04-10.
 */
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DiagramComponent extends JComponent
{
    private ArrayList<Shape> shapes;

    public DiagramComponent() {
        shapes = new ArrayList<>();
    }

    @Override protected void paintComponent(final Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes ){
            shape.draw(g);
        }
        // Rita upp alla former här!
    }
    public void addShape(Shape s){
        shapes.add(s);
    }
}