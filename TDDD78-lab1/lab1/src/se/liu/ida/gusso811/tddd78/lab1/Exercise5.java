package se.liu.ida.gusso811.tddd78.lab1;

/**
 * Created by gurra on 1/27/16.
 */
public class Exercise5 {
    public static void main(String[] args) {
        for (int a = 2; a < 100; a++) {
            System.out.println(isPrime(a));
        }
    }
    public static boolean isPrime(int number){
        for(int i = 2; i < number; i++) {
            int rest = number % i;
            if (rest == 0) {
                return false;
            }
        }
        return true;
    }
}
