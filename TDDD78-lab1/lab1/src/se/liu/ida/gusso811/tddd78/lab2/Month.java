package se.liu.ida.gusso811.tddd78.lab2;

/**
 * Created by gurra on 2/10/16.
 */
public class Month {

    private String name;
    private int number;
    private int days;


    public Month(String name, int number, int days) {
        this.name = name;
        this.number = number;
        this.days = days;

    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int getDays() {
        return days;
    }

    public static int getMonthNumber(String name){
        switch (name){
            case "januari":
                return 1;
            case "februari":
                return 2;
            case "mars":
                return 3;
            case "april":
                return 4;
            case "maj":
                return 5;
            case "juni":
                return 6;
            case "juli":
                return 7;
            case "augusti":
                return 8;
            case "september":
                return 9;
            case "oktober":
                return 10;
            case "november":
                return 11;
            case "december":
                return 12;
        }
        return -1;
    }

    public static int getMonthDays(String name){
        switch (name) {
            case "januari":
                return 31;
            case "februari":
                return 28;
            case "mars":
                return 31;
            case "april":
                return 30;
            case "maj":
                return 31;
            case "juni":
                return 30;
            case "juli":
                return 31;
            case "augusti":
                return 31;
            case "september":
                return 30;
            case "oktober":
                return 31;
            case "november":
                return 30;
            case "december":
                return 31;
        }
        return -1;
    }

    @Override
    public String toString() {
        return name;
    }
}
