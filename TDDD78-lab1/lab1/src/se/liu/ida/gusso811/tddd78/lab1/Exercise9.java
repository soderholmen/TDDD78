package se.liu.ida.gusso811.tddd78.lab1;

import javax.swing.*;

/**
 * Created by gurra on 1/28/16.
 */
public class Exercise9 {
    public static void main(String[] args) {
        String input =
                JOptionPane.showInputDialog("Please input a value");
        double doub = Integer.parseInt(input);

        System.out.println("Roten ur "+input+" är "+findRoot(doub));
    }

    public static double findRoot(double number) {
        double x = number;
        for (int i=0; i<10; i++){
            x = x - (x*x-number)/(2*x);
        }
        return x;
    }
}
