package se.liu.ida.gusso811.tddd78.lab2;

import java.util.Random;

/**
 * Created by gurra on 1/29/16.
 */
public class Slump {
    public static void main(String[] args) {

        for (int i=0; i<26;i++  ) {

            Random rnd = new Random();
            int x = rnd.nextInt(100);
            System.out.println(x);
        }
    }
}
