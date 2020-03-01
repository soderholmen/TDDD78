package se.liu.ida.gusso811.tddd78.lab1;

import javax.swing.*;

/**
 * Created by gurra on 1/22/16.
 */
public class Exercise2 {
    public static int sumFor(int min, int max){
        for(int i = min; i < max; ++i){
            min = min + i;
        }
        return min;
    }

    public static int sumWhile(int min, int max){
        int a = 0;
        while (min < max){
            ++min;
            a += min;
        }



        return a;
    }

    public static void main(String[] args){
        String min_str =
                JOptionPane.showInputDialog("Please input a min value");
        String max_str =
                JOptionPane.showInputDialog("Please input a max value");
        String swi =
                JOptionPane.showInputDialog("For-loop or While-loop");
        int min = Integer.parseInt(min_str);
        int max = Integer.parseInt(max_str);
        switch (swi){
            case "while":
                System.out.println(sumFor(min,max));
                break;
            case "for":
                System.out.println(sumWhile(min,max));
                break;
        }

    }

}
