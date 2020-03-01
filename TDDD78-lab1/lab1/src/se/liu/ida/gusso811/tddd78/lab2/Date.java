package se.liu.ida.gusso811.tddd78.lab2;

import java.lang.management.MonitorInfo;

/**
 * Created by gurra on 2/10/16.
 */
public class Date {

    private int year;
    private int day;
    private Month month;

    public Date(int year, int day, Month month) {
        this.year = year;
        this.day = day;
        this.month = month;
    }

    public String toString() {
        return day + " " + month.toString()
                + ", " + year + ", ";
    }
}
