package se.liu.ida.gusso811.tddd78.lab3;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by gurra on 2/21/16.
 */
public class TestShape {

    public static void main(String[] args) {
        final ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(3, 4, 1, Color.red));
        shapes.add(new Circle(5,7,2, Color.green));
        shapes.add(new Rectangle(5, 3, 5, 2, Color.BLACK));
        shapes.add(new Text(4, 2, 19, Color.blue, "Hello World"));
        for (Shape shape : shapes) {
            System.out.println(shape.getX() + " " + shape.getY());


        }

    }
}
