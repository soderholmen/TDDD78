package se.liu.ida.gusso811.tddd78.lab3;

/**
 * Created by Gustaf on 2016-04-10.
 */
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DiagramViewer
{
    public static void main(String[] args) {

        DiagramComponent comp = new DiagramComponent();

        // Add several shapes to the component
        final ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(30, 40, 10, Color.red));
        shapes.add(new Circle(50,70,20, Color.green));
        shapes.add(new Rectangle(50, 30, 50, 20, Color.BLACK));
        shapes.add(new Text(40, 20, 19, Color.blue, "Hello World"));
        for (Shape shape : shapes) {
        comp.addShape(shape);
        }
        JFrame frame = new JFrame("Mitt fönster");
        frame.setLayout(new BorderLayout());
        frame.add(comp, BorderLayout.CENTER);
        frame.setSize(800,600);
        frame.setVisible(true);
    }
}