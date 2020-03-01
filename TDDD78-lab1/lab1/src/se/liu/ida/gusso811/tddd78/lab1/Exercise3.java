package se.liu.ida.gusso811.tddd78.lab1;

import javax.swing.*;

/**
 * Created by gurra on 1/27/16.
 */
public class Exercise3 {
    private final static int TABELL = 5;
    public static void main(String[] args){
        String input =
                JOptionPane.showInputDialog("Please input a value");
        int tabell = Integer.parseInt(input);
        for(int i = 0; i<10; i++){
            System.out.println(i + "*" + tabell + "=" + tabell * i);
        }
    }
}
