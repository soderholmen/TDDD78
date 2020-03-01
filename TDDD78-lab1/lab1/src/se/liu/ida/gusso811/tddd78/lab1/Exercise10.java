package se.liu.ida.gusso811.tddd78.lab1;

/**
 * Created by gurra on 1/28/16.
 */
public class Exercise10 {
    public static void main(String[] args) {
        int tal = 16777217;


        double decimaltal = tal;

        int tillbaka = (int)decimaltal;

        int big = 2147483647;

        long bigger = big+1;


        System.out.println(tal);
        System.out.println(decimaltal);
        System.out.println(tillbaka);
        System.out.println(big);
        System.out.println(bigger);
    }
}
