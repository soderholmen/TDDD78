package se.liu.ida.gusso811.tddd78.lab2;

import java.util.Objects;

/**
 * Created by gurra on 2/11/16.
 */
public class testcalender {

    public static void main(String[] args) {
        Calender myCal = new Calender();
        myCal.book(2016, "januari", 13, "13:30", "14:00", "swagtime");
        myCal.book(2016, "januari", 13, "15:30", "16:00", "swagtime");
        myCal.book(2016, "januari", 16, "13:00", "19:00", "swagtime");
        myCal.book(2016, "januari", 19, "10:30", "14:35", "swagtime");
        myCal.book(2016, "mars", 10, "13:30", "14:00", "swagtime");
        myCal.book(2016, "augusti", 29, "08:30", "14:00", "swagtime");
        myCal.book(2016, "november", 1, "10:30", "14:00", "Någonting");
        myCal.book(2016, "december", 24, "13:30", "14:00", "Julafton");
        myCal.show();

    }
}
