package se.liu.ida.gusso811.tddd78.lab3;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by gurra on 2/21/16.
 */
public class TestCircle {

    public static void main(String[] args) {
        final ArrayList<Circle> circles = new ArrayList<>();
        circles.add(new Circle(3, 4, 1, Color.red));
        circles.add(new Circle(5,7,2, Color.green));
        for (Circle circle : circles) {
            String output = String.valueOf(circle.getY()) + " " + String.valueOf(circle.getX());
            System.out.println(output);

        }

    }
}
